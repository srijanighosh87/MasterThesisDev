/**
 * 
 */
package com.kaleidoscope.core.auxiliary.simpleexcel.artefactadapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.kaleidoscope.core.auxiliary.simpleexcel.utils.Constants;

import SimpleExcel.ExcelElement;
import SimpleExcel.RowObject;
import SimpleExcel.SimpleExcelFactory;

/**
 * @author Srijani
 *
 */
public class ExcelHandler {
	private static final Logger logger = Logger.getLogger(ExcelHandler.class);

	private Path path;
	private Workbook workBook;
	private Optional<ExcelElement> model;
	private int rowId = 1;

	private int cellId = 0;

	public ExcelHandler(Path path, Optional<ExcelElement> model) {
		this.path = path;
		this.model = model;
	}

	/**
	 * Read Data from a Excel File
	 * 
	 * @return
	 */
	public Optional<ExcelElement> startReadExcel() {
		try {
			String filePath = path.toString();

			System.out.println("starting reading...");

			FileInputStream excelFile = new FileInputStream(new File(filePath));
			this.workBook = new XSSFWorkbook(excelFile);

			// extract file name, folder Name
			// List<String> fileAndFolder = getFileAndFolderName(path);

			SimpleExcel.File simpleFile = SimpleExcelFactory.eINSTANCE.createFile();
			String absoluteFileName = path.toAbsolutePath().toString();
			if (absoluteFileName.contains("\\.\\")) {
				absoluteFileName = absoluteFileName.replace("\\.\\", "\\");
			}
			simpleFile.setFileName(absoluteFileName);
			model = Optional.of(simpleFile);

			// iterate through all the sheets
			for (int sheetCount = 0; sheetCount < workBook.getNumberOfSheets(); sheetCount++) {
				// create excelElement from Sheet
				SimpleExcel.Sheet simpleSheet = SimpleExcelFactory.eINSTANCE.createSheet();
				readSheet(workBook.getSheetAt(sheetCount), sheetCount, simpleSheet);
				simpleFile.getSheet().add(simpleSheet);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return model;
	}

	/**
	 * Read data from Sheet
	 * 
	 * @param sheetCount
	 * @param simpleSheet
	 * @param sheetAt
	 */
	private void readSheet(Sheet currentSheet, int sheetCount, SimpleExcel.Sheet simpleSheet) {
		System.out.println("Reading from Sheet :" + this.workBook.getSheetName(sheetCount));

		simpleSheet.setSheetName(currentSheet.getSheetName());
		// read the whole sheet
		List<Row> rowList = new ArrayList<Row>();
		Iterator<Row> rowIterator = currentSheet.iterator();
		while (rowIterator.hasNext()) {
			Row currentRow = rowIterator.next();
			rowList.add(currentRow);
		}

		setRowRelations(rowList, simpleSheet, 0);
		
		System.out.println();

	}

	private RowObject setRowRelations(List<Row> rowList, SimpleExcel.Sheet simpleSheet, int index) {
		Row currentRow = null;
		RowObject nextRowObject = SimpleExcelFactory.eINSTANCE.createRowObject();
		if (index < rowList.size()) {
			currentRow = rowList.get(index);
			if (!rowIsEmpty(currentRow)) {
				RowObject rowObject = SimpleExcelFactory.eINSTANCE.createRowObject();
				if (rowId == 1)
					rowObject.setIsheader(true);
				rowObject.setRowId(rowId++);
				
				
				readRow(currentRow, rowObject, simpleSheet);
				
				nextRowObject = setRowRelations(rowList, simpleSheet, index + 1);
				
				if (nextRowObject != null && !(nextRowObject.getRowId() <= 0))
					rowObject.setNextRow(nextRowObject);
				
				simpleSheet.getRowobject().add(rowObject);
				return rowObject;
			}
		}
		return nextRowObject;
	}

	/**
	 * Check if a row is empty or null If so, then do not create any object for that
	 * 
	 * @param currentRow
	 */
	private boolean rowIsEmpty(Row currentRow) {
		if ((null == currentRow) || (currentRow.getLastCellNum() <= 0))
			return true;

		for (int cellIndex = currentRow.getFirstCellNum(); cellIndex < currentRow.getLastCellNum(); cellIndex++) {
			Cell cell = currentRow.getCell(cellIndex);
			if (null != cell && cell.getCellTypeEnum() != CellType.BLANK && StringUtils.isNotBlank(cell.toString())) {
				return false;
			}
		}

		return false;
	}

	/**
	 * Read data from each row
	 * 
	 * @param currentRow
	 * @param rowObject
	 * @param simpleSheet 
	 */
	private void readRow(Row currentRow, RowObject rowObject, SimpleExcel.Sheet simpleSheet) {
		Iterator<Cell> cellIterator = currentRow.iterator();
		while (cellIterator.hasNext()) {
			Cell currentCell = cellIterator.next();
			// create Cell Object for Model
			SimpleExcel.Cell cellObject = SimpleExcelFactory.eINSTANCE.createCell();

			// cread attributes for every cell
			readCell(cellObject, currentCell);
			rowObject.getCell().add(cellObject);
			simpleSheet.getCell().add(cellObject);
		}
	}

	/**
	 * This method reads the attributes for every cell and then insert them in the
	 * model
	 * 
	 * @param cellObject
	 * @param currentCell
	 */
	private void readCell(SimpleExcel.Cell cellObject, Cell currentCell) {
		// get attributes
		int rowIndex = currentCell.getRowIndex() + 1;
		int colIndex = currentCell.getColumnIndex() + 1;
		String comment = currentCell.getCellComment() != null ? currentCell.getCellComment().getString().toString()
				: "";

		// add attributes to the cellObject
		if (!comment.equals("")) // ignore empty comments
			cellObject.setCellComments(comment);
		if (!currentCell.toString().equals(""))
			cellObject.setText(currentCell.toString());
		//cellObject.setCellId(cellId ++);
		// get cell colors
		XSSFColor xssfColor = (XSSFColor) currentCell.getCellStyle().getFillForegroundColorColor();
		if (xssfColor != null) {
			String argbHex = xssfColor.getARGBHex();
			System.out.println("row:" + rowIndex + ",col:" + colIndex + " color: " + argbHex);
			if (argbHex.toString().compareTo(Constants.RED_ARGB) == 0)
				cellObject.setBackgroundColor("RED");
			if (argbHex.toString().compareTo(Constants.YELLOW_ARGB) == 0)
				cellObject.setBackgroundColor("YELLOW");
			if (argbHex.toString().compareTo(Constants.GREEN_ARGB) == 0)
				cellObject.setBackgroundColor("GREEN");
		}
	}
}
