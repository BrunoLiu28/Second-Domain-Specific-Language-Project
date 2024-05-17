/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SimpleMioGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cProgramAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cProgramProgramParserRuleCall_1_0 = (RuleCall)cProgramAssignment_1.eContents().get(0);
		
		//Model returns Model:
		//    {Model}
		//    program=Program;
		@Override public ParserRule getRule() { return rule; }
		
		//{Model}
		//program=Program
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//program=Program
		public Assignment getProgramAssignment_1() { return cProgramAssignment_1; }
		
		//Program
		public RuleCall getProgramProgramParserRuleCall_1_0() { return cProgramProgramParserRuleCall_1_0; }
	}
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cProgramAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cEventsAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cEventsEventParserRuleCall_1_0_0 = (RuleCall)cEventsAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cNumberSignKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final RuleCall cEStringParserRuleCall_1_1_1 = (RuleCall)cGroup_1_1.eContents().get(1);
		
		//Program returns Program:
		//    {Program}
		//    (events+=Event | ("#" EString*))+
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{Program}
		//(events+=Event | ("#" EString*))+
		public Group getGroup() { return cGroup; }
		
		//{Program}
		public Action getProgramAction_0() { return cProgramAction_0; }
		
		//(events+=Event | ("#" EString*))+
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//events+=Event
		public Assignment getEventsAssignment_1_0() { return cEventsAssignment_1_0; }
		
		//Event
		public RuleCall getEventsEventParserRuleCall_1_0_0() { return cEventsEventParserRuleCall_1_0_0; }
		
		//("#" EString*)
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"#"
		public Keyword getNumberSignKeyword_1_1_0() { return cNumberSignKeyword_1_1_0; }
		
		//EString*
		public RuleCall getEStringParserRuleCall_1_1_1() { return cEStringParserRuleCall_1_1_1; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEventAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cConditionalsensorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConditionalsensorOrParserRuleCall_1_0 = (RuleCall)cConditionalsensorAssignment_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cActionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cActionsActionParserRuleCall_3_0 = (RuleCall)cActionsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cActionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cActionsActionParserRuleCall_4_1_0 = (RuleCall)cActionsAssignment_4_1.eContents().get(0);
		
		//Event returns Event:
		//    {Event}
		//    conditionalsensor=Or "->" actions+=Action ("," actions+=Action)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Event}
		//conditionalsensor=Or "->" actions+=Action ("," actions+=Action)*
		public Group getGroup() { return cGroup; }
		
		//{Event}
		public Action getEventAction_0() { return cEventAction_0; }
		
		//conditionalsensor=Or
		public Assignment getConditionalsensorAssignment_1() { return cConditionalsensorAssignment_1; }
		
		//Or
		public RuleCall getConditionalsensorOrParserRuleCall_1_0() { return cConditionalsensorOrParserRuleCall_1_0; }
		
		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_2() { return cHyphenMinusGreaterThanSignKeyword_2; }
		
		//actions+=Action
		public Assignment getActionsAssignment_3() { return cActionsAssignment_3; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_3_0() { return cActionsActionParserRuleCall_3_0; }
		
		//("," actions+=Action)*
		public Group getGroup_4() { return cGroup_4; }
		
		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//actions+=Action
		public Assignment getActionsAssignment_4_1() { return cActionsAssignment_4_1; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_4_1_0() { return cActionsActionParserRuleCall_4_1_0; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cActionNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cActionNameAlternatives_1_0 = (Alternatives)cActionNameAssignment_1.eContents().get(0);
		private final Keyword cActionNameMoveKeyword_1_0_0 = (Keyword)cActionNameAlternatives_1_0.eContents().get(0);
		private final Keyword cActionNameLedKeyword_1_0_1 = (Keyword)cActionNameAlternatives_1_0.eContents().get(1);
		private final Keyword cActionNameTurnKeyword_1_0_2 = (Keyword)cActionNameAlternatives_1_0.eContents().get(2);
		private final Assignment cActionSpecifierAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cActionSpecifierAlternatives_2_0 = (Alternatives)cActionSpecifierAssignment_2.eContents().get(0);
		private final Keyword cActionSpecifierLeftKeyword_2_0_0 = (Keyword)cActionSpecifierAlternatives_2_0.eContents().get(0);
		private final Keyword cActionSpecifierRightKeyword_2_0_1 = (Keyword)cActionSpecifierAlternatives_2_0.eContents().get(1);
		private final Keyword cActionSpecifierForwardKeyword_2_0_2 = (Keyword)cActionSpecifierAlternatives_2_0.eContents().get(2);
		private final Keyword cActionSpecifierBackwardKeyword_2_0_3 = (Keyword)cActionSpecifierAlternatives_2_0.eContents().get(3);
		private final Keyword cActionSpecifierStopKeyword_2_0_4 = (Keyword)cActionSpecifierAlternatives_2_0.eContents().get(4);
		private final Keyword cActionSpecifierRedKeyword_2_0_5 = (Keyword)cActionSpecifierAlternatives_2_0.eContents().get(5);
		private final Keyword cActionSpecifierGreenKeyword_2_0_6 = (Keyword)cActionSpecifierAlternatives_2_0.eContents().get(6);
		private final Keyword cActionSpecifierBlueKeyword_2_0_7 = (Keyword)cActionSpecifierAlternatives_2_0.eContents().get(7);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommercialAtKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cStrengthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cStrengthEIntParserRuleCall_3_1_0 = (RuleCall)cStrengthAssignment_3_1.eContents().get(0);
		
		//Action returns Action:
		//    {Action}
		//    actionName=("move" | "led" | "turn")
		//    actionSpecifier=("left" | "right" | "forward" | "backward" | "stop" | "red" | "green" | "blue")
		//    ("@" strength=EInt)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Action}
		//actionName=("move" | "led" | "turn")
		//actionSpecifier=("left" | "right" | "forward" | "backward" | "stop" | "red" | "green" | "blue")
		//("@" strength=EInt)?
		public Group getGroup() { return cGroup; }
		
		//{Action}
		public Action getActionAction_0() { return cActionAction_0; }
		
		//actionName=("move" | "led" | "turn")
		public Assignment getActionNameAssignment_1() { return cActionNameAssignment_1; }
		
		//("move" | "led" | "turn")
		public Alternatives getActionNameAlternatives_1_0() { return cActionNameAlternatives_1_0; }
		
		//"move"
		public Keyword getActionNameMoveKeyword_1_0_0() { return cActionNameMoveKeyword_1_0_0; }
		
		//"led"
		public Keyword getActionNameLedKeyword_1_0_1() { return cActionNameLedKeyword_1_0_1; }
		
		//"turn"
		public Keyword getActionNameTurnKeyword_1_0_2() { return cActionNameTurnKeyword_1_0_2; }
		
		//actionSpecifier=("left" | "right" | "forward" | "backward" | "stop" | "red" | "green" | "blue")
		public Assignment getActionSpecifierAssignment_2() { return cActionSpecifierAssignment_2; }
		
		//("left" | "right" | "forward" | "backward" | "stop" | "red" | "green" | "blue")
		public Alternatives getActionSpecifierAlternatives_2_0() { return cActionSpecifierAlternatives_2_0; }
		
		//"left"
		public Keyword getActionSpecifierLeftKeyword_2_0_0() { return cActionSpecifierLeftKeyword_2_0_0; }
		
		//"right"
		public Keyword getActionSpecifierRightKeyword_2_0_1() { return cActionSpecifierRightKeyword_2_0_1; }
		
		//"forward"
		public Keyword getActionSpecifierForwardKeyword_2_0_2() { return cActionSpecifierForwardKeyword_2_0_2; }
		
		//"backward"
		public Keyword getActionSpecifierBackwardKeyword_2_0_3() { return cActionSpecifierBackwardKeyword_2_0_3; }
		
		//"stop"
		public Keyword getActionSpecifierStopKeyword_2_0_4() { return cActionSpecifierStopKeyword_2_0_4; }
		
		//"red"
		public Keyword getActionSpecifierRedKeyword_2_0_5() { return cActionSpecifierRedKeyword_2_0_5; }
		
		//"green"
		public Keyword getActionSpecifierGreenKeyword_2_0_6() { return cActionSpecifierGreenKeyword_2_0_6; }
		
		//"blue"
		public Keyword getActionSpecifierBlueKeyword_2_0_7() { return cActionSpecifierBlueKeyword_2_0_7; }
		
		//("@" strength=EInt)?
		public Group getGroup_3() { return cGroup_3; }
		
		//"@"
		public Keyword getCommercialAtKeyword_3_0() { return cCommercialAtKeyword_3_0; }
		
		//strength=EInt
		public Assignment getStrengthAssignment_3_1() { return cStrengthAssignment_3_1; }
		
		//EInt
		public RuleCall getStrengthEIntParserRuleCall_3_1_0() { return cStrengthEIntParserRuleCall_3_1_0; }
	}
	public class OrElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.Or");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cOrKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Or returns ConditionalSensor:
		//    And ({Or.left=current} "or" right=And)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//And ({Or.left=current} "or" right=And)*
		public Group getGroup() { return cGroup; }
		
		//And
		public RuleCall getAndParserRuleCall_0() { return cAndParserRuleCall_0; }
		
		//({Or.left=current} "or" right=And)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Or.left=current}
		public Action getOrLeftAction_1_0() { return cOrLeftAction_1_0; }
		
		//"or"
		public Keyword getOrKeyword_1_1() { return cOrKeyword_1_1; }
		
		//right=And
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//And
		public RuleCall getRightAndParserRuleCall_1_2_0() { return cRightAndParserRuleCall_1_2_0; }
	}
	public class AndElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.And");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNotParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAndKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightNotParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//And returns ConditionalSensor:
		//    Not ({And.left=current} "and" right=Not)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Not ({And.left=current} "and" right=Not)*
		public Group getGroup() { return cGroup; }
		
		//Not
		public RuleCall getNotParserRuleCall_0() { return cNotParserRuleCall_0; }
		
		//({And.left=current} "and" right=Not)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{And.left=current}
		public Action getAndLeftAction_1_0() { return cAndLeftAction_1_0; }
		
		//"and"
		public Keyword getAndKeyword_1_1() { return cAndKeyword_1_1; }
		
		//right=Not
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Not
		public RuleCall getRightNotParserRuleCall_1_2_0() { return cRightNotParserRuleCall_1_2_0; }
	}
	public class NotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.Not");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cNotAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Keyword cNotKeyword_0_1_0 = (Keyword)cGroup_0_1.eContents().get(0);
		private final Assignment cConditionalsensorAssignment_0_1_1 = (Assignment)cGroup_0_1.eContents().get(1);
		private final RuleCall cConditionalsensorParenParserRuleCall_0_1_1_0 = (RuleCall)cConditionalsensorAssignment_0_1_1.eContents().get(0);
		private final RuleCall cSensorParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParenParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Not returns ConditionalSensor:
		//    {Not}
		//    ("not" conditionalsensor=Paren) | Sensor | Paren
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Not}
		//("not" conditionalsensor=Paren) | Sensor | Paren
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Not}
		//("not" conditionalsensor=Paren)
		public Group getGroup_0() { return cGroup_0; }
		
		//{Not}
		public Action getNotAction_0_0() { return cNotAction_0_0; }
		
		//("not" conditionalsensor=Paren)
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//"not"
		public Keyword getNotKeyword_0_1_0() { return cNotKeyword_0_1_0; }
		
		//conditionalsensor=Paren
		public Assignment getConditionalsensorAssignment_0_1_1() { return cConditionalsensorAssignment_0_1_1; }
		
		//Paren
		public RuleCall getConditionalsensorParenParserRuleCall_0_1_1_0() { return cConditionalsensorParenParserRuleCall_0_1_1_0; }
		
		//Sensor
		public RuleCall getSensorParserRuleCall_1() { return cSensorParserRuleCall_1; }
		
		//Paren
		public RuleCall getParenParserRuleCall_2() { return cParenParserRuleCall_2; }
	}
	public class ParenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.Paren");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cOrParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Paren returns ConditionalSensor:
		//    "(" Or ")"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//"(" Or ")"
		public Group getGroup() { return cGroup; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Or
		public RuleCall getOrParserRuleCall_1() { return cOrParserRuleCall_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class SensorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.Sensor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSensorAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cSensorNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cSensorNameAlternatives_1_0 = (Alternatives)cSensorNameAssignment_1.eContents().get(0);
		private final Keyword cSensorNameObstacleKeyword_1_0_0 = (Keyword)cSensorNameAlternatives_1_0.eContents().get(0);
		private final Keyword cSensorNameSoundKeyword_1_0_1 = (Keyword)cSensorNameAlternatives_1_0.eContents().get(1);
		private final Keyword cSensorNameLineKeyword_1_0_2 = (Keyword)cSensorNameAlternatives_1_0.eContents().get(2);
		private final Keyword cSensorNameButtonKeyword_1_0_3 = (Keyword)cSensorNameAlternatives_1_0.eContents().get(3);
		private final Keyword cSensorNameMotorKeyword_1_0_4 = (Keyword)cSensorNameAlternatives_1_0.eContents().get(4);
		private final Assignment cSensorSpecifierAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cSensorSpecifierAlternatives_2_0 = (Alternatives)cSensorSpecifierAssignment_2.eContents().get(0);
		private final Keyword cSensorSpecifierFrontKeyword_2_0_0 = (Keyword)cSensorSpecifierAlternatives_2_0.eContents().get(0);
		private final Keyword cSensorSpecifierBackKeyword_2_0_1 = (Keyword)cSensorSpecifierAlternatives_2_0.eContents().get(1);
		private final Keyword cSensorSpecifierLeftKeyword_2_0_2 = (Keyword)cSensorSpecifierAlternatives_2_0.eContents().get(2);
		private final Keyword cSensorSpecifierRightKeyword_2_0_3 = (Keyword)cSensorSpecifierAlternatives_2_0.eContents().get(3);
		private final Keyword cSensorSpecifierUpKeyword_2_0_4 = (Keyword)cSensorSpecifierAlternatives_2_0.eContents().get(4);
		private final Keyword cSensorSpecifierDownKeyword_2_0_5 = (Keyword)cSensorSpecifierAlternatives_2_0.eContents().get(5);
		private final Keyword cSensorSpecifierCenterKeyword_2_0_6 = (Keyword)cSensorSpecifierAlternatives_2_0.eContents().get(6);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommercialAtKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cStrengthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cStrengthEIntParserRuleCall_3_1_0 = (RuleCall)cStrengthAssignment_3_1.eContents().get(0);
		
		//Sensor returns Sensor:
		//    {Sensor}
		//        sensorName=("obstacle" | "sound" | "line" | "button" | "motor")
		//        (sensorSpecifier=("front" | "back" | "left" | "right" | "up" | "down" | "center"))?
		//        ('@' strength=EInt)?
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{Sensor}
		//    sensorName=("obstacle" | "sound" | "line" | "button" | "motor")
		//    (sensorSpecifier=("front" | "back" | "left" | "right" | "up" | "down" | "center"))?
		//    ('@' strength=EInt)?
		public Group getGroup() { return cGroup; }
		
		//{Sensor}
		public Action getSensorAction_0() { return cSensorAction_0; }
		
		//sensorName=("obstacle" | "sound" | "line" | "button" | "motor")
		public Assignment getSensorNameAssignment_1() { return cSensorNameAssignment_1; }
		
		//("obstacle" | "sound" | "line" | "button" | "motor")
		public Alternatives getSensorNameAlternatives_1_0() { return cSensorNameAlternatives_1_0; }
		
		//"obstacle"
		public Keyword getSensorNameObstacleKeyword_1_0_0() { return cSensorNameObstacleKeyword_1_0_0; }
		
		//"sound"
		public Keyword getSensorNameSoundKeyword_1_0_1() { return cSensorNameSoundKeyword_1_0_1; }
		
		//"line"
		public Keyword getSensorNameLineKeyword_1_0_2() { return cSensorNameLineKeyword_1_0_2; }
		
		//"button"
		public Keyword getSensorNameButtonKeyword_1_0_3() { return cSensorNameButtonKeyword_1_0_3; }
		
		//"motor"
		public Keyword getSensorNameMotorKeyword_1_0_4() { return cSensorNameMotorKeyword_1_0_4; }
		
		//(sensorSpecifier=("front" | "back" | "left" | "right" | "up" | "down" | "center"))?
		public Assignment getSensorSpecifierAssignment_2() { return cSensorSpecifierAssignment_2; }
		
		//("front" | "back" | "left" | "right" | "up" | "down" | "center")
		public Alternatives getSensorSpecifierAlternatives_2_0() { return cSensorSpecifierAlternatives_2_0; }
		
		//"front"
		public Keyword getSensorSpecifierFrontKeyword_2_0_0() { return cSensorSpecifierFrontKeyword_2_0_0; }
		
		//"back"
		public Keyword getSensorSpecifierBackKeyword_2_0_1() { return cSensorSpecifierBackKeyword_2_0_1; }
		
		//"left"
		public Keyword getSensorSpecifierLeftKeyword_2_0_2() { return cSensorSpecifierLeftKeyword_2_0_2; }
		
		//"right"
		public Keyword getSensorSpecifierRightKeyword_2_0_3() { return cSensorSpecifierRightKeyword_2_0_3; }
		
		//"up"
		public Keyword getSensorSpecifierUpKeyword_2_0_4() { return cSensorSpecifierUpKeyword_2_0_4; }
		
		//"down"
		public Keyword getSensorSpecifierDownKeyword_2_0_5() { return cSensorSpecifierDownKeyword_2_0_5; }
		
		//"center"
		public Keyword getSensorSpecifierCenterKeyword_2_0_6() { return cSensorSpecifierCenterKeyword_2_0_6; }
		
		//('@' strength=EInt)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'@'
		public Keyword getCommercialAtKeyword_3_0() { return cCommercialAtKeyword_3_0; }
		
		//strength=EInt
		public Assignment getStrengthAssignment_3_1() { return cStrengthAssignment_3_1; }
		
		//EInt
		public RuleCall getStrengthEIntParserRuleCall_3_1_0() { return cStrengthEIntParserRuleCall_3_1_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//    STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//    '-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	
	private final ModelElements pModel;
	private final ProgramElements pProgram;
	private final EventElements pEvent;
	private final ActionElements pAction;
	private final OrElements pOr;
	private final AndElements pAnd;
	private final NotElements pNot;
	private final ParenElements pParen;
	private final SensorElements pSensor;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	private final TerminalRule tSL_COMMENT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SimpleMioGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pProgram = new ProgramElements();
		this.pEvent = new EventElements();
		this.pAction = new ActionElements();
		this.pOr = new OrElements();
		this.pAnd = new AndElements();
		this.pNot = new NotElements();
		this.pParen = new ParenElements();
		this.pSensor = new SensorElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.SimpleMio.SL_COMMENT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.SimpleMio".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model returns Model:
	//    {Model}
	//    program=Program;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Program returns Program:
	//    {Program}
	//    (events+=Event | ("#" EString*))+
	//    ;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//Event returns Event:
	//    {Event}
	//    conditionalsensor=Or "->" actions+=Action ("," actions+=Action)*;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//Action returns Action:
	//    {Action}
	//    actionName=("move" | "led" | "turn")
	//    actionSpecifier=("left" | "right" | "forward" | "backward" | "stop" | "red" | "green" | "blue")
	//    ("@" strength=EInt)?
	//;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//Or returns ConditionalSensor:
	//    And ({Or.left=current} "or" right=And)*
	//;
	public OrElements getOrAccess() {
		return pOr;
	}
	
	public ParserRule getOrRule() {
		return getOrAccess().getRule();
	}
	
	//And returns ConditionalSensor:
	//    Not ({And.left=current} "and" right=Not)*
	//;
	public AndElements getAndAccess() {
		return pAnd;
	}
	
	public ParserRule getAndRule() {
		return getAndAccess().getRule();
	}
	
	//Not returns ConditionalSensor:
	//    {Not}
	//    ("not" conditionalsensor=Paren) | Sensor | Paren
	//;
	public NotElements getNotAccess() {
		return pNot;
	}
	
	public ParserRule getNotRule() {
		return getNotAccess().getRule();
	}
	
	//Paren returns ConditionalSensor:
	//    "(" Or ")"
	//;
	public ParenElements getParenAccess() {
		return pParen;
	}
	
	public ParserRule getParenRule() {
		return getParenAccess().getRule();
	}
	
	//Sensor returns Sensor:
	//    {Sensor}
	//        sensorName=("obstacle" | "sound" | "line" | "button" | "motor")
	//        (sensorSpecifier=("front" | "back" | "left" | "right" | "up" | "down" | "center"))?
	//        ('@' strength=EInt)?
	//    ;
	public SensorElements getSensorAccess() {
		return pSensor;
	}
	
	public ParserRule getSensorRule() {
		return getSensorAccess().getRule();
	}
	
	//EString returns ecore::EString:
	//    STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//EInt returns ecore::EInt:
	//    '-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//@Override
	//terminal SL_COMMENT: '#' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
