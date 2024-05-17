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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'move'", "'led'", "'turn'", "'left'", "'right'", "'forward'", "'backward'", "'stop'", "'red'", "'green'", "'blue'", "'obstacle'", "'sound'", "'line'", "'button'", "'motor'", "'front'", "'back'", "'up'", "'down'", "'center'", "'#'", "'->'", "','", "'@'", "'or'", "'and'", "'not'", "'('", "')'", "'-'"
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
    // InternalSimpleMio.g:87:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:91:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalSimpleMio.g:92:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalSimpleMio.g:92:2: ( ( rule__Program__Group__0 ) )
            // InternalSimpleMio.g:93:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalSimpleMio.g:94:3: ( rule__Program__Group__0 )
            // InternalSimpleMio.g:94:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // InternalSimpleMio.g:103:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalSimpleMio.g:104:1: ( ruleEvent EOF )
            // InternalSimpleMio.g:105:1: ruleEvent EOF
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
    // InternalSimpleMio.g:112:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:116:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalSimpleMio.g:117:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalSimpleMio.g:117:2: ( ( rule__Event__Group__0 ) )
            // InternalSimpleMio.g:118:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalSimpleMio.g:119:3: ( rule__Event__Group__0 )
            // InternalSimpleMio.g:119:4: rule__Event__Group__0
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
    // InternalSimpleMio.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalSimpleMio.g:129:1: ( ruleAction EOF )
            // InternalSimpleMio.g:130:1: ruleAction EOF
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
    // InternalSimpleMio.g:137:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:141:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalSimpleMio.g:142:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalSimpleMio.g:142:2: ( ( rule__Action__Group__0 ) )
            // InternalSimpleMio.g:143:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalSimpleMio.g:144:3: ( rule__Action__Group__0 )
            // InternalSimpleMio.g:144:4: rule__Action__Group__0
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
    // InternalSimpleMio.g:153:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalSimpleMio.g:154:1: ( ruleOr EOF )
            // InternalSimpleMio.g:155:1: ruleOr EOF
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
    // InternalSimpleMio.g:162:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:166:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalSimpleMio.g:167:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalSimpleMio.g:167:2: ( ( rule__Or__Group__0 ) )
            // InternalSimpleMio.g:168:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalSimpleMio.g:169:3: ( rule__Or__Group__0 )
            // InternalSimpleMio.g:169:4: rule__Or__Group__0
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
    // InternalSimpleMio.g:178:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalSimpleMio.g:179:1: ( ruleAnd EOF )
            // InternalSimpleMio.g:180:1: ruleAnd EOF
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
    // InternalSimpleMio.g:187:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:191:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalSimpleMio.g:192:2: ( ( rule__And__Group__0 ) )
            {
            // InternalSimpleMio.g:192:2: ( ( rule__And__Group__0 ) )
            // InternalSimpleMio.g:193:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalSimpleMio.g:194:3: ( rule__And__Group__0 )
            // InternalSimpleMio.g:194:4: rule__And__Group__0
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
    // InternalSimpleMio.g:203:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalSimpleMio.g:204:1: ( ruleNot EOF )
            // InternalSimpleMio.g:205:1: ruleNot EOF
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
    // InternalSimpleMio.g:212:1: ruleNot : ( ( rule__Not__Alternatives ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:216:2: ( ( ( rule__Not__Alternatives ) ) )
            // InternalSimpleMio.g:217:2: ( ( rule__Not__Alternatives ) )
            {
            // InternalSimpleMio.g:217:2: ( ( rule__Not__Alternatives ) )
            // InternalSimpleMio.g:218:3: ( rule__Not__Alternatives )
            {
             before(grammarAccess.getNotAccess().getAlternatives()); 
            // InternalSimpleMio.g:219:3: ( rule__Not__Alternatives )
            // InternalSimpleMio.g:219:4: rule__Not__Alternatives
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
    // InternalSimpleMio.g:228:1: entryRuleParen : ruleParen EOF ;
    public final void entryRuleParen() throws RecognitionException {
        try {
            // InternalSimpleMio.g:229:1: ( ruleParen EOF )
            // InternalSimpleMio.g:230:1: ruleParen EOF
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
    // InternalSimpleMio.g:237:1: ruleParen : ( ( rule__Paren__Group__0 ) ) ;
    public final void ruleParen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:241:2: ( ( ( rule__Paren__Group__0 ) ) )
            // InternalSimpleMio.g:242:2: ( ( rule__Paren__Group__0 ) )
            {
            // InternalSimpleMio.g:242:2: ( ( rule__Paren__Group__0 ) )
            // InternalSimpleMio.g:243:3: ( rule__Paren__Group__0 )
            {
             before(grammarAccess.getParenAccess().getGroup()); 
            // InternalSimpleMio.g:244:3: ( rule__Paren__Group__0 )
            // InternalSimpleMio.g:244:4: rule__Paren__Group__0
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
    // InternalSimpleMio.g:253:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalSimpleMio.g:254:1: ( ruleSensor EOF )
            // InternalSimpleMio.g:255:1: ruleSensor EOF
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
    // InternalSimpleMio.g:262:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:266:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalSimpleMio.g:267:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalSimpleMio.g:267:2: ( ( rule__Sensor__Group__0 ) )
            // InternalSimpleMio.g:268:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalSimpleMio.g:269:3: ( rule__Sensor__Group__0 )
            // InternalSimpleMio.g:269:4: rule__Sensor__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalSimpleMio.g:278:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSimpleMio.g:279:1: ( ruleEString EOF )
            // InternalSimpleMio.g:280:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSimpleMio.g:287:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:291:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSimpleMio.g:292:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSimpleMio.g:292:2: ( ( rule__EString__Alternatives ) )
            // InternalSimpleMio.g:293:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSimpleMio.g:294:3: ( rule__EString__Alternatives )
            // InternalSimpleMio.g:294:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalSimpleMio.g:303:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSimpleMio.g:304:1: ( ruleEInt EOF )
            // InternalSimpleMio.g:305:1: ruleEInt EOF
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
    // InternalSimpleMio.g:312:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:316:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSimpleMio.g:317:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSimpleMio.g:317:2: ( ( rule__EInt__Group__0 ) )
            // InternalSimpleMio.g:318:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSimpleMio.g:319:3: ( rule__EInt__Group__0 )
            // InternalSimpleMio.g:319:4: rule__EInt__Group__0
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


    // $ANTLR start "rule__Program__Alternatives_1"
    // InternalSimpleMio.g:327:1: rule__Program__Alternatives_1 : ( ( ( rule__Program__EventsAssignment_1_0 ) ) | ( ( rule__Program__Group_1_1__0 ) ) );
    public final void rule__Program__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:331:1: ( ( ( rule__Program__EventsAssignment_1_0 ) ) | ( ( rule__Program__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=22 && LA1_0<=26)||(LA1_0>=38 && LA1_0<=39)) ) {
                alt1=1;
            }
            else if ( (LA1_0==32) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSimpleMio.g:332:2: ( ( rule__Program__EventsAssignment_1_0 ) )
                    {
                    // InternalSimpleMio.g:332:2: ( ( rule__Program__EventsAssignment_1_0 ) )
                    // InternalSimpleMio.g:333:3: ( rule__Program__EventsAssignment_1_0 )
                    {
                     before(grammarAccess.getProgramAccess().getEventsAssignment_1_0()); 
                    // InternalSimpleMio.g:334:3: ( rule__Program__EventsAssignment_1_0 )
                    // InternalSimpleMio.g:334:4: rule__Program__EventsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__EventsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getEventsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:338:2: ( ( rule__Program__Group_1_1__0 ) )
                    {
                    // InternalSimpleMio.g:338:2: ( ( rule__Program__Group_1_1__0 ) )
                    // InternalSimpleMio.g:339:3: ( rule__Program__Group_1_1__0 )
                    {
                     before(grammarAccess.getProgramAccess().getGroup_1_1()); 
                    // InternalSimpleMio.g:340:3: ( rule__Program__Group_1_1__0 )
                    // InternalSimpleMio.g:340:4: rule__Program__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Program__Alternatives_1"


    // $ANTLR start "rule__Action__ActionNameAlternatives_1_0"
    // InternalSimpleMio.g:348:1: rule__Action__ActionNameAlternatives_1_0 : ( ( 'move' ) | ( 'led' ) | ( 'turn' ) );
    public final void rule__Action__ActionNameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:352:1: ( ( 'move' ) | ( 'led' ) | ( 'turn' ) )
            int alt2=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSimpleMio.g:353:2: ( 'move' )
                    {
                    // InternalSimpleMio.g:353:2: ( 'move' )
                    // InternalSimpleMio.g:354:3: 'move'
                    {
                     before(grammarAccess.getActionAccess().getActionNameMoveKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionNameMoveKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:359:2: ( 'led' )
                    {
                    // InternalSimpleMio.g:359:2: ( 'led' )
                    // InternalSimpleMio.g:360:3: 'led'
                    {
                     before(grammarAccess.getActionAccess().getActionNameLedKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionNameLedKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:365:2: ( 'turn' )
                    {
                    // InternalSimpleMio.g:365:2: ( 'turn' )
                    // InternalSimpleMio.g:366:3: 'turn'
                    {
                     before(grammarAccess.getActionAccess().getActionNameTurnKeyword_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionNameTurnKeyword_1_0_2()); 

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
    // InternalSimpleMio.g:375:1: rule__Action__ActionSpecifierAlternatives_2_0 : ( ( 'left' ) | ( 'right' ) | ( 'forward' ) | ( 'backward' ) | ( 'stop' ) | ( 'red' ) | ( 'green' ) | ( 'blue' ) );
    public final void rule__Action__ActionSpecifierAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:379:1: ( ( 'left' ) | ( 'right' ) | ( 'forward' ) | ( 'backward' ) | ( 'stop' ) | ( 'red' ) | ( 'green' ) | ( 'blue' ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            case 20:
                {
                alt3=7;
                }
                break;
            case 21:
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
                    // InternalSimpleMio.g:380:2: ( 'left' )
                    {
                    // InternalSimpleMio.g:380:2: ( 'left' )
                    // InternalSimpleMio.g:381:3: 'left'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierLeftKeyword_2_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierLeftKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:386:2: ( 'right' )
                    {
                    // InternalSimpleMio.g:386:2: ( 'right' )
                    // InternalSimpleMio.g:387:3: 'right'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierRightKeyword_2_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierRightKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:392:2: ( 'forward' )
                    {
                    // InternalSimpleMio.g:392:2: ( 'forward' )
                    // InternalSimpleMio.g:393:3: 'forward'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierForwardKeyword_2_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierForwardKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:398:2: ( 'backward' )
                    {
                    // InternalSimpleMio.g:398:2: ( 'backward' )
                    // InternalSimpleMio.g:399:3: 'backward'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierBackwardKeyword_2_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierBackwardKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:404:2: ( 'stop' )
                    {
                    // InternalSimpleMio.g:404:2: ( 'stop' )
                    // InternalSimpleMio.g:405:3: 'stop'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierStopKeyword_2_0_4()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierStopKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleMio.g:410:2: ( 'red' )
                    {
                    // InternalSimpleMio.g:410:2: ( 'red' )
                    // InternalSimpleMio.g:411:3: 'red'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierRedKeyword_2_0_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierRedKeyword_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleMio.g:416:2: ( 'green' )
                    {
                    // InternalSimpleMio.g:416:2: ( 'green' )
                    // InternalSimpleMio.g:417:3: 'green'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierGreenKeyword_2_0_6()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierGreenKeyword_2_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSimpleMio.g:422:2: ( 'blue' )
                    {
                    // InternalSimpleMio.g:422:2: ( 'blue' )
                    // InternalSimpleMio.g:423:3: 'blue'
                    {
                     before(grammarAccess.getActionAccess().getActionSpecifierBlueKeyword_2_0_7()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getActionAccess().getActionSpecifierBlueKeyword_2_0_7()); 

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
    // InternalSimpleMio.g:432:1: rule__Not__Alternatives : ( ( ( rule__Not__Group_0__0 ) ) | ( ruleSensor ) | ( ruleParen ) );
    public final void rule__Not__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:436:1: ( ( ( rule__Not__Group_0__0 ) ) | ( ruleSensor ) | ( ruleParen ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt4=1;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt4=2;
                }
                break;
            case 39:
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
                    // InternalSimpleMio.g:437:2: ( ( rule__Not__Group_0__0 ) )
                    {
                    // InternalSimpleMio.g:437:2: ( ( rule__Not__Group_0__0 ) )
                    // InternalSimpleMio.g:438:3: ( rule__Not__Group_0__0 )
                    {
                     before(grammarAccess.getNotAccess().getGroup_0()); 
                    // InternalSimpleMio.g:439:3: ( rule__Not__Group_0__0 )
                    // InternalSimpleMio.g:439:4: rule__Not__Group_0__0
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
                    // InternalSimpleMio.g:443:2: ( ruleSensor )
                    {
                    // InternalSimpleMio.g:443:2: ( ruleSensor )
                    // InternalSimpleMio.g:444:3: ruleSensor
                    {
                     before(grammarAccess.getNotAccess().getSensorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getNotAccess().getSensorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:449:2: ( ruleParen )
                    {
                    // InternalSimpleMio.g:449:2: ( ruleParen )
                    // InternalSimpleMio.g:450:3: ruleParen
                    {
                     before(grammarAccess.getNotAccess().getParenParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParen();

                    state._fsp--;

                     after(grammarAccess.getNotAccess().getParenParserRuleCall_2()); 

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
    // InternalSimpleMio.g:459:1: rule__Sensor__SensorNameAlternatives_1_0 : ( ( 'obstacle' ) | ( 'sound' ) | ( 'line' ) | ( 'button' ) | ( 'motor' ) );
    public final void rule__Sensor__SensorNameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:463:1: ( ( 'obstacle' ) | ( 'sound' ) | ( 'line' ) | ( 'button' ) | ( 'motor' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            case 26:
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
                    // InternalSimpleMio.g:464:2: ( 'obstacle' )
                    {
                    // InternalSimpleMio.g:464:2: ( 'obstacle' )
                    // InternalSimpleMio.g:465:3: 'obstacle'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameObstacleKeyword_1_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameObstacleKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:470:2: ( 'sound' )
                    {
                    // InternalSimpleMio.g:470:2: ( 'sound' )
                    // InternalSimpleMio.g:471:3: 'sound'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameSoundKeyword_1_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameSoundKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:476:2: ( 'line' )
                    {
                    // InternalSimpleMio.g:476:2: ( 'line' )
                    // InternalSimpleMio.g:477:3: 'line'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameLineKeyword_1_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameLineKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:482:2: ( 'button' )
                    {
                    // InternalSimpleMio.g:482:2: ( 'button' )
                    // InternalSimpleMio.g:483:3: 'button'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameButtonKeyword_1_0_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameButtonKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:488:2: ( 'motor' )
                    {
                    // InternalSimpleMio.g:488:2: ( 'motor' )
                    // InternalSimpleMio.g:489:3: 'motor'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameMotorKeyword_1_0_4()); 
                    match(input,26,FOLLOW_2); 
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
    // InternalSimpleMio.g:498:1: rule__Sensor__SensorSpecifierAlternatives_2_0 : ( ( 'front' ) | ( 'back' ) | ( 'left' ) | ( 'right' ) | ( 'up' ) | ( 'down' ) | ( 'center' ) );
    public final void rule__Sensor__SensorSpecifierAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:502:1: ( ( 'front' ) | ( 'back' ) | ( 'left' ) | ( 'right' ) | ( 'up' ) | ( 'down' ) | ( 'center' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 29:
                {
                alt6=5;
                }
                break;
            case 30:
                {
                alt6=6;
                }
                break;
            case 31:
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
                    // InternalSimpleMio.g:503:2: ( 'front' )
                    {
                    // InternalSimpleMio.g:503:2: ( 'front' )
                    // InternalSimpleMio.g:504:3: 'front'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierFrontKeyword_2_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierFrontKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:509:2: ( 'back' )
                    {
                    // InternalSimpleMio.g:509:2: ( 'back' )
                    // InternalSimpleMio.g:510:3: 'back'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierBackKeyword_2_0_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierBackKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:515:2: ( 'left' )
                    {
                    // InternalSimpleMio.g:515:2: ( 'left' )
                    // InternalSimpleMio.g:516:3: 'left'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierLeftKeyword_2_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierLeftKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:521:2: ( 'right' )
                    {
                    // InternalSimpleMio.g:521:2: ( 'right' )
                    // InternalSimpleMio.g:522:3: 'right'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierRightKeyword_2_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierRightKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:527:2: ( 'up' )
                    {
                    // InternalSimpleMio.g:527:2: ( 'up' )
                    // InternalSimpleMio.g:528:3: 'up'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierUpKeyword_2_0_4()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierUpKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleMio.g:533:2: ( 'down' )
                    {
                    // InternalSimpleMio.g:533:2: ( 'down' )
                    // InternalSimpleMio.g:534:3: 'down'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierDownKeyword_2_0_5()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierDownKeyword_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleMio.g:539:2: ( 'center' )
                    {
                    // InternalSimpleMio.g:539:2: ( 'center' )
                    // InternalSimpleMio.g:540:3: 'center'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierCenterKeyword_2_0_6()); 
                    match(input,31,FOLLOW_2); 
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSimpleMio.g:549:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:553:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimpleMio.g:554:2: ( RULE_STRING )
                    {
                    // InternalSimpleMio.g:554:2: ( RULE_STRING )
                    // InternalSimpleMio.g:555:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:560:2: ( RULE_ID )
                    {
                    // InternalSimpleMio.g:560:2: ( RULE_ID )
                    // InternalSimpleMio.g:561:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSimpleMio.g:570:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:574:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSimpleMio.g:575:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSimpleMio.g:582:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:586:1: ( ( () ) )
            // InternalSimpleMio.g:587:1: ( () )
            {
            // InternalSimpleMio.g:587:1: ( () )
            // InternalSimpleMio.g:588:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalSimpleMio.g:589:2: ()
            // InternalSimpleMio.g:589:3: 
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
    // InternalSimpleMio.g:597:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:601:1: ( rule__Model__Group__1__Impl )
            // InternalSimpleMio.g:602:2: rule__Model__Group__1__Impl
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
    // InternalSimpleMio.g:608:1: rule__Model__Group__1__Impl : ( ( rule__Model__ProgramAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:612:1: ( ( ( rule__Model__ProgramAssignment_1 ) ) )
            // InternalSimpleMio.g:613:1: ( ( rule__Model__ProgramAssignment_1 ) )
            {
            // InternalSimpleMio.g:613:1: ( ( rule__Model__ProgramAssignment_1 ) )
            // InternalSimpleMio.g:614:2: ( rule__Model__ProgramAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getProgramAssignment_1()); 
            // InternalSimpleMio.g:615:2: ( rule__Model__ProgramAssignment_1 )
            // InternalSimpleMio.g:615:3: rule__Model__ProgramAssignment_1
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


    // $ANTLR start "rule__Program__Group__0"
    // InternalSimpleMio.g:624:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:628:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSimpleMio.g:629:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalSimpleMio.g:636:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:640:1: ( ( () ) )
            // InternalSimpleMio.g:641:1: ( () )
            {
            // InternalSimpleMio.g:641:1: ( () )
            // InternalSimpleMio.g:642:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalSimpleMio.g:643:2: ()
            // InternalSimpleMio.g:643:3: 
            {
            }

             after(grammarAccess.getProgramAccess().getProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalSimpleMio.g:651:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:655:1: ( rule__Program__Group__1__Impl )
            // InternalSimpleMio.g:656:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalSimpleMio.g:662:1: rule__Program__Group__1__Impl : ( ( ( rule__Program__Alternatives_1 ) ) ( ( rule__Program__Alternatives_1 )* ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:666:1: ( ( ( ( rule__Program__Alternatives_1 ) ) ( ( rule__Program__Alternatives_1 )* ) ) )
            // InternalSimpleMio.g:667:1: ( ( ( rule__Program__Alternatives_1 ) ) ( ( rule__Program__Alternatives_1 )* ) )
            {
            // InternalSimpleMio.g:667:1: ( ( ( rule__Program__Alternatives_1 ) ) ( ( rule__Program__Alternatives_1 )* ) )
            // InternalSimpleMio.g:668:2: ( ( rule__Program__Alternatives_1 ) ) ( ( rule__Program__Alternatives_1 )* )
            {
            // InternalSimpleMio.g:668:2: ( ( rule__Program__Alternatives_1 ) )
            // InternalSimpleMio.g:669:3: ( rule__Program__Alternatives_1 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_1()); 
            // InternalSimpleMio.g:670:3: ( rule__Program__Alternatives_1 )
            // InternalSimpleMio.g:670:4: rule__Program__Alternatives_1
            {
            pushFollow(FOLLOW_4);
            rule__Program__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAlternatives_1()); 

            }

            // InternalSimpleMio.g:673:2: ( ( rule__Program__Alternatives_1 )* )
            // InternalSimpleMio.g:674:3: ( rule__Program__Alternatives_1 )*
            {
             before(grammarAccess.getProgramAccess().getAlternatives_1()); 
            // InternalSimpleMio.g:675:3: ( rule__Program__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=26)||LA8_0==32||(LA8_0>=38 && LA8_0<=39)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleMio.g:675:4: rule__Program__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group_1_1__0"
    // InternalSimpleMio.g:685:1: rule__Program__Group_1_1__0 : rule__Program__Group_1_1__0__Impl rule__Program__Group_1_1__1 ;
    public final void rule__Program__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:689:1: ( rule__Program__Group_1_1__0__Impl rule__Program__Group_1_1__1 )
            // InternalSimpleMio.g:690:2: rule__Program__Group_1_1__0__Impl rule__Program__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_1_1__1();

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
    // $ANTLR end "rule__Program__Group_1_1__0"


    // $ANTLR start "rule__Program__Group_1_1__0__Impl"
    // InternalSimpleMio.g:697:1: rule__Program__Group_1_1__0__Impl : ( '#' ) ;
    public final void rule__Program__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:701:1: ( ( '#' ) )
            // InternalSimpleMio.g:702:1: ( '#' )
            {
            // InternalSimpleMio.g:702:1: ( '#' )
            // InternalSimpleMio.g:703:2: '#'
            {
             before(grammarAccess.getProgramAccess().getNumberSignKeyword_1_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getNumberSignKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Program__Group_1_1__0__Impl"


    // $ANTLR start "rule__Program__Group_1_1__1"
    // InternalSimpleMio.g:712:1: rule__Program__Group_1_1__1 : rule__Program__Group_1_1__1__Impl ;
    public final void rule__Program__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:716:1: ( rule__Program__Group_1_1__1__Impl )
            // InternalSimpleMio.g:717:2: rule__Program__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Program__Group_1_1__1"


    // $ANTLR start "rule__Program__Group_1_1__1__Impl"
    // InternalSimpleMio.g:723:1: rule__Program__Group_1_1__1__Impl : ( ( ruleEString )* ) ;
    public final void rule__Program__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:727:1: ( ( ( ruleEString )* ) )
            // InternalSimpleMio.g:728:1: ( ( ruleEString )* )
            {
            // InternalSimpleMio.g:728:1: ( ( ruleEString )* )
            // InternalSimpleMio.g:729:2: ( ruleEString )*
            {
             before(grammarAccess.getProgramAccess().getEStringParserRuleCall_1_1_1()); 
            // InternalSimpleMio.g:730:2: ( ruleEString )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimpleMio.g:730:3: ruleEString
            	    {
            	    pushFollow(FOLLOW_6);
            	    ruleEString();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getEStringParserRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__Program__Group_1_1__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalSimpleMio.g:739:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:743:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalSimpleMio.g:744:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleMio.g:751:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:755:1: ( ( () ) )
            // InternalSimpleMio.g:756:1: ( () )
            {
            // InternalSimpleMio.g:756:1: ( () )
            // InternalSimpleMio.g:757:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalSimpleMio.g:758:2: ()
            // InternalSimpleMio.g:758:3: 
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
    // InternalSimpleMio.g:766:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:770:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalSimpleMio.g:771:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalSimpleMio.g:778:1: rule__Event__Group__1__Impl : ( ( rule__Event__ConditionalsensorAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:782:1: ( ( ( rule__Event__ConditionalsensorAssignment_1 ) ) )
            // InternalSimpleMio.g:783:1: ( ( rule__Event__ConditionalsensorAssignment_1 ) )
            {
            // InternalSimpleMio.g:783:1: ( ( rule__Event__ConditionalsensorAssignment_1 ) )
            // InternalSimpleMio.g:784:2: ( rule__Event__ConditionalsensorAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getConditionalsensorAssignment_1()); 
            // InternalSimpleMio.g:785:2: ( rule__Event__ConditionalsensorAssignment_1 )
            // InternalSimpleMio.g:785:3: rule__Event__ConditionalsensorAssignment_1
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
    // InternalSimpleMio.g:793:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:797:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalSimpleMio.g:798:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSimpleMio.g:805:1: rule__Event__Group__2__Impl : ( '->' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:809:1: ( ( '->' ) )
            // InternalSimpleMio.g:810:1: ( '->' )
            {
            // InternalSimpleMio.g:810:1: ( '->' )
            // InternalSimpleMio.g:811:2: '->'
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
    // InternalSimpleMio.g:820:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:824:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalSimpleMio.g:825:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSimpleMio.g:832:1: rule__Event__Group__3__Impl : ( ( rule__Event__ActionsAssignment_3 ) ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:836:1: ( ( ( rule__Event__ActionsAssignment_3 ) ) )
            // InternalSimpleMio.g:837:1: ( ( rule__Event__ActionsAssignment_3 ) )
            {
            // InternalSimpleMio.g:837:1: ( ( rule__Event__ActionsAssignment_3 ) )
            // InternalSimpleMio.g:838:2: ( rule__Event__ActionsAssignment_3 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_3()); 
            // InternalSimpleMio.g:839:2: ( rule__Event__ActionsAssignment_3 )
            // InternalSimpleMio.g:839:3: rule__Event__ActionsAssignment_3
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
    // InternalSimpleMio.g:847:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:851:1: ( rule__Event__Group__4__Impl )
            // InternalSimpleMio.g:852:2: rule__Event__Group__4__Impl
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
    // InternalSimpleMio.g:858:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )* ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:862:1: ( ( ( rule__Event__Group_4__0 )* ) )
            // InternalSimpleMio.g:863:1: ( ( rule__Event__Group_4__0 )* )
            {
            // InternalSimpleMio.g:863:1: ( ( rule__Event__Group_4__0 )* )
            // InternalSimpleMio.g:864:2: ( rule__Event__Group_4__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalSimpleMio.g:865:2: ( rule__Event__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleMio.g:865:3: rule__Event__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Event__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSimpleMio.g:874:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:878:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalSimpleMio.g:879:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSimpleMio.g:886:1: rule__Event__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:890:1: ( ( ',' ) )
            // InternalSimpleMio.g:891:1: ( ',' )
            {
            // InternalSimpleMio.g:891:1: ( ',' )
            // InternalSimpleMio.g:892:2: ','
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
    // InternalSimpleMio.g:901:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:905:1: ( rule__Event__Group_4__1__Impl )
            // InternalSimpleMio.g:906:2: rule__Event__Group_4__1__Impl
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
    // InternalSimpleMio.g:912:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__ActionsAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:916:1: ( ( ( rule__Event__ActionsAssignment_4_1 ) ) )
            // InternalSimpleMio.g:917:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            {
            // InternalSimpleMio.g:917:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            // InternalSimpleMio.g:918:2: ( rule__Event__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_1()); 
            // InternalSimpleMio.g:919:2: ( rule__Event__ActionsAssignment_4_1 )
            // InternalSimpleMio.g:919:3: rule__Event__ActionsAssignment_4_1
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
    // InternalSimpleMio.g:928:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:932:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalSimpleMio.g:933:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalSimpleMio.g:940:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:944:1: ( ( () ) )
            // InternalSimpleMio.g:945:1: ( () )
            {
            // InternalSimpleMio.g:945:1: ( () )
            // InternalSimpleMio.g:946:2: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // InternalSimpleMio.g:947:2: ()
            // InternalSimpleMio.g:947:3: 
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
    // InternalSimpleMio.g:955:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:959:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalSimpleMio.g:960:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalSimpleMio.g:967:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActionNameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:971:1: ( ( ( rule__Action__ActionNameAssignment_1 ) ) )
            // InternalSimpleMio.g:972:1: ( ( rule__Action__ActionNameAssignment_1 ) )
            {
            // InternalSimpleMio.g:972:1: ( ( rule__Action__ActionNameAssignment_1 ) )
            // InternalSimpleMio.g:973:2: ( rule__Action__ActionNameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getActionNameAssignment_1()); 
            // InternalSimpleMio.g:974:2: ( rule__Action__ActionNameAssignment_1 )
            // InternalSimpleMio.g:974:3: rule__Action__ActionNameAssignment_1
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
    // InternalSimpleMio.g:982:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:986:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalSimpleMio.g:987:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSimpleMio.g:994:1: rule__Action__Group__2__Impl : ( ( rule__Action__ActionSpecifierAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:998:1: ( ( ( rule__Action__ActionSpecifierAssignment_2 ) ) )
            // InternalSimpleMio.g:999:1: ( ( rule__Action__ActionSpecifierAssignment_2 ) )
            {
            // InternalSimpleMio.g:999:1: ( ( rule__Action__ActionSpecifierAssignment_2 ) )
            // InternalSimpleMio.g:1000:2: ( rule__Action__ActionSpecifierAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getActionSpecifierAssignment_2()); 
            // InternalSimpleMio.g:1001:2: ( rule__Action__ActionSpecifierAssignment_2 )
            // InternalSimpleMio.g:1001:3: rule__Action__ActionSpecifierAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionSpecifierAssignment_2();

            state._fsp--;


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
    // InternalSimpleMio.g:1009:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1013:1: ( rule__Action__Group__3__Impl )
            // InternalSimpleMio.g:1014:2: rule__Action__Group__3__Impl
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
    // InternalSimpleMio.g:1020:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1024:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // InternalSimpleMio.g:1025:1: ( ( rule__Action__Group_3__0 )? )
            {
            // InternalSimpleMio.g:1025:1: ( ( rule__Action__Group_3__0 )? )
            // InternalSimpleMio.g:1026:2: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // InternalSimpleMio.g:1027:2: ( rule__Action__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimpleMio.g:1027:3: rule__Action__Group_3__0
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
    // InternalSimpleMio.g:1036:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1040:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // InternalSimpleMio.g:1041:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSimpleMio.g:1048:1: rule__Action__Group_3__0__Impl : ( '@' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1052:1: ( ( '@' ) )
            // InternalSimpleMio.g:1053:1: ( '@' )
            {
            // InternalSimpleMio.g:1053:1: ( '@' )
            // InternalSimpleMio.g:1054:2: '@'
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
    // InternalSimpleMio.g:1063:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1067:1: ( rule__Action__Group_3__1__Impl )
            // InternalSimpleMio.g:1068:2: rule__Action__Group_3__1__Impl
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
    // InternalSimpleMio.g:1074:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__StrengthAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1078:1: ( ( ( rule__Action__StrengthAssignment_3_1 ) ) )
            // InternalSimpleMio.g:1079:1: ( ( rule__Action__StrengthAssignment_3_1 ) )
            {
            // InternalSimpleMio.g:1079:1: ( ( rule__Action__StrengthAssignment_3_1 ) )
            // InternalSimpleMio.g:1080:2: ( rule__Action__StrengthAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getStrengthAssignment_3_1()); 
            // InternalSimpleMio.g:1081:2: ( rule__Action__StrengthAssignment_3_1 )
            // InternalSimpleMio.g:1081:3: rule__Action__StrengthAssignment_3_1
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
    // InternalSimpleMio.g:1090:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1094:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalSimpleMio.g:1095:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSimpleMio.g:1102:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1106:1: ( ( ruleAnd ) )
            // InternalSimpleMio.g:1107:1: ( ruleAnd )
            {
            // InternalSimpleMio.g:1107:1: ( ruleAnd )
            // InternalSimpleMio.g:1108:2: ruleAnd
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
    // InternalSimpleMio.g:1117:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1121:1: ( rule__Or__Group__1__Impl )
            // InternalSimpleMio.g:1122:2: rule__Or__Group__1__Impl
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
    // InternalSimpleMio.g:1128:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1132:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalSimpleMio.g:1133:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalSimpleMio.g:1133:1: ( ( rule__Or__Group_1__0 )* )
            // InternalSimpleMio.g:1134:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalSimpleMio.g:1135:2: ( rule__Or__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSimpleMio.g:1135:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSimpleMio.g:1144:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1148:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalSimpleMio.g:1149:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalSimpleMio.g:1156:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1160:1: ( ( () ) )
            // InternalSimpleMio.g:1161:1: ( () )
            {
            // InternalSimpleMio.g:1161:1: ( () )
            // InternalSimpleMio.g:1162:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalSimpleMio.g:1163:2: ()
            // InternalSimpleMio.g:1163:3: 
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
    // InternalSimpleMio.g:1171:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1175:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalSimpleMio.g:1176:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleMio.g:1183:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1187:1: ( ( 'or' ) )
            // InternalSimpleMio.g:1188:1: ( 'or' )
            {
            // InternalSimpleMio.g:1188:1: ( 'or' )
            // InternalSimpleMio.g:1189:2: 'or'
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
    // InternalSimpleMio.g:1198:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1202:1: ( rule__Or__Group_1__2__Impl )
            // InternalSimpleMio.g:1203:2: rule__Or__Group_1__2__Impl
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
    // InternalSimpleMio.g:1209:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1213:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalSimpleMio.g:1214:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalSimpleMio.g:1214:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalSimpleMio.g:1215:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalSimpleMio.g:1216:2: ( rule__Or__RightAssignment_1_2 )
            // InternalSimpleMio.g:1216:3: rule__Or__RightAssignment_1_2
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
    // InternalSimpleMio.g:1225:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1229:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSimpleMio.g:1230:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleMio.g:1237:1: rule__And__Group__0__Impl : ( ruleNot ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1241:1: ( ( ruleNot ) )
            // InternalSimpleMio.g:1242:1: ( ruleNot )
            {
            // InternalSimpleMio.g:1242:1: ( ruleNot )
            // InternalSimpleMio.g:1243:2: ruleNot
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
    // InternalSimpleMio.g:1252:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1256:1: ( rule__And__Group__1__Impl )
            // InternalSimpleMio.g:1257:2: rule__And__Group__1__Impl
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
    // InternalSimpleMio.g:1263:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1267:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalSimpleMio.g:1268:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalSimpleMio.g:1268:1: ( ( rule__And__Group_1__0 )* )
            // InternalSimpleMio.g:1269:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalSimpleMio.g:1270:2: ( rule__And__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSimpleMio.g:1270:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSimpleMio.g:1279:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1283:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalSimpleMio.g:1284:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSimpleMio.g:1291:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1295:1: ( ( () ) )
            // InternalSimpleMio.g:1296:1: ( () )
            {
            // InternalSimpleMio.g:1296:1: ( () )
            // InternalSimpleMio.g:1297:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalSimpleMio.g:1298:2: ()
            // InternalSimpleMio.g:1298:3: 
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
    // InternalSimpleMio.g:1306:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1310:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalSimpleMio.g:1311:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleMio.g:1318:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1322:1: ( ( 'and' ) )
            // InternalSimpleMio.g:1323:1: ( 'and' )
            {
            // InternalSimpleMio.g:1323:1: ( 'and' )
            // InternalSimpleMio.g:1324:2: 'and'
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
    // InternalSimpleMio.g:1333:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1337:1: ( rule__And__Group_1__2__Impl )
            // InternalSimpleMio.g:1338:2: rule__And__Group_1__2__Impl
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
    // InternalSimpleMio.g:1344:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1348:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalSimpleMio.g:1349:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalSimpleMio.g:1349:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalSimpleMio.g:1350:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalSimpleMio.g:1351:2: ( rule__And__RightAssignment_1_2 )
            // InternalSimpleMio.g:1351:3: rule__And__RightAssignment_1_2
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
    // InternalSimpleMio.g:1360:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1364:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // InternalSimpleMio.g:1365:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSimpleMio.g:1372:1: rule__Not__Group_0__0__Impl : ( () ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1376:1: ( ( () ) )
            // InternalSimpleMio.g:1377:1: ( () )
            {
            // InternalSimpleMio.g:1377:1: ( () )
            // InternalSimpleMio.g:1378:2: ()
            {
             before(grammarAccess.getNotAccess().getNotAction_0_0()); 
            // InternalSimpleMio.g:1379:2: ()
            // InternalSimpleMio.g:1379:3: 
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
    // InternalSimpleMio.g:1387:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1391:1: ( rule__Not__Group_0__1__Impl )
            // InternalSimpleMio.g:1392:2: rule__Not__Group_0__1__Impl
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
    // InternalSimpleMio.g:1398:1: rule__Not__Group_0__1__Impl : ( ( rule__Not__Group_0_1__0 ) ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1402:1: ( ( ( rule__Not__Group_0_1__0 ) ) )
            // InternalSimpleMio.g:1403:1: ( ( rule__Not__Group_0_1__0 ) )
            {
            // InternalSimpleMio.g:1403:1: ( ( rule__Not__Group_0_1__0 ) )
            // InternalSimpleMio.g:1404:2: ( rule__Not__Group_0_1__0 )
            {
             before(grammarAccess.getNotAccess().getGroup_0_1()); 
            // InternalSimpleMio.g:1405:2: ( rule__Not__Group_0_1__0 )
            // InternalSimpleMio.g:1405:3: rule__Not__Group_0_1__0
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
    // InternalSimpleMio.g:1414:1: rule__Not__Group_0_1__0 : rule__Not__Group_0_1__0__Impl rule__Not__Group_0_1__1 ;
    public final void rule__Not__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1418:1: ( rule__Not__Group_0_1__0__Impl rule__Not__Group_0_1__1 )
            // InternalSimpleMio.g:1419:2: rule__Not__Group_0_1__0__Impl rule__Not__Group_0_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleMio.g:1426:1: rule__Not__Group_0_1__0__Impl : ( 'not' ) ;
    public final void rule__Not__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1430:1: ( ( 'not' ) )
            // InternalSimpleMio.g:1431:1: ( 'not' )
            {
            // InternalSimpleMio.g:1431:1: ( 'not' )
            // InternalSimpleMio.g:1432:2: 'not'
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
    // InternalSimpleMio.g:1441:1: rule__Not__Group_0_1__1 : rule__Not__Group_0_1__1__Impl ;
    public final void rule__Not__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1445:1: ( rule__Not__Group_0_1__1__Impl )
            // InternalSimpleMio.g:1446:2: rule__Not__Group_0_1__1__Impl
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
    // InternalSimpleMio.g:1452:1: rule__Not__Group_0_1__1__Impl : ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) ) ;
    public final void rule__Not__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1456:1: ( ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) ) )
            // InternalSimpleMio.g:1457:1: ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) )
            {
            // InternalSimpleMio.g:1457:1: ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) )
            // InternalSimpleMio.g:1458:2: ( rule__Not__ConditionalsensorAssignment_0_1_1 )
            {
             before(grammarAccess.getNotAccess().getConditionalsensorAssignment_0_1_1()); 
            // InternalSimpleMio.g:1459:2: ( rule__Not__ConditionalsensorAssignment_0_1_1 )
            // InternalSimpleMio.g:1459:3: rule__Not__ConditionalsensorAssignment_0_1_1
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


    // $ANTLR start "rule__Paren__Group__0"
    // InternalSimpleMio.g:1468:1: rule__Paren__Group__0 : rule__Paren__Group__0__Impl rule__Paren__Group__1 ;
    public final void rule__Paren__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1472:1: ( rule__Paren__Group__0__Impl rule__Paren__Group__1 )
            // InternalSimpleMio.g:1473:2: rule__Paren__Group__0__Impl rule__Paren__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleMio.g:1480:1: rule__Paren__Group__0__Impl : ( '(' ) ;
    public final void rule__Paren__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1484:1: ( ( '(' ) )
            // InternalSimpleMio.g:1485:1: ( '(' )
            {
            // InternalSimpleMio.g:1485:1: ( '(' )
            // InternalSimpleMio.g:1486:2: '('
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
    // InternalSimpleMio.g:1495:1: rule__Paren__Group__1 : rule__Paren__Group__1__Impl rule__Paren__Group__2 ;
    public final void rule__Paren__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1499:1: ( rule__Paren__Group__1__Impl rule__Paren__Group__2 )
            // InternalSimpleMio.g:1500:2: rule__Paren__Group__1__Impl rule__Paren__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSimpleMio.g:1507:1: rule__Paren__Group__1__Impl : ( ruleOr ) ;
    public final void rule__Paren__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1511:1: ( ( ruleOr ) )
            // InternalSimpleMio.g:1512:1: ( ruleOr )
            {
            // InternalSimpleMio.g:1512:1: ( ruleOr )
            // InternalSimpleMio.g:1513:2: ruleOr
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
    // InternalSimpleMio.g:1522:1: rule__Paren__Group__2 : rule__Paren__Group__2__Impl ;
    public final void rule__Paren__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1526:1: ( rule__Paren__Group__2__Impl )
            // InternalSimpleMio.g:1527:2: rule__Paren__Group__2__Impl
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
    // InternalSimpleMio.g:1533:1: rule__Paren__Group__2__Impl : ( ')' ) ;
    public final void rule__Paren__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1537:1: ( ( ')' ) )
            // InternalSimpleMio.g:1538:1: ( ')' )
            {
            // InternalSimpleMio.g:1538:1: ( ')' )
            // InternalSimpleMio.g:1539:2: ')'
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
    // InternalSimpleMio.g:1549:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1553:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSimpleMio.g:1554:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSimpleMio.g:1561:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1565:1: ( ( () ) )
            // InternalSimpleMio.g:1566:1: ( () )
            {
            // InternalSimpleMio.g:1566:1: ( () )
            // InternalSimpleMio.g:1567:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalSimpleMio.g:1568:2: ()
            // InternalSimpleMio.g:1568:3: 
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
    // InternalSimpleMio.g:1576:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1580:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalSimpleMio.g:1581:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSimpleMio.g:1588:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__SensorNameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1592:1: ( ( ( rule__Sensor__SensorNameAssignment_1 ) ) )
            // InternalSimpleMio.g:1593:1: ( ( rule__Sensor__SensorNameAssignment_1 ) )
            {
            // InternalSimpleMio.g:1593:1: ( ( rule__Sensor__SensorNameAssignment_1 ) )
            // InternalSimpleMio.g:1594:2: ( rule__Sensor__SensorNameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getSensorNameAssignment_1()); 
            // InternalSimpleMio.g:1595:2: ( rule__Sensor__SensorNameAssignment_1 )
            // InternalSimpleMio.g:1595:3: rule__Sensor__SensorNameAssignment_1
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
    // InternalSimpleMio.g:1603:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1607:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalSimpleMio.g:1608:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSimpleMio.g:1615:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__SensorSpecifierAssignment_2 )? ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1619:1: ( ( ( rule__Sensor__SensorSpecifierAssignment_2 )? ) )
            // InternalSimpleMio.g:1620:1: ( ( rule__Sensor__SensorSpecifierAssignment_2 )? )
            {
            // InternalSimpleMio.g:1620:1: ( ( rule__Sensor__SensorSpecifierAssignment_2 )? )
            // InternalSimpleMio.g:1621:2: ( rule__Sensor__SensorSpecifierAssignment_2 )?
            {
             before(grammarAccess.getSensorAccess().getSensorSpecifierAssignment_2()); 
            // InternalSimpleMio.g:1622:2: ( rule__Sensor__SensorSpecifierAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=14 && LA14_0<=15)||(LA14_0>=27 && LA14_0<=31)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimpleMio.g:1622:3: rule__Sensor__SensorSpecifierAssignment_2
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
    // InternalSimpleMio.g:1630:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1634:1: ( rule__Sensor__Group__3__Impl )
            // InternalSimpleMio.g:1635:2: rule__Sensor__Group__3__Impl
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
    // InternalSimpleMio.g:1641:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__Group_3__0 )? ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1645:1: ( ( ( rule__Sensor__Group_3__0 )? ) )
            // InternalSimpleMio.g:1646:1: ( ( rule__Sensor__Group_3__0 )? )
            {
            // InternalSimpleMio.g:1646:1: ( ( rule__Sensor__Group_3__0 )? )
            // InternalSimpleMio.g:1647:2: ( rule__Sensor__Group_3__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_3()); 
            // InternalSimpleMio.g:1648:2: ( rule__Sensor__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSimpleMio.g:1648:3: rule__Sensor__Group_3__0
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
    // InternalSimpleMio.g:1657:1: rule__Sensor__Group_3__0 : rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 ;
    public final void rule__Sensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1661:1: ( rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 )
            // InternalSimpleMio.g:1662:2: rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSimpleMio.g:1669:1: rule__Sensor__Group_3__0__Impl : ( '@' ) ;
    public final void rule__Sensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1673:1: ( ( '@' ) )
            // InternalSimpleMio.g:1674:1: ( '@' )
            {
            // InternalSimpleMio.g:1674:1: ( '@' )
            // InternalSimpleMio.g:1675:2: '@'
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
    // InternalSimpleMio.g:1684:1: rule__Sensor__Group_3__1 : rule__Sensor__Group_3__1__Impl ;
    public final void rule__Sensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1688:1: ( rule__Sensor__Group_3__1__Impl )
            // InternalSimpleMio.g:1689:2: rule__Sensor__Group_3__1__Impl
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
    // InternalSimpleMio.g:1695:1: rule__Sensor__Group_3__1__Impl : ( ( rule__Sensor__StrengthAssignment_3_1 ) ) ;
    public final void rule__Sensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1699:1: ( ( ( rule__Sensor__StrengthAssignment_3_1 ) ) )
            // InternalSimpleMio.g:1700:1: ( ( rule__Sensor__StrengthAssignment_3_1 ) )
            {
            // InternalSimpleMio.g:1700:1: ( ( rule__Sensor__StrengthAssignment_3_1 ) )
            // InternalSimpleMio.g:1701:2: ( rule__Sensor__StrengthAssignment_3_1 )
            {
             before(grammarAccess.getSensorAccess().getStrengthAssignment_3_1()); 
            // InternalSimpleMio.g:1702:2: ( rule__Sensor__StrengthAssignment_3_1 )
            // InternalSimpleMio.g:1702:3: rule__Sensor__StrengthAssignment_3_1
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
    // InternalSimpleMio.g:1711:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1715:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSimpleMio.g:1716:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSimpleMio.g:1723:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1727:1: ( ( ( '-' )? ) )
            // InternalSimpleMio.g:1728:1: ( ( '-' )? )
            {
            // InternalSimpleMio.g:1728:1: ( ( '-' )? )
            // InternalSimpleMio.g:1729:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSimpleMio.g:1730:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSimpleMio.g:1730:3: '-'
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
    // InternalSimpleMio.g:1738:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1742:1: ( rule__EInt__Group__1__Impl )
            // InternalSimpleMio.g:1743:2: rule__EInt__Group__1__Impl
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
    // InternalSimpleMio.g:1749:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1753:1: ( ( RULE_INT ) )
            // InternalSimpleMio.g:1754:1: ( RULE_INT )
            {
            // InternalSimpleMio.g:1754:1: ( RULE_INT )
            // InternalSimpleMio.g:1755:2: RULE_INT
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
    // InternalSimpleMio.g:1765:1: rule__Model__ProgramAssignment_1 : ( ruleProgram ) ;
    public final void rule__Model__ProgramAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1769:1: ( ( ruleProgram ) )
            // InternalSimpleMio.g:1770:2: ( ruleProgram )
            {
            // InternalSimpleMio.g:1770:2: ( ruleProgram )
            // InternalSimpleMio.g:1771:3: ruleProgram
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


    // $ANTLR start "rule__Program__EventsAssignment_1_0"
    // InternalSimpleMio.g:1780:1: rule__Program__EventsAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__Program__EventsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1784:1: ( ( ruleEvent ) )
            // InternalSimpleMio.g:1785:2: ( ruleEvent )
            {
            // InternalSimpleMio.g:1785:2: ( ruleEvent )
            // InternalSimpleMio.g:1786:3: ruleEvent
            {
             before(grammarAccess.getProgramAccess().getEventsEventParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getEventsEventParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Program__EventsAssignment_1_0"


    // $ANTLR start "rule__Event__ConditionalsensorAssignment_1"
    // InternalSimpleMio.g:1795:1: rule__Event__ConditionalsensorAssignment_1 : ( ruleOr ) ;
    public final void rule__Event__ConditionalsensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1799:1: ( ( ruleOr ) )
            // InternalSimpleMio.g:1800:2: ( ruleOr )
            {
            // InternalSimpleMio.g:1800:2: ( ruleOr )
            // InternalSimpleMio.g:1801:3: ruleOr
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
    // InternalSimpleMio.g:1810:1: rule__Event__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1814:1: ( ( ruleAction ) )
            // InternalSimpleMio.g:1815:2: ( ruleAction )
            {
            // InternalSimpleMio.g:1815:2: ( ruleAction )
            // InternalSimpleMio.g:1816:3: ruleAction
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
    // InternalSimpleMio.g:1825:1: rule__Event__ActionsAssignment_4_1 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1829:1: ( ( ruleAction ) )
            // InternalSimpleMio.g:1830:2: ( ruleAction )
            {
            // InternalSimpleMio.g:1830:2: ( ruleAction )
            // InternalSimpleMio.g:1831:3: ruleAction
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
    // InternalSimpleMio.g:1840:1: rule__Action__ActionNameAssignment_1 : ( ( rule__Action__ActionNameAlternatives_1_0 ) ) ;
    public final void rule__Action__ActionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1844:1: ( ( ( rule__Action__ActionNameAlternatives_1_0 ) ) )
            // InternalSimpleMio.g:1845:2: ( ( rule__Action__ActionNameAlternatives_1_0 ) )
            {
            // InternalSimpleMio.g:1845:2: ( ( rule__Action__ActionNameAlternatives_1_0 ) )
            // InternalSimpleMio.g:1846:3: ( rule__Action__ActionNameAlternatives_1_0 )
            {
             before(grammarAccess.getActionAccess().getActionNameAlternatives_1_0()); 
            // InternalSimpleMio.g:1847:3: ( rule__Action__ActionNameAlternatives_1_0 )
            // InternalSimpleMio.g:1847:4: rule__Action__ActionNameAlternatives_1_0
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
    // InternalSimpleMio.g:1855:1: rule__Action__ActionSpecifierAssignment_2 : ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) ) ;
    public final void rule__Action__ActionSpecifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1859:1: ( ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) ) )
            // InternalSimpleMio.g:1860:2: ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) )
            {
            // InternalSimpleMio.g:1860:2: ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) )
            // InternalSimpleMio.g:1861:3: ( rule__Action__ActionSpecifierAlternatives_2_0 )
            {
             before(grammarAccess.getActionAccess().getActionSpecifierAlternatives_2_0()); 
            // InternalSimpleMio.g:1862:3: ( rule__Action__ActionSpecifierAlternatives_2_0 )
            // InternalSimpleMio.g:1862:4: rule__Action__ActionSpecifierAlternatives_2_0
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
    // InternalSimpleMio.g:1870:1: rule__Action__StrengthAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Action__StrengthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1874:1: ( ( ruleEInt ) )
            // InternalSimpleMio.g:1875:2: ( ruleEInt )
            {
            // InternalSimpleMio.g:1875:2: ( ruleEInt )
            // InternalSimpleMio.g:1876:3: ruleEInt
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
    // InternalSimpleMio.g:1885:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1889:1: ( ( ruleAnd ) )
            // InternalSimpleMio.g:1890:2: ( ruleAnd )
            {
            // InternalSimpleMio.g:1890:2: ( ruleAnd )
            // InternalSimpleMio.g:1891:3: ruleAnd
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
    // InternalSimpleMio.g:1900:1: rule__And__RightAssignment_1_2 : ( ruleNot ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1904:1: ( ( ruleNot ) )
            // InternalSimpleMio.g:1905:2: ( ruleNot )
            {
            // InternalSimpleMio.g:1905:2: ( ruleNot )
            // InternalSimpleMio.g:1906:3: ruleNot
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
    // InternalSimpleMio.g:1915:1: rule__Not__ConditionalsensorAssignment_0_1_1 : ( ruleParen ) ;
    public final void rule__Not__ConditionalsensorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1919:1: ( ( ruleParen ) )
            // InternalSimpleMio.g:1920:2: ( ruleParen )
            {
            // InternalSimpleMio.g:1920:2: ( ruleParen )
            // InternalSimpleMio.g:1921:3: ruleParen
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


    // $ANTLR start "rule__Sensor__SensorNameAssignment_1"
    // InternalSimpleMio.g:1930:1: rule__Sensor__SensorNameAssignment_1 : ( ( rule__Sensor__SensorNameAlternatives_1_0 ) ) ;
    public final void rule__Sensor__SensorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1934:1: ( ( ( rule__Sensor__SensorNameAlternatives_1_0 ) ) )
            // InternalSimpleMio.g:1935:2: ( ( rule__Sensor__SensorNameAlternatives_1_0 ) )
            {
            // InternalSimpleMio.g:1935:2: ( ( rule__Sensor__SensorNameAlternatives_1_0 ) )
            // InternalSimpleMio.g:1936:3: ( rule__Sensor__SensorNameAlternatives_1_0 )
            {
             before(grammarAccess.getSensorAccess().getSensorNameAlternatives_1_0()); 
            // InternalSimpleMio.g:1937:3: ( rule__Sensor__SensorNameAlternatives_1_0 )
            // InternalSimpleMio.g:1937:4: rule__Sensor__SensorNameAlternatives_1_0
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
    // InternalSimpleMio.g:1945:1: rule__Sensor__SensorSpecifierAssignment_2 : ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) ) ;
    public final void rule__Sensor__SensorSpecifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1949:1: ( ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) ) )
            // InternalSimpleMio.g:1950:2: ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) )
            {
            // InternalSimpleMio.g:1950:2: ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) )
            // InternalSimpleMio.g:1951:3: ( rule__Sensor__SensorSpecifierAlternatives_2_0 )
            {
             before(grammarAccess.getSensorAccess().getSensorSpecifierAlternatives_2_0()); 
            // InternalSimpleMio.g:1952:3: ( rule__Sensor__SensorSpecifierAlternatives_2_0 )
            // InternalSimpleMio.g:1952:4: rule__Sensor__SensorSpecifierAlternatives_2_0
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
    // InternalSimpleMio.g:1960:1: rule__Sensor__StrengthAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Sensor__StrengthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1964:1: ( ( ruleEInt ) )
            // InternalSimpleMio.g:1965:2: ( ruleEInt )
            {
            // InternalSimpleMio.g:1965:2: ( ruleEInt )
            // InternalSimpleMio.g:1966:3: ruleEInt
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000C107C00000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000C107C00002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000C007C00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003FC000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000008F800C000L});

}