/*
 * generated by Xtext
 */
package protolipse.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 * 
 */
class ProtobufScopeProvider extends AbstractDeclarativeScopeProvider {
//	def scope_EnumLink_target(EnumLink enumLink, EReference ref) {
//		val msgField = enumLink.getContainerOfType(MessageField)
//		if(msgField == null) return IScope.NULLSCOPE
//
//		val cplxTypeLink = msgField.type as ComplexTypeLink
//		if(cplxTypeLink == null) return IScope.NULLSCOPE
//
//		val enum = cplxTypeLink.target as Enum
//		if(enum == null) return IScope.NULLSCOPE
//
//		return Scopes.scopeFor(enum.elements.filter(EnumField))
//	}
}
