/**
 * 
 */
package com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.xml.sax.SAXException;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.XML.GenerateXML;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import SimpleTree.Node;
import SimpleTree.SimpletreePackage;
import SimpleTree.TreeElement;

/**
 * @author Srijani
 *
 */
public class XMLArtefactAdapter implements ArtefactAdapter<TreeElement, Path> {

	private final static Logger logger = Logger.getLogger(XMLArtefactAdapter.class);

	private ResourceSet resourceSet;
	private Optional<TreeElement> model;
	private Path path;
	private String intermediateTreePath;
	private String header;
	
	public XMLArtefactAdapter(Path path, String intermediateTreePath, ResourceSet set, String header) {
		this.resourceSet = set;
		this.path = path;
		this.intermediateTreePath = intermediateTreePath;
		this.model = Optional.empty();
		this.header = header;
	}

	@Override
	public void parse() {
		// calling XMLHandler
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser;
			saxParser = factory.newSAXParser();
			XMLHandler handler = new XMLHandler();
			saxParser.parse(path.toAbsolutePath().toString(), handler);
			Node root = handler.getRoot();

			if (null != root) {
				setModel(root);
			}

			System.out.println();

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void unparse() {
		logger.debug("Unparsing XML: " + this.intermediateTreePath);

		// calling XTEND Code
		GenerateXML generateXML = new GenerateXML();

		try {
			String code = generateXML.readXMIFile(intermediateTreePath, header);
			String regenerateFileName = getNewFileName(path.toString());
			final File file = new File(regenerateFileName);
			Files.write(code, file, Charsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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
