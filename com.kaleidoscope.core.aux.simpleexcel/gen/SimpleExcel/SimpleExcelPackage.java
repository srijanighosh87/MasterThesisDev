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
	String eNS_URI = "platform:/plugin/SimpleExcel/model/SimpleExcel.ecore";

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
	int EXCEL_ELEMENT = 4;

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
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = EXCEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = EXCEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleExcel.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleExcel.impl.FolderImpl
	 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FILE = EXCEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PARENT_FOLDER = EXCEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Folder</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SUB_FOLDER = EXCEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = EXCEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = EXCEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = EXCEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleExcel.impl.SheetImpl <em>Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleExcel.impl.SheetImpl
	 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getSheet()
	 * @generated
	 */
	int SHEET = 2;

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
	 * The number of structural features of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_FEATURE_COUNT = EXCEL_ELEMENT_FEATURE_COUNT + 4;

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
	int CELL = 3;

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
	 * The feature id for the '<em><b>Row Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ROW_INDEX = EXCEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Col Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__COL_INDEX = EXCEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = EXCEL_ELEMENT_FEATURE_COUNT + 6;

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
	int ROW_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OBJECT__CELL = 0;

	/**
	 * The feature id for the '<em><b>Row Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OBJECT__ROW_ID = 1;

	/**
	 * The feature id for the '<em><b>Isheader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OBJECT__ISHEADER = 2;

	/**
	 * The number of structural features of the '<em>Row Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OBJECT_FEATURE_COUNT = 3;

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
	int COL_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OBJECT__CELL = 0;

	/**
	 * The feature id for the '<em><b>Col Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OBJECT__COL_ID = 1;

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
	 * Returns the meta object for class '{@link SimpleExcel.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see SimpleExcel.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleExcel.Folder#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File</em>'.
	 * @see SimpleExcel.Folder#getFile()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_File();

	/**
	 * Returns the meta object for the containment reference '{@link SimpleExcel.Folder#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent Folder</em>'.
	 * @see SimpleExcel.Folder#getParentFolder()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_ParentFolder();

	/**
	 * Returns the meta object for the reference list '{@link SimpleExcel.Folder#getSubFolder <em>Sub Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Folder</em>'.
	 * @see SimpleExcel.Folder#getSubFolder()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_SubFolder();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SimpleExcel.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

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
	 * Returns the meta object for the attribute '{@link SimpleExcel.Cell#getRowIndex <em>Row Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Index</em>'.
	 * @see SimpleExcel.Cell#getRowIndex()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_RowIndex();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.Cell#getColIndex <em>Col Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Index</em>'.
	 * @see SimpleExcel.Cell#getColIndex()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_ColIndex();

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
	 * Returns the meta object for the containment reference list '{@link SimpleExcel.RowObject#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell</em>'.
	 * @see SimpleExcel.RowObject#getCell()
	 * @see #getRowObject()
	 * @generated
	 */
	EReference getRowObject_Cell();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.RowObject#getRowId <em>Row Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Id</em>'.
	 * @see SimpleExcel.RowObject#getRowId()
	 * @see #getRowObject()
	 * @generated
	 */
	EAttribute getRowObject_RowId();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.RowObject#isIsheader <em>Isheader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isheader</em>'.
	 * @see SimpleExcel.RowObject#isIsheader()
	 * @see #getRowObject()
	 * @generated
	 */
	EAttribute getRowObject_Isheader();

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
	 * Returns the meta object for the containment reference list '{@link SimpleExcel.ColObject#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell</em>'.
	 * @see SimpleExcel.ColObject#getCell()
	 * @see #getColObject()
	 * @generated
	 */
	EReference getColObject_Cell();

	/**
	 * Returns the meta object for the attribute '{@link SimpleExcel.ColObject#getColId <em>Col Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Id</em>'.
	 * @see SimpleExcel.ColObject#getColId()
	 * @see #getColObject()
	 * @generated
	 */
	EAttribute getColObject_ColId();

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
		 * The meta object literal for the '{@link SimpleExcel.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleExcel.impl.FolderImpl
		 * @see SimpleExcel.impl.SimpleExcelPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__FILE = eINSTANCE.getFolder_File();

		/**
		 * The meta object literal for the '<em><b>Parent Folder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__PARENT_FOLDER = eINSTANCE.getFolder_ParentFolder();

		/**
		 * The meta object literal for the '<em><b>Sub Folder</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__SUB_FOLDER = eINSTANCE.getFolder_SubFolder();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

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
		 * The meta object literal for the '<em><b>Row Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__ROW_INDEX = eINSTANCE.getCell_RowIndex();

		/**
		 * The meta object literal for the '<em><b>Col Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__COL_INDEX = eINSTANCE.getCell_ColIndex();

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
		 * The meta object literal for the '<em><b>Cell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_OBJECT__CELL = eINSTANCE.getRowObject_Cell();

		/**
		 * The meta object literal for the '<em><b>Row Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_OBJECT__ROW_ID = eINSTANCE.getRowObject_RowId();

		/**
		 * The meta object literal for the '<em><b>Isheader</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_OBJECT__ISHEADER = eINSTANCE.getRowObject_Isheader();

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
		 * The meta object literal for the '<em><b>Cell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COL_OBJECT__CELL = eINSTANCE.getColObject_Cell();

		/**
		 * The meta object literal for the '<em><b>Col Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_OBJECT__COL_ID = eINSTANCE.getColObject_ColId();

	}

} //SimpleExcelPackage
