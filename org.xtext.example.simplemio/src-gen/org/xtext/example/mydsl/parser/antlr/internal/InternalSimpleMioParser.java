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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'->'", "','", "'move'", "'led'", "'turn'", "'left'", "'right'", "'forward'", "'backward'", "'stop'", "'red'", "'green'", "'blue'", "'@'", "'or'", "'and'", "'not'", "'('", "')'", "'obstacle'", "'sound'", "'line'", "'button'", "'motor'", "'front'", "'back'", "'up'", "'down'", "'center'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=7;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    // InternalSimpleMio.g:116:1: ruleProgram returns [EObject current=null] : ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= '#' ( ruleEString )* ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_events_1_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:122:2: ( ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= '#' ( ruleEString )* ) )+ ) )
            // InternalSimpleMio.g:123:2: ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= '#' ( ruleEString )* ) )+ )
            {
            // InternalSimpleMio.g:123:2: ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= '#' ( ruleEString )* ) )+ )
            // InternalSimpleMio.g:124:3: () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= '#' ( ruleEString )* ) )+
            {
            // InternalSimpleMio.g:124:3: ()
            // InternalSimpleMio.g:125:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            // InternalSimpleMio.g:131:3: ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= '#' ( ruleEString )* ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=28 && LA2_0<=29)||(LA2_0>=31 && LA2_0<=35)) ) {
                    alt2=1;
                }
                else if ( (LA2_0==11) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSimpleMio.g:132:4: ( (lv_events_1_0= ruleEvent ) )
            	    {
            	    // InternalSimpleMio.g:132:4: ( (lv_events_1_0= ruleEvent ) )
            	    // InternalSimpleMio.g:133:5: (lv_events_1_0= ruleEvent )
            	    {
            	    // InternalSimpleMio.g:133:5: (lv_events_1_0= ruleEvent )
            	    // InternalSimpleMio.g:134:6: lv_events_1_0= ruleEvent
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getEventsEventParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_events_1_0=ruleEvent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"events",
            	    							lv_events_1_0,
            	    							"org.xtext.example.mydsl.SimpleMio.Event");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalSimpleMio.g:152:4: (otherlv_2= '#' ( ruleEString )* )
            	    {
            	    // InternalSimpleMio.g:152:4: (otherlv_2= '#' ( ruleEString )* )
            	    // InternalSimpleMio.g:153:5: otherlv_2= '#' ( ruleEString )*
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_4); 

            	    					newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getNumberSignKeyword_1_1_0());
            	    				
            	    // InternalSimpleMio.g:157:5: ( ruleEString )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalSimpleMio.g:158:6: ruleEString
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getProgramAccess().getEStringParserRuleCall_1_1_1());
            	    	    					
            	    	    pushFollow(FOLLOW_4);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleEvent"
    // InternalSimpleMio.g:172:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalSimpleMio.g:172:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalSimpleMio.g:173:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalSimpleMio.g:179:1: ruleEvent returns [EObject current=null] : ( () ( (lv_conditionalsensor_1_0= ruleOr ) ) otherlv_2= '->' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditionalsensor_1_0 = null;

        EObject lv_actions_3_0 = null;

        EObject lv_actions_5_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:185:2: ( ( () ( (lv_conditionalsensor_1_0= ruleOr ) ) otherlv_2= '->' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* ) )
            // InternalSimpleMio.g:186:2: ( () ( (lv_conditionalsensor_1_0= ruleOr ) ) otherlv_2= '->' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* )
            {
            // InternalSimpleMio.g:186:2: ( () ( (lv_conditionalsensor_1_0= ruleOr ) ) otherlv_2= '->' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )* )
            // InternalSimpleMio.g:187:3: () ( (lv_conditionalsensor_1_0= ruleOr ) ) otherlv_2= '->' ( (lv_actions_3_0= ruleAction ) ) (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )*
            {
            // InternalSimpleMio.g:187:3: ()
            // InternalSimpleMio.g:188:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalSimpleMio.g:194:3: ( (lv_conditionalsensor_1_0= ruleOr ) )
            // InternalSimpleMio.g:195:4: (lv_conditionalsensor_1_0= ruleOr )
            {
            // InternalSimpleMio.g:195:4: (lv_conditionalsensor_1_0= ruleOr )
            // InternalSimpleMio.g:196:5: lv_conditionalsensor_1_0= ruleOr
            {

            					newCompositeNode(grammarAccess.getEventAccess().getConditionalsensorOrParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalSimpleMio.g:217:3: ( (lv_actions_3_0= ruleAction ) )
            // InternalSimpleMio.g:218:4: (lv_actions_3_0= ruleAction )
            {
            // InternalSimpleMio.g:218:4: (lv_actions_3_0= ruleAction )
            // InternalSimpleMio.g:219:5: lv_actions_3_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalSimpleMio.g:236:3: (otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpleMio.g:237:4: otherlv_4= ',' ( (lv_actions_5_0= ruleAction ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEventAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalSimpleMio.g:241:4: ( (lv_actions_5_0= ruleAction ) )
            	    // InternalSimpleMio.g:242:5: (lv_actions_5_0= ruleAction )
            	    {
            	    // InternalSimpleMio.g:242:5: (lv_actions_5_0= ruleAction )
            	    // InternalSimpleMio.g:243:6: lv_actions_5_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getEventAccess().getActionsActionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
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
            	    break loop3;
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
    // InternalSimpleMio.g:265:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalSimpleMio.g:265:47: (iv_ruleAction= ruleAction EOF )
            // InternalSimpleMio.g:266:2: iv_ruleAction= ruleAction EOF
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
    // InternalSimpleMio.g:272:1: ruleAction returns [EObject current=null] : ( () ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' ) ) ) ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'stop' | lv_actionSpecifier_2_6= 'red' | lv_actionSpecifier_2_7= 'green' | lv_actionSpecifier_2_8= 'blue' ) ) ) (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_actionName_1_1=null;
        Token lv_actionName_1_2=null;
        Token lv_actionName_1_3=null;
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
            // InternalSimpleMio.g:278:2: ( ( () ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' ) ) ) ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'stop' | lv_actionSpecifier_2_6= 'red' | lv_actionSpecifier_2_7= 'green' | lv_actionSpecifier_2_8= 'blue' ) ) ) (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? ) )
            // InternalSimpleMio.g:279:2: ( () ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' ) ) ) ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'stop' | lv_actionSpecifier_2_6= 'red' | lv_actionSpecifier_2_7= 'green' | lv_actionSpecifier_2_8= 'blue' ) ) ) (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? )
            {
            // InternalSimpleMio.g:279:2: ( () ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' ) ) ) ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'stop' | lv_actionSpecifier_2_6= 'red' | lv_actionSpecifier_2_7= 'green' | lv_actionSpecifier_2_8= 'blue' ) ) ) (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? )
            // InternalSimpleMio.g:280:3: () ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' ) ) ) ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'stop' | lv_actionSpecifier_2_6= 'red' | lv_actionSpecifier_2_7= 'green' | lv_actionSpecifier_2_8= 'blue' ) ) ) (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )?
            {
            // InternalSimpleMio.g:280:3: ()
            // InternalSimpleMio.g:281:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalSimpleMio.g:287:3: ( ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' ) ) )
            // InternalSimpleMio.g:288:4: ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' ) )
            {
            // InternalSimpleMio.g:288:4: ( (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' ) )
            // InternalSimpleMio.g:289:5: (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' )
            {
            // InternalSimpleMio.g:289:5: (lv_actionName_1_1= 'move' | lv_actionName_1_2= 'led' | lv_actionName_1_3= 'turn' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSimpleMio.g:290:6: lv_actionName_1_1= 'move'
                    {
                    lv_actionName_1_1=(Token)match(input,14,FOLLOW_8); 

                    						newLeafNode(lv_actionName_1_1, grammarAccess.getActionAccess().getActionNameMoveKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionName", lv_actionName_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:301:6: lv_actionName_1_2= 'led'
                    {
                    lv_actionName_1_2=(Token)match(input,15,FOLLOW_8); 

                    						newLeafNode(lv_actionName_1_2, grammarAccess.getActionAccess().getActionNameLedKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionName", lv_actionName_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:312:6: lv_actionName_1_3= 'turn'
                    {
                    lv_actionName_1_3=(Token)match(input,16,FOLLOW_8); 

                    						newLeafNode(lv_actionName_1_3, grammarAccess.getActionAccess().getActionNameTurnKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionName", lv_actionName_1_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSimpleMio.g:325:3: ( ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'stop' | lv_actionSpecifier_2_6= 'red' | lv_actionSpecifier_2_7= 'green' | lv_actionSpecifier_2_8= 'blue' ) ) )
            // InternalSimpleMio.g:326:4: ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'stop' | lv_actionSpecifier_2_6= 'red' | lv_actionSpecifier_2_7= 'green' | lv_actionSpecifier_2_8= 'blue' ) )
            {
            // InternalSimpleMio.g:326:4: ( (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'stop' | lv_actionSpecifier_2_6= 'red' | lv_actionSpecifier_2_7= 'green' | lv_actionSpecifier_2_8= 'blue' ) )
            // InternalSimpleMio.g:327:5: (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'stop' | lv_actionSpecifier_2_6= 'red' | lv_actionSpecifier_2_7= 'green' | lv_actionSpecifier_2_8= 'blue' )
            {
            // InternalSimpleMio.g:327:5: (lv_actionSpecifier_2_1= 'left' | lv_actionSpecifier_2_2= 'right' | lv_actionSpecifier_2_3= 'forward' | lv_actionSpecifier_2_4= 'backward' | lv_actionSpecifier_2_5= 'stop' | lv_actionSpecifier_2_6= 'red' | lv_actionSpecifier_2_7= 'green' | lv_actionSpecifier_2_8= 'blue' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            case 23:
                {
                alt5=7;
                }
                break;
            case 24:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSimpleMio.g:328:6: lv_actionSpecifier_2_1= 'left'
                    {
                    lv_actionSpecifier_2_1=(Token)match(input,17,FOLLOW_9); 

                    						newLeafNode(lv_actionSpecifier_2_1, grammarAccess.getActionAccess().getActionSpecifierLeftKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:339:6: lv_actionSpecifier_2_2= 'right'
                    {
                    lv_actionSpecifier_2_2=(Token)match(input,18,FOLLOW_9); 

                    						newLeafNode(lv_actionSpecifier_2_2, grammarAccess.getActionAccess().getActionSpecifierRightKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:350:6: lv_actionSpecifier_2_3= 'forward'
                    {
                    lv_actionSpecifier_2_3=(Token)match(input,19,FOLLOW_9); 

                    						newLeafNode(lv_actionSpecifier_2_3, grammarAccess.getActionAccess().getActionSpecifierForwardKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:361:6: lv_actionSpecifier_2_4= 'backward'
                    {
                    lv_actionSpecifier_2_4=(Token)match(input,20,FOLLOW_9); 

                    						newLeafNode(lv_actionSpecifier_2_4, grammarAccess.getActionAccess().getActionSpecifierBackwardKeyword_2_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:372:6: lv_actionSpecifier_2_5= 'stop'
                    {
                    lv_actionSpecifier_2_5=(Token)match(input,21,FOLLOW_9); 

                    						newLeafNode(lv_actionSpecifier_2_5, grammarAccess.getActionAccess().getActionSpecifierStopKeyword_2_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_5, null);
                    					

                    }
                    break;
                case 6 :
                    // InternalSimpleMio.g:383:6: lv_actionSpecifier_2_6= 'red'
                    {
                    lv_actionSpecifier_2_6=(Token)match(input,22,FOLLOW_9); 

                    						newLeafNode(lv_actionSpecifier_2_6, grammarAccess.getActionAccess().getActionSpecifierRedKeyword_2_0_5());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_6, null);
                    					

                    }
                    break;
                case 7 :
                    // InternalSimpleMio.g:394:6: lv_actionSpecifier_2_7= 'green'
                    {
                    lv_actionSpecifier_2_7=(Token)match(input,23,FOLLOW_9); 

                    						newLeafNode(lv_actionSpecifier_2_7, grammarAccess.getActionAccess().getActionSpecifierGreenKeyword_2_0_6());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_7, null);
                    					

                    }
                    break;
                case 8 :
                    // InternalSimpleMio.g:405:6: lv_actionSpecifier_2_8= 'blue'
                    {
                    lv_actionSpecifier_2_8=(Token)match(input,24,FOLLOW_9); 

                    						newLeafNode(lv_actionSpecifier_2_8, grammarAccess.getActionAccess().getActionSpecifierBlueKeyword_2_0_7());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(current, "actionSpecifier", lv_actionSpecifier_2_8, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSimpleMio.g:418:3: (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimpleMio.g:419:4: otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getActionAccess().getCommercialAtKeyword_3_0());
                    			
                    // InternalSimpleMio.g:423:4: ( (lv_strength_4_0= ruleEInt ) )
                    // InternalSimpleMio.g:424:5: (lv_strength_4_0= ruleEInt )
                    {
                    // InternalSimpleMio.g:424:5: (lv_strength_4_0= ruleEInt )
                    // InternalSimpleMio.g:425:6: lv_strength_4_0= ruleEInt
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
    // InternalSimpleMio.g:447:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalSimpleMio.g:447:43: (iv_ruleOr= ruleOr EOF )
            // InternalSimpleMio.g:448:2: iv_ruleOr= ruleOr EOF
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
    // InternalSimpleMio.g:454:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:460:2: ( (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalSimpleMio.g:461:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalSimpleMio.g:461:2: (this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalSimpleMio.g:462:3: this_And_0= ruleAnd ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSimpleMio.g:470:3: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleMio.g:471:4: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalSimpleMio.g:471:4: ()
            	    // InternalSimpleMio.g:472:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	    			
            	    // InternalSimpleMio.g:482:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalSimpleMio.g:483:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalSimpleMio.g:483:5: (lv_right_3_0= ruleAnd )
            	    // InternalSimpleMio.g:484:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // InternalSimpleMio.g:506:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalSimpleMio.g:506:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalSimpleMio.g:507:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalSimpleMio.g:513:1: ruleAnd returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:519:2: ( (this_Not_0= ruleNot ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )* ) )
            // InternalSimpleMio.g:520:2: (this_Not_0= ruleNot ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )* )
            {
            // InternalSimpleMio.g:520:2: (this_Not_0= ruleNot ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )* )
            // InternalSimpleMio.g:521:3: this_Not_0= ruleNot ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getNotParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Not_0=ruleNot();

            state._fsp--;


            			current = this_Not_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSimpleMio.g:529:3: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleMio.g:530:4: () otherlv_2= 'and' ( (lv_right_3_0= ruleNot ) )
            	    {
            	    // InternalSimpleMio.g:530:4: ()
            	    // InternalSimpleMio.g:531:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	    			
            	    // InternalSimpleMio.g:541:4: ( (lv_right_3_0= ruleNot ) )
            	    // InternalSimpleMio.g:542:5: (lv_right_3_0= ruleNot )
            	    {
            	    // InternalSimpleMio.g:542:5: (lv_right_3_0= ruleNot )
            	    // InternalSimpleMio.g:543:6: lv_right_3_0= ruleNot
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightNotParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
    // InternalSimpleMio.g:565:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalSimpleMio.g:565:44: (iv_ruleNot= ruleNot EOF )
            // InternalSimpleMio.g:566:2: iv_ruleNot= ruleNot EOF
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
    // InternalSimpleMio.g:572:1: ruleNot returns [EObject current=null] : ( ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) ) | this_Sensor_3= ruleSensor | this_Paren_4= ruleParen ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_conditionalsensor_2_0 = null;

        EObject this_Sensor_3 = null;

        EObject this_Paren_4 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:578:2: ( ( ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) ) | this_Sensor_3= ruleSensor | this_Paren_4= ruleParen ) )
            // InternalSimpleMio.g:579:2: ( ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) ) | this_Sensor_3= ruleSensor | this_Paren_4= ruleParen )
            {
            // InternalSimpleMio.g:579:2: ( ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) ) | this_Sensor_3= ruleSensor | this_Paren_4= ruleParen )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSimpleMio.g:580:3: ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) )
                    {
                    // InternalSimpleMio.g:580:3: ( () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) ) )
                    // InternalSimpleMio.g:581:4: () (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) )
                    {
                    // InternalSimpleMio.g:581:4: ()
                    // InternalSimpleMio.g:582:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotAccess().getNotAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSimpleMio.g:588:4: (otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) ) )
                    // InternalSimpleMio.g:589:5: otherlv_1= 'not' ( (lv_conditionalsensor_2_0= ruleParen ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_12); 

                    					newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_0_1_0());
                    				
                    // InternalSimpleMio.g:593:5: ( (lv_conditionalsensor_2_0= ruleParen ) )
                    // InternalSimpleMio.g:594:6: (lv_conditionalsensor_2_0= ruleParen )
                    {
                    // InternalSimpleMio.g:594:6: (lv_conditionalsensor_2_0= ruleParen )
                    // InternalSimpleMio.g:595:7: lv_conditionalsensor_2_0= ruleParen
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
                    // InternalSimpleMio.g:615:3: this_Sensor_3= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getNotAccess().getSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_3=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:624:3: this_Paren_4= ruleParen
                    {

                    			newCompositeNode(grammarAccess.getNotAccess().getParenParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Paren_4=ruleParen();

                    state._fsp--;


                    			current = this_Paren_4;
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
    // InternalSimpleMio.g:636:1: entryRuleParen returns [EObject current=null] : iv_ruleParen= ruleParen EOF ;
    public final EObject entryRuleParen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParen = null;


        try {
            // InternalSimpleMio.g:636:46: (iv_ruleParen= ruleParen EOF )
            // InternalSimpleMio.g:637:2: iv_ruleParen= ruleParen EOF
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
    // InternalSimpleMio.g:643:1: ruleParen returns [EObject current=null] : (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) ;
    public final EObject ruleParen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Or_1 = null;



        	enterRule();

        try {
            // InternalSimpleMio.g:649:2: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) )
            // InternalSimpleMio.g:650:2: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
            {
            // InternalSimpleMio.g:650:2: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
            // InternalSimpleMio.g:651:3: otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getParenAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenAccess().getOrParserRuleCall_1());
            		
            pushFollow(FOLLOW_14);
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
    // InternalSimpleMio.g:671:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSimpleMio.g:671:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSimpleMio.g:672:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalSimpleMio.g:678:1: ruleSensor returns [EObject current=null] : ( () ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) ) ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? ) ;
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
            // InternalSimpleMio.g:684:2: ( ( () ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) ) ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? ) )
            // InternalSimpleMio.g:685:2: ( () ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) ) ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? )
            {
            // InternalSimpleMio.g:685:2: ( () ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) ) ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )? )
            // InternalSimpleMio.g:686:3: () ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) ) ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )? (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )?
            {
            // InternalSimpleMio.g:686:3: ()
            // InternalSimpleMio.g:687:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            // InternalSimpleMio.g:693:3: ( ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) ) )
            // InternalSimpleMio.g:694:4: ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) )
            {
            // InternalSimpleMio.g:694:4: ( (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' ) )
            // InternalSimpleMio.g:695:5: (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' )
            {
            // InternalSimpleMio.g:695:5: (lv_sensorName_1_1= 'obstacle' | lv_sensorName_1_2= 'sound' | lv_sensorName_1_3= 'line' | lv_sensorName_1_4= 'button' | lv_sensorName_1_5= 'motor' )
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
                    // InternalSimpleMio.g:696:6: lv_sensorName_1_1= 'obstacle'
                    {
                    lv_sensorName_1_1=(Token)match(input,31,FOLLOW_15); 

                    						newLeafNode(lv_sensorName_1_1, grammarAccess.getSensorAccess().getSensorNameObstacleKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensorName", lv_sensorName_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:707:6: lv_sensorName_1_2= 'sound'
                    {
                    lv_sensorName_1_2=(Token)match(input,32,FOLLOW_15); 

                    						newLeafNode(lv_sensorName_1_2, grammarAccess.getSensorAccess().getSensorNameSoundKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensorName", lv_sensorName_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:718:6: lv_sensorName_1_3= 'line'
                    {
                    lv_sensorName_1_3=(Token)match(input,33,FOLLOW_15); 

                    						newLeafNode(lv_sensorName_1_3, grammarAccess.getSensorAccess().getSensorNameLineKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensorName", lv_sensorName_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:729:6: lv_sensorName_1_4= 'button'
                    {
                    lv_sensorName_1_4=(Token)match(input,34,FOLLOW_15); 

                    						newLeafNode(lv_sensorName_1_4, grammarAccess.getSensorAccess().getSensorNameButtonKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorRule());
                    						}
                    						setWithLastConsumed(current, "sensorName", lv_sensorName_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:740:6: lv_sensorName_1_5= 'motor'
                    {
                    lv_sensorName_1_5=(Token)match(input,35,FOLLOW_15); 

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

            // InternalSimpleMio.g:753:3: ( ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=17 && LA12_0<=18)||(LA12_0>=36 && LA12_0<=40)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimpleMio.g:754:4: ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) )
                    {
                    // InternalSimpleMio.g:754:4: ( (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' ) )
                    // InternalSimpleMio.g:755:5: (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' )
                    {
                    // InternalSimpleMio.g:755:5: (lv_sensorSpecifier_2_1= 'front' | lv_sensorSpecifier_2_2= 'back' | lv_sensorSpecifier_2_3= 'left' | lv_sensorSpecifier_2_4= 'right' | lv_sensorSpecifier_2_5= 'up' | lv_sensorSpecifier_2_6= 'down' | lv_sensorSpecifier_2_7= 'center' )
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
                            // InternalSimpleMio.g:756:6: lv_sensorSpecifier_2_1= 'front'
                            {
                            lv_sensorSpecifier_2_1=(Token)match(input,36,FOLLOW_9); 

                            						newLeafNode(lv_sensorSpecifier_2_1, grammarAccess.getSensorAccess().getSensorSpecifierFrontKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_1, null);
                            					

                            }
                            break;
                        case 2 :
                            // InternalSimpleMio.g:767:6: lv_sensorSpecifier_2_2= 'back'
                            {
                            lv_sensorSpecifier_2_2=(Token)match(input,37,FOLLOW_9); 

                            						newLeafNode(lv_sensorSpecifier_2_2, grammarAccess.getSensorAccess().getSensorSpecifierBackKeyword_2_0_1());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_2, null);
                            					

                            }
                            break;
                        case 3 :
                            // InternalSimpleMio.g:778:6: lv_sensorSpecifier_2_3= 'left'
                            {
                            lv_sensorSpecifier_2_3=(Token)match(input,17,FOLLOW_9); 

                            						newLeafNode(lv_sensorSpecifier_2_3, grammarAccess.getSensorAccess().getSensorSpecifierLeftKeyword_2_0_2());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_3, null);
                            					

                            }
                            break;
                        case 4 :
                            // InternalSimpleMio.g:789:6: lv_sensorSpecifier_2_4= 'right'
                            {
                            lv_sensorSpecifier_2_4=(Token)match(input,18,FOLLOW_9); 

                            						newLeafNode(lv_sensorSpecifier_2_4, grammarAccess.getSensorAccess().getSensorSpecifierRightKeyword_2_0_3());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_4, null);
                            					

                            }
                            break;
                        case 5 :
                            // InternalSimpleMio.g:800:6: lv_sensorSpecifier_2_5= 'up'
                            {
                            lv_sensorSpecifier_2_5=(Token)match(input,38,FOLLOW_9); 

                            						newLeafNode(lv_sensorSpecifier_2_5, grammarAccess.getSensorAccess().getSensorSpecifierUpKeyword_2_0_4());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_5, null);
                            					

                            }
                            break;
                        case 6 :
                            // InternalSimpleMio.g:811:6: lv_sensorSpecifier_2_6= 'down'
                            {
                            lv_sensorSpecifier_2_6=(Token)match(input,39,FOLLOW_9); 

                            						newLeafNode(lv_sensorSpecifier_2_6, grammarAccess.getSensorAccess().getSensorSpecifierDownKeyword_2_0_5());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSensorRule());
                            						}
                            						setWithLastConsumed(current, "sensorSpecifier", lv_sensorSpecifier_2_6, null);
                            					

                            }
                            break;
                        case 7 :
                            // InternalSimpleMio.g:822:6: lv_sensorSpecifier_2_7= 'center'
                            {
                            lv_sensorSpecifier_2_7=(Token)match(input,40,FOLLOW_9); 

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

            // InternalSimpleMio.g:835:3: (otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimpleMio.g:836:4: otherlv_3= '@' ( (lv_strength_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getCommercialAtKeyword_3_0());
                    			
                    // InternalSimpleMio.g:840:4: ( (lv_strength_4_0= ruleEInt ) )
                    // InternalSimpleMio.g:841:5: (lv_strength_4_0= ruleEInt )
                    {
                    // InternalSimpleMio.g:841:5: (lv_strength_4_0= ruleEInt )
                    // InternalSimpleMio.g:842:6: lv_strength_4_0= ruleEInt
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


    // $ANTLR start "entryRuleEString"
    // InternalSimpleMio.g:864:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSimpleMio.g:864:47: (iv_ruleEString= ruleEString EOF )
            // InternalSimpleMio.g:865:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSimpleMio.g:871:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSimpleMio.g:877:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSimpleMio.g:878:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSimpleMio.g:878:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimpleMio.g:879:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:887:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalSimpleMio.g:898:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSimpleMio.g:898:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSimpleMio.g:899:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSimpleMio.g:905:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSimpleMio.g:911:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSimpleMio.g:912:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSimpleMio.g:912:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSimpleMio.g:913:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSimpleMio.g:913:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSimpleMio.g:914:4: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_16); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000FB0000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000FB0000832L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001FE0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000FB0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000001F002060002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});

}