/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import simplemioModel.Model
import java.util.List
import simplemioModel.Event
import simplemioModel.ConditionalSensor
import simplemioModel.Sensor
import simplemioModel.Not
import simplemioModel.And
import simplemioModel.Or
import simplemioModel.Action
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SimpleMioGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("program.aseba", toAsebaCode(resource.contents.head as Model));
	}
	
	def toAsebaCode(Model model) {
		'''
		var obstacle = 2000
		var line = 400
		var mic = 150
		var motor = 250
		
		mic.threshold = 250
		
		onevent prox
		«generateEvents(filterEvent(model.getProgram().getEvents(), "obstacleturnline"))»
		
		onevent motor
		«generateEvents(filterEvent(model.getProgram().getEvents(), "motor"))»
		
		onevent buttons
		«generateEvents(filterEvent(model.getProgram().getEvents(), "button"))»
		
		onevent mic
		«generateEvents(filterEvent(model.getProgram().getEvents(), "sound"))»
		'''
	}
	
	def generateEvents(List<Event> events) {
		'''
			if 0 != 0 then
		«FOR e : events»
				elseif
			«generateEvent(e)»
		«ENDFOR»
			end
		'''
	}
	
	def generateEvent(Event event) {
		'''
		«generateConditionalSensor(event.getConditionalsensor())» then	
		«FOR action : event.getActions()»
			«generateAction(action)»
		«ENDFOR»
		'''
	}
	
	def generateConditionalSensor(ConditionalSensor cs) {
		'''
		«IF cs instanceof Sensor»
			«IF cs.getSensorName() == "obstacle"»
				«IF cs.sensorSpecifier == "front"»
					prox.horizontal[1] > obstacle «generateSensorStrength(cs)» or prox.horizontal[2] > obstacle «generateSensorStrength(cs)» or prox.horizontal[3] > obstacle «generateSensorStrength(cs)»
				«ELSEIF cs.sensorSpecifier == "right"»
					prox.horizontal[3] > obstacle «generateSensorStrength(cs)» or prox.horizontal[4] > obstacle «generateSensorStrength(cs)»
				«ELSEIF cs.sensorSpecifier == "left"»
					prox.horizontal[0] > obstacle «generateSensorStrength(cs)» or prox.horizontal[1] > obstacle «generateSensorStrength(cs)»
				«ELSEIF cs.sensorSpecifier == "back"»
						prox.horizontal[5] > obstacle «generateSensorStrength(cs)» or prox.horizontal[6] > obstacle «generateSensorStrength(cs)»
				«ENDIF»
			«ELSEIF cs.getSensorName() == "line"»
				«IF cs.getSensorSpecifier() == "right"»
					prox.ground.delta[1] < line «generateSensorStrength(cs)»
				«ELSEIF cs.getSensorSpecifier() == "left"»
					prox.ground.delta[0] < line «generateSensorStrength(cs)»
				«ENDIF»
			«ELSEIF cs.getSensorName() == "sound"»
				mic.intensity > mic «generateSensorStrength(cs)»
			«ELSEIF cs.getSensorName() == "motor"»
				(motor.left.speed > 0 or motor.right.speed > 0)
			«ELSEIF cs.getSensorName() == "button"»
				«IF cs.getSensorSpecifier() == "center"»
					button.center > 0
				«ELSEIF cs.getSensorSpecifier() == "left"»
					button.left > 0
				«ELSEIF cs.getSensorSpecifier() == "right"»
					button.right > 0
				«ELSEIF cs.getSensorSpecifier() == "up"»
					button.forward > 0
				«ELSEIF cs.getSensorSpecifier() == "down"»
					button.backward > 0
				«ENDIF»
			«ENDIF»
		«ELSEIF cs instanceof Not»
			not («generateConditionalSensor(cs.getConditionalsensor())»)
		«ELSEIF cs instanceof And»
			(«generateConditionalSensor(cs.getLeft())») and («generateConditionalSensor(cs.getRight())»)
		«ELSEIF cs instanceof Or»
			(«generateConditionalSensor(cs.getLeft())») or («generateConditionalSensor(cs.getRight())»)
		«ENDIF»
		'''	
	}
	
	def generateAction(Action action) {
		'''
		«IF action.getActionName() == "move"»
			«IF action.getActionSpecifier() == "forward"»
				motor.left.target = motor «generateActionStrength(action)»
				motor.right.target = motor «generateActionStrength(action)»
			«ELSEIF action.getActionSpecifier() == "backward"»
				motor.left.target = -motor «generateActionStrength(action)»
				motor.right.target = -motor «generateActionStrength(action)»
			«ENDIF»
		«ELSEIF action.getActionName() == "stop"»
				motor.left.target = 0
				motor.right.target = 0	
		«ELSEIF action.getActionName() == "turn"»
			«IF action.getActionSpecifier() == "right"»
				motor.left.target = motor «generateActionStrength(action)»
				motor.right.target = -motor «generateActionStrength(action)»
			«ELSEIF action.getActionSpecifier() == "left"»
				motor.left.target = -motor «generateActionStrength(action)»
				motor.right.target = motor «generateActionStrength(action)»
			«ENDIF»
		«ELSEIF action.getActionName() == "led"»
			«IF action.getActionSpecifier() == "red"»
				call leds.top(127 «generateActionStrength(action)», 0 ,0)
			«ELSEIF action.getActionSpecifier() == "green"»
				call leds.top(0, 127 «generateActionStrength(action)», 0)
			«ELSEIF action.getActionSpecifier() == "blue"»
				call leds.top(0, 0, 127 «generateActionStrength(action)»)
			«ELSEIF action.getActionSpecifier() == "off"»
				call leds.top(0, 0, 0)
			«ENDIF»
		«ENDIF»
		'''
	}
	
	def generateSensorStrength(Sensor sensor) {
		'''
		«IF sensor.getStrength() !== null»
			* «sensor.getStrength()» / 5
		«ENDIF»
		'''
	}
	def generateActionStrength(Action action) {
		'''
		«IF action.getStrength() !== null»
			* «action.getStrength()» / 5
		«ENDIF»
		'''
	}
	
	// It is necessary to filter the events by their type because in aseba
	// it is only possible to have on onevent prox (onevent *event_name*)
	// So it is necessary to know what type of sensor each event uses
	
	def filterEvent(List<Event> events, String eventNames) {
		var res = new ArrayList()
		for (Event e : events) {
			var flattened = flatten(e.conditionalsensor)
			var isEvent = false
			for (Sensor cs : flattened){
				if (eventNames.contains(cs.sensorName)) {
					isEvent = true
				}
			}
			if (isEvent) res.add(e)
		}
		
		return res
	}
	
	def List<Sensor> flatten(ConditionalSensor cs) {
		var res = new ArrayList
		if (cs instanceof Sensor) {
			res.add(cs)
		} else if (cs instanceof Not) {
			res.addAll(flatten(cs.conditionalsensor))
		} else if (cs instanceof And) {
			res.addAll(flatten(cs.left))
			res.addAll(flatten(cs.right))
		} else if (cs instanceof Or) {
			res.addAll(flatten(cs.left))
			res.addAll(flatten(cs.right))
		}
		
		return res
	}
}
