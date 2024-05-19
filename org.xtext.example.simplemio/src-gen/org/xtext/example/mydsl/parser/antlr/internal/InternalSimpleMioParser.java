package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SimpleMioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleMioParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'->'", "','", "'move'", "'led'", "'turn'", "'stop'", "'left'", "'right'", "'forward'", "'backward'", "'red'", "'green'", "'blue'", "'off'", "'@'", "'or'", "'and'", "'not'", "'('", "')'", "'obstacle'", "'sound'", "'line'", "'button'", "'motor'", "'front'", "'back'", "'up'", "'down'", "'center'", "'-'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSimpleMioParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleMioParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleMioParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimpleMio.g"; }



     	private SimpleMioGrammarAccess grammarAccess;

        public InternalSimpleMioParser(TokenStream input, SimpleMioGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SimpleMioGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSimpleMio.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSimpleMio.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSimpleMio.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSimpleMio.g:71:1: ruleModel returns [EObject current=null] : ( () ( (lv_program_1_0= ruleProgram ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_program_1_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:77:2: ( ( () ( (lv_program_1_0= ruleProgram ) ) ) )
            // InternalSimpleMio.g:78:2: ( () ( (lv_program_1_0= ruleProgram ) ) )
            {
            // InternalSimpleMio.g:78:2: ( () ( (lv_program_1_0= ruleProgram ) ) )
            // InternalSimpleMio.g:79:3: () ( (lv_program_1_0= ruleProgram ) )
            {
            // InternalSimpleMio.g:79:3: ()
            // InternalSimpleMio.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalSimpleMio.g:86:3: ( (lv_program_1_0= ruleProgram ) )
            // InternalSimpleMio.g:87:4: (lv_program_1_0= ruleProgram )
            {
            // InternalSimpleMio.g:87:4: (lv_program_1_0= ruleProgram )
            // InternalSimpleMio.g:88:5: lv_program_1_0= ruleProgram
            {

            					newCompositeNode(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_program_1_0=ruleProgram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"program",
            						lv_program_1_0,
            						"org.xtext.example.mydsl.SimpleMio.Program");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgram"
    // InternalSimpleMio.g:109:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalSimpleMio.g:109:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalSimpleMio.g:110:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSimpleMio.g:116:1: ruleProgram returns [EObject current=null] : ( (lv_events_0_0= ruleEvent ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_events_0_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:122:2: ( ( (lv_events_0_0= ruleEvent ) )+ )
            // InternalSimpleMio.g:123:2: ( (lv_events_0_0= ruleEvent ) )+
            {
            // InternalSimpleMio.g:123:2: ( (lv_events_0_0= ruleEvent ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=28 && LA1_0<=29)||(LA1_0>=31 && LA1_0<=35)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleMio.g:124:3: (lv_events_0_0= ruleEvent )
            	    {
            	    // InternalSimpleMio.g:124:3: (lv_events_0_0= ruleEvent )
            	    // InternalSimpleMio.g:125:4: lv_events_0_0= ruleEvent
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getEventsEventParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_events_0_0=ruleEvent();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"events",
            	    					lv_events_0_0,
            	    					"org.xtext.example.mydsl.SimpleMio.Event");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleEvent"
    // InternalSimpleMio.g:145:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalSimpleMio.g:145:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalSimpleMio.g:146:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalSimpleMio.g:152:1: ruleEvent returns [EObject current=null] : ( () ( (lv_conditionalsensor_1_0= ruleOr ) ) otherlv_2= '->' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditionalsensor_1_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:158:2: ( ( () ( (lv_conditionalsensor_1_0= ruleOr ) ) otherlv_2= '->' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* ) )
            // InternalSimpleMio.g:159:2: ( () ( (lv_conditionalsensor_1_0= ruleOr ) ) otherlv_2= '->' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* )
            {
            // InternalSimpleMio.g:159:2: ( () ( (lv_conditionalsensor_1_0= ruleOr ) ) otherlv_2= '->' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* )
            // InternalSimpleMio.g:160:3: () ( (lv_conditionalsensor_1_0= ruleOr ) ) otherlv_2= '->' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )*
            {
            // InternalSimpleMio.g:160:3: ()
            // InternalSimpleMio.g:161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalSimpleMio.g:167:3: ( (lv_conditionalsensor_1_0= ruleOr ) )
            // InternalSimpleMio.g:168:4: (lv_conditionalsensor_1_0= ruleOr )
            {
            // InternalSimpleMio.g:168:4: (lv_conditionalsensor_1_0= ruleOr )
            // InternalSimpleMio.g:169:5: lv_conditionalsensor_1_0= ruleOr
            {

            					newCompositeNode(grammarAccess.getEventAccess().getConditionalsensorOrParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_conditionalsensor_1_0=ruleOr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"conditionalsensor",
            						lv_conditionalsensor_1_0,
            						"org.xtext.example.mydsl.SimpleMio.Or");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalSimpleMio.g:190:3: ( (lv_actions_3_0= ruleAction ) )
            // InternalSimpleMio.g:191:4: (lv_actions_3_0= ruleAction )
            {
            // InternalSimpleMio.g:191:4: (lv_actions_3_0= ruleAction )
            // InternalSimpleMio.g:192:5: lv_actions_3_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_actions_3_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_3_0,
            						"org.xtext.example.mydsl.SimpleMio.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSimpleMio.g:209:3: (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSimpleMio.g:210:4: otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSimpleMio.g:214:4: ( (lv_actions_5_0= ruleAction ) )
            	    // InternalSimpleMio.g:215:5: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalSimpleMio.g:215:5: (lv_actions_5_0= ruleAction )
            	    // InternalSimpleMio.g:216:6: lv_actions_5_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_5_0,
            	    							"org.xtext.example.mydsl.SimpleMio.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAction"
    // InternalSimpleMio.g:238:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSimpleMio.g:238:47: (iv_ruleAction= ruleAction EOF )
            // InternalSimpleMio.g:239:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSimpleMio.g:245:1: ruleAction returns [EObject current=null] : ( () ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' | lv_actionName_1_4= 'stop' ) ) ) ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'red' | lv_actionSpecifier_2_6= 'green' | lv_actionSpecifier_2_7= 'blue' | lv_actionSpecifier_2_8= 'off' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_actionName_1_1=null;
        Token lv_actionName_1_2=null;
        Token lv_actionName_1_3=null;
        Token lv_actionName_1_4=null;
        Token lv_actionSpecifier_2_1=null;
        Token lv_actionSpecifier_2_2=null;
        Token lv_actionSpecifier_2_3=null;
        Token lv_actionSpecifier_2_4=null;
        Token lv_actionSpecifier_2_5=null;
        Token lv_actionSpecifier_2_6=null;
        Token lv_actionSpecifier_2_7=null;
        Token lv_actionSpecifier_2_8=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_strength_4_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:251:2: ( ( () ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' | lv_actionName_1_4= 'stop' ) ) ) ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'red' | lv_actionSpecifier_2_6= 'green' | lv_actionSpecifier_2_7= 'blue' | lv_actionSpecifier_2_8= 'off' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? ) )
            // InternalSimpleMio.g:252:2: ( () ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' | lv_actionName_1_4= 'stop' ) ) ) ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'red' | lv_actionSpecifier_2_6= 'green' | lv_actionSpecifier_2_7= 'blue' | lv_actionSpecifier_2_8= 'off' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? )
            {
            // InternalSimpleMio.g:252:2: ( () ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' | lv_actionName_1_4= 'stop' ) ) ) ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'red' | lv_actionSpecifier_2_6= 'green' | lv_actionSpecifier_2_7= 'blue' | lv_actionSpecifier_2_8= 'off' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? )
            // InternalSimpleMio.g:253:3: () ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' | lv_actionName_1_4= 'stop' ) ) ) ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'red' | lv_actionSpecifier_2_6= 'green' | lv_actionSpecifier_2_7= 'blue' | lv_actionSpecifier_2_8= 'off' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )?
            {
            // InternalSimpleMio.g:253:3: ()
            // InternalSimpleMio.g:254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalSimpleMio.g:260:3: ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' | lv_actionName_1_4= 'stop' ) ) )
            // InternalSimpleMio.g:261:4: ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' | lv_actionName_1_4= 'stop' ) )
            {
            // InternalSimpleMio.g:261:4: ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' | lv_actionName_1_4= 'stop' ) )
            // InternalSimpleMio.g:262:5: (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' | lv_actionName_1_4= 'stop' )
            {
            // InternalSimpleMio.g:262:5: (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' | lv_actionName_1_4= 'stop' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSimpleMio.g:263:6: lv_actionName_1_1= 'move'
                    {
                    lv_actionName_1_1=(Token)match(input,13,FOLLOW_7); 

                    						newLeafNode(lv_actionName_1_1, grammarAccess.getActionAccess().getActionNameMoveKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionName", lv_actionName_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:274:6: lv_actionName_1_2= 'led'
                    {
                    lv_actionName_1_2=(Token)match(input,14,FOLLOW_7); 

                    						newLeafNode(lv_actionName_1_2, grammarAccess.getActionAccess().getActionNameLedKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionName", lv_actionName_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:285:6: lv_actionName_1_3= 'turn'
                    {
                    lv_actionName_1_3=(Token)match(input,15,FOLLOW_7); 

                    						newLeafNode(lv_actionName_1_3, grammarAccess.getActionAccess().getActionNameTurnKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionName", lv_actionName_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:296:6: lv_actionName_1_4= 'stop'
                    {
                    lv_actionName_1_4=(Token)match(input,16,FOLLOW_7); 

                    						newLeafNode(lv_actionName_1_4, grammarAccess.getActionAccess().getActionNameStopKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionName", lv_actionName_1_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSimpleMio.g:309:3: ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'red' | lv_actionSpecifier_2_6= 'green' | lv_actionSpecifier_2_7= 'blue' | lv_actionSpecifier_2_8= 'off' ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=17 && LA5_0<=24)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimpleMio.g:310:4: ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'red' | lv_actionSpecifier_2_6= 'green' | lv_actionSpecifier_2_7= 'blue' | lv_actionSpecifier_2_8= 'off' ) )
                    {
                    // InternalSimpleMio.g:310:4: ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'red' | lv_actionSpecifier_2_6= 'green' | lv_actionSpecifier_2_7= 'blue' | lv_actionSpecifier_2_8= 'off' ) )
                    // InternalSimpleMio.g:311:5: (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'red' | lv_actionSpecifier_2_6= 'green' | lv_actionSpecifier_2_7= 'blue' | lv_actionSpecifier_2_8= 'off' )
                    {
                    // InternalSimpleMio.g:311:5: (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'red' | lv_actionSpecifier_2_6= 'green' | lv_actionSpecifier_2_7= 'blue' | lv_actionSpecifier_2_8= 'off' )
                    int alt4=8;
                    switch ( input.LA(1) ) {
                    case 17:
                        {
                        alt4=1;
                        }
                        break;
                    case 18:
                        {
                        alt4=2;
                        }
                        break;
                    case 19:
                        {
                        alt4=3;
                        }
                        break;
                    case 20:
                        {
                        alt4=4;
                        }
                        break;
                    case 21:
                        {
                        alt4=5;
                        }
                        break;
                    case 22:
                        {
                        alt4=6;
                        }
                        break;
                    case 23:
                        {
                        alt4=7;
                        }
                        break;
                    case 24:
                        {
                        alt4=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }

                    switch (alt4) {
                        case 1 :
                            // InternalSimpleMio.g:312:6: lv_actionSpecifier_2_1= 'left'
                            {
                            lv_actionSpecifier_2_1=(Token)match(input,17,FOLLOW_8); 

                            						newLeafNode(lv_actionSpecifier_2_1, grammarAccess.getActionAccess().getActionSpecifierLeftKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getActionRule());
                            						}
                            						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalSimpleMio.g:323:6: lv_actionSpecifier_2_2= 'right'
                            {
                            lv_actionSpecifier_2_2=(Token)match(input,18,FOLLOW_8); 

                            						newLeafNode(lv_actionSpecifier_2_2, grammarAccess.getActionAccess().getActionSpecifierRightKeyword_2_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getActionRule());
                            						}
                            						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalSimpleMio.g:334:6: lv_actionSpecifier_2_3= 'forward'
                            {
                            lv_actionSpecifier_2_3=(Token)match(input,19,FOLLOW_8); 

                            						newLeafNode(lv_actionSpecifier_2_3, grammarAccess.getActionAccess().getActionSpecifierForwardKeyword_2_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getActionRule());
                            						}
                            						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_3, null);
                            					

                            }
                            break;
                        case 4 :
                            // InternalSimpleMio.g:345:6: lv_actionSpecifier_2_4= 'backward'
                            {
                            lv_actionSpecifier_2_4=(Token)match(input,20,FOLLOW_8); 

                            						newLeafNode(lv_actionSpecifier_2_4, grammarAccess.getActionAccess().getActionSpecifierBackwardKeyword_2_0_3());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getActionRule());
                            						}
                            						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_4, null);
                            					

                            }
                            break;
                        case 5 :
                            // InternalSimpleMio.g:356:6: lv_actionSpecifier_2_5= 'red'
                            {
                            lv_actionSpecifier_2_5=(Token)match(input,21,FOLLOW_8); 

                            						newLeafNode(lv_actionSpecifier_2_5, grammarAccess.getActionAccess().getActionSpecifierRedKeyword_2_0_4());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getActionRule());
                            						}
                            						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_5, null);
                            					

                            }
                            break;
                        case 6 :
                            // InternalSimpleMio.g:367:6: lv_actionSpecifier_2_6= 'green'
                            {
                            lv_actionSpecifier_2_6=(Token)match(input,22,FOLLOW_8); 

                            						newLeafNode(lv_actionSpecifier_2_6, grammarAccess.getActionAccess().getActionSpecifierGreenKeyword_2_0_5());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getActionRule());
                            						}
                            						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_6, null);
                            					

                            }
                            break;
                        case 7 :
                            // InternalSimpleMio.g:378:6: lv_actionSpecifier_2_7= 'blue'
                            {
                            lv_actionSpecifier_2_7=(Token)match(input,23,FOLLOW_8); 

                            						newLeafNode(lv_actionSpecifier_2_7, grammarAccess.getActionAccess().getActionSpecifierBlueKeyword_2_0_6());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getActionRule());
                            						}
                            						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_7, null);
                            					

                            }
                            break;
                        case 8 :
                            // InternalSimpleMio.g:389:6: lv_actionSpecifier_2_8= 'off'
                            {
                            lv_actionSpecifier_2_8=(Token)match(input,24,FOLLOW_8); 

                            						newLeafNode(lv_actionSpecifier_2_8, grammarAccess.getActionAccess().getActionSpecifierOffKeyword_2_0_7());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getActionRule());
                            						}
                            						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_8, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalSimpleMio.g:402:3: (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimpleMio.g:403:4: otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getCommercialAtKeyword_3_0());
                    			
                    // InternalSimpleMio.g:407:4: ( (lv_strength_4_0= ruleEInt ) )
                    // InternalSimpleMio.g:408:5: (lv_strength_4_0= ruleEInt )
                    {
                    // InternalSimpleMio.g:408:5: (lv_strength_4_0= ruleEInt )
                    // InternalSimpleMio.g:409:6: lv_strength_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getStrengthEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_strength_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"strength",
                    							lv_strength_4_0,
                    							"org.xtext.example.mydsl.SimpleMio.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleOr"
    // InternalSimpleMio.g:431:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSimpleMio.g:431:43: (iv_ruleOr= ruleOr EOF )
            // InternalSimpleMio.g:432:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalSimpleMio.g:438:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:444:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalSimpleMio.g:445:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalSimpleMio.g:445:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalSimpleMio.g:446:3: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSimpleMio.g:454:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleMio.g:455:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalSimpleMio.g:455:4: ()
            	    // InternalSimpleMio.g:456:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalSimpleMio.g:466:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalSimpleMio.g:467:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalSimpleMio.g:467:5: (lv_right_3_0= ruleAnd )
            	    // InternalSimpleMio.g:468:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.SimpleMio.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalSimpleMio.g:490:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSimpleMio.g:490:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSimpleMio.g:491:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSimpleMio.g:497:1: ruleAnd returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:503:2: ( (this_Not_0= ruleNot ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )* ) )
            // InternalSimpleMio.g:504:2: (this_Not_0= ruleNot ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )* )
            {
            // InternalSimpleMio.g:504:2: (this_Not_0= ruleNot ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )* )
            // InternalSimpleMio.g:505:3: this_Not_0= ruleNot ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSimpleMio.g:513:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleMio.g:514:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) )
            	    {
            	    // InternalSimpleMio.g:514:4: ()
            	    // InternalSimpleMio.g:515:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalSimpleMio.g:525:4: ( (lv_right_3_0= ruleNot ) )
            	    // InternalSimpleMio.g:526:5: (lv_right_3_0= ruleNot )
            	    {
            	    // InternalSimpleMio.g:526:5: (lv_right_3_0= ruleNot )
            	    // InternalSimpleMio.g:527:6: lv_right_3_0= ruleNot
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightNotParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleNot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.SimpleMio.Not");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNot"
    // InternalSimpleMio.g:549:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalSimpleMio.g:549:44: (iv_ruleNot= ruleNot EOF )
            // InternalSimpleMio.g:550:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalSimpleMio.g:556:1: ruleNot returns [EObject current=null] : ( ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) ) | ( () (otherlv_4= 'not' ( (lv_conditionalsensor_5_0= ruleSensor ) ) ) ) | this_Sensor_6= ruleSensor | this_Paren_7= ruleParen ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_conditionalsensor_2_0 = null;

        EObject lv_conditionalsensor_5_0 = null;

        EObject this_Sensor_6 = null;

        EObject this_Paren_7 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:562:2: ( ( ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) ) | ( () (otherlv_4= 'not' ( (lv_conditionalsensor_5_0= ruleSensor ) ) ) ) | this_Sensor_6= ruleSensor | this_Paren_7= ruleParen ) )
            // InternalSimpleMio.g:563:2: ( ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) ) | ( () (otherlv_4= 'not' ( (lv_conditionalsensor_5_0= ruleSensor ) ) ) ) | this_Sensor_6= ruleSensor | this_Paren_7= ruleParen )
            {
            // InternalSimpleMio.g:563:2: ( ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) ) | ( () (otherlv_4= 'not' ( (lv_conditionalsensor_5_0= ruleSensor ) ) ) ) | this_Sensor_6= ruleSensor | this_Paren_7= ruleParen )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==29) ) {
                    alt9=1;
                }
                else if ( ((LA9_1>=31 && LA9_1<=35)) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt9=3;
                }
                break;
            case 29:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSimpleMio.g:564:3: ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) )
                    {
                    // InternalSimpleMio.g:564:3: ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) )
                    // InternalSimpleMio.g:565:4: () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) )
                    {
                    // InternalSimpleMio.g:565:4: ()
                    // InternalSimpleMio.g:566:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSimpleMio.g:572:4: (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) )
                    // InternalSimpleMio.g:573:5: otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_14); 

                    					newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_0_1_0());
                    				
                    // InternalSimpleMio.g:577:5: ( (lv_conditionalsensor_2_0= ruleParen ) )
                    // InternalSimpleMio.g:578:6: (lv_conditionalsensor_2_0= ruleParen )
                    {
                    // InternalSimpleMio.g:578:6: (lv_conditionalsensor_2_0= ruleParen )
                    // InternalSimpleMio.g:579:7: lv_conditionalsensor_2_0= ruleParen
                    {

                    							newCompositeNode(grammarAccess.getNotAccess().getConditionalsensorParenParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_conditionalsensor_2_0=ruleParen();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNotRule());
                    							}
                    							set(
                    								current,
                    								"conditionalsensor",
                    								lv_conditionalsensor_2_0,
                    								"org.xtext.example.mydsl.SimpleMio.Paren");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:599:3: ( () (otherlv_4= 'not' ( (lv_conditionalsensor_5_0= ruleSensor ) ) ) )
                    {
                    // InternalSimpleMio.g:599:3: ( () (otherlv_4= 'not' ( (lv_conditionalsensor_5_0= ruleSensor ) ) ) )
                    // InternalSimpleMio.g:600:4: () (otherlv_4= 'not' ( (lv_conditionalsensor_5_0= ruleSensor ) ) )
                    {
                    // InternalSimpleMio.g:600:4: ()
                    // InternalSimpleMio.g:601:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSimpleMio.g:607:4: (otherlv_4= 'not' ( (lv_conditionalsensor_5_0= ruleSensor ) ) )
                    // InternalSimpleMio.g:608:5: otherlv_4= 'not' ( (lv_conditionalsensor_5_0= ruleSensor ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_15); 

                    					newLeafNode(otherlv_4, grammarAccess.getNotAccess().getNotKeyword_1_1_0());
                    				
                    // InternalSimpleMio.g:612:5: ( (lv_conditionalsensor_5_0= ruleSensor ) )
                    // InternalSimpleMio.g:613:6: (lv_conditionalsensor_5_0= ruleSensor )
                    {
                    // InternalSimpleMio.g:613:6: (lv_conditionalsensor_5_0= ruleSensor )
                    // InternalSimpleMio.g:614:7: lv_conditionalsensor_5_0= ruleSensor
                    {

                    							newCompositeNode(grammarAccess.getNotAccess().getConditionalsensorSensorParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_conditionalsensor_5_0=ruleSensor();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNotRule());
                    							}
                    							set(
                    								current,
                    								"conditionalsensor",
                    								lv_conditionalsensor_5_0,
                    								"org.xtext.example.mydsl.SimpleMio.Sensor");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:634:3: this_Sensor_6= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getNotAccess().getSensorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_6=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:643:3: this_Paren_7= ruleParen
                    {

                    			newCompositeNode(grammarAccess.getNotAccess().getParenParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Paren_7=ruleParen();

                    state._fsp--;


                    			current = this_Paren_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleParen"
    // InternalSimpleMio.g:655:1: entryRuleParen returns [EObject current=null] : iv_ruleParen= ruleParen EOF ;
    public final EObject entryRuleParen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParen = null;


        try {
            // InternalSimpleMio.g:655:46: (iv_ruleParen= ruleParen EOF )
            // InternalSimpleMio.g:656:2: iv_ruleParen= ruleParen EOF
            {
             newCompositeNode(grammarAccess.getParenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParen=ruleParen();

            state._fsp--;

             current =iv_ruleParen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParen"


    // $ANTLR start "ruleParen"
    // InternalSimpleMio.g:662:1: ruleParen returns [EObject current=null] : (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) ;
    public final EObject ruleParen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Or_1 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:668:2: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) )
            // InternalSimpleMio.g:669:2: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
            {
            // InternalSimpleMio.g:669:2: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
            // InternalSimpleMio.g:670:3: otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getParenAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenAccess().getOrParserRuleCall_1());
            		
            pushFollow(FOLLOW_17);
            this_Or_1=ruleOr();

            state._fsp--;


            			current = this_Or_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParen"


    // $ANTLR start "entryRuleSensor"
    // InternalSimpleMio.g:690:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSimpleMio.g:690:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSimpleMio.g:691:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSimpleMio.g:697:1: ruleSensor returns [EObject current=null] : ( () ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) ) ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token lv_sensorName_1_1=null;
        Token lv_sensorName_1_2=null;
        Token lv_sensorName_1_3=null;
        Token lv_sensorName_1_4=null;
        Token lv_sensorName_1_5=null;
        Token lv_sensorSpecifier_2_1=null;
        Token lv_sensorSpecifier_2_2=null;
        Token lv_sensorSpecifier_2_3=null;
        Token lv_sensorSpecifier_2_4=null;
        Token lv_sensorSpecifier_2_5=null;
        Token lv_sensorSpecifier_2_6=null;
        Token lv_sensorSpecifier_2_7=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_strength_4_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:703:2: ( ( () ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) ) ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? ) )
            // InternalSimpleMio.g:704:2: ( () ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) ) ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? )
            {
            // InternalSimpleMio.g:704:2: ( () ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) ) ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? )
            // InternalSimpleMio.g:705:3: () ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) ) ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )?
            {
            // InternalSimpleMio.g:705:3: ()
            // InternalSimpleMio.g:706:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            // InternalSimpleMio.g:712:3: ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) )
            // InternalSimpleMio.g:713:4: ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) )
            {
            // InternalSimpleMio.g:713:4: ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) )
            // InternalSimpleMio.g:714:5: (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' )
            {
            // InternalSimpleMio.g:714:5: (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 32:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 34:
                {
                alt10=4;
                }
                break;
            case 35:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSimpleMio.g:715:6: lv_sensorName_1_1= 'obstacle'
                    {
                    lv_sensorName_1_1=(Token)match(input,31,FOLLOW_18); 

                    						newLeafNode(lv_sensorName_1_1, grammarAccess.getSensorAccess().getSensorNameObstacleKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensorName", lv_sensorName_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:726:6: lv_sensorName_1_2= 'sound'
                    {
                    lv_sensorName_1_2=(Token)match(input,32,FOLLOW_18); 

                    						newLeafNode(lv_sensorName_1_2, grammarAccess.getSensorAccess().getSensorNameSoundKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensorName", lv_sensorName_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:737:6: lv_sensorName_1_3= 'line'
                    {
                    lv_sensorName_1_3=(Token)match(input,33,FOLLOW_18); 

                    						newLeafNode(lv_sensorName_1_3, grammarAccess.getSensorAccess().getSensorNameLineKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensorName", lv_sensorName_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:748:6: lv_sensorName_1_4= 'button'
                    {
                    lv_sensorName_1_4=(Token)match(input,34,FOLLOW_18); 

                    						newLeafNode(lv_sensorName_1_4, grammarAccess.getSensorAccess().getSensorNameButtonKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensorName", lv_sensorName_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:759:6: lv_sensorName_1_5= 'motor'
                    {
                    lv_sensorName_1_5=(Token)match(input,35,FOLLOW_18); 

                    						newLeafNode(lv_sensorName_1_5, grammarAccess.getSensorAccess().getSensorNameMotorKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensorName", lv_sensorName_1_5, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSimpleMio.g:772:3: ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=17 && LA12_0<=18)||(LA12_0>=36 && LA12_0<=40)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimpleMio.g:773:4: ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) )
                    {
                    // InternalSimpleMio.g:773:4: ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) )
                    // InternalSimpleMio.g:774:5: (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' )
                    {
                    // InternalSimpleMio.g:774:5: (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' )
                    int alt11=7;
                    switch ( input.LA(1) ) {
                    case 36:
                        {
                        alt11=1;
                        }
                        break;
                    case 37:
                        {
                        alt11=2;
                        }
                        break;
                    case 17:
                        {
                        alt11=3;
                        }
                        break;
                    case 18:
                        {
                        alt11=4;
                        }
                        break;
                    case 38:
                        {
                        alt11=5;
                        }
                        break;
                    case 39:
                        {
                        alt11=6;
                        }
                        break;
                    case 40:
                        {
                        alt11=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // InternalSimpleMio.g:775:6: lv_sensorSpecifier_2_1= 'front'
                            {
                            lv_sensorSpecifier_2_1=(Token)match(input,36,FOLLOW_8); 

                            						newLeafNode(lv_sensorSpecifier_2_1, grammarAccess.getSensorAccess().getSensorSpecifierFrontKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalSimpleMio.g:786:6: lv_sensorSpecifier_2_2= 'back'
                            {
                            lv_sensorSpecifier_2_2=(Token)match(input,37,FOLLOW_8); 

                            						newLeafNode(lv_sensorSpecifier_2_2, grammarAccess.getSensorAccess().getSensorSpecifierBackKeyword_2_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalSimpleMio.g:797:6: lv_sensorSpecifier_2_3= 'left'
                            {
                            lv_sensorSpecifier_2_3=(Token)match(input,17,FOLLOW_8); 

                            						newLeafNode(lv_sensorSpecifier_2_3, grammarAccess.getSensorAccess().getSensorSpecifierLeftKeyword_2_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_3, null);
                            					

                            }
                            break;
                        case 4 :
                            // InternalSimpleMio.g:808:6: lv_sensorSpecifier_2_4= 'right'
                            {
                            lv_sensorSpecifier_2_4=(Token)match(input,18,FOLLOW_8); 

                            						newLeafNode(lv_sensorSpecifier_2_4, grammarAccess.getSensorAccess().getSensorSpecifierRightKeyword_2_0_3());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_4, null);
                            					

                            }
                            break;
                        case 5 :
                            // InternalSimpleMio.g:819:6: lv_sensorSpecifier_2_5= 'up'
                            {
                            lv_sensorSpecifier_2_5=(Token)match(input,38,FOLLOW_8); 

                            						newLeafNode(lv_sensorSpecifier_2_5, grammarAccess.getSensorAccess().getSensorSpecifierUpKeyword_2_0_4());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_5, null);
                            					

                            }
                            break;
                        case 6 :
                            // InternalSimpleMio.g:830:6: lv_sensorSpecifier_2_6= 'down'
                            {
                            lv_sensorSpecifier_2_6=(Token)match(input,39,FOLLOW_8); 

                            						newLeafNode(lv_sensorSpecifier_2_6, grammarAccess.getSensorAccess().getSensorSpecifierDownKeyword_2_0_5());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_6, null);
                            					

                            }
                            break;
                        case 7 :
                            // InternalSimpleMio.g:841:6: lv_sensorSpecifier_2_7= 'center'
                            {
                            lv_sensorSpecifier_2_7=(Token)match(input,40,FOLLOW_8); 

                            						newLeafNode(lv_sensorSpecifier_2_7, grammarAccess.getSensorAccess().getSensorSpecifierCenterKeyword_2_0_6());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_7, null);
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalSimpleMio.g:854:3: (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimpleMio.g:855:4: otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getCommercialAtKeyword_3_0());
                    			
                    // InternalSimpleMio.g:859:4: ( (lv_strength_4_0= ruleEInt ) )
                    // InternalSimpleMio.g:860:5: (lv_strength_4_0= ruleEInt )
                    {
                    // InternalSimpleMio.g:860:5: (lv_strength_4_0= ruleEInt )
                    // InternalSimpleMio.g:861:6: lv_strength_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getStrengthEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_strength_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"strength",
                    							lv_strength_4_0,
                    							"org.xtext.example.mydsl.SimpleMio.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleEInt"
    // InternalSimpleMio.g:883:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSimpleMio.g:883:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSimpleMio.g:884:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSimpleMio.g:890:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSimpleMio.g:896:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSimpleMio.g:897:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSimpleMio.g:897:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSimpleMio.g:898:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSimpleMio.g:898:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimpleMio.g:899:4: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000FB0000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003FE0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000FB4000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000FB8000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000FB0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000F80000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000FF0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000001F002060002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});

}