/**
 * 
 */
package com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.Excel;

import java.nio.file.Path;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import SimpleTree.SimpletreePackage;
import SimpleTree.TreeElement;

/**
 * @author Srijani
 *
 */
public class ExcelArtefactAdapter implements ArtefactAdapter<TreeElement, Path> {

	private final static Logger logger = Logger.getLogger(ExcelArtefactAdapter.class);

	private ResourceSet resourceSet;
	private Optional<TreeElement> model;
	private Path path;
	String intermediateTreePath;
	
	public ExcelArtefactAdapter(Path path, String intermediateTreePath) {
		// Obtain a new resource set
		ResourceSet set = new ResourceSetImpl();

		// register factories
		setUpResourceFactories(set);

		this.resourceSet = set;
		this.path = path;
		this.intermediateTreePath = intermediateTreePath;
		this.model = Optional.empty();
	}

	/**
	 * @param set
	 */
	private static void setUpResourceFactories(ResourceSet set) {
		set.getPackageRegistry().put(SimpletreePackage.eNS_URI, SimpletreePackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new EcoreResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}

	@Override
	public void parse() {}

	@Override
	public void unparse() {}

	/**
	 * Create new File name to save the regenerated XML file
	 * 
	 * @param filePath
	 * @return
	 */
	private String getNewFileName(String filePath) {
		String extension = filePath.substring(filePath.lastIndexOf("."));
		String newFileName = filePath.substring(0, filePath.lastIndexOf(".")) + "_regenerated";
		return newFileName+extension;
	}

	@Override
	public void setModel(TreeElement m) {
		model = Optional.of(m);
	}

	@Override
	public void setArtefact(Path a) {
		path = a;
	}

	@Override
	public Optional<TreeElement> getModel() {
		return model;
	}

	@Override
	public Optional<Path> getArtefact() {
		return Optional.of(path);
	}

}
