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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'move'", "'led'", "'turn'", "'left'", "'right'", "'forward'", "'backward'", "'stop'", "'red'", "'green'", "'blue'", "'obstacle'", "'sound'", "'line'", "'button'", "'motor'", "'front'", "'back'", "'up'", "'down'", "'center'", "'#'", "'->'", "','", "'@'", "'or'", "'and'", "'not'", "'('", "')'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_ML_COMMENT=7;
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

            if ( ((LA1_0>=22 && LA1_0<=26)||LA1_0==38) ) {
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
    // InternalSimpleMio.g:432:1: rule__Not__Alternatives : ( ( ( rule__Not__Group_0__0 ) ) | ( ruleSensor ) );
    public final void rule__Not__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:436:1: ( ( ( rule__Not__Group_0__0 ) ) | ( ruleSensor ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=22 && LA4_0<=26)) ) {
                alt4=2;
            }
            else {
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
    // InternalSimpleMio.g:453:1: rule__Sensor__SensorNameAlternatives_1_0 : ( ( 'obstacle' ) | ( 'sound' ) | ( 'line' ) | ( 'button' ) | ( 'motor' ) );
    public final void rule__Sensor__SensorNameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:457:1: ( ( 'obstacle' ) | ( 'sound' ) | ( 'line' ) | ( 'button' ) | ( 'motor' ) )
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
                    // InternalSimpleMio.g:458:2: ( 'obstacle' )
                    {
                    // InternalSimpleMio.g:458:2: ( 'obstacle' )
                    // InternalSimpleMio.g:459:3: 'obstacle'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameObstacleKeyword_1_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameObstacleKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:464:2: ( 'sound' )
                    {
                    // InternalSimpleMio.g:464:2: ( 'sound' )
                    // InternalSimpleMio.g:465:3: 'sound'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameSoundKeyword_1_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameSoundKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:470:2: ( 'line' )
                    {
                    // InternalSimpleMio.g:470:2: ( 'line' )
                    // InternalSimpleMio.g:471:3: 'line'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameLineKeyword_1_0_2()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameLineKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:476:2: ( 'button' )
                    {
                    // InternalSimpleMio.g:476:2: ( 'button' )
                    // InternalSimpleMio.g:477:3: 'button'
                    {
                     before(grammarAccess.getSensorAccess().getSensorNameButtonKeyword_1_0_3()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorNameButtonKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:482:2: ( 'motor' )
                    {
                    // InternalSimpleMio.g:482:2: ( 'motor' )
                    // InternalSimpleMio.g:483:3: 'motor'
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
    // InternalSimpleMio.g:492:1: rule__Sensor__SensorSpecifierAlternatives_2_0 : ( ( 'front' ) | ( 'back' ) | ( 'left' ) | ( 'right' ) | ( 'up' ) | ( 'down' ) | ( 'center' ) );
    public final void rule__Sensor__SensorSpecifierAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:496:1: ( ( 'front' ) | ( 'back' ) | ( 'left' ) | ( 'right' ) | ( 'up' ) | ( 'down' ) | ( 'center' ) )
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
                    // InternalSimpleMio.g:497:2: ( 'front' )
                    {
                    // InternalSimpleMio.g:497:2: ( 'front' )
                    // InternalSimpleMio.g:498:3: 'front'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierFrontKeyword_2_0_0()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierFrontKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:503:2: ( 'back' )
                    {
                    // InternalSimpleMio.g:503:2: ( 'back' )
                    // InternalSimpleMio.g:504:3: 'back'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierBackKeyword_2_0_1()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierBackKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimpleMio.g:509:2: ( 'left' )
                    {
                    // InternalSimpleMio.g:509:2: ( 'left' )
                    // InternalSimpleMio.g:510:3: 'left'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierLeftKeyword_2_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierLeftKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimpleMio.g:515:2: ( 'right' )
                    {
                    // InternalSimpleMio.g:515:2: ( 'right' )
                    // InternalSimpleMio.g:516:3: 'right'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierRightKeyword_2_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierRightKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimpleMio.g:521:2: ( 'up' )
                    {
                    // InternalSimpleMio.g:521:2: ( 'up' )
                    // InternalSimpleMio.g:522:3: 'up'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierUpKeyword_2_0_4()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierUpKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSimpleMio.g:527:2: ( 'down' )
                    {
                    // InternalSimpleMio.g:527:2: ( 'down' )
                    // InternalSimpleMio.g:528:3: 'down'
                    {
                     before(grammarAccess.getSensorAccess().getSensorSpecifierDownKeyword_2_0_5()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getSensorAccess().getSensorSpecifierDownKeyword_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSimpleMio.g:533:2: ( 'center' )
                    {
                    // InternalSimpleMio.g:533:2: ( 'center' )
                    // InternalSimpleMio.g:534:3: 'center'
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
    // InternalSimpleMio.g:543:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:547:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSimpleMio.g:548:2: ( RULE_STRING )
                    {
                    // InternalSimpleMio.g:548:2: ( RULE_STRING )
                    // InternalSimpleMio.g:549:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimpleMio.g:554:2: ( RULE_ID )
                    {
                    // InternalSimpleMio.g:554:2: ( RULE_ID )
                    // InternalSimpleMio.g:555:3: RULE_ID
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
    // InternalSimpleMio.g:564:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:568:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSimpleMio.g:569:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalSimpleMio.g:576:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:580:1: ( ( () ) )
            // InternalSimpleMio.g:581:1: ( () )
            {
            // InternalSimpleMio.g:581:1: ( () )
            // InternalSimpleMio.g:582:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalSimpleMio.g:583:2: ()
            // InternalSimpleMio.g:583:3: 
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
    // InternalSimpleMio.g:591:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:595:1: ( rule__Model__Group__1__Impl )
            // InternalSimpleMio.g:596:2: rule__Model__Group__1__Impl
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
    // InternalSimpleMio.g:602:1: rule__Model__Group__1__Impl : ( ( rule__Model__ProgramAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:606:1: ( ( ( rule__Model__ProgramAssignment_1 ) ) )
            // InternalSimpleMio.g:607:1: ( ( rule__Model__ProgramAssignment_1 ) )
            {
            // InternalSimpleMio.g:607:1: ( ( rule__Model__ProgramAssignment_1 ) )
            // InternalSimpleMio.g:608:2: ( rule__Model__ProgramAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getProgramAssignment_1()); 
            // InternalSimpleMio.g:609:2: ( rule__Model__ProgramAssignment_1 )
            // InternalSimpleMio.g:609:3: rule__Model__ProgramAssignment_1
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
    // InternalSimpleMio.g:618:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:622:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalSimpleMio.g:623:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalSimpleMio.g:630:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:634:1: ( ( () ) )
            // InternalSimpleMio.g:635:1: ( () )
            {
            // InternalSimpleMio.g:635:1: ( () )
            // InternalSimpleMio.g:636:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalSimpleMio.g:637:2: ()
            // InternalSimpleMio.g:637:3: 
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
    // InternalSimpleMio.g:645:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:649:1: ( rule__Program__Group__1__Impl )
            // InternalSimpleMio.g:650:2: rule__Program__Group__1__Impl
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
    // InternalSimpleMio.g:656:1: rule__Program__Group__1__Impl : ( ( ( rule__Program__Alternatives_1 ) ) ( ( rule__Program__Alternatives_1 )* ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:660:1: ( ( ( ( rule__Program__Alternatives_1 ) ) ( ( rule__Program__Alternatives_1 )* ) ) )
            // InternalSimpleMio.g:661:1: ( ( ( rule__Program__Alternatives_1 ) ) ( ( rule__Program__Alternatives_1 )* ) )
            {
            // InternalSimpleMio.g:661:1: ( ( ( rule__Program__Alternatives_1 ) ) ( ( rule__Program__Alternatives_1 )* ) )
            // InternalSimpleMio.g:662:2: ( ( rule__Program__Alternatives_1 ) ) ( ( rule__Program__Alternatives_1 )* )
            {
            // InternalSimpleMio.g:662:2: ( ( rule__Program__Alternatives_1 ) )
            // InternalSimpleMio.g:663:3: ( rule__Program__Alternatives_1 )
            {
             before(grammarAccess.getProgramAccess().getAlternatives_1()); 
            // InternalSimpleMio.g:664:3: ( rule__Program__Alternatives_1 )
            // InternalSimpleMio.g:664:4: rule__Program__Alternatives_1
            {
            pushFollow(FOLLOW_4);
            rule__Program__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getAlternatives_1()); 

            }

            // InternalSimpleMio.g:667:2: ( ( rule__Program__Alternatives_1 )* )
            // InternalSimpleMio.g:668:3: ( rule__Program__Alternatives_1 )*
            {
             before(grammarAccess.getProgramAccess().getAlternatives_1()); 
            // InternalSimpleMio.g:669:3: ( rule__Program__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=26)||LA8_0==32||LA8_0==38) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimpleMio.g:669:4: rule__Program__Alternatives_1
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
    // InternalSimpleMio.g:679:1: rule__Program__Group_1_1__0 : rule__Program__Group_1_1__0__Impl rule__Program__Group_1_1__1 ;
    public final void rule__Program__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:683:1: ( rule__Program__Group_1_1__0__Impl rule__Program__Group_1_1__1 )
            // InternalSimpleMio.g:684:2: rule__Program__Group_1_1__0__Impl rule__Program__Group_1_1__1
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
    // InternalSimpleMio.g:691:1: rule__Program__Group_1_1__0__Impl : ( '#' ) ;
    public final void rule__Program__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:695:1: ( ( '#' ) )
            // InternalSimpleMio.g:696:1: ( '#' )
            {
            // InternalSimpleMio.g:696:1: ( '#' )
            // InternalSimpleMio.g:697:2: '#'
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
    // InternalSimpleMio.g:706:1: rule__Program__Group_1_1__1 : rule__Program__Group_1_1__1__Impl ;
    public final void rule__Program__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:710:1: ( rule__Program__Group_1_1__1__Impl )
            // InternalSimpleMio.g:711:2: rule__Program__Group_1_1__1__Impl
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
    // InternalSimpleMio.g:717:1: rule__Program__Group_1_1__1__Impl : ( ( ruleEString )* ) ;
    public final void rule__Program__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:721:1: ( ( ( ruleEString )* ) )
            // InternalSimpleMio.g:722:1: ( ( ruleEString )* )
            {
            // InternalSimpleMio.g:722:1: ( ( ruleEString )* )
            // InternalSimpleMio.g:723:2: ( ruleEString )*
            {
             before(grammarAccess.getProgramAccess().getEStringParserRuleCall_1_1_1()); 
            // InternalSimpleMio.g:724:2: ( ruleEString )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimpleMio.g:724:3: ruleEString
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
    // InternalSimpleMio.g:733:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:737:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalSimpleMio.g:738:2: rule__Event__Group__0__Impl rule__Event__Group__1
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
    // InternalSimpleMio.g:745:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:749:1: ( ( () ) )
            // InternalSimpleMio.g:750:1: ( () )
            {
            // InternalSimpleMio.g:750:1: ( () )
            // InternalSimpleMio.g:751:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalSimpleMio.g:752:2: ()
            // InternalSimpleMio.g:752:3: 
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
    // InternalSimpleMio.g:760:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:764:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalSimpleMio.g:765:2: rule__Event__Group__1__Impl rule__Event__Group__2
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
    // InternalSimpleMio.g:772:1: rule__Event__Group__1__Impl : ( ( rule__Event__ConditionalsensorAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:776:1: ( ( ( rule__Event__ConditionalsensorAssignment_1 ) ) )
            // InternalSimpleMio.g:777:1: ( ( rule__Event__ConditionalsensorAssignment_1 ) )
            {
            // InternalSimpleMio.g:777:1: ( ( rule__Event__ConditionalsensorAssignment_1 ) )
            // InternalSimpleMio.g:778:2: ( rule__Event__ConditionalsensorAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getConditionalsensorAssignment_1()); 
            // InternalSimpleMio.g:779:2: ( rule__Event__ConditionalsensorAssignment_1 )
            // InternalSimpleMio.g:779:3: rule__Event__ConditionalsensorAssignment_1
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
    // InternalSimpleMio.g:787:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:791:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalSimpleMio.g:792:2: rule__Event__Group__2__Impl rule__Event__Group__3
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
    // InternalSimpleMio.g:799:1: rule__Event__Group__2__Impl : ( '->' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:803:1: ( ( '->' ) )
            // InternalSimpleMio.g:804:1: ( '->' )
            {
            // InternalSimpleMio.g:804:1: ( '->' )
            // InternalSimpleMio.g:805:2: '->'
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
    // InternalSimpleMio.g:814:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:818:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalSimpleMio.g:819:2: rule__Event__Group__3__Impl rule__Event__Group__4
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
    // InternalSimpleMio.g:826:1: rule__Event__Group__3__Impl : ( ( rule__Event__ActionsAssignment_3 ) ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:830:1: ( ( ( rule__Event__ActionsAssignment_3 ) ) )
            // InternalSimpleMio.g:831:1: ( ( rule__Event__ActionsAssignment_3 ) )
            {
            // InternalSimpleMio.g:831:1: ( ( rule__Event__ActionsAssignment_3 ) )
            // InternalSimpleMio.g:832:2: ( rule__Event__ActionsAssignment_3 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_3()); 
            // InternalSimpleMio.g:833:2: ( rule__Event__ActionsAssignment_3 )
            // InternalSimpleMio.g:833:3: rule__Event__ActionsAssignment_3
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
    // InternalSimpleMio.g:841:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:845:1: ( rule__Event__Group__4__Impl )
            // InternalSimpleMio.g:846:2: rule__Event__Group__4__Impl
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
    // InternalSimpleMio.g:852:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )* ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:856:1: ( ( ( rule__Event__Group_4__0 )* ) )
            // InternalSimpleMio.g:857:1: ( ( rule__Event__Group_4__0 )* )
            {
            // InternalSimpleMio.g:857:1: ( ( rule__Event__Group_4__0 )* )
            // InternalSimpleMio.g:858:2: ( rule__Event__Group_4__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalSimpleMio.g:859:2: ( rule__Event__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimpleMio.g:859:3: rule__Event__Group_4__0
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
    // InternalSimpleMio.g:868:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:872:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalSimpleMio.g:873:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
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
    // InternalSimpleMio.g:880:1: rule__Event__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:884:1: ( ( ',' ) )
            // InternalSimpleMio.g:885:1: ( ',' )
            {
            // InternalSimpleMio.g:885:1: ( ',' )
            // InternalSimpleMio.g:886:2: ','
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
    // InternalSimpleMio.g:895:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:899:1: ( rule__Event__Group_4__1__Impl )
            // InternalSimpleMio.g:900:2: rule__Event__Group_4__1__Impl
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
    // InternalSimpleMio.g:906:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__ActionsAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:910:1: ( ( ( rule__Event__ActionsAssignment_4_1 ) ) )
            // InternalSimpleMio.g:911:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            {
            // InternalSimpleMio.g:911:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            // InternalSimpleMio.g:912:2: ( rule__Event__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_1()); 
            // InternalSimpleMio.g:913:2: ( rule__Event__ActionsAssignment_4_1 )
            // InternalSimpleMio.g:913:3: rule__Event__ActionsAssignment_4_1
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
    // InternalSimpleMio.g:922:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:926:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalSimpleMio.g:927:2: rule__Action__Group__0__Impl rule__Action__Group__1
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
    // InternalSimpleMio.g:934:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:938:1: ( ( () ) )
            // InternalSimpleMio.g:939:1: ( () )
            {
            // InternalSimpleMio.g:939:1: ( () )
            // InternalSimpleMio.g:940:2: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // InternalSimpleMio.g:941:2: ()
            // InternalSimpleMio.g:941:3: 
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
    // InternalSimpleMio.g:949:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:953:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalSimpleMio.g:954:2: rule__Action__Group__1__Impl rule__Action__Group__2
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
    // InternalSimpleMio.g:961:1: rule__Action__Group__1__Impl : ( ( rule__Action__ActionNameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:965:1: ( ( ( rule__Action__ActionNameAssignment_1 ) ) )
            // InternalSimpleMio.g:966:1: ( ( rule__Action__ActionNameAssignment_1 ) )
            {
            // InternalSimpleMio.g:966:1: ( ( rule__Action__ActionNameAssignment_1 ) )
            // InternalSimpleMio.g:967:2: ( rule__Action__ActionNameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getActionNameAssignment_1()); 
            // InternalSimpleMio.g:968:2: ( rule__Action__ActionNameAssignment_1 )
            // InternalSimpleMio.g:968:3: rule__Action__ActionNameAssignment_1
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
    // InternalSimpleMio.g:976:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:980:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // InternalSimpleMio.g:981:2: rule__Action__Group__2__Impl rule__Action__Group__3
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
    // InternalSimpleMio.g:988:1: rule__Action__Group__2__Impl : ( ( rule__Action__ActionSpecifierAssignment_2 ) ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:992:1: ( ( ( rule__Action__ActionSpecifierAssignment_2 ) ) )
            // InternalSimpleMio.g:993:1: ( ( rule__Action__ActionSpecifierAssignment_2 ) )
            {
            // InternalSimpleMio.g:993:1: ( ( rule__Action__ActionSpecifierAssignment_2 ) )
            // InternalSimpleMio.g:994:2: ( rule__Action__ActionSpecifierAssignment_2 )
            {
             before(grammarAccess.getActionAccess().getActionSpecifierAssignment_2()); 
            // InternalSimpleMio.g:995:2: ( rule__Action__ActionSpecifierAssignment_2 )
            // InternalSimpleMio.g:995:3: rule__Action__ActionSpecifierAssignment_2
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
    // InternalSimpleMio.g:1003:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1007:1: ( rule__Action__Group__3__Impl )
            // InternalSimpleMio.g:1008:2: rule__Action__Group__3__Impl
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
    // InternalSimpleMio.g:1014:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )? ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1018:1: ( ( ( rule__Action__Group_3__0 )? ) )
            // InternalSimpleMio.g:1019:1: ( ( rule__Action__Group_3__0 )? )
            {
            // InternalSimpleMio.g:1019:1: ( ( rule__Action__Group_3__0 )? )
            // InternalSimpleMio.g:1020:2: ( rule__Action__Group_3__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // InternalSimpleMio.g:1021:2: ( rule__Action__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSimpleMio.g:1021:3: rule__Action__Group_3__0
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
    // InternalSimpleMio.g:1030:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1034:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // InternalSimpleMio.g:1035:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
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
    // InternalSimpleMio.g:1042:1: rule__Action__Group_3__0__Impl : ( '@' ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1046:1: ( ( '@' ) )
            // InternalSimpleMio.g:1047:1: ( '@' )
            {
            // InternalSimpleMio.g:1047:1: ( '@' )
            // InternalSimpleMio.g:1048:2: '@'
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
    // InternalSimpleMio.g:1057:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1061:1: ( rule__Action__Group_3__1__Impl )
            // InternalSimpleMio.g:1062:2: rule__Action__Group_3__1__Impl
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
    // InternalSimpleMio.g:1068:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__StrengthAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1072:1: ( ( ( rule__Action__StrengthAssignment_3_1 ) ) )
            // InternalSimpleMio.g:1073:1: ( ( rule__Action__StrengthAssignment_3_1 ) )
            {
            // InternalSimpleMio.g:1073:1: ( ( rule__Action__StrengthAssignment_3_1 ) )
            // InternalSimpleMio.g:1074:2: ( rule__Action__StrengthAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getStrengthAssignment_3_1()); 
            // InternalSimpleMio.g:1075:2: ( rule__Action__StrengthAssignment_3_1 )
            // InternalSimpleMio.g:1075:3: rule__Action__StrengthAssignment_3_1
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
    // InternalSimpleMio.g:1084:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1088:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalSimpleMio.g:1089:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalSimpleMio.g:1096:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1100:1: ( ( ruleAnd ) )
            // InternalSimpleMio.g:1101:1: ( ruleAnd )
            {
            // InternalSimpleMio.g:1101:1: ( ruleAnd )
            // InternalSimpleMio.g:1102:2: ruleAnd
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
    // InternalSimpleMio.g:1111:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1115:1: ( rule__Or__Group__1__Impl )
            // InternalSimpleMio.g:1116:2: rule__Or__Group__1__Impl
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
    // InternalSimpleMio.g:1122:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1126:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalSimpleMio.g:1127:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalSimpleMio.g:1127:1: ( ( rule__Or__Group_1__0 )* )
            // InternalSimpleMio.g:1128:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalSimpleMio.g:1129:2: ( rule__Or__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSimpleMio.g:1129:3: rule__Or__Group_1__0
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
    // InternalSimpleMio.g:1138:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1142:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalSimpleMio.g:1143:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalSimpleMio.g:1150:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1154:1: ( ( () ) )
            // InternalSimpleMio.g:1155:1: ( () )
            {
            // InternalSimpleMio.g:1155:1: ( () )
            // InternalSimpleMio.g:1156:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalSimpleMio.g:1157:2: ()
            // InternalSimpleMio.g:1157:3: 
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
    // InternalSimpleMio.g:1165:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1169:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalSimpleMio.g:1170:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalSimpleMio.g:1177:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1181:1: ( ( 'or' ) )
            // InternalSimpleMio.g:1182:1: ( 'or' )
            {
            // InternalSimpleMio.g:1182:1: ( 'or' )
            // InternalSimpleMio.g:1183:2: 'or'
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
    // InternalSimpleMio.g:1192:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1196:1: ( rule__Or__Group_1__2__Impl )
            // InternalSimpleMio.g:1197:2: rule__Or__Group_1__2__Impl
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
    // InternalSimpleMio.g:1203:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1207:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalSimpleMio.g:1208:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalSimpleMio.g:1208:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalSimpleMio.g:1209:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalSimpleMio.g:1210:2: ( rule__Or__RightAssignment_1_2 )
            // InternalSimpleMio.g:1210:3: rule__Or__RightAssignment_1_2
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
    // InternalSimpleMio.g:1219:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1223:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalSimpleMio.g:1224:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalSimpleMio.g:1231:1: rule__And__Group__0__Impl : ( ruleNot ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1235:1: ( ( ruleNot ) )
            // InternalSimpleMio.g:1236:1: ( ruleNot )
            {
            // InternalSimpleMio.g:1236:1: ( ruleNot )
            // InternalSimpleMio.g:1237:2: ruleNot
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
    // InternalSimpleMio.g:1246:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1250:1: ( rule__And__Group__1__Impl )
            // InternalSimpleMio.g:1251:2: rule__And__Group__1__Impl
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
    // InternalSimpleMio.g:1257:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1261:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalSimpleMio.g:1262:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalSimpleMio.g:1262:1: ( ( rule__And__Group_1__0 )* )
            // InternalSimpleMio.g:1263:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalSimpleMio.g:1264:2: ( rule__And__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSimpleMio.g:1264:3: rule__And__Group_1__0
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
    // InternalSimpleMio.g:1273:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1277:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalSimpleMio.g:1278:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalSimpleMio.g:1285:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1289:1: ( ( () ) )
            // InternalSimpleMio.g:1290:1: ( () )
            {
            // InternalSimpleMio.g:1290:1: ( () )
            // InternalSimpleMio.g:1291:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalSimpleMio.g:1292:2: ()
            // InternalSimpleMio.g:1292:3: 
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
    // InternalSimpleMio.g:1300:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1304:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalSimpleMio.g:1305:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalSimpleMio.g:1312:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1316:1: ( ( 'and' ) )
            // InternalSimpleMio.g:1317:1: ( 'and' )
            {
            // InternalSimpleMio.g:1317:1: ( 'and' )
            // InternalSimpleMio.g:1318:2: 'and'
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
    // InternalSimpleMio.g:1327:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1331:1: ( rule__And__Group_1__2__Impl )
            // InternalSimpleMio.g:1332:2: rule__And__Group_1__2__Impl
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
    // InternalSimpleMio.g:1338:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1342:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalSimpleMio.g:1343:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalSimpleMio.g:1343:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalSimpleMio.g:1344:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalSimpleMio.g:1345:2: ( rule__And__RightAssignment_1_2 )
            // InternalSimpleMio.g:1345:3: rule__And__RightAssignment_1_2
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
    // InternalSimpleMio.g:1354:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1358:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // InternalSimpleMio.g:1359:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
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
    // InternalSimpleMio.g:1366:1: rule__Not__Group_0__0__Impl : ( () ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1370:1: ( ( () ) )
            // InternalSimpleMio.g:1371:1: ( () )
            {
            // InternalSimpleMio.g:1371:1: ( () )
            // InternalSimpleMio.g:1372:2: ()
            {
             before(grammarAccess.getNotAccess().getNotAction_0_0()); 
            // InternalSimpleMio.g:1373:2: ()
            // InternalSimpleMio.g:1373:3: 
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
    // InternalSimpleMio.g:1381:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1385:1: ( rule__Not__Group_0__1__Impl )
            // InternalSimpleMio.g:1386:2: rule__Not__Group_0__1__Impl
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
    // InternalSimpleMio.g:1392:1: rule__Not__Group_0__1__Impl : ( ( rule__Not__Group_0_1__0 ) ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1396:1: ( ( ( rule__Not__Group_0_1__0 ) ) )
            // InternalSimpleMio.g:1397:1: ( ( rule__Not__Group_0_1__0 ) )
            {
            // InternalSimpleMio.g:1397:1: ( ( rule__Not__Group_0_1__0 ) )
            // InternalSimpleMio.g:1398:2: ( rule__Not__Group_0_1__0 )
            {
             before(grammarAccess.getNotAccess().getGroup_0_1()); 
            // InternalSimpleMio.g:1399:2: ( rule__Not__Group_0_1__0 )
            // InternalSimpleMio.g:1399:3: rule__Not__Group_0_1__0
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
    // InternalSimpleMio.g:1408:1: rule__Not__Group_0_1__0 : rule__Not__Group_0_1__0__Impl rule__Not__Group_0_1__1 ;
    public final void rule__Not__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1412:1: ( rule__Not__Group_0_1__0__Impl rule__Not__Group_0_1__1 )
            // InternalSimpleMio.g:1413:2: rule__Not__Group_0_1__0__Impl rule__Not__Group_0_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSimpleMio.g:1420:1: rule__Not__Group_0_1__0__Impl : ( 'not' ) ;
    public final void rule__Not__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1424:1: ( ( 'not' ) )
            // InternalSimpleMio.g:1425:1: ( 'not' )
            {
            // InternalSimpleMio.g:1425:1: ( 'not' )
            // InternalSimpleMio.g:1426:2: 'not'
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
    // InternalSimpleMio.g:1435:1: rule__Not__Group_0_1__1 : rule__Not__Group_0_1__1__Impl ;
    public final void rule__Not__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1439:1: ( rule__Not__Group_0_1__1__Impl )
            // InternalSimpleMio.g:1440:2: rule__Not__Group_0_1__1__Impl
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
    // InternalSimpleMio.g:1446:1: rule__Not__Group_0_1__1__Impl : ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) ) ;
    public final void rule__Not__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1450:1: ( ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) ) )
            // InternalSimpleMio.g:1451:1: ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) )
            {
            // InternalSimpleMio.g:1451:1: ( ( rule__Not__ConditionalsensorAssignment_0_1_1 ) )
            // InternalSimpleMio.g:1452:2: ( rule__Not__ConditionalsensorAssignment_0_1_1 )
            {
             before(grammarAccess.getNotAccess().getConditionalsensorAssignment_0_1_1()); 
            // InternalSimpleMio.g:1453:2: ( rule__Not__ConditionalsensorAssignment_0_1_1 )
            // InternalSimpleMio.g:1453:3: rule__Not__ConditionalsensorAssignment_0_1_1
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
    // InternalSimpleMio.g:1462:1: rule__Paren__Group__0 : rule__Paren__Group__0__Impl rule__Paren__Group__1 ;
    public final void rule__Paren__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1466:1: ( rule__Paren__Group__0__Impl rule__Paren__Group__1 )
            // InternalSimpleMio.g:1467:2: rule__Paren__Group__0__Impl rule__Paren__Group__1
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
    // InternalSimpleMio.g:1474:1: rule__Paren__Group__0__Impl : ( '(' ) ;
    public final void rule__Paren__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1478:1: ( ( '(' ) )
            // InternalSimpleMio.g:1479:1: ( '(' )
            {
            // InternalSimpleMio.g:1479:1: ( '(' )
            // InternalSimpleMio.g:1480:2: '('
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
    // InternalSimpleMio.g:1489:1: rule__Paren__Group__1 : rule__Paren__Group__1__Impl rule__Paren__Group__2 ;
    public final void rule__Paren__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1493:1: ( rule__Paren__Group__1__Impl rule__Paren__Group__2 )
            // InternalSimpleMio.g:1494:2: rule__Paren__Group__1__Impl rule__Paren__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSimpleMio.g:1501:1: rule__Paren__Group__1__Impl : ( ruleOr ) ;
    public final void rule__Paren__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1505:1: ( ( ruleOr ) )
            // InternalSimpleMio.g:1506:1: ( ruleOr )
            {
            // InternalSimpleMio.g:1506:1: ( ruleOr )
            // InternalSimpleMio.g:1507:2: ruleOr
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
    // InternalSimpleMio.g:1516:1: rule__Paren__Group__2 : rule__Paren__Group__2__Impl ;
    public final void rule__Paren__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1520:1: ( rule__Paren__Group__2__Impl )
            // InternalSimpleMio.g:1521:2: rule__Paren__Group__2__Impl
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
    // InternalSimpleMio.g:1527:1: rule__Paren__Group__2__Impl : ( ')' ) ;
    public final void rule__Paren__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1531:1: ( ( ')' ) )
            // InternalSimpleMio.g:1532:1: ( ')' )
            {
            // InternalSimpleMio.g:1532:1: ( ')' )
            // InternalSimpleMio.g:1533:2: ')'
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
    // InternalSimpleMio.g:1543:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1547:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSimpleMio.g:1548:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSimpleMio.g:1555:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1559:1: ( ( () ) )
            // InternalSimpleMio.g:1560:1: ( () )
            {
            // InternalSimpleMio.g:1560:1: ( () )
            // InternalSimpleMio.g:1561:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalSimpleMio.g:1562:2: ()
            // InternalSimpleMio.g:1562:3: 
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
    // InternalSimpleMio.g:1570:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1574:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalSimpleMio.g:1575:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
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
    // InternalSimpleMio.g:1582:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__SensorNameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1586:1: ( ( ( rule__Sensor__SensorNameAssignment_1 ) ) )
            // InternalSimpleMio.g:1587:1: ( ( rule__Sensor__SensorNameAssignment_1 ) )
            {
            // InternalSimpleMio.g:1587:1: ( ( rule__Sensor__SensorNameAssignment_1 ) )
            // InternalSimpleMio.g:1588:2: ( rule__Sensor__SensorNameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getSensorNameAssignment_1()); 
            // InternalSimpleMio.g:1589:2: ( rule__Sensor__SensorNameAssignment_1 )
            // InternalSimpleMio.g:1589:3: rule__Sensor__SensorNameAssignment_1
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
    // InternalSimpleMio.g:1597:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1601:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalSimpleMio.g:1602:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
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
    // InternalSimpleMio.g:1609:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__SensorSpecifierAssignment_2 )? ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1613:1: ( ( ( rule__Sensor__SensorSpecifierAssignment_2 )? ) )
            // InternalSimpleMio.g:1614:1: ( ( rule__Sensor__SensorSpecifierAssignment_2 )? )
            {
            // InternalSimpleMio.g:1614:1: ( ( rule__Sensor__SensorSpecifierAssignment_2 )? )
            // InternalSimpleMio.g:1615:2: ( rule__Sensor__SensorSpecifierAssignment_2 )?
            {
             before(grammarAccess.getSensorAccess().getSensorSpecifierAssignment_2()); 
            // InternalSimpleMio.g:1616:2: ( rule__Sensor__SensorSpecifierAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=14 && LA14_0<=15)||(LA14_0>=27 && LA14_0<=31)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimpleMio.g:1616:3: rule__Sensor__SensorSpecifierAssignment_2
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
    // InternalSimpleMio.g:1624:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1628:1: ( rule__Sensor__Group__3__Impl )
            // InternalSimpleMio.g:1629:2: rule__Sensor__Group__3__Impl
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
    // InternalSimpleMio.g:1635:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__Group_3__0 )? ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1639:1: ( ( ( rule__Sensor__Group_3__0 )? ) )
            // InternalSimpleMio.g:1640:1: ( ( rule__Sensor__Group_3__0 )? )
            {
            // InternalSimpleMio.g:1640:1: ( ( rule__Sensor__Group_3__0 )? )
            // InternalSimpleMio.g:1641:2: ( rule__Sensor__Group_3__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_3()); 
            // InternalSimpleMio.g:1642:2: ( rule__Sensor__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSimpleMio.g:1642:3: rule__Sensor__Group_3__0
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
    // InternalSimpleMio.g:1651:1: rule__Sensor__Group_3__0 : rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 ;
    public final void rule__Sensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1655:1: ( rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 )
            // InternalSimpleMio.g:1656:2: rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1
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
    // InternalSimpleMio.g:1663:1: rule__Sensor__Group_3__0__Impl : ( '@' ) ;
    public final void rule__Sensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1667:1: ( ( '@' ) )
            // InternalSimpleMio.g:1668:1: ( '@' )
            {
            // InternalSimpleMio.g:1668:1: ( '@' )
            // InternalSimpleMio.g:1669:2: '@'
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
    // InternalSimpleMio.g:1678:1: rule__Sensor__Group_3__1 : rule__Sensor__Group_3__1__Impl ;
    public final void rule__Sensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1682:1: ( rule__Sensor__Group_3__1__Impl )
            // InternalSimpleMio.g:1683:2: rule__Sensor__Group_3__1__Impl
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
    // InternalSimpleMio.g:1689:1: rule__Sensor__Group_3__1__Impl : ( ( rule__Sensor__StrengthAssignment_3_1 ) ) ;
    public final void rule__Sensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1693:1: ( ( ( rule__Sensor__StrengthAssignment_3_1 ) ) )
            // InternalSimpleMio.g:1694:1: ( ( rule__Sensor__StrengthAssignment_3_1 ) )
            {
            // InternalSimpleMio.g:1694:1: ( ( rule__Sensor__StrengthAssignment_3_1 ) )
            // InternalSimpleMio.g:1695:2: ( rule__Sensor__StrengthAssignment_3_1 )
            {
             before(grammarAccess.getSensorAccess().getStrengthAssignment_3_1()); 
            // InternalSimpleMio.g:1696:2: ( rule__Sensor__StrengthAssignment_3_1 )
            // InternalSimpleMio.g:1696:3: rule__Sensor__StrengthAssignment_3_1
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
    // InternalSimpleMio.g:1705:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1709:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSimpleMio.g:1710:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSimpleMio.g:1717:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1721:1: ( ( ( '-' )? ) )
            // InternalSimpleMio.g:1722:1: ( ( '-' )? )
            {
            // InternalSimpleMio.g:1722:1: ( ( '-' )? )
            // InternalSimpleMio.g:1723:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSimpleMio.g:1724:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSimpleMio.g:1724:3: '-'
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
    // InternalSimpleMio.g:1732:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1736:1: ( rule__EInt__Group__1__Impl )
            // InternalSimpleMio.g:1737:2: rule__EInt__Group__1__Impl
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
    // InternalSimpleMio.g:1743:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1747:1: ( ( RULE_INT ) )
            // InternalSimpleMio.g:1748:1: ( RULE_INT )
            {
            // InternalSimpleMio.g:1748:1: ( RULE_INT )
            // InternalSimpleMio.g:1749:2: RULE_INT
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
    // InternalSimpleMio.g:1759:1: rule__Model__ProgramAssignment_1 : ( ruleProgram ) ;
    public final void rule__Model__ProgramAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1763:1: ( ( ruleProgram ) )
            // InternalSimpleMio.g:1764:2: ( ruleProgram )
            {
            // InternalSimpleMio.g:1764:2: ( ruleProgram )
            // InternalSimpleMio.g:1765:3: ruleProgram
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
    // InternalSimpleMio.g:1774:1: rule__Program__EventsAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__Program__EventsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1778:1: ( ( ruleEvent ) )
            // InternalSimpleMio.g:1779:2: ( ruleEvent )
            {
            // InternalSimpleMio.g:1779:2: ( ruleEvent )
            // InternalSimpleMio.g:1780:3: ruleEvent
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
    // InternalSimpleMio.g:1789:1: rule__Event__ConditionalsensorAssignment_1 : ( ruleOr ) ;
    public final void rule__Event__ConditionalsensorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1793:1: ( ( ruleOr ) )
            // InternalSimpleMio.g:1794:2: ( ruleOr )
            {
            // InternalSimpleMio.g:1794:2: ( ruleOr )
            // InternalSimpleMio.g:1795:3: ruleOr
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
    // InternalSimpleMio.g:1804:1: rule__Event__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1808:1: ( ( ruleAction ) )
            // InternalSimpleMio.g:1809:2: ( ruleAction )
            {
            // InternalSimpleMio.g:1809:2: ( ruleAction )
            // InternalSimpleMio.g:1810:3: ruleAction
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
    // InternalSimpleMio.g:1819:1: rule__Event__ActionsAssignment_4_1 : ( ruleAction ) ;
    public final void rule__Event__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1823:1: ( ( ruleAction ) )
            // InternalSimpleMio.g:1824:2: ( ruleAction )
            {
            // InternalSimpleMio.g:1824:2: ( ruleAction )
            // InternalSimpleMio.g:1825:3: ruleAction
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
    // InternalSimpleMio.g:1834:1: rule__Action__ActionNameAssignment_1 : ( ( rule__Action__ActionNameAlternatives_1_0 ) ) ;
    public final void rule__Action__ActionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1838:1: ( ( ( rule__Action__ActionNameAlternatives_1_0 ) ) )
            // InternalSimpleMio.g:1839:2: ( ( rule__Action__ActionNameAlternatives_1_0 ) )
            {
            // InternalSimpleMio.g:1839:2: ( ( rule__Action__ActionNameAlternatives_1_0 ) )
            // InternalSimpleMio.g:1840:3: ( rule__Action__ActionNameAlternatives_1_0 )
            {
             before(grammarAccess.getActionAccess().getActionNameAlternatives_1_0()); 
            // InternalSimpleMio.g:1841:3: ( rule__Action__ActionNameAlternatives_1_0 )
            // InternalSimpleMio.g:1841:4: rule__Action__ActionNameAlternatives_1_0
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
    // InternalSimpleMio.g:1849:1: rule__Action__ActionSpecifierAssignment_2 : ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) ) ;
    public final void rule__Action__ActionSpecifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1853:1: ( ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) ) )
            // InternalSimpleMio.g:1854:2: ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) )
            {
            // InternalSimpleMio.g:1854:2: ( ( rule__Action__ActionSpecifierAlternatives_2_0 ) )
            // InternalSimpleMio.g:1855:3: ( rule__Action__ActionSpecifierAlternatives_2_0 )
            {
             before(grammarAccess.getActionAccess().getActionSpecifierAlternatives_2_0()); 
            // InternalSimpleMio.g:1856:3: ( rule__Action__ActionSpecifierAlternatives_2_0 )
            // InternalSimpleMio.g:1856:4: rule__Action__ActionSpecifierAlternatives_2_0
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
    // InternalSimpleMio.g:1864:1: rule__Action__StrengthAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Action__StrengthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1868:1: ( ( ruleEInt ) )
            // InternalSimpleMio.g:1869:2: ( ruleEInt )
            {
            // InternalSimpleMio.g:1869:2: ( ruleEInt )
            // InternalSimpleMio.g:1870:3: ruleEInt
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
    // InternalSimpleMio.g:1879:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1883:1: ( ( ruleAnd ) )
            // InternalSimpleMio.g:1884:2: ( ruleAnd )
            {
            // InternalSimpleMio.g:1884:2: ( ruleAnd )
            // InternalSimpleMio.g:1885:3: ruleAnd
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
    // InternalSimpleMio.g:1894:1: rule__And__RightAssignment_1_2 : ( ruleNot ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1898:1: ( ( ruleNot ) )
            // InternalSimpleMio.g:1899:2: ( ruleNot )
            {
            // InternalSimpleMio.g:1899:2: ( ruleNot )
            // InternalSimpleMio.g:1900:3: ruleNot
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
    // InternalSimpleMio.g:1909:1: rule__Not__ConditionalsensorAssignment_0_1_1 : ( ruleParen ) ;
    public final void rule__Not__ConditionalsensorAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1913:1: ( ( ruleParen ) )
            // InternalSimpleMio.g:1914:2: ( ruleParen )
            {
            // InternalSimpleMio.g:1914:2: ( ruleParen )
            // InternalSimpleMio.g:1915:3: ruleParen
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
    // InternalSimpleMio.g:1924:1: rule__Sensor__SensorNameAssignment_1 : ( ( rule__Sensor__SensorNameAlternatives_1_0 ) ) ;
    public final void rule__Sensor__SensorNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1928:1: ( ( ( rule__Sensor__SensorNameAlternatives_1_0 ) ) )
            // InternalSimpleMio.g:1929:2: ( ( rule__Sensor__SensorNameAlternatives_1_0 ) )
            {
            // InternalSimpleMio.g:1929:2: ( ( rule__Sensor__SensorNameAlternatives_1_0 ) )
            // InternalSimpleMio.g:1930:3: ( rule__Sensor__SensorNameAlternatives_1_0 )
            {
             before(grammarAccess.getSensorAccess().getSensorNameAlternatives_1_0()); 
            // InternalSimpleMio.g:1931:3: ( rule__Sensor__SensorNameAlternatives_1_0 )
            // InternalSimpleMio.g:1931:4: rule__Sensor__SensorNameAlternatives_1_0
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
    // InternalSimpleMio.g:1939:1: rule__Sensor__SensorSpecifierAssignment_2 : ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) ) ;
    public final void rule__Sensor__SensorSpecifierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1943:1: ( ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) ) )
            // InternalSimpleMio.g:1944:2: ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) )
            {
            // InternalSimpleMio.g:1944:2: ( ( rule__Sensor__SensorSpecifierAlternatives_2_0 ) )
            // InternalSimpleMio.g:1945:3: ( rule__Sensor__SensorSpecifierAlternatives_2_0 )
            {
             before(grammarAccess.getSensorAccess().getSensorSpecifierAlternatives_2_0()); 
            // InternalSimpleMio.g:1946:3: ( rule__Sensor__SensorSpecifierAlternatives_2_0 )
            // InternalSimpleMio.g:1946:4: rule__Sensor__SensorSpecifierAlternatives_2_0
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
    // InternalSimpleMio.g:1954:1: rule__Sensor__StrengthAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Sensor__StrengthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimpleMio.g:1958:1: ( ( ruleEInt ) )
            // InternalSimpleMio.g:1959:2: ( ruleEInt )
            {
            // InternalSimpleMio.g:1959:2: ( ruleEInt )
            // InternalSimpleMio.g:1960:3: ruleEInt
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004107C00000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004107C00002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004007C00000L});
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
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000008F800C000L});

}