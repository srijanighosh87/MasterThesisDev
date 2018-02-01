/**
 * 
 */
package com.kaleidoscope.core.auxiliary.simpleexcel.artefactadapter;


import java.nio.file.Path;
import java.util.Optional;

import org.apache.log4j.Logger;

import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import SimpleExcel.ExcelElement;
;
/**
 * @author Srijani
 *
 */
public class ExcelArtefactAdapter implements ArtefactAdapter<ExcelElement, Path>{
	private static final Logger logger = Logger.getLogger(ExcelArtefactAdapter.class);
	
	private Optional<ExcelElement> model;
	private Path path;
	private String intermediateTreePath;
	
	public ExcelArtefactAdapter(Path path) {
		this.path = path;
		this.model = Optional.empty();
	}

	@Override
	public void parse() {
		//calling ExcelHandler
		ExcelHandler excelHandler = new ExcelHandler(path, model);
		this.model = excelHandler.startReadExcel();
	}

	@Override
	public void unparse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setModel(ExcelElement m) {
		model = Optional.of(m);
	}

	@Override
	public void setArtefact(Path a) {
		path = a;
	}

	@Override
	public Optional<ExcelElement> getModel() {
		return model;
	}

	@Override
	public Optional<Path> getArtefact() {
		return Optional.of(path);
	}

}
