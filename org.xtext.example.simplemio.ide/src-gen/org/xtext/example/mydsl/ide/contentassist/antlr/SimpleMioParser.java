/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalSimpleMioParser;
import org.xtext.example.mydsl.services.SimpleMioGrammarAccess;

public class SimpleMioParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SimpleMioGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SimpleMioGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getActionAccess().getActionNameAlternatives_1_0(), "rule__Action__ActionNameAlternatives_1_0");
			builder.put(grammarAccess.getActionAccess().getActionSpecifierAlternatives_2_0(), "rule__Action__ActionSpecifierAlternatives_2_0");
			builder.put(grammarAccess.getNotAccess().getAlternatives(), "rule__Not__Alternatives");
			builder.put(grammarAccess.getSensorAccess().getSensorNameAlternatives_1_0(), "rule__Sensor__SensorNameAlternatives_1_0");
			builder.put(grammarAccess.getSensorAccess().getSensorSpecifierAlternatives_2_0(), "rule__Sensor__SensorSpecifierAlternatives_2_0");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
			builder.put(grammarAccess.getEventAccess().getGroup_4(), "rule__Event__Group_4__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup_3(), "rule__Action__Group_3__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
			builder.put(grammarAccess.getNotAccess().getGroup_0(), "rule__Not__Group_0__0");
			builder.put(grammarAccess.getNotAccess().getGroup_0_1(), "rule__Not__Group_0_1__0");
			builder.put(grammarAccess.getNotAccess().getGroup_1(), "rule__Not__Group_1__0");
			builder.put(grammarAccess.getNotAccess().getGroup_1_1(), "rule__Not__Group_1_1__0");
			builder.put(grammarAccess.getParenAccess().getGroup(), "rule__Paren__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_3(), "rule__Sensor__Group_3__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getModelAccess().getProgramAssignment_1(), "rule__Model__ProgramAssignment_1");
			builder.put(grammarAccess.getProgramAccess().getEventsAssignment(), "rule__Program__EventsAssignment");
			builder.put(grammarAccess.getEventAccess().getConditionalsensorAssignment_1(), "rule__Event__ConditionalsensorAssignment_1");
			builder.put(grammarAccess.getEventAccess().getActionsAssignment_3(), "rule__Event__ActionsAssignment_3");
			builder.put(grammarAccess.getEventAccess().getActionsAssignment_4_1(), "rule__Event__ActionsAssignment_4_1");
			builder.put(grammarAccess.getActionAccess().getActionNameAssignment_1(), "rule__Action__ActionNameAssignment_1");
			builder.put(grammarAccess.getActionAccess().getActionSpecifierAssignment_2(), "rule__Action__ActionSpecifierAssignment_2");
			builder.put(grammarAccess.getActionAccess().getStrengthAssignment_3_1(), "rule__Action__StrengthAssignment_3_1");
			builder.put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
			builder.put(grammarAccess.getNotAccess().getConditionalsensorAssignment_0_1_1(), "rule__Not__ConditionalsensorAssignment_0_1_1");
			builder.put(grammarAccess.getNotAccess().getConditionalsensorAssignment_1_1_1(), "rule__Not__ConditionalsensorAssignment_1_1_1");
			builder.put(grammarAccess.getSensorAccess().getSensorNameAssignment_1(), "rule__Sensor__SensorNameAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getSensorSpecifierAssignment_2(), "rule__Sensor__SensorSpecifierAssignment_2");
			builder.put(grammarAccess.getSensorAccess().getStrengthAssignment_3_1(), "rule__Sensor__StrengthAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SimpleMioGrammarAccess grammarAccess;

	@Override
	protected InternalSimpleMioParser createParser() {
		InternalSimpleMioParser result = new InternalSimpleMioParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SimpleMioGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SimpleMioGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
