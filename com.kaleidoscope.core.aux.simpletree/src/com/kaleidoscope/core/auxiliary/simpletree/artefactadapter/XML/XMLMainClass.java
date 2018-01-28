/**
 * 
 */
package com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;

import SimpleTree.SimpletreePackage;
import SimpleTree.TreeElement;

/**
 * Entry Point
 * 
 * @author Srijani
 */
public class XMLMainClass {
	public static void main(String[] args) {
		String xmlPath = "./Resources/Plugin.xml";
		String intermediateTreePath = "./Resources/intermediateTree.xmi";
		String header = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\r\n" + 
				"<?eclipse version=\"3.0\"?>\r\n";

		ResourceSet set = setResourceSet();

		// calling XMLAdapter
		Path path = Paths.get(xmlPath);
		XMLArtefactAdapter xmlAdapter = new XMLArtefactAdapter(path, intermediateTreePath, set, header);

		// parse XML
		System.out.println("Parsing XML file ...");
		xmlAdapter.parse();
		// store the parsed tree in .xmi file
		Optional<TreeElement> model = xmlAdapter.getModel();
		model.ifPresent(m -> {
			XMIArtefactAdapter<TreeElement> ad = new XMIArtefactAdapter<TreeElement>(Paths.get(intermediateTreePath));
			ad.setModel(m);
			ad.unparse();
		});
		System.out.println("Parsing completed ...");

		// unparse and regenerate XML
		System.out.println("Reading XMI file ...");
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",  new XMIResourceFactoryImpl());
		xmlAdapter.unparse();
		System.out.println("XML file regenrated ...");
	}

	private static ResourceSet setResourceSet() {
		// obtain a new resource set
		ResourceSet set = new ResourceSetImpl();

		// TODO Auto-generated method stub
		set.getPackageRegistry().put(SimpletreePackage.eNS_URI, SimpletreePackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new EcoreResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		return set;
	}

}
