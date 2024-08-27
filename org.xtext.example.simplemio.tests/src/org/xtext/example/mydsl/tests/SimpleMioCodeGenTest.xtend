package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import simplemioModel.Model
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.xtext.example.mydsl.validation.SimpleMioValidator
import simplemioModel.SimplemioModelPackage
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions

@ExtendWith(InjectionExtension)
@InjectWith(SimpleMioInjectorProvider)
class SimpleMioCodeGenTest {
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	
	 @Test
	 def void testSimpleProgram(){
	 	'''
	 	not obstacle front -> move forward
	 	'''.assertCompilesTo(
	 		'''
	 		var obstacle = 2000
	 		var line = 400
	 		var mic = 150
	 		var motor = 250
	 		
	 		mic.threshold = 250
	 		
	 		onevent prox
	 			if 0 != 0 then
	 			elseif
	 		not (prox.horizontal[1] > obstacle  or prox.horizontal[2] > obstacle  or prox.horizontal[3] > obstacle 
	 		)
	 		 then	
	 		motor.left.target = motor 
	 		motor.right.target = motor 
	 			end
	 		
	 		onevent motor
	 			if 0 != 0 then
	 			end
	 		
	 		onevent buttons
	 			if 0 != 0 then
	 			end
	 		
	 		onevent mic
	 			if 0 != 0 then
	 			end
	 		'''
	 	)
	 }
	 
	 @Test
	 def void testObstacleMove(){
	 	'''
	 	not obstacle front -> move forward
	 	obstacle left -> led red @9, turn right
	 	obstacle right -> led green @3, turn left
	 	'''.assertCompilesTo(
	 		'''
	 		var obstacle = 2000
	 		var line = 400
	 		var mic = 150
	 		var motor = 250
	 		
	 		mic.threshold = 250
	 		
	 		onevent prox
	 			if 0 != 0 then
	 			elseif
	 		not (prox.horizontal[1] > obstacle  or prox.horizontal[2] > obstacle  or prox.horizontal[3] > obstacle 
	 		)
	 		 then	
	 		motor.left.target = motor 
	 		motor.right.target = motor 
	 			elseif
	 		prox.horizontal[0] > obstacle  or prox.horizontal[1] > obstacle 
	 		 then	
	 		call leds.top(127 * 9 / 5
	 		, 0 ,0)
	 		motor.left.target = motor 
	 		motor.right.target = -motor 
	 			elseif
	 		prox.horizontal[3] > obstacle  or prox.horizontal[4] > obstacle 
	 		 then	
	 		call leds.top(0, 127 * 3 / 5
	 		, 0)
	 		motor.left.target = -motor 
	 		motor.right.target = motor 
	 			end
	 		
	 		onevent motor
	 			if 0 != 0 then
	 			end
	 		
	 		onevent buttons
	 			if 0 != 0 then
	 			end
	 		
	 		onevent mic
	 			if 0 != 0 then
	 			end
	 		'''
	 	)
	 }
	 
	 @Test
	 def void testSoundTurn(){
	 	'''
	 	not obstacle front -> move forward
	 	button center -> stop
	 	sound -> turn left
	 	'''.assertCompilesTo(
	 		'''
	 		var obstacle = 2000
	 		var line = 400
	 		var mic = 150
	 		var motor = 250
	 		
	 		mic.threshold = 250
	 		
	 		onevent prox
	 			if 0 != 0 then
	 			elseif
	 		not (prox.horizontal[1] > obstacle  or prox.horizontal[2] > obstacle  or prox.horizontal[3] > obstacle 
	 		)
	 		 then	
	 		motor.left.target = motor 
	 		motor.right.target = motor 
	 			end
	 		
	 		onevent motor
	 			if 0 != 0 then
	 			end
	 		
	 		onevent buttons
	 			if 0 != 0 then
	 			elseif
	 		button.center > 0
	 		 then	
	 		motor.left.target = 0
	 		motor.right.target = 0	
	 			end
	 		
	 		onevent mic
	 			if 0 != 0 then
	 			elseif
	 		mic.intensity > mic 
	 		 then	
	 		motor.left.target = -motor 
	 		motor.right.target = motor 
	 			end
	 		'''
	 	)
	 }
	 
	 @Test
	 def void testMotor(){
	 	'''
	 	button center and not motor -> move forward
	 	button center and motor -> stop
	 	motor -> move forward
	 	'''.assertCompilesTo(
	 		'''
	 		var obstacle = 2000
	 		var line = 400
	 		var mic = 150
	 		var motor = 250
	 		
	 		mic.threshold = 250
	 		
	 		onevent prox
	 			if 0 != 0 then
	 			end
	 		
	 		onevent motor
	 			if 0 != 0 then
	 			elseif
	 		(button.center > 0
	 		) and (not ((motor.left.speed > 0 or motor.right.speed > 0)
	 		)
	 		)
	 		 then	
	 		motor.left.target = motor 
	 		motor.right.target = motor 
	 			elseif
	 		(button.center > 0
	 		) and ((motor.left.speed > 0 or motor.right.speed > 0)
	 		)
	 		 then	
	 		motor.left.target = 0
	 		motor.right.target = 0	
	 			elseif
	 		(motor.left.speed > 0 or motor.right.speed > 0)
	 		 then	
	 		motor.left.target = motor 
	 		motor.right.target = motor 
	 			end
	 		
	 		onevent buttons
	 			if 0 != 0 then
	 			elseif
	 		(button.center > 0
	 		) and (not ((motor.left.speed > 0 or motor.right.speed > 0)
	 		)
	 		)
	 		 then	
	 		motor.left.target = motor 
	 		motor.right.target = motor 
	 			elseif
	 		(button.center > 0
	 		) and ((motor.left.speed > 0 or motor.right.speed > 0)
	 		)
	 		 then	
	 		motor.left.target = 0
	 		motor.right.target = 0	
	 			end
	 		
	 		onevent mic
	 			if 0 != 0 then
	 			end
	 		'''
	 	)
	 }
	 
	 @Test
	 def void testButtonsLed(){
	 	'''
	 	sound -> led blue
	 	button up -> move forward
	 	button down -> move backward
	 	button center -> stop
	 	'''.assertCompilesTo(
	 		'''
	 		var obstacle = 2000
	 		var line = 400
	 		var mic = 150
	 		var motor = 250
	 		
	 		mic.threshold = 250
	 		
	 		onevent prox
	 			if 0 != 0 then
	 			end
	 		
	 		onevent motor
	 			if 0 != 0 then
	 			end
	 		
	 		onevent buttons
	 			if 0 != 0 then
	 			elseif
	 		button.forward > 0
	 		 then	
	 		motor.left.target = motor 
	 		motor.right.target = motor 
	 			elseif
	 		button.backward > 0
	 		 then	
	 		motor.left.target = -motor 
	 		motor.right.target = -motor 
	 			elseif
	 		button.center > 0
	 		 then	
	 		motor.left.target = 0
	 		motor.right.target = 0	
	 			end
	 		
	 		onevent mic
	 			if 0 != 0 then
	 			elseif
	 		mic.intensity > mic 
	 		 then	
	 		call leds.top(0, 0, 127 )
	 			end
	 		'''
	 	)
	 }
}