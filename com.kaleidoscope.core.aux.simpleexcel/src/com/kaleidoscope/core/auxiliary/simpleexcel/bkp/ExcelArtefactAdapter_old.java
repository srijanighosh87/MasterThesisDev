/**
 * 
 */
package com.kaleidoscope.core.auxiliary.simpleexcel.bkp;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.model.SharedStringsTable;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;


import SimpleExcel.ExcelElement;

/**
 * @author Srijani
 *
 */
public class ExcelArtefactAdapter_old implements ArtefactAdapter {
	// set logger
	private final static Logger logger = Logger.getLogger(ExcelArtefactAdapter_old.class);

	private Path path;
	private String intermediateTreePath;
	private Optional<ExcelElement> model;

	public ExcelArtefactAdapter_old(Path path, String intermediateTreePath) {
		this.path = path;
		this.intermediateTreePath = intermediateTreePath;
		this.model = Optional.empty();
	}

	@Override
	public void parse() {
		try {

			//iterating all sheets and reading them
			OPCPackage pkg = OPCPackage.open(this.path.toAbsolutePath().toString());
			XSSFReader r = new XSSFReader(pkg);
			SharedStringsTable sst = r.getSharedStringsTable();

			XMLReader parser = fetchSheetParser(sst);
			
			// Calling ExcelHandler
			SheetHandler_old sheetHandler_old = new SheetHandler_old(sst);

			Iterator<InputStream> sheets = null;
			
			sheets = r.getSheetsData();

			while (sheets.hasNext()) {
				System.out.println("Processing new sheet:\n");
				InputStream sheet = sheets.next();
				InputSource sheetSource = new InputSource(sheet);
				parser.parse(sheetSource);
				sheet.close();
			}

		} catch (SAXException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OpenXML4JException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public XMLReader fetchSheetParser(SharedStringsTable sst) throws SAXException {
		XMLReader parser = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
		ContentHandler handler = (ContentHandler) new SheetHandler_old(sst);
		parser.setContentHandler(handler);
		return parser;
	}

	@Override
	public void unparse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setModel(Object m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setArtefact(Object a) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional getArtefact() {
		// TODO Auto-generated method stub
		return null;
	}

}
