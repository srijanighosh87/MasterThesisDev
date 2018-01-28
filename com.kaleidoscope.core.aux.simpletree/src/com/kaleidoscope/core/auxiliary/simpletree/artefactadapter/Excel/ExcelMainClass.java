/**
 * 
 */
package com.kaleidoscope.core.auxiliary.simpletree.artefactadapter.Excel;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Entry Point
 * 
 * @author Srijani
 */
public class ExcelMainClass {
	public static void main(String[] args) {
		String excelPath = "./Resources/Plugin_relation.ods";
		String intermediateTreePath = "./Resources/intermediateExcelTree.xmi";
		
		// calling ExcelAdapter
		Path path = Paths.get(excelPath);
		ExcelArtefactAdapter excelAdapter = new ExcelArtefactAdapter(path, intermediateTreePath);
		
		//parse XML
		System.out.println("Parsing EXCEL file ...");
		//TODO
		System.out.println("Parsing completed ...");
		
		//unparse and regenerate XML
		System.out.println("Reading XMI file ...");
		//TODO
		System.out.println("EXCEL file regenrated ...");
	}

}
