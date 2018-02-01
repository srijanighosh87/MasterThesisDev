/**
 */
package SimpleExcel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SimpleExcel.SimpleExcelFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleExcelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SimpleExcel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resources/com.kaleidoscope.core.aux.simpleexcel/model/SimpleExcel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SimpleExcel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpleExcelPackage eINSTANCE = SimpleExcel.impl.SimpleExcelPackageImpl.init();

	/**
	 * The meta object id for the '{@link SimpleExcel.impl.ExcelElementImpl <em>Excel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleExcel.impl.ExcelElementImpl
	 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getExcelElement()
	 * @generated
	 */
	int EXCEL_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Excel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Excel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SimpleExcel.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleExcel.impl.FileImpl
	 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SHEET = EXCEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILE_NAME = EXCEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = EXCEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = EXCEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = EXCEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleExcel.impl.SheetImpl <em>Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleExcel.impl.SheetImpl
	 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getSheet()
	 * @generated
	 */
	int SHEET = 1;

	/**
	 * The feature id for the '<em><b>Sheet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__SHEET_ID = EXCEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__SHEET_NAME = EXCEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Colobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__COLOBJECT = EXCEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rowobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__ROWOBJECT = EXCEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__CELL = EXCEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_FEATURE_COUNT = EXCEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_OPERATION_COUNT = EXCEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleExcel.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleExcel.impl.CellImpl
	 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__TEXT = EXCEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__BACKGROUND_COLOR = EXCEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cell Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CELL_COMMENTS = EXCEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cell Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CELL_ID = EXCEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = EXCEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = EXCEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleExcel.impl.RowObjectImpl <em>Row Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleExcel.impl.RowObjectImpl
	 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getRowObject()
	 * @generated
	 */
	int ROW_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OBJECT__CELL = 0;

	/**
	 * The feature id for the '<em><b>Next Row</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OBJECT__NEXT_ROW = 1;

	/**
	 * The number of structural features of the '<em>Row Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Row Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SimpleExcel.impl.ColObjectImpl <em>Col Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleExcel.impl.ColObjectImpl
	 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getColObject()
	 * @generated
	 */
	int COL_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OBJECT__CELL = 0;

	/**
	 * The feature id for the '<em><b>Next Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OBJECT__NEXT_COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Col Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Col Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OBJECT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link SimpleExcel.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see SimpleExcel.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleExcel.File#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sheet</em>'.
	 * @see SimpleExcel.File#getSheet()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.File#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see SimpleExcel.File#getFileName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_FileName();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see SimpleExcel.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for class '{@link SimpleExcel.Sheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sheet</em>'.
	 * @see SimpleExcel.Sheet
	 * @generated
	 */
	EClass getSheet();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.Sheet#getSheetId <em>Sheet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Id</em>'.
	 * @see SimpleExcel.Sheet#getSheetId()
	 * @see #getSheet()
	 * @generated
	 */
	EAttribute getSheet_SheetId();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.Sheet#getSheetName <em>Sheet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet Name</em>'.
	 * @see SimpleExcel.Sheet#getSheetName()
	 * @see #getSheet()
	 * @generated
	 */
	EAttribute getSheet_SheetName();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleExcel.Sheet#getColobject <em>Colobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colobject</em>'.
	 * @see SimpleExcel.Sheet#getColobject()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Colobject();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleExcel.Sheet#getRowobject <em>Rowobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rowobject</em>'.
	 * @see SimpleExcel.Sheet#getRowobject()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Rowobject();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleExcel.Sheet#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell</em>'.
	 * @see SimpleExcel.Sheet#getCell()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Cell();

	/**
	 * Returns the meta object for class '{@link SimpleExcel.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see SimpleExcel.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.Cell#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see SimpleExcel.Cell#getText()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Text();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.Cell#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see SimpleExcel.Cell#getBackgroundColor()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.Cell#getCellComments <em>Cell Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Comments</em>'.
	 * @see SimpleExcel.Cell#getCellComments()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_CellComments();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.Cell#getCellId <em>Cell Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Id</em>'.
	 * @see SimpleExcel.Cell#getCellId()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_CellId();

	/**
	 * Returns the meta object for class '{@link SimpleExcel.ExcelElement <em>Excel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel Element</em>'.
	 * @see SimpleExcel.ExcelElement
	 * @generated
	 */
	EClass getExcelElement();

	/**
	 * Returns the meta object for class '{@link SimpleExcel.RowObject <em>Row Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Object</em>'.
	 * @see SimpleExcel.RowObject
	 * @generated
	 */
	EClass getRowObject();

	/**
	 * Returns the meta object for the reference list '{@link SimpleExcel.RowObject#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cell</em>'.
	 * @see SimpleExcel.RowObject#getCell()
	 * @see #getRowObject()
	 * @generated
	 */
	EReference getRowObject_Cell();

	/**
	 * Returns the meta object for the reference '{@link SimpleExcel.RowObject#getNextRow <em>Next Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Row</em>'.
	 * @see SimpleExcel.RowObject#getNextRow()
	 * @see #getRowObject()
	 * @generated
	 */
	EReference getRowObject_NextRow();

	/**
	 * Returns the meta object for class '{@link SimpleExcel.ColObject <em>Col Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Col Object</em>'.
	 * @see SimpleExcel.ColObject
	 * @generated
	 */
	EClass getColObject();

	/**
	 * Returns the meta object for the reference list '{@link SimpleExcel.ColObject#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cell</em>'.
	 * @see SimpleExcel.ColObject#getCell()
	 * @see #getColObject()
	 * @generated
	 */
	EReference getColObject_Cell();

	/**
	 * Returns the meta object for the reference '{@link SimpleExcel.ColObject#getNextColumn <em>Next Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Column</em>'.
	 * @see SimpleExcel.ColObject#getNextColumn()
	 * @see #getColObject()
	 * @generated
	 */
	EReference getColObject_NextColumn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpleExcelFactory getSimpleExcelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SimpleExcel.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleExcel.impl.FileImpl
		 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__SHEET = eINSTANCE.getFile_Sheet();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILE_NAME = eINSTANCE.getFile_FileName();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '{@link SimpleExcel.impl.SheetImpl <em>Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleExcel.impl.SheetImpl
		 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getSheet()
		 * @generated
		 */
		EClass SHEET = eINSTANCE.getSheet();

		/**
		 * The meta object literal for the '<em><b>Sheet Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET__SHEET_ID = eINSTANCE.getSheet_SheetId();

		/**
		 * The meta object literal for the '<em><b>Sheet Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET__SHEET_NAME = eINSTANCE.getSheet_SheetName();

		/**
		 * The meta object literal for the '<em><b>Colobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__COLOBJECT = eINSTANCE.getSheet_Colobject();

		/**
		 * The meta object literal for the '<em><b>Rowobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__ROWOBJECT = eINSTANCE.getSheet_Rowobject();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__CELL = eINSTANCE.getSheet_Cell();

		/**
		 * The meta object literal for the '{@link SimpleExcel.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleExcel.impl.CellImpl
		 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__TEXT = eINSTANCE.getCell_Text();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__BACKGROUND_COLOR = eINSTANCE.getCell_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Cell Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__CELL_COMMENTS = eINSTANCE.getCell_CellComments();

		/**
		 * The meta object literal for the '<em><b>Cell Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__CELL_ID = eINSTANCE.getCell_CellId();

		/**
		 * The meta object literal for the '{@link SimpleExcel.impl.ExcelElementImpl <em>Excel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleExcel.impl.ExcelElementImpl
		 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getExcelElement()
		 * @generated
		 */
		EClass EXCEL_ELEMENT = eINSTANCE.getExcelElement();

		/**
		 * The meta object literal for the '{@link SimpleExcel.impl.RowObjectImpl <em>Row Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleExcel.impl.RowObjectImpl
		 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getRowObject()
		 * @generated
		 */
		EClass ROW_OBJECT = eINSTANCE.getRowObject();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_OBJECT__CELL = eINSTANCE.getRowObject_Cell();

		/**
		 * The meta object literal for the '<em><b>Next Row</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_OBJECT__NEXT_ROW = eINSTANCE.getRowObject_NextRow();

		/**
		 * The meta object literal for the '{@link SimpleExcel.impl.ColObjectImpl <em>Col Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleExcel.impl.ColObjectImpl
		 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getColObject()
		 * @generated
		 */
		EClass COL_OBJECT = eINSTANCE.getColObject();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COL_OBJECT__CELL = eINSTANCE.getColObject_Cell();

		/**
		 * The meta object literal for the '<em><b>Next Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COL_OBJECT__NEXT_COLUMN = eINSTANCE.getColObject_NextColumn();

	}

} //SimpleExcelPackage
