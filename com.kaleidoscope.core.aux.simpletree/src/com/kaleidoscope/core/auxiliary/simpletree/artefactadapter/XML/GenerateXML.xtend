package com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML;

import SimpleTree.Node
import SimpleTree.SimpleTreePackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class GenerateXML {

	def String readXMIFile(String file, String header) {
		val resourceSet = new ResourceSetImpl
		resourceSet.getPackageRegistry().put(SimpleTreePackage.eNS_URI, SimpleTreePackage.eINSTANCE);
		val resource = resourceSet.getResource(URI.createURI(file), true)
		for (content : resource.contents) {
			val code = header + generateCode(content as Node)
			return code
		}

	}

	def String generateCode(Node node) '''
		«val hasChild = node.children.size>0»
		<«node.name»«generateAttributes(node)»«if (hasChild)"" else "/"»>
		«IF (hasChild)»
			«FOR child : node.children»
				«generateCode(child as Node)»
			«ENDFOR»
		</«node.getName()»>
		«ENDIF»
	'''

	def String generateAttributes(Node node) '''«FOR attr : node.attribute» «attr.name»="«attr.value»"«ENDFOR»'''

}
