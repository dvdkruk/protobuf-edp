/*
 * generated by Xtext
 */
package protolipse.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import protolipse.services.ProtobufGrammarAccess;

@SuppressWarnings("all")
public class ProtobufSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ProtobufGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Rpc___LeftCurlyBracketKeyword_9_0_RightCurlyBracketKeyword_9_2__q;
	protected AbstractElementAlias match_Service_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_WeakImport_WeakKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ProtobufGrammarAccess) access;
		match_Rpc___LeftCurlyBracketKeyword_9_0_RightCurlyBracketKeyword_9_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRpcAccess().getLeftCurlyBracketKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getRpcAccess().getRightCurlyBracketKeyword_9_2()));
		match_Service_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getServiceAccess().getSemicolonKeyword_5());
		match_WeakImport_WeakKeyword_1_q = new TokenAlias(false, true, grammarAccess.getWeakImportAccess().getWeakKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Rpc___LeftCurlyBracketKeyword_9_0_RightCurlyBracketKeyword_9_2__q.equals(syntax))
				emit_Rpc___LeftCurlyBracketKeyword_9_0_RightCurlyBracketKeyword_9_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Service_SemicolonKeyword_5_q.equals(syntax))
				emit_Service_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_WeakImport_WeakKeyword_1_q.equals(syntax))
				emit_WeakImport_WeakKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     returnType=MessageLink ')' (ambiguity) ';' (rule end)
	 */
	protected void emit_Rpc___LeftCurlyBracketKeyword_9_0_RightCurlyBracketKeyword_9_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     elements+=ServiceElement '}' (ambiguity) (rule end)
	 */
	protected void emit_Service_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'weak'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'import' (ambiguity) importURI=STRING
	 */
	protected void emit_WeakImport_WeakKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
