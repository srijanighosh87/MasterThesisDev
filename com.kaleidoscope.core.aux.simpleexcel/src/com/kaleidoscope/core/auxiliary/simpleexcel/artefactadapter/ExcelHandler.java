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
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import SimpleExcel.ExcelElement;
import SimpleExcel.Folder;
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
			List<String> fileAndFolder = getFileAndFolderName(path);
			Folder simpleFolder = SimpleExcelFactory.eINSTANCE.createFolder();
			simpleFolder.setName(fileAndFolder.get(1));
			model = Optional.of(simpleFolder);

			SimpleExcel.File simpleFile = SimpleExcelFactory.eINSTANCE.createFile();
			simpleFile.setFileName(fileAndFolder.get(0));
			simpleFolder.getFile().add(simpleFile);

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
	 * Returns FIle and Folder name
	 * @param path
	 * @return
	 */
	private List<String> getFileAndFolderName(Path path) {
		List<String> fileAndFolderName = new ArrayList<String>();
		String absoluteFileName = path.toAbsolutePath().toString();

		// retrieve fileName
		int indexOfSlash = absoluteFileName.lastIndexOf("\\");
		String fileName = absoluteFileName.substring(indexOfSlash + 1, absoluteFileName.length());

		// retrieve folder name
		String folderName = absoluteFileName.substring(0, indexOfSlash);
		if (folderName.contains("\\.\\")) {
			folderName = folderName.replace("\\.\\", "\\");
		}

		fileAndFolderName.add(fileName);
		fileAndFolderName.add(folderName);

		return fileAndFolderName;
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
		Iterator<Row> rowIterator = currentSheet.iterator();
		while (rowIterator.hasNext()) {
			Row currentRow = rowIterator.next();
			// create Row Object for Model - check for blank rows
			if (!rowIsEmpty(currentRow)) {
				RowObject rowObject = SimpleExcelFactory.eINSTANCE.createRowObject();
				if (rowId == 1)
					rowObject.setIsheader(true);
				rowObject.setRowId(rowId++);
				readRow(currentRow, rowObject);
				simpleSheet.getRowobject().add(rowObject);
			}

		}
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
	 */
	private void readRow(Row currentRow, RowObject rowObject) {
		Iterator<Cell> cellIterator = currentRow.iterator();
		while (cellIterator.hasNext()) {
			Cell currentCell = cellIterator.next();
			// create Cell Object for Model
			SimpleExcel.Cell cellObject = SimpleExcelFactory.eINSTANCE.createCell();

			// cread attributes for every cell
			readCell(cellObject, currentCell);
			rowObject.getCell().add(cellObject);
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
		cellObject.setRowIndex(rowIndex);
		cellObject.setColIndex(colIndex);
		if (!comment.equals("")) // ignore empty comments
			cellObject.setCellComments(comment);
		if (!currentCell.toString().equals(""))
			cellObject.setText(currentCell.toString());

		//TODO - not working 
		// get Cell color 
		/*XSSFColor fillBackGroundXssfColor = ((XSSFCellStyle) currentCell.getCellStyle()).getFillBackgroundXSSFColor();
		if (null != fillBackGroundXssfColor) {
			byte[] a = fillBackGroundXssfColor.getRGB();
			String color = "";
			if (a != null && a.length == 3)
				color = a[0] + "," + a[1] + "," + a[2];
			if (null != color) {
				if (!color.isEmpty())
					cellObject.setBackgroundColor(color);
			}
		}*/

	}
}
