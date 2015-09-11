/*
 * generated by Xtext
 */
package protolipse.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import protolipse.services.ProtobufGrammarAccess;

public class ProtobufParser extends AbstractContentAssistParser {
	
	@Inject
	private ProtobufGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected protolipse.ui.contentassist.antlr.internal.InternalProtobufParser createParser() {
		protolipse.ui.contentassist.antlr.internal.InternalProtobufParser result = new protolipse.ui.contentassist.antlr.internal.InternalProtobufParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getImportAccess().getAlternatives(), "rule__Import__Alternatives");
					put(grammarAccess.getOptionAccess().getAlternatives(), "rule__Option__Alternatives");
					put(grammarAccess.getSimpleValueLinkAccess().getAlternatives(), "rule__SimpleValueLink__Alternatives");
					put(grammarAccess.getNumberLinkAccess().getAlternatives(), "rule__NumberLink__Alternatives");
					put(grammarAccess.getComplexTypeAccess().getAlternatives(), "rule__ComplexType__Alternatives");
					put(grammarAccess.getExtensibleTypeAccess().getAlternatives(), "rule__ExtensibleType__Alternatives");
					put(grammarAccess.getMessageElementAccess().getAlternatives(), "rule__MessageElement__Alternatives");
					put(grammarAccess.getIndexedElementAccess().getAlternatives(), "rule__IndexedElement__Alternatives");
					put(grammarAccess.getRangeAccess().getAlternatives_1_1(), "rule__Range__Alternatives_1_1");
					put(grammarAccess.getTypeLinkAccess().getAlternatives(), "rule__TypeLink__Alternatives");
					put(grammarAccess.getFieldOptionAccess().getAlternatives(), "rule__FieldOption__Alternatives");
					put(grammarAccess.getEnumElementAccess().getAlternatives(), "rule__EnumElement__Alternatives");
					put(grammarAccess.getServiceElementAccess().getAlternatives(), "rule__ServiceElement__Alternatives");
					put(grammarAccess.getExtendAccess().getTypeAlternatives_1_0(), "rule__Extend__TypeAlternatives_1_0");
					put(grammarAccess.getVar_fullAccess().getAlternatives(), "rule__Var_full__Alternatives");
					put(grammarAccess.getVarAccess().getAlternatives(), "rule__Var__Alternatives");
					put(grammarAccess.getVarReservedAccess().getAlternatives(), "rule__VarReserved__Alternatives");
					put(grammarAccess.getEXPAccess().getAlternatives_1(), "rule__EXP__Alternatives_1");
					put(grammarAccess.getBOOLAccess().getAlternatives(), "rule__BOOL__Alternatives");
					put(grammarAccess.getModifierAccess().getAlternatives(), "rule__Modifier__Alternatives");
					put(grammarAccess.getScalarTypeAccess().getAlternatives(), "rule__ScalarType__Alternatives");
					put(grammarAccess.getProtoAccess().getGroup(), "rule__Proto__Group__0");
					put(grammarAccess.getSyntaxAccess().getGroup(), "rule__Syntax__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getPublicImportAccess().getGroup(), "rule__PublicImport__Group__0");
					put(grammarAccess.getWeakImportAccess().getGroup(), "rule__WeakImport__Group__0");
					put(grammarAccess.getNativeOptionAccess().getGroup(), "rule__NativeOption__Group__0");
					put(grammarAccess.getCustomOptionAccess().getGroup(), "rule__CustomOption__Group__0");
					put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
					put(grammarAccess.getExtensionRangeAccess().getGroup(), "rule__ExtensionRange__Group__0");
					put(grammarAccess.getExtensionRangeAccess().getGroup_2(), "rule__ExtensionRange__Group_2__0");
					put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
					put(grammarAccess.getRangeAccess().getGroup_1(), "rule__Range__Group_1__0");
					put(grammarAccess.getMessageFieldAccess().getGroup(), "rule__MessageField__Group__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getFieldOptionsAccess().getGroup(), "rule__FieldOptions__Group__0");
					put(grammarAccess.getFieldOptionsAccess().getGroup_2(), "rule__FieldOptions__Group_2__0");
					put(grammarAccess.getDefaultValueFieldOptionAccess().getGroup(), "rule__DefaultValueFieldOption__Group__0");
					put(grammarAccess.getNativeFieldOptionAccess().getGroup(), "rule__NativeFieldOption__Group__0");
					put(grammarAccess.getEnumAccess().getGroup(), "rule__Enum__Group__0");
					put(grammarAccess.getEnumFieldAccess().getGroup(), "rule__EnumField__Group__0");
					put(grammarAccess.getEnumFieldAccess().getGroup_3(), "rule__EnumField__Group_3__0");
					put(grammarAccess.getEnumFieldAccess().getGroup_3_2(), "rule__EnumField__Group_3_2__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getRpcAccess().getGroup(), "rule__Rpc__Group__0");
					put(grammarAccess.getRpcAccess().getGroup_9(), "rule__Rpc__Group_9__0");
					put(grammarAccess.getExtendAccess().getGroup(), "rule__Extend__Group__0");
					put(grammarAccess.getFULL_IDAccess().getGroup(), "rule__FULL_ID__Group__0");
					put(grammarAccess.getFULL_IDAccess().getGroup_1(), "rule__FULL_ID__Group_1__0");
					put(grammarAccess.getEXPAccess().getGroup(), "rule__EXP__Group__0");
					put(grammarAccess.getProtoAccess().getSyntaxAssignment_0(), "rule__Proto__SyntaxAssignment_0");
					put(grammarAccess.getProtoAccess().getStatementsAssignment_1(), "rule__Proto__StatementsAssignment_1");
					put(grammarAccess.getSyntaxAccess().getNameAssignment_2(), "rule__Syntax__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
					put(grammarAccess.getPublicImportAccess().getImportURIAssignment_2(), "rule__PublicImport__ImportURIAssignment_2");
					put(grammarAccess.getWeakImportAccess().getImportURIAssignment_2(), "rule__WeakImport__ImportURIAssignment_2");
					put(grammarAccess.getNativeOptionAccess().getSourceAssignment_1(), "rule__NativeOption__SourceAssignment_1");
					put(grammarAccess.getNativeOptionAccess().getValueAssignment_3(), "rule__NativeOption__ValueAssignment_3");
					put(grammarAccess.getCustomOptionAccess().getSourceAssignment_1(), "rule__CustomOption__SourceAssignment_1");
					put(grammarAccess.getCustomOptionAccess().getValueAssignment_3(), "rule__CustomOption__ValueAssignment_3");
					put(grammarAccess.getEnumLinkAccess().getTargetAssignment(), "rule__EnumLink__TargetAssignment");
					put(grammarAccess.getStringLinkAccess().getTargetAssignment(), "rule__StringLink__TargetAssignment");
					put(grammarAccess.getBooleanLinkAccess().getTargetAssignment(), "rule__BooleanLink__TargetAssignment");
					put(grammarAccess.getIntLinkAccess().getTargetAssignment(), "rule__IntLink__TargetAssignment");
					put(grammarAccess.getDoubleLinkAccess().getTargetAssignment(), "rule__DoubleLink__TargetAssignment");
					put(grammarAccess.getMessageAccess().getNameAssignment_1(), "rule__Message__NameAssignment_1");
					put(grammarAccess.getMessageAccess().getElementsAssignment_3(), "rule__Message__ElementsAssignment_3");
					put(grammarAccess.getExtensionRangeAccess().getRangesAssignment_1(), "rule__ExtensionRange__RangesAssignment_1");
					put(grammarAccess.getExtensionRangeAccess().getRangesAssignment_2_1(), "rule__ExtensionRange__RangesAssignment_2_1");
					put(grammarAccess.getRangeAccess().getFromAssignment_0(), "rule__Range__FromAssignment_0");
					put(grammarAccess.getRangeAccess().getToAssignment_1_1_0(), "rule__Range__ToAssignment_1_1_0");
					put(grammarAccess.getRangeAccess().getMaxAssignment_1_1_1(), "rule__Range__MaxAssignment_1_1_1");
					put(grammarAccess.getMessageFieldAccess().getModifierAssignment_0(), "rule__MessageField__ModifierAssignment_0");
					put(grammarAccess.getMessageFieldAccess().getTypeAssignment_1(), "rule__MessageField__TypeAssignment_1");
					put(grammarAccess.getMessageFieldAccess().getNameAssignment_2(), "rule__MessageField__NameAssignment_2");
					put(grammarAccess.getMessageFieldAccess().getIndexAssignment_4(), "rule__MessageField__IndexAssignment_4");
					put(grammarAccess.getMessageFieldAccess().getOptionsAssignment_5(), "rule__MessageField__OptionsAssignment_5");
					put(grammarAccess.getGroupAccess().getModifierAssignment_0(), "rule__Group__ModifierAssignment_0");
					put(grammarAccess.getGroupAccess().getNameAssignment_2(), "rule__Group__NameAssignment_2");
					put(grammarAccess.getGroupAccess().getIndexAssignment_4(), "rule__Group__IndexAssignment_4");
					put(grammarAccess.getGroupAccess().getElementsAssignment_6(), "rule__Group__ElementsAssignment_6");
					put(grammarAccess.getComplexTypeLinkAccess().getTargetAssignment(), "rule__ComplexTypeLink__TargetAssignment");
					put(grammarAccess.getScalarTypeLinkAccess().getTargetAssignment(), "rule__ScalarTypeLink__TargetAssignment");
					put(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_1(), "rule__FieldOptions__OptionsAssignment_1");
					put(grammarAccess.getFieldOptionsAccess().getOptionsAssignment_2_1(), "rule__FieldOptions__OptionsAssignment_2_1");
					put(grammarAccess.getDefaultValueFieldOptionAccess().getValueAssignment_2(), "rule__DefaultValueFieldOption__ValueAssignment_2");
					put(grammarAccess.getNativeFieldOptionAccess().getSourceAssignment_0(), "rule__NativeFieldOption__SourceAssignment_0");
					put(grammarAccess.getNativeFieldOptionAccess().getValueAssignment_2(), "rule__NativeFieldOption__ValueAssignment_2");
					put(grammarAccess.getOptionSourceAccess().getTargetAssignment(), "rule__OptionSource__TargetAssignment");
					put(grammarAccess.getEnumAccess().getNameAssignment_1(), "rule__Enum__NameAssignment_1");
					put(grammarAccess.getEnumAccess().getElementsAssignment_3(), "rule__Enum__ElementsAssignment_3");
					put(grammarAccess.getEnumFieldAccess().getNameAssignment_0(), "rule__EnumField__NameAssignment_0");
					put(grammarAccess.getEnumFieldAccess().getIndexAssignment_2(), "rule__EnumField__IndexAssignment_2");
					put(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_1(), "rule__EnumField__OptionsAssignment_3_1");
					put(grammarAccess.getEnumFieldAccess().getOptionsAssignment_3_2_1(), "rule__EnumField__OptionsAssignment_3_2_1");
					put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
					put(grammarAccess.getServiceAccess().getElementsAssignment_3(), "rule__Service__ElementsAssignment_3");
					put(grammarAccess.getRpcAccess().getNameAssignment_1(), "rule__Rpc__NameAssignment_1");
					put(grammarAccess.getRpcAccess().getArgTypeAssignment_3(), "rule__Rpc__ArgTypeAssignment_3");
					put(grammarAccess.getRpcAccess().getReturnTypeAssignment_7(), "rule__Rpc__ReturnTypeAssignment_7");
					put(grammarAccess.getRpcAccess().getOptionsAssignment_9_1(), "rule__Rpc__OptionsAssignment_9_1");
					put(grammarAccess.getMessageLinkAccess().getTargetAssignment(), "rule__MessageLink__TargetAssignment");
					put(grammarAccess.getExtendAccess().getTypeAssignment_1(), "rule__Extend__TypeAssignment_1");
					put(grammarAccess.getExtendAccess().getElementsAssignment_3(), "rule__Extend__ElementsAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			protolipse.ui.contentassist.antlr.internal.InternalProtobufParser typedParser = (protolipse.ui.contentassist.antlr.internal.InternalProtobufParser) parser;
			typedParser.entryRuleProto();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ProtobufGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ProtobufGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
