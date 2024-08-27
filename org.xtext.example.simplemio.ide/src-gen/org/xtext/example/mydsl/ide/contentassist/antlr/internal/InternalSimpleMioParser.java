package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.SimpleMioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimpleMioParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_SL_COMMENT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'move'", "'led'", "'turn'", "'stop'", "'left'", "'right'", "'forward'", "'backward'", "'red'", "'green'", "'blue'", "'off'", "'obstacle'", "'sound'", "'line'", "'button'", "'motor'", "'front'", "'back'", "'up'", "'down'", "'center'", "'->'", "','", "'@'", "'or'", "'and'", "'not'", "'('", "')'", "'-'"
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

    	public void setGrammarAccess(SimpleMioGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSimpleMio.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSimpleMio.g:54:1: ( ruleModel EOF )
            // InternalSimpleMio.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSimpleMio.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSimpleMio.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSimpleMio.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSimpleMio.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSimpleMio.g:69:3: ( rule__Model__Group__0 )
            // InternalSimpleMio.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgram"
    // InternalSimpleMio.g:78:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalSimpleMio.g:79:1: ( ruleProgram EOF )
            // InternalSimpleMio.g:80:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalSimpleMio.g:87:1: ruleProgram : ( ( ( rule__Program__EventsAssignment ) ) ( ( rule__Program__EventsAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:91:2: ( ( ( ( rule__Program__EventsAssignment ) ) ( ( rule__Program__EventsAssignment )* ) ) )
            // InternalSimpleMio.g:92:2: ( ( ( rule__Program__EventsAssignment ) ) ( ( rule__Program__EventsAssignment )* ) )
            {
            // InternalSimpleMio.g:92:2: ( ( ( rule__Program__EventsAssignment ) ) ( ( rule__Program__EventsAssignment )* ) )
            // InternalSimpleMio.g:93:3: ( ( rule__Program__EventsAssignment ) ) ( ( rule__Program__EventsAssignment )* )
            {
            // InternalSimpleMio.g:93:3: ( ( rule__Program__EventsAssignment ) )
            // InternalSimpleMio.g:94:4: ( rule__Program__EventsAssignment )
            {
             before(grammarAccess.getProgramAccess().getEventsAssignment()); 
            // InternalSimpleMio.g:95:4: ( rule__Program__EventsAssignment )
            // InternalSimpleMio.g:95:5: rule__Program__EventsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__EventsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getEventsAssignment()); 

            }

            // InternalSimpleMio.g:98:3: ( ( rule__Program__EventsAssignment )* )
            // InternalSimpleMio.g:99:4: ( rule__Program__EventsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getEventsAssignment()); 
            // InternalSimpleMio.g:100:4: ( rule__Program__EventsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=23 && LA1_0<=27)||(LA1_0>=38 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleMio.g:100:5: rule__Program__EventsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__EventsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getEventsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleEvent"
    // InternalSimpleMio.g:110:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalSimpleMio.g:111:1: ( ruleEvent EOF )
            // InternalSimpleMio.g:112:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalSimpleMio.g:119:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:123:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalSimpleMio.g:124:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalSimpleMio.g:124:2: ( ( rule__Event__Group__0 ) )
            // InternalSimpleMio.g:125:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalSimpleMio.g:126:3: ( rule__Event__Group__0 )
            // InternalSimpleMio.g:126:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAction"
    // InternalSimpleMio.g:135:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalSimpleMio.g:136:1: ( ruleAction EOF )
            // InternalSimpleMio.g:137:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalSimpleMio.g:144:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:148:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalSimpleMio.g:149:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalSimpleMio.g:149:2: ( ( rule__Action__Group__0 ) )
            // InternalSimpleMio.g:150:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalSimpleMio.g:151:3: ( rule__Action__Group__0 )
            // InternalSimpleMio.g:151:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleOr"
    // InternalSimpleMio.g:160:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalSimpleMio.g:161:1: ( ruleOr EOF )
            // InternalSimpleMio.g:162:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalSimpleMio.g:169:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:173:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalSimpleMio.g:174:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalSimpleMio.g:174:2: ( ( rule__Or__Group__0 ) )
            // InternalSimpleMio.g:175:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalSimpleMio.g:176:3: ( rule__Or__Group__0 )
            // InternalSimpleMio.g:176:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalSimpleMio.g:185:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalSimpleMio.g:186:1: ( ruleAnd EOF )
            // InternalSimpleMio.g:187:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalSimpleMio.g:194:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:198:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalSimpleMio.g:199:2: ( ( rule__And__Group__0 ) )
            {
            // InternalSimpleMio.g:199:2: ( ( rule__And__Group__0 ) )
            // InternalSimpleMio.g:200:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalSimpleMio.g:201:3: ( rule__And__Group__0 )
            // InternalSimpleMio.g:201:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleNot"
    // InternalSimpleMio.g:210:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalSimpleMio.g:211:1: ( ruleNot EOF )
            // InternalSimpleMio.g:212:1: ruleNot EOF
            {
             before(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getNotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalSimpleMio.g:219:1: ruleNot : ( ( rule__Not__Alternatives ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:223:2: ( ( ( rule__Not__Alternatives ) ) )
            // InternalSimpleMio.g:224:2: ( ( rule__Not__Alternatives ) )
            {
            // InternalSimpleMio.g:224:2: ( ( rule__Not__Alternatives ) )
            // InternalSimpleMio.g:225:3: ( rule__Not__Alternatives )
            {
             before(grammarAccess.getNotAccess().getAlternatives()); 
            // InternalSimpleMio.g:226:3: ( rule__Not__Alternatives )
            // InternalSimpleMio.g:226:4: rule__Not__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Not__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleParen"
    // InternalSimpleMio.g:235:1: entryRuleParen : ruleParen EOF ;
    public final void entryRuleParen() throws RecognitionException {
        try {
            // InternalSimpleMio.g:236:1: ( ruleParen EOF )
            // InternalSimpleMio.g:237:1: ruleParen EOF
            {
             before(grammarAccess.getParenRule()); 
            pushFollow(FOLLOW_1);
            ruleParen();

            state._fsp--;

             after(grammarAccess.getParenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParen"


    // $ANTLR start "ruleParen"
    // InternalSimpleMio.g:244:1: ruleParen : ( ( rule__Paren__Group__0 ) ) ;
    public final void ruleParen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:248:2: ( ( ( rule__Paren__Group__0 ) ) )
            // InternalSimpleMio.g:249:2: ( ( rule__Paren__Group__0 ) )
            {
            // InternalSimpleMio.g:249:2: ( ( rule__Paren__Group__0 ) )
            // InternalSimpleMio.g:250:3: ( rule__Paren__Group__0 )
            {
             before(grammarAccess.getParenAccess().getGroup()); 
            // InternalSimpleMio.g:251:3: ( rule__Paren__Group__0 )
            // InternalSimpleMio.g:251:4: rule__Paren__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paren__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParen"


    // $ANTLR start "entryRuleSensor"
    // InternalSimpleMio.g:260:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalSimpleMio.g:261:1: ( ruleSensor EOF )
            // InternalSimpleMio.g:262:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSimpleMio.g:269:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:273:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalSimpleMio.g:274:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalSimpleMio.g:274:2: ( ( rule__Sensor__Group__0 ) )
            // InternalSimpleMio.g:275:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalSimpleMio.g:276:3: ( rule__Sensor__Group__0 )
            // InternalSimpleMio.g:276:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleEInt"
    // InternalSimpleMio.g:285:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSimpleMio.g:286:1: ( ruleEInt EOF )
            // InternalSimpleMio.g:287:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSimpleMio.g:294:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:298:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSimpleMio.g:299:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSimpleMio.g:299:2: ( ( rule__EInt__Group__0 ) )
            // InternalSimpleMio.g:300:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSimpleMio.g:301:3: ( rule__EInt__Group__0 )
            // InternalSimpleMio.g:301:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__Action__ActionNameAlternatives_1_0"
    // InternalSimpleMio.g:309:1: rule__Action__ActionNameAlternatives_1_0 : ( ( 'move' ) | ( 'led' ) | ( 'turn' ) | ( 'stop' ) );
    public final void rule__Action__ActionNameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:313:1: ( ( 'move' ) | ( 'led' ) | ( 'turn' ) | ( 'stop' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSimpleMio.g:314:2: ( 'move' )
                    {
                    // InternalSimpleMio.g:314:2: ( 'move' )
                    // InternalSimpleMio.g:315:3: 'move'
                    {
                     before(grammarAccess.getActionAccess().getActionNameMoveKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionNameMoveKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:320:2: ( 'led' )
                    {
                    // InternalSimpleMio.g:320:2: ( 'led' )
                    // InternalSimpleMio.g:321:3: 'led'
                    {
                     before(grammarAccess.getActionAccess().getActionNameLedKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionNameLedKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:326:2: ( 'turn' )
                    {
                    // InternalSimpleMio.g:326:2: ( 'turn' )
                    // InternalSimpleMio.g:327:3: 'turn'
                    {
                     before(grammarAccess.getActionAccess().getActionNameTurnKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionNameTurnKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:332:2: ( 'stop' )
                    {
                    // InternalSimpleMio.g:332:2: ( 'stop' )
                    // InternalSimpleMio.g:333:3: 'stop'
                    {
                     before(grammarAccess.getActionAccess().getActionNameStopKeyword_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionNameStopKeyword_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionNameAlternatives_1_0"


    // $ANTLR start "rule__Action__ActionSpecifierAlternatives_2_0"
    // InternalSimpleMio.g:342:1: rule__Action__ActionSpecifierAlternatives_2_0 : ( ( 'left' ) | ( 'right' ) | ( 'forward' ) | ( 'backward' ) | ( 'red' ) | ( 'green' ) | ( 'blue' ) | ( 'off' ) );
    public final void rule__Action__ActionSpecifierAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:346:1: ( ( 'left' ) | ( 'right' ) | ( 'forward' ) | ( 'backward' ) | ( 'red' ) | ( 'green' ) | ( 'blue' ) | ( 'off' ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            case 21:
                {
                alt3=7;
                }
                break;
            case 22:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSimpleMio.g:347:2: ( 'left' )
                    {
                    // InternalSimpleMio.g:347:2: ( 'left' )
                    // InternalSimpleMio.g:348:3: 'left'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierLeftKeyword_2_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierLeftKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:353:2: ( 'right' )
                    {
                    // InternalSimpleMio.g:353:2: ( 'right' )
                    // InternalSimpleMio.g:354:3: 'right'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierRightKeyword_2_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierRightKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:359:2: ( 'forward' )
                    {
                    // InternalSimpleMio.g:359:2: ( 'forward' )
                    // InternalSimpleMio.g:360:3: 'forward'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierForwardKeyword_2_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierForwardKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:365:2: ( 'backward' )
                    {
                    // InternalSimpleMio.g:365:2: ( 'backward' )
                    // InternalSimpleMio.g:366:3: 'backward'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierBackwardKeyword_2_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierBackwardKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:371:2: ( 'red' )
                    {
                    // InternalSimpleMio.g:371:2: ( 'red' )
                    // InternalSimpleMio.g:372:3: 'red'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierRedKeyword_2_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierRedKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleMio.g:377:2: ( 'green' )
                    {
                    // InternalSimpleMio.g:377:2: ( 'green' )
                    // InternalSimpleMio.g:378:3: 'green'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierGreenKeyword_2_0_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierGreenKeyword_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleMio.g:383:2: ( 'blue' )
                    {
                    // InternalSimpleMio.g:383:2: ( 'blue' )
                    // InternalSimpleMio.g:384:3: 'blue'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierBlueKeyword_2_0_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierBlueKeyword_2_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSimpleMio.g:389:2: ( 'off' )
                    {
                    // InternalSimpleMio.g:389:2: ( 'off' )
                    // InternalSimpleMio.g:390:3: 'off'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierOffKeyword_2_0_7()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierOffKeyword_2_0_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionSpecifierAlternatives_2_0"


    // $ANTLR start "rule__Not__Alternatives"
    // InternalSimpleMio.g:399:1: rule__Not__Alternatives : ( ( ( rule__Not__Group_0__0 ) ) | ( ( rule__Not__Group_1__0 ) ) | ( ruleSensor ) | ( ruleParen ) );
    public final void rule__Not__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:403:1: ( ( ( rule__Not__Group_0__0 ) ) | ( ( rule__Not__Group_1__0 ) ) | ( ruleSensor ) | ( ruleParen ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=23 && LA4_1<=27)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==39) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                {
                alt4=3;
                }
                break;
            case 39:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSimpleMio.g:404:2: ( ( rule__Not__Group_0__0 ) )
                    {
                    // InternalSimpleMio.g:404:2: ( ( rule__Not__Group_0__0 ) )
                    // InternalSimpleMio.g:405:3: ( rule__Not__Group_0__0 )
                    {
                     before(grammarAccess.getNotAccess().getGroup_0()); 
                    // InternalSimpleMio.g:406:3: ( rule__Not__Group_0__0 )
                    // InternalSimpleMio.g:406:4: rule__Not__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Not__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:410:2: ( ( rule__Not__Group_1__0 ) )
                    {
                    // InternalSimpleMio.g:410:2: ( ( rule__Not__Group_1__0 ) )
                    // InternalSimpleMio.g:411:3: ( rule__Not__Group_1__0 )
                    {
                     before(grammarAccess.getNotAccess().getGroup_1()); 
                    // InternalSimpleMio.g:412:3: ( rule__Not__Group_1__0 )
                    // InternalSimpleMio.g:412:4: rule__Not__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Not__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:416:2: ( ruleSensor )
                    {
                    // InternalSimpleMio.g:416:2: ( ruleSensor )
                    // InternalSimpleMio.g:417:3: ruleSensor
                    {
                     before(grammarAccess.getNotAccess().getSensorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getNotAccess().getSensorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:422:2: ( ruleParen )
                    {
                    // InternalSimpleMio.g:422:2: ( ruleParen )
                    // InternalSimpleMio.g:423:3: ruleParen
                    {
                     before(grammarAccess.getNotAccess().getParenParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParen();

                    state._fsp--;

                     after(grammarAccess.getNotAccess().getParenParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Alternatives"


    // $ANTLR start "rule__Sensor__SensorNameAlternatives_1_0"
    // InternalSimpleMio.g:432:1: rule__Sensor__SensorNameAlternatives_1_0 : ( ( 'obstacle' ) | ( 'sound' ) | ( 'line' ) | ( 'button' ) | ( 'motor' ) );
    public final void rule__Sensor__SensorNameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:436:1: ( ( 'obstacle' ) | ( 'sound' ) | ( 'line' ) | ( 'button' ) | ( 'motor' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSimpleMio.g:437:2: ( 'obstacle' )
                    {
                    // InternalSimpleMio.g:437:2: ( 'obstacle' )
                    // InternalSimpleMio.g:438:3: 'obstacle'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameObstacleKeyword_1_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameObstacleKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:443:2: ( 'sound' )
                    {
                    // InternalSimpleMio.g:443:2: ( 'sound' )
                    // InternalSimpleMio.g:444:3: 'sound'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameSoundKeyword_1_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameSoundKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:449:2: ( 'line' )
                    {
                    // InternalSimpleMio.g:449:2: ( 'line' )
                    // InternalSimpleMio.g:450:3: 'line'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameLineKeyword_1_0_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameLineKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:455:2: ( 'button' )
                    {
                    // InternalSimpleMio.g:455:2: ( 'button' )
                    // InternalSimpleMio.g:456:3: 'button'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameButtonKeyword_1_0_3()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameButtonKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:461:2: ( 'motor' )
                    {
                    // InternalSimpleMio.g:461:2: ( 'motor' )
                    // InternalSimpleMio.g:462:3: 'motor'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameMotorKeyword_1_0_4()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameMotorKeyword_1_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SensorNameAlternatives_1_0"


    // $ANTLR start "rule__Sensor__SensorSpecifierAlternatives_2_0"
    // InternalSimpleMio.g:471:1: rule__Sensor__SensorSpecifierAlternatives_2_0 : ( ( 'front' ) | ( 'back' ) | ( 'left' ) | ( 'right' ) | ( 'up' ) | ( 'down' ) | ( 'center' ) );
    public final void rule__Sensor__SensorSpecifierAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:475:1: ( ( 'front' ) | ( 'back' ) | ( 'left' ) | ( 'right' ) | ( 'up' ) | ( 'down' ) | ( 'center' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 30:
                {
                alt6=5;
                }
                break;
            case 31:
                {
                alt6=6;
                }
                break;
            case 32:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSimpleMio.g:476:2: ( 'front' )
                    {
                    // InternalSimpleMio.g:476:2: ( 'front' )
                    // InternalSimpleMio.g:477:3: 'front'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierFrontKeyword_2_0_0()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierFrontKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:482:2: ( 'back' )
                    {
                    // InternalSimpleMio.g:482:2: ( 'back' )
                    // InternalSimpleMio.g:483:3: 'back'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierBackKeyword_2_0_1()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierBackKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:488:2: ( 'left' )
                    {
                    // InternalSimpleMio.g:488:2: ( 'left' )
                    // InternalSimpleMio.g:489:3: 'left'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierLeftKeyword_2_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierLeftKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:494:2: ( 'right' )
                    {
                    // InternalSimpleMio.g:494:2: ( 'right' )
                    // InternalSimpleMio.g:495:3: 'right'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierRightKeyword_2_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierRightKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:500:2: ( 'up' )
                    {
                    // InternalSimpleMio.g:500:2: ( 'up' )
                    // InternalSimpleMio.g:501:3: 'up'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierUpKeyword_2_0_4()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierUpKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleMio.g:506:2: ( 'down' )
                    {
                    // InternalSimpleMio.g:506:2: ( 'down' )
                    // InternalSimpleMio.g:507:3: 'down'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierDownKeyword_2_0_5()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierDownKeyword_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleMio.g:512:2: ( 'center' )
                    {
                    // InternalSimpleMio.g:512:2: ( 'center' )
                    // InternalSimpleMio.g:513:3: 'center'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierCenterKeyword_2_0_6()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierCenterKeyword_2_0_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SensorSpecifierAlternatives_2_0"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSimpleMio.g:522:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:526:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSimpleMio.g:527:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSimpleMio.g:534:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:538:1: ( ( () ) )
            // InternalSimpleMio.g:539:1: ( () )
            {
            // InternalSimpleMio.g:539:1: ( () )
            // InternalSimpleMio.g:540:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalSimpleMio.g:541:2: ()
            // InternalSimpleMio.g:541:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSimpleMio.g:549:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:553:1: ( rule__Model__Group__1__Impl )
            // InternalSimpleMio.g:554:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSimpleMio.g:560:1: rule__Model__Group__1__Impl : ( ( rule__Model__ProgramAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:564:1: ( ( ( rule__Model__ProgramAssignment_1 ) ) )
            // InternalSimpleMio.g:565:1: ( ( rule__Model__ProgramAssignment_1 ) )
            {
            // InternalSimpleMio.g:565:1: ( ( rule__Model__ProgramAssignment_1 ) )
            // InternalSimpleMio.g:566:2: ( rule__Model__ProgramAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getProgramAssignment_1()); 
            // InternalSimpleMio.g:567:2: ( rule__Model__ProgramAssignment_1 )
            // InternalSimpleMio.g:567:3: rule__Model__ProgramAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ProgramAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProgramAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalSimpleMio.g:576:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:580:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalSimpleMio.g:581:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalSimpleMio.g:588:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:592:1: ( ( () ) )
            // InternalSimpleMio.g:593:1: ( () )
            {
            // InternalSimpleMio.g:593:1: ( () )
            // InternalSimpleMio.g:594:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalSimpleMio.g:595:2: ()
            // InternalSimpleMio.g:595:3: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalSimpleMio.g:603:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:607:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalSimpleMio.g:608:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalSimpleMio.g:615:1: rule__Event__Group__1__Impl : ( ( rule__Event__ConditionalsensorAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:619:1: ( ( ( rule__Event__ConditionalsensorAssignment_1 ) ) )
            // InternalSimpleMio.g:620:1: ( ( rule__Event__ConditionalsensorAssignment_1 ) )
            {
            // InternalSimpleMio.g:620:1: ( ( rule__Event__ConditionalsensorAssignment_1 ) )
            // InternalSimpleMio.g:621:2: ( rule__Event__ConditionalsensorAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getConditionalsensorAssignment_1()); 
            // InternalSimpleMio.g:622:2: ( rule__Event__ConditionalsensorAssignment_1 )
            // InternalSimpleMio.g:622:3: rule__Event__ConditionalsensorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ConditionalsensorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getConditionalsensorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalSimpleMio.g:630:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:634:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalSimpleMio.g:635:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalSimpleMio.g:642:1: rule__Event__Group__2__Impl : ( '->' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:646:1: ( ( '->' ) )
            // InternalSimpleMio.g:647:1: ( '->' )
            {
            // InternalSimpleMio.g:647:1: ( '->' )
            // InternalSimpleMio.g:648:2: '->'
            {
             before(grammarAccess.getEventAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalSimpleMio.g:657:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:661:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalSimpleMio.g:662:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalSimpleMio.g:669:1: rule__Event__Group__3__Impl : ( ( rule__Event__ActionsAssignment_3 ) ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:673:1: ( ( ( rule__Event__ActionsAssignment_3 ) ) )
            // InternalSimpleMio.g:674:1: ( ( rule__Event__ActionsAssignment_3 ) )
            {
            // InternalSimpleMio.g:674:1: ( ( rule__Event__ActionsAssignment_3 ) )
            // InternalSimpleMio.g:675:2: ( rule__Event__ActionsAssignment_3 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_3()); 
            // InternalSimpleMio.g:676:2: ( rule__Event__ActionsAssignment_3 )
            // InternalSimpleMio.g:676:3: rule__Event__ActionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Event__ActionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // InternalSimpleMio.g:684:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:688:1: ( rule__Event__Group__4__Impl )
            // InternalSimpleMio.g:689:2: rule__Event__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // InternalSimpleMio.g:695:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )* ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:699:1: ( ( ( rule__Event__Group_4__0 )* ) )
            // InternalSimpleMio.g:700:1: ( ( rule__Event__Group_4__0 )* )
            {
            // InternalSimpleMio.g:700:1: ( ( rule__Event__Group_4__0 )* )
            // InternalSimpleMio.g:701:2: ( rule__Event__Group_4__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalSimpleMio.g:702:2: ( rule__Event__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimpleMio.g:702:3: rule__Event__Group_4__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Event__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group_4__0"
    // InternalSimpleMio.g:711:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:715:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalSimpleMio.g:716:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Event__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__0"


    // $ANTLR start "rule__Event__Group_4__0__Impl"
    // InternalSimpleMio.g:723:1: rule__Event__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:727:1: ( ( ',' ) )
            // InternalSimpleMio.g:728:1: ( ',' )
            {
            // InternalSimpleMio.g:728:1: ( ',' )
            // InternalSimpleMio.g:729:2: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__0__Impl"


    // $ANTLR start "rule__Event__Group_4__1"
    // InternalSimpleMio.g:738:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:742:1: ( rule__Event__Group_4__1__Impl )
            // InternalSimpleMio.g:743:2: rule__Event__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__1"


    // $ANTLR start "rule__Event__Group_4__1__Impl"
    // InternalSimpleMio.g:749:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__ActionsAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:753:1: ( ( ( rule__Event__ActionsAssignment_4_1 ) ) )
            // InternalSimpleMio.g:754:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            {
            // InternalSimpleMio.g:754:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            // InternalSimpleMio.g:755:2: ( rule__Event__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_1()); 
            // InternalSimpleMio.g:756:2: ( rule__Event__ActionsAssignment_4_1 )
            // InternalSimpleMio.g:756:3: rule__Event__ActionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ActionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getActionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalSimpleMio.g:765:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:769:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalSimpleMio.g:770:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalSimpleMio.g:777:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:781:1: ( ( () ) )
            // InternalSimpleMio.g:782:1: ( () )
            {
            // InternalSimpleMio.g:782:1: ( () )
            // InternalSimpleMio.g:783:2: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // InternalSimpleMio.g:784:2: ()
            // InternalSimpleMio.g:784:3: 
            {
            }

             after(grammarAccess.getActionAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalSimpleMio.g:792:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:796:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalSimpleMio.g:797:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalSimpleMio.g:804:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActionNameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:808:1: ( ( ( rule__Action__ActionNameAssignment_1 ) ) )
            // InternalSimpleMio.g:809:1: ( ( rule__Action__ActionNameAssignment_1 ) )
            {
            // InternalSimpleMio.g:809:1: ( ( rule__Action__ActionNameAssignment_1 ) )
            // InternalSimpleMio.g:810:2: ( rule__Action__ActionNameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getActionNameAssignment_1()); 
            // InternalSimpleMio.g:811:2: ( rule__Action__ActionNameAssignment_1 )
            // InternalSimpleMio.g:811:3: rule__Action__ActionNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalSimpleMio.g:819:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:823:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalSimpleMio.g:824:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalSimpleMio.g:831:1: rule__Action__Group__2__Impl : ( ( rule__Action__ActionSpecifierAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:835:1: ( ( ( rule__Action__ActionSpecifierAssignment_2 )? ) )
            // InternalSimpleMio.g:836:1: ( ( rule__Action__ActionSpecifierAssignment_2 )? )
            {
            // InternalSimpleMio.g:836:1: ( ( rule__Action__ActionSpecifierAssignment_2 )? )
            // InternalSimpleMio.g:837:2: ( rule__Action__ActionSpecifierAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getActionSpecifierAssignment_2()); 
            // InternalSimpleMio.g:838:2: ( rule__Action__ActionSpecifierAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=15 && LA8_0<=22)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSimpleMio.g:838:3: rule__Action__ActionSpecifierAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ActionSpecifierAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getActionSpecifierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group__3"
    // InternalSimpleMio.g:846:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:850:1: ( rule__Action__Group__3__Impl )
            // InternalSimpleMio.g:851:2: rule__Action__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3"


    // $ANTLR start "rule__Action__Group__3__Impl"
    // InternalSimpleMio.g:857:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:861:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // InternalSimpleMio.g:862:1: ( ( rule__Action__Group_3__0 )? )
            {
            // InternalSimpleMio.g:862:1: ( ( rule__Action__Group_3__0 )? )
            // InternalSimpleMio.g:863:2: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // InternalSimpleMio.g:864:2: ( rule__Action__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSimpleMio.g:864:3: rule__Action__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__3__Impl"


    // $ANTLR start "rule__Action__Group_3__0"
    // InternalSimpleMio.g:873:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:877:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // InternalSimpleMio.g:878:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Action__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0"


    // $ANTLR start "rule__Action__Group_3__0__Impl"
    // InternalSimpleMio.g:885:1: rule__Action__Group_3__0__Impl : ( '@' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:889:1: ( ( '@' ) )
            // InternalSimpleMio.g:890:1: ( '@' )
            {
            // InternalSimpleMio.g:890:1: ( '@' )
            // InternalSimpleMio.g:891:2: '@'
            {
             before(grammarAccess.getActionAccess().getCommercialAtKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCommercialAtKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__0__Impl"


    // $ANTLR start "rule__Action__Group_3__1"
    // InternalSimpleMio.g:900:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:904:1: ( rule__Action__Group_3__1__Impl )
            // InternalSimpleMio.g:905:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1"


    // $ANTLR start "rule__Action__Group_3__1__Impl"
    // InternalSimpleMio.g:911:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__StrengthAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:915:1: ( ( ( rule__Action__StrengthAssignment_3_1 ) ) )
            // InternalSimpleMio.g:916:1: ( ( rule__Action__StrengthAssignment_3_1 ) )
            {
            // InternalSimpleMio.g:916:1: ( ( rule__Action__StrengthAssignment_3_1 ) )
            // InternalSimpleMio.g:917:2: ( rule__Action__StrengthAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getStrengthAssignment_3_1()); 
            // InternalSimpleMio.g:918:2: ( rule__Action__StrengthAssignment_3_1 )
            // InternalSimpleMio.g:918:3: rule__Action__StrengthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__StrengthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getStrengthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_3__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalSimpleMio.g:927:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:931:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalSimpleMio.g:932:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalSimpleMio.g:939:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:943:1: ( ( ruleAnd ) )
            // InternalSimpleMio.g:944:1: ( ruleAnd )
            {
            // InternalSimpleMio.g:944:1: ( ruleAnd )
            // InternalSimpleMio.g:945:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalSimpleMio.g:954:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:958:1: ( rule__Or__Group__1__Impl )
            // InternalSimpleMio.g:959:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalSimpleMio.g:965:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:969:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalSimpleMio.g:970:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalSimpleMio.g:970:1: ( ( rule__Or__Group_1__0 )* )
            // InternalSimpleMio.g:971:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalSimpleMio.g:972:2: ( rule__Or__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleMio.g:972:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalSimpleMio.g:981:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:985:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalSimpleMio.g:986:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalSimpleMio.g:993:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:997:1: ( ( () ) )
            // InternalSimpleMio.g:998:1: ( () )
            {
            // InternalSimpleMio.g:998:1: ( () )
            // InternalSimpleMio.g:999:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalSimpleMio.g:1000:2: ()
            // InternalSimpleMio.g:1000:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalSimpleMio.g:1008:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1012:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalSimpleMio.g:1013:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalSimpleMio.g:1020:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1024:1: ( ( 'or' ) )
            // InternalSimpleMio.g:1025:1: ( 'or' )
            {
            // InternalSimpleMio.g:1025:1: ( 'or' )
            // InternalSimpleMio.g:1026:2: 'or'
            {
             before(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalSimpleMio.g:1035:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1039:1: ( rule__Or__Group_1__2__Impl )
            // InternalSimpleMio.g:1040:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalSimpleMio.g:1046:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1050:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalSimpleMio.g:1051:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalSimpleMio.g:1051:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalSimpleMio.g:1052:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalSimpleMio.g:1053:2: ( rule__Or__RightAssignment_1_2 )
            // InternalSimpleMio.g:1053:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalSimpleMio.g:1062:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1066:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSimpleMio.g:1067:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalSimpleMio.g:1074:1: rule__And__Group__0__Impl : ( ruleNot ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1078:1: ( ( ruleNot ) )
            // InternalSimpleMio.g:1079:1: ( ruleNot )
            {
            // InternalSimpleMio.g:1079:1: ( ruleNot )
            // InternalSimpleMio.g:1080:2: ruleNot
            {
             before(grammarAccess.getAndAccess().getNotParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getAndAccess().getNotParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalSimpleMio.g:1089:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1093:1: ( rule__And__Group__1__Impl )
            // InternalSimpleMio.g:1094:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalSimpleMio.g:1100:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1104:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalSimpleMio.g:1105:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalSimpleMio.g:1105:1: ( ( rule__And__Group_1__0 )* )
            // InternalSimpleMio.g:1106:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalSimpleMio.g:1107:2: ( rule__And__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSimpleMio.g:1107:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalSimpleMio.g:1116:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1120:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalSimpleMio.g:1121:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalSimpleMio.g:1128:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1132:1: ( ( () ) )
            // InternalSimpleMio.g:1133:1: ( () )
            {
            // InternalSimpleMio.g:1133:1: ( () )
            // InternalSimpleMio.g:1134:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalSimpleMio.g:1135:2: ()
            // InternalSimpleMio.g:1135:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalSimpleMio.g:1143:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1147:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalSimpleMio.g:1148:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalSimpleMio.g:1155:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1159:1: ( ( 'and' ) )
            // InternalSimpleMio.g:1160:1: ( 'and' )
            {
            // InternalSimpleMio.g:1160:1: ( 'and' )
            // InternalSimpleMio.g:1161:2: 'and'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalSimpleMio.g:1170:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1174:1: ( rule__And__Group_1__2__Impl )
            // InternalSimpleMio.g:1175:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalSimpleMio.g:1181:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1185:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalSimpleMio.g:1186:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalSimpleMio.g:1186:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalSimpleMio.g:1187:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalSimpleMio.g:1188:2: ( rule__And__RightAssignment_1_2 )
            // InternalSimpleMio.g:1188:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Not__Group_0__0"
    // InternalSimpleMio.g:1197:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1201:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // InternalSimpleMio.g:1202:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Not__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__0"


    // $ANTLR start "rule__Not__Group_0__0__Impl"
    // InternalSimpleMio.g:1209:1: rule__Not__Group_0__0__Impl : ( () ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1213:1: ( ( () ) )
            // InternalSimpleMio.g:1214:1: ( () )
            {
            // InternalSimpleMio.g:1214:1: ( () )
            // InternalSimpleMio.g:1215:2: ()
            {
             before(grammarAccess.getNotAccess().getNotAction_0_0()); 
            // InternalSimpleMio.g:1216:2: ()
            // InternalSimpleMio.g:1216:3: 
            {
            }

             after(grammarAccess.getNotAccess().getNotAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__0__Impl"


    // $ANTLR start "rule__Not__Group_0__1"
    // InternalSimpleMio.g:1224:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1228:1: ( rule__Not__Group_0__1__Impl )
            // InternalSimpleMio.g:1229:2: rule__Not__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__1"


    // $ANTLR start "rule__Not__Group_0__1__Impl"
    // InternalSimpleMio.g:1235:1: rule__Not__Group_0__1__Impl : ( ( rule__Not__Group_0_1__0 ) ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1239:1: ( ( ( rule__Not__Group_0_1__0 ) ) )
            // InternalSimpleMio.g:1240:1: ( ( rule__Not__Group_0_1__0 ) )
            {
            // InternalSimpleMio.g:1240:1: ( ( rule__Not__Group_0_1__0 ) )
            // InternalSimpleMio.g:1241:2: ( rule__Not__Group_0_1__0 )
            {
             before(grammarAccess.getNotAccess().getGroup_0_1()); 
            // InternalSimpleMio.g:1242:2: ( rule__Not__Group_0_1__0 )
            // InternalSimpleMio.g:1242:3: rule__Not__Group_0_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_0_1__0();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__1__Impl"


    // $ANTLR start "rule__Not__Group_0_1__0"
    // InternalSimpleMio.g:1251:1: rule__Not__Group_0_1__0 : rule__Not__Group_0_1__0__Impl rule__Not__Group_0_1__1 ;
    public final void rule__Not__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1255:1: ( rule__Not__Group_0_1__0__Impl rule__Not__Group_0_1__1 )
            // InternalSimpleMio.g:1256:2: rule__Not__Group_0_1__0__Impl rule__Not__Group_0_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Not__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0_1__0"


    // $ANTLR start "rule__Not__Group_0_1__0__Impl"
    // InternalSimpleMio.g:1263:1: rule__Not__Group_0_1__0__Impl : ( 'not' ) ;
    public final void rule__Not__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1267:1: ( ( 'not' ) )
            // InternalSimpleMio.g:1268:1: ( 'not' )
            {
            // InternalSimpleMio.g:1268:1: ( 'not' )
            // InternalSimpleMio.g:1269:2: 'not'
            {
             before(grammarAccess.getNotAccess().getNotKeyword_0_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getNotKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0_1__0__Impl"


    // $ANTLR start "rule__Not__Group_0_1__1"
    // InternalSimpleMio.g:1278:1: rule__Not__Group_0_1__1 : rule__Not__Group_0_1__1__Impl ;
    public final void rule__Not__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1282:1: ( rule__Not__Group_0_1__1__Impl )
            // InternalSimpleMio.g:1283:2: rule__Not__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0_1__1"


    // $ANTLR start "rule__Not__Group_0_1__1__Impl"
    // InternalSimpleMio.g:1289:1: rule__Not__Group_0_1__1__Impl : ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) ) ;
    public final void rule__Not__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1293:1: ( ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) ) )
            // InternalSimpleMio.g:1294:1: ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) )
            {
            // InternalSimpleMio.g:1294:1: ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) )
            // InternalSimpleMio.g:1295:2: ( rule__Not__ConditionalsensorAssignment_0_1_1 )
            {
             before(grammarAccess.getNotAccess().getConditionalsensorAssignment_0_1_1()); 
            // InternalSimpleMio.g:1296:2: ( rule__Not__ConditionalsensorAssignment_0_1_1 )
            // InternalSimpleMio.g:1296:3: rule__Not__ConditionalsensorAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Not__ConditionalsensorAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getConditionalsensorAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0_1__1__Impl"


    // $ANTLR start "rule__Not__Group_1__0"
    // InternalSimpleMio.g:1305:1: rule__Not__Group_1__0 : rule__Not__Group_1__0__Impl rule__Not__Group_1__1 ;
    public final void rule__Not__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1309:1: ( rule__Not__Group_1__0__Impl rule__Not__Group_1__1 )
            // InternalSimpleMio.g:1310:2: rule__Not__Group_1__0__Impl rule__Not__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Not__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1__0"


    // $ANTLR start "rule__Not__Group_1__0__Impl"
    // InternalSimpleMio.g:1317:1: rule__Not__Group_1__0__Impl : ( () ) ;
    public final void rule__Not__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1321:1: ( ( () ) )
            // InternalSimpleMio.g:1322:1: ( () )
            {
            // InternalSimpleMio.g:1322:1: ( () )
            // InternalSimpleMio.g:1323:2: ()
            {
             before(grammarAccess.getNotAccess().getNotAction_1_0()); 
            // InternalSimpleMio.g:1324:2: ()
            // InternalSimpleMio.g:1324:3: 
            {
            }

             after(grammarAccess.getNotAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1__0__Impl"


    // $ANTLR start "rule__Not__Group_1__1"
    // InternalSimpleMio.g:1332:1: rule__Not__Group_1__1 : rule__Not__Group_1__1__Impl ;
    public final void rule__Not__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1336:1: ( rule__Not__Group_1__1__Impl )
            // InternalSimpleMio.g:1337:2: rule__Not__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1__1"


    // $ANTLR start "rule__Not__Group_1__1__Impl"
    // InternalSimpleMio.g:1343:1: rule__Not__Group_1__1__Impl : ( ( rule__Not__Group_1_1__0 ) ) ;
    public final void rule__Not__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1347:1: ( ( ( rule__Not__Group_1_1__0 ) ) )
            // InternalSimpleMio.g:1348:1: ( ( rule__Not__Group_1_1__0 ) )
            {
            // InternalSimpleMio.g:1348:1: ( ( rule__Not__Group_1_1__0 ) )
            // InternalSimpleMio.g:1349:2: ( rule__Not__Group_1_1__0 )
            {
             before(grammarAccess.getNotAccess().getGroup_1_1()); 
            // InternalSimpleMio.g:1350:2: ( rule__Not__Group_1_1__0 )
            // InternalSimpleMio.g:1350:3: rule__Not__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1__1__Impl"


    // $ANTLR start "rule__Not__Group_1_1__0"
    // InternalSimpleMio.g:1359:1: rule__Not__Group_1_1__0 : rule__Not__Group_1_1__0__Impl rule__Not__Group_1_1__1 ;
    public final void rule__Not__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1363:1: ( rule__Not__Group_1_1__0__Impl rule__Not__Group_1_1__1 )
            // InternalSimpleMio.g:1364:2: rule__Not__Group_1_1__0__Impl rule__Not__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Not__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1_1__0"


    // $ANTLR start "rule__Not__Group_1_1__0__Impl"
    // InternalSimpleMio.g:1371:1: rule__Not__Group_1_1__0__Impl : ( 'not' ) ;
    public final void rule__Not__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1375:1: ( ( 'not' ) )
            // InternalSimpleMio.g:1376:1: ( 'not' )
            {
            // InternalSimpleMio.g:1376:1: ( 'not' )
            // InternalSimpleMio.g:1377:2: 'not'
            {
             before(grammarAccess.getNotAccess().getNotKeyword_1_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getNotKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1_1__0__Impl"


    // $ANTLR start "rule__Not__Group_1_1__1"
    // InternalSimpleMio.g:1386:1: rule__Not__Group_1_1__1 : rule__Not__Group_1_1__1__Impl ;
    public final void rule__Not__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1390:1: ( rule__Not__Group_1_1__1__Impl )
            // InternalSimpleMio.g:1391:2: rule__Not__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1_1__1"


    // $ANTLR start "rule__Not__Group_1_1__1__Impl"
    // InternalSimpleMio.g:1397:1: rule__Not__Group_1_1__1__Impl : ( ( rule__Not__ConditionalsensorAssignment_1_1_1 ) ) ;
    public final void rule__Not__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1401:1: ( ( ( rule__Not__ConditionalsensorAssignment_1_1_1 ) ) )
            // InternalSimpleMio.g:1402:1: ( ( rule__Not__ConditionalsensorAssignment_1_1_1 ) )
            {
            // InternalSimpleMio.g:1402:1: ( ( rule__Not__ConditionalsensorAssignment_1_1_1 ) )
            // InternalSimpleMio.g:1403:2: ( rule__Not__ConditionalsensorAssignment_1_1_1 )
            {
             before(grammarAccess.getNotAccess().getConditionalsensorAssignment_1_1_1()); 
            // InternalSimpleMio.g:1404:2: ( rule__Not__ConditionalsensorAssignment_1_1_1 )
            // InternalSimpleMio.g:1404:3: rule__Not__ConditionalsensorAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Not__ConditionalsensorAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getConditionalsensorAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_1_1__1__Impl"


    // $ANTLR start "rule__Paren__Group__0"
    // InternalSimpleMio.g:1413:1: rule__Paren__Group__0 : rule__Paren__Group__0__Impl rule__Paren__Group__1 ;
    public final void rule__Paren__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1417:1: ( rule__Paren__Group__0__Impl rule__Paren__Group__1 )
            // InternalSimpleMio.g:1418:2: rule__Paren__Group__0__Impl rule__Paren__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Paren__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paren__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paren__Group__0"


    // $ANTLR start "rule__Paren__Group__0__Impl"
    // InternalSimpleMio.g:1425:1: rule__Paren__Group__0__Impl : ( '(' ) ;
    public final void rule__Paren__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1429:1: ( ( '(' ) )
            // InternalSimpleMio.g:1430:1: ( '(' )
            {
            // InternalSimpleMio.g:1430:1: ( '(' )
            // InternalSimpleMio.g:1431:2: '('
            {
             before(grammarAccess.getParenAccess().getLeftParenthesisKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParenAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paren__Group__0__Impl"


    // $ANTLR start "rule__Paren__Group__1"
    // InternalSimpleMio.g:1440:1: rule__Paren__Group__1 : rule__Paren__Group__1__Impl rule__Paren__Group__2 ;
    public final void rule__Paren__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1444:1: ( rule__Paren__Group__1__Impl rule__Paren__Group__2 )
            // InternalSimpleMio.g:1445:2: rule__Paren__Group__1__Impl rule__Paren__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Paren__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paren__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paren__Group__1"


    // $ANTLR start "rule__Paren__Group__1__Impl"
    // InternalSimpleMio.g:1452:1: rule__Paren__Group__1__Impl : ( ruleOr ) ;
    public final void rule__Paren__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1456:1: ( ( ruleOr ) )
            // InternalSimpleMio.g:1457:1: ( ruleOr )
            {
            // InternalSimpleMio.g:1457:1: ( ruleOr )
            // InternalSimpleMio.g:1458:2: ruleOr
            {
             before(grammarAccess.getParenAccess().getOrParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getParenAccess().getOrParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paren__Group__1__Impl"


    // $ANTLR start "rule__Paren__Group__2"
    // InternalSimpleMio.g:1467:1: rule__Paren__Group__2 : rule__Paren__Group__2__Impl ;
    public final void rule__Paren__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1471:1: ( rule__Paren__Group__2__Impl )
            // InternalSimpleMio.g:1472:2: rule__Paren__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paren__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paren__Group__2"


    // $ANTLR start "rule__Paren__Group__2__Impl"
    // InternalSimpleMio.g:1478:1: rule__Paren__Group__2__Impl : ( ')' ) ;
    public final void rule__Paren__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1482:1: ( ( ')' ) )
            // InternalSimpleMio.g:1483:1: ( ')' )
            {
            // InternalSimpleMio.g:1483:1: ( ')' )
            // InternalSimpleMio.g:1484:2: ')'
            {
             before(grammarAccess.getParenAccess().getRightParenthesisKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getParenAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paren__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalSimpleMio.g:1494:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1498:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSimpleMio.g:1499:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalSimpleMio.g:1506:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1510:1: ( ( () ) )
            // InternalSimpleMio.g:1511:1: ( () )
            {
            // InternalSimpleMio.g:1511:1: ( () )
            // InternalSimpleMio.g:1512:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalSimpleMio.g:1513:2: ()
            // InternalSimpleMio.g:1513:3: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalSimpleMio.g:1521:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1525:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalSimpleMio.g:1526:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalSimpleMio.g:1533:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__SensorNameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1537:1: ( ( ( rule__Sensor__SensorNameAssignment_1 ) ) )
            // InternalSimpleMio.g:1538:1: ( ( rule__Sensor__SensorNameAssignment_1 ) )
            {
            // InternalSimpleMio.g:1538:1: ( ( rule__Sensor__SensorNameAssignment_1 ) )
            // InternalSimpleMio.g:1539:2: ( rule__Sensor__SensorNameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getSensorNameAssignment_1()); 
            // InternalSimpleMio.g:1540:2: ( rule__Sensor__SensorNameAssignment_1 )
            // InternalSimpleMio.g:1540:3: rule__Sensor__SensorNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalSimpleMio.g:1548:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1552:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalSimpleMio.g:1553:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalSimpleMio.g:1560:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__SensorSpecifierAssignment_2 )? ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1564:1: ( ( ( rule__Sensor__SensorSpecifierAssignment_2 )? ) )
            // InternalSimpleMio.g:1565:1: ( ( rule__Sensor__SensorSpecifierAssignment_2 )? )
            {
            // InternalSimpleMio.g:1565:1: ( ( rule__Sensor__SensorSpecifierAssignment_2 )? )
            // InternalSimpleMio.g:1566:2: ( rule__Sensor__SensorSpecifierAssignment_2 )?
            {
             before(grammarAccess.getSensorAccess().getSensorSpecifierAssignment_2()); 
            // InternalSimpleMio.g:1567:2: ( rule__Sensor__SensorSpecifierAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=15 && LA12_0<=16)||(LA12_0>=28 && LA12_0<=32)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimpleMio.g:1567:3: rule__Sensor__SensorSpecifierAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__SensorSpecifierAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getSensorSpecifierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalSimpleMio.g:1575:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1579:1: ( rule__Sensor__Group__3__Impl )
            // InternalSimpleMio.g:1580:2: rule__Sensor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalSimpleMio.g:1586:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__Group_3__0 )? ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1590:1: ( ( ( rule__Sensor__Group_3__0 )? ) )
            // InternalSimpleMio.g:1591:1: ( ( rule__Sensor__Group_3__0 )? )
            {
            // InternalSimpleMio.g:1591:1: ( ( rule__Sensor__Group_3__0 )? )
            // InternalSimpleMio.g:1592:2: ( rule__Sensor__Group_3__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_3()); 
            // InternalSimpleMio.g:1593:2: ( rule__Sensor__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimpleMio.g:1593:3: rule__Sensor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group_3__0"
    // InternalSimpleMio.g:1602:1: rule__Sensor__Group_3__0 : rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 ;
    public final void rule__Sensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1606:1: ( rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 )
            // InternalSimpleMio.g:1607:2: rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Sensor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__0"


    // $ANTLR start "rule__Sensor__Group_3__0__Impl"
    // InternalSimpleMio.g:1614:1: rule__Sensor__Group_3__0__Impl : ( '@' ) ;
    public final void rule__Sensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1618:1: ( ( '@' ) )
            // InternalSimpleMio.g:1619:1: ( '@' )
            {
            // InternalSimpleMio.g:1619:1: ( '@' )
            // InternalSimpleMio.g:1620:2: '@'
            {
             before(grammarAccess.getSensorAccess().getCommercialAtKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getCommercialAtKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__0__Impl"


    // $ANTLR start "rule__Sensor__Group_3__1"
    // InternalSimpleMio.g:1629:1: rule__Sensor__Group_3__1 : rule__Sensor__Group_3__1__Impl ;
    public final void rule__Sensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1633:1: ( rule__Sensor__Group_3__1__Impl )
            // InternalSimpleMio.g:1634:2: rule__Sensor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__1"


    // $ANTLR start "rule__Sensor__Group_3__1__Impl"
    // InternalSimpleMio.g:1640:1: rule__Sensor__Group_3__1__Impl : ( ( rule__Sensor__StrengthAssignment_3_1 ) ) ;
    public final void rule__Sensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1644:1: ( ( ( rule__Sensor__StrengthAssignment_3_1 ) ) )
            // InternalSimpleMio.g:1645:1: ( ( rule__Sensor__StrengthAssignment_3_1 ) )
            {
            // InternalSimpleMio.g:1645:1: ( ( rule__Sensor__StrengthAssignment_3_1 ) )
            // InternalSimpleMio.g:1646:2: ( rule__Sensor__StrengthAssignment_3_1 )
            {
             before(grammarAccess.getSensorAccess().getStrengthAssignment_3_1()); 
            // InternalSimpleMio.g:1647:2: ( rule__Sensor__StrengthAssignment_3_1 )
            // InternalSimpleMio.g:1647:3: rule__Sensor__StrengthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__StrengthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getStrengthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSimpleMio.g:1656:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1660:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSimpleMio.g:1661:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSimpleMio.g:1668:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1672:1: ( ( ( '-' )? ) )
            // InternalSimpleMio.g:1673:1: ( ( '-' )? )
            {
            // InternalSimpleMio.g:1673:1: ( ( '-' )? )
            // InternalSimpleMio.g:1674:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSimpleMio.g:1675:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimpleMio.g:1675:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSimpleMio.g:1683:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1687:1: ( rule__EInt__Group__1__Impl )
            // InternalSimpleMio.g:1688:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSimpleMio.g:1694:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1698:1: ( ( RULE_INT ) )
            // InternalSimpleMio.g:1699:1: ( RULE_INT )
            {
            // InternalSimpleMio.g:1699:1: ( RULE_INT )
            // InternalSimpleMio.g:1700:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Model__ProgramAssignment_1"
    // InternalSimpleMio.g:1710:1: rule__Model__ProgramAssignment_1 : ( ruleProgram ) ;
    public final void rule__Model__ProgramAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1714:1: ( ( ruleProgram ) )
            // InternalSimpleMio.g:1715:2: ( ruleProgram )
            {
            // InternalSimpleMio.g:1715:2: ( ruleProgram )
            // InternalSimpleMio.g:1716:3: ruleProgram
            {
             before(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramProgramParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProgramAssignment_1"


    // $ANTLR start "rule__Program__EventsAssignment"
    // InternalSimpleMio.g:1725:1: rule__Program__EventsAssignment : ( ruleEvent ) ;
    public final void rule__Program__EventsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1729:1: ( ( ruleEvent ) )
            // InternalSimpleMio.g:1730:2: ( ruleEvent )
            {
            // InternalSimpleMio.g:1730:2: ( ruleEvent )
            // InternalSimpleMio.g:1731:3: ruleEvent
            {
             before(grammarAccess.getProgramAccess().getEventsEventParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getEventsEventParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__EventsAssignment"


    // $ANTLR start "rule__Event__ConditionalsensorAssignment_1"
    // InternalSimpleMio.g:1740:1: rule__Event__ConditionalsensorAssignment_1 : ( ruleOr ) ;
    public final void rule__Event__ConditionalsensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1744:1: ( ( ruleOr ) )
            // InternalSimpleMio.g:1745:2: ( ruleOr )
            {
            // InternalSimpleMio.g:1745:2: ( ruleOr )
            // InternalSimpleMio.g:1746:3: ruleOr
            {
             before(grammarAccess.getEventAccess().getConditionalsensorOrParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getEventAccess().getConditionalsensorOrParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ConditionalsensorAssignment_1"


    // $ANTLR start "rule__Event__ActionsAssignment_3"
    // InternalSimpleMio.g:1755:1: rule__Event__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1759:1: ( ( ruleAction ) )
            // InternalSimpleMio.g:1760:2: ( ruleAction )
            {
            // InternalSimpleMio.g:1760:2: ( ruleAction )
            // InternalSimpleMio.g:1761:3: ruleAction
            {
             before(grammarAccess.getEventAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEventAccess().getActionsActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ActionsAssignment_3"


    // $ANTLR start "rule__Event__ActionsAssignment_4_1"
    // InternalSimpleMio.g:1770:1: rule__Event__ActionsAssignment_4_1 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1774:1: ( ( ruleAction ) )
            // InternalSimpleMio.g:1775:2: ( ruleAction )
            {
            // InternalSimpleMio.g:1775:2: ( ruleAction )
            // InternalSimpleMio.g:1776:3: ruleAction
            {
             before(grammarAccess.getEventAccess().getActionsActionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEventAccess().getActionsActionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ActionsAssignment_4_1"


    // $ANTLR start "rule__Action__ActionNameAssignment_1"
    // InternalSimpleMio.g:1785:1: rule__Action__ActionNameAssignment_1 : ( ( rule__Action__ActionNameAlternatives_1_0 ) ) ;
    public final void rule__Action__ActionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1789:1: ( ( ( rule__Action__ActionNameAlternatives_1_0 ) ) )
            // InternalSimpleMio.g:1790:2: ( ( rule__Action__ActionNameAlternatives_1_0 ) )
            {
            // InternalSimpleMio.g:1790:2: ( ( rule__Action__ActionNameAlternatives_1_0 ) )
            // InternalSimpleMio.g:1791:3: ( rule__Action__ActionNameAlternatives_1_0 )
            {
             before(grammarAccess.getActionAccess().getActionNameAlternatives_1_0()); 
            // InternalSimpleMio.g:1792:3: ( rule__Action__ActionNameAlternatives_1_0 )
            // InternalSimpleMio.g:1792:4: rule__Action__ActionNameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionNameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionNameAssignment_1"


    // $ANTLR start "rule__Action__ActionSpecifierAssignment_2"
    // InternalSimpleMio.g:1800:1: rule__Action__ActionSpecifierAssignment_2 : ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) ) ;
    public final void rule__Action__ActionSpecifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1804:1: ( ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) ) )
            // InternalSimpleMio.g:1805:2: ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) )
            {
            // InternalSimpleMio.g:1805:2: ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) )
            // InternalSimpleMio.g:1806:3: ( rule__Action__ActionSpecifierAlternatives_2_0 )
            {
             before(grammarAccess.getActionAccess().getActionSpecifierAlternatives_2_0()); 
            // InternalSimpleMio.g:1807:3: ( rule__Action__ActionSpecifierAlternatives_2_0 )
            // InternalSimpleMio.g:1807:4: rule__Action__ActionSpecifierAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionSpecifierAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionSpecifierAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionSpecifierAssignment_2"


    // $ANTLR start "rule__Action__StrengthAssignment_3_1"
    // InternalSimpleMio.g:1815:1: rule__Action__StrengthAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Action__StrengthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1819:1: ( ( ruleEInt ) )
            // InternalSimpleMio.g:1820:2: ( ruleEInt )
            {
            // InternalSimpleMio.g:1820:2: ( ruleEInt )
            // InternalSimpleMio.g:1821:3: ruleEInt
            {
             before(grammarAccess.getActionAccess().getStrengthEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getActionAccess().getStrengthEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__StrengthAssignment_3_1"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalSimpleMio.g:1830:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1834:1: ( ( ruleAnd ) )
            // InternalSimpleMio.g:1835:2: ( ruleAnd )
            {
            // InternalSimpleMio.g:1835:2: ( ruleAnd )
            // InternalSimpleMio.g:1836:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalSimpleMio.g:1845:1: rule__And__RightAssignment_1_2 : ( ruleNot ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1849:1: ( ( ruleNot ) )
            // InternalSimpleMio.g:1850:2: ( ruleNot )
            {
            // InternalSimpleMio.g:1850:2: ( ruleNot )
            // InternalSimpleMio.g:1851:3: ruleNot
            {
             before(grammarAccess.getAndAccess().getRightNotParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightNotParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Not__ConditionalsensorAssignment_0_1_1"
    // InternalSimpleMio.g:1860:1: rule__Not__ConditionalsensorAssignment_0_1_1 : ( ruleParen ) ;
    public final void rule__Not__ConditionalsensorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1864:1: ( ( ruleParen ) )
            // InternalSimpleMio.g:1865:2: ( ruleParen )
            {
            // InternalSimpleMio.g:1865:2: ( ruleParen )
            // InternalSimpleMio.g:1866:3: ruleParen
            {
             before(grammarAccess.getNotAccess().getConditionalsensorParenParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParen();

            state._fsp--;

             after(grammarAccess.getNotAccess().getConditionalsensorParenParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__ConditionalsensorAssignment_0_1_1"


    // $ANTLR start "rule__Not__ConditionalsensorAssignment_1_1_1"
    // InternalSimpleMio.g:1875:1: rule__Not__ConditionalsensorAssignment_1_1_1 : ( ruleSensor ) ;
    public final void rule__Not__ConditionalsensorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1879:1: ( ( ruleSensor ) )
            // InternalSimpleMio.g:1880:2: ( ruleSensor )
            {
            // InternalSimpleMio.g:1880:2: ( ruleSensor )
            // InternalSimpleMio.g:1881:3: ruleSensor
            {
             before(grammarAccess.getNotAccess().getConditionalsensorSensorParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getNotAccess().getConditionalsensorSensorParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__ConditionalsensorAssignment_1_1_1"


    // $ANTLR start "rule__Sensor__SensorNameAssignment_1"
    // InternalSimpleMio.g:1890:1: rule__Sensor__SensorNameAssignment_1 : ( ( rule__Sensor__SensorNameAlternatives_1_0 ) ) ;
    public final void rule__Sensor__SensorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1894:1: ( ( ( rule__Sensor__SensorNameAlternatives_1_0 ) ) )
            // InternalSimpleMio.g:1895:2: ( ( rule__Sensor__SensorNameAlternatives_1_0 ) )
            {
            // InternalSimpleMio.g:1895:2: ( ( rule__Sensor__SensorNameAlternatives_1_0 ) )
            // InternalSimpleMio.g:1896:3: ( rule__Sensor__SensorNameAlternatives_1_0 )
            {
             before(grammarAccess.getSensorAccess().getSensorNameAlternatives_1_0()); 
            // InternalSimpleMio.g:1897:3: ( rule__Sensor__SensorNameAlternatives_1_0 )
            // InternalSimpleMio.g:1897:4: rule__Sensor__SensorNameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorNameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SensorNameAssignment_1"


    // $ANTLR start "rule__Sensor__SensorSpecifierAssignment_2"
    // InternalSimpleMio.g:1905:1: rule__Sensor__SensorSpecifierAssignment_2 : ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) ) ;
    public final void rule__Sensor__SensorSpecifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1909:1: ( ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) ) )
            // InternalSimpleMio.g:1910:2: ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) )
            {
            // InternalSimpleMio.g:1910:2: ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) )
            // InternalSimpleMio.g:1911:3: ( rule__Sensor__SensorSpecifierAlternatives_2_0 )
            {
             before(grammarAccess.getSensorAccess().getSensorSpecifierAlternatives_2_0()); 
            // InternalSimpleMio.g:1912:3: ( rule__Sensor__SensorSpecifierAlternatives_2_0 )
            // InternalSimpleMio.g:1912:4: rule__Sensor__SensorSpecifierAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorSpecifierAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorSpecifierAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SensorSpecifierAssignment_2"


    // $ANTLR start "rule__Sensor__StrengthAssignment_3_1"
    // InternalSimpleMio.g:1920:1: rule__Sensor__StrengthAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Sensor__StrengthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1924:1: ( ( ruleEInt ) )
            // InternalSimpleMio.g:1925:2: ( ruleEInt )
            {
            // InternalSimpleMio.g:1925:2: ( ruleEInt )
            // InternalSimpleMio.g:1926:3: ruleEInt
            {
             before(grammarAccess.getSensorAccess().getStrengthEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getStrengthEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__StrengthAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000C00F800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000C00F800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000008007F8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000009F0018000L});

}