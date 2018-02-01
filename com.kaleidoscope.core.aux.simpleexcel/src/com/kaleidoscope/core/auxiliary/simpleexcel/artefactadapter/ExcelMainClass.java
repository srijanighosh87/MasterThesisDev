/**
 * 
 */
package com.kaleidoscope.core.auxiliary.simpleexcel.artefactadapter;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;

import SimpleExcel.ExcelElement;
import SimpleExcel.SimpleExcelPackage;

/**
 * @author Srijani
 *
 */
public class ExcelMainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String excelPath = "./Resources/Relationship.xlsx";
		String intermediateTreePath = "./Resources/intermediateTree.xmi";

		ResourceSet set = setResourceSet();

		// calling EXCELAdapter
		Path path = Paths.get(excelPath);
		ExcelArtefactAdapter excelArtefactAdapter = new ExcelArtefactAdapter(path);

		// parse Excel
		System.out.println("Parsing EXCEL file...");
		excelArtefactAdapter.parse();
		// store the parsed tree in .xmi file
		Optional<ExcelElement> model = excelArtefactAdapter.getModel();
		model.ifPresent(m -> {
			XMIArtefactAdapter<ExcelElement> ad = new XMIArtefactAdapter<ExcelElement>(Paths.get(intermediateTreePath));
			ad.setModel(m);
			ad.unparse();
		});
		System.out.println("Parsing completed...");

		// unparse and regenerate EXCEL
		//System.out.println("Reading XMI file...");
		//excelArtefactAdapter.unparse();
		//System.out.println("EXCEL file regenrated ...");
	}

	private static ResourceSet setResourceSet() {
		// obtain a new resource set
		ResourceSet set = new ResourceSetImpl();

		// TODO Auto-generated method stub
		set.getPackageRegistry().put(SimpleExcelPackage.eNS_URI, SimpleExcelPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new EcoreResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		return set;
	}

}
