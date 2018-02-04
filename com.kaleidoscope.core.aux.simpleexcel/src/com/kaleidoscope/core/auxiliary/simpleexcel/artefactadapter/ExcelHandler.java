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
import org.eclipse.emf.common.util.EList;

import com.kaleidoscope.core.auxiliary.simpleexcel.utils.Constants;

import SimpleExcel.ColObject;
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

	private int rowId = Constants.INIT_ROW;
	private int cellId = Constants.INIT_CELL;
	private List<ColObject> columnObjectList = new ArrayList();

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

		// read the rows of whole sheet
		List<Row> rowList = new ArrayList<Row>();
		Iterator<Row> rowIterator = currentSheet.iterator();
		while (rowIterator.hasNext()) {
			Row currentRow = rowIterator.next();
			rowList.add(currentRow);
		}

		// get max number of cell in a row - set that as column number
		int maxColumnNumber = 0;
		for (Row row : rowList) {
			int lastRowNum = row.getLastCellNum();
			if (lastRowNum > 0)
				maxColumnNumber = lastRowNum;
		}

		for (int colIndex = 0; colIndex < maxColumnNumber; colIndex++) {
			ColObject columnObject = SimpleExcelFactory.eINSTANCE.createColObject();
			columnObjectList.add(columnObject);
			simpleSheet.getColobject().add(columnObject);
		}

		// set column relations
		for (int index = 0; index < columnObjectList.size(); index++) {
			if (index < maxColumnNumber - 1) {
				columnObjectList.get(index).setNextColumn(columnObjectList.get(index+1));
			}
		}

		setRowRelations(rowList, simpleSheet, 0);

		// create Columns
		// createColumnObjects(simpleSheet, rowList);
	}

	/**
	 * This method reads sheets, Rows from them and creates columnObjects
	 * 
	 * @param simpleSheet
	 * @param rowList
	 */
	private void createColumnObjects(SimpleExcel.Sheet simpleSheet, List<Row> rowList) {
		// get max number of cell in a row - set that as column number
		int maxColumnNumber = 0;
		for (Row row : rowList) {
			int lastRowNum = row.getLastCellNum();
			if (lastRowNum > 0)
				maxColumnNumber = lastRowNum;
		}

		// System.out.println("Number of columns "+ columnNumber);

		for (int colIndex = 0; colIndex < maxColumnNumber; colIndex++) {
			ColObject columnObject = SimpleExcelFactory.eINSTANCE.createColObject();

			// add cells to columns - iterate RowOBject for that
			EList<RowObject> rowObjectList = simpleSheet.getRowobject();
			for (RowObject rowObject : rowObjectList) {
				EList<SimpleExcel.Cell> cellList = rowObject.getCell();
				if (cellList != null && cellList.size() > 0) {
					SimpleExcel.Cell cell = rowObject.getCell().get(colIndex);
					columnObject.getCell().add(cell);
				}
			}

			// add columnObject to Sheet
			simpleSheet.getColobject().add(columnObject);
		}
	}

	/**
	 * Recursive code for reading the rows and setting nextRowObject
	 * 
	 * @param rowList
	 * @param simpleSheet
	 * @param index
	 * @return
	 */
	private RowObject setRowRelations(List<Row> rowList, SimpleExcel.Sheet simpleSheet, int index) {
		Row currentRow = null;
		// RowObject nextRowObject = SimpleExcelFactory.eINSTANCE.createRowObject();
		RowObject nextRowObject = null;
		if (index < rowList.size()) {
			currentRow = rowList.get(index);
			if (!rowIsEmpty(currentRow)) {
				RowObject rowObject = SimpleExcelFactory.eINSTANCE.createRowObject();
				// if (rowId == 1)
				// rowObject.setIsheader(true);
				// rowObject.setRowId(rowId++);

				readRow(currentRow, rowObject, simpleSheet);

				nextRowObject = setRowRelations(rowList, simpleSheet, index + 1);

				// if (nextRowObject != null && !(nextRowObject.getRowId() <= 0))
				if (nextRowObject != null)
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

			// add cell to colObject
			columnObjectList.get(currentCell.getAddress().getColumn()).getCell().add(cellObject);

			// add cell to simpleSheet
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
		cellObject.setCellId(cellId++);
		// get cell colors
		XSSFColor xssfColor = (XSSFColor) currentCell.getCellStyle().getFillForegroundColorColor();
		if (xssfColor != null) {
			String argbHex = xssfColor.getARGBHex();
			System.out.println("row:" + rowIndex + ",col:" + colIndex + " color: " + argbHex);
			/*if (argbHex.toString().compareTo(Constants.RED_ARGB) == 0)
				cellObject.setBackgroundColor("RED");
			if (argbHex.toString().compareTo(Constants.YELLOW_ARGB) == 0)
				cellObject.setBackgroundColor("YELLOW");
			if (argbHex.toString().compareTo(Constants.GREEN_ARGB) == 0)
				cellObject.setBackgroundColor("GREEN");
			*/
			cellObject.setBackgroundColor(argbHex);
		}
	}
}
