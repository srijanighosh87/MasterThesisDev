/**
 */
package SimpleExcel;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleExcel.Sheet#getSheetId <em>Sheet Id</em>}</li>
 *   <li>{@link SimpleExcel.Sheet#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link SimpleExcel.Sheet#getColobject <em>Colobject</em>}</li>
 *   <li>{@link SimpleExcel.Sheet#getRowobject <em>Rowobject</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleExcel.SimpleExcelPackage#getSheet()
 * @model
 * @generated
 */
public interface Sheet extends ExcelElement {
	/**
	 * Returns the value of the '<em><b>Sheet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Id</em>' attribute.
	 * @see #setSheetId(int)
	 * @see SimpleExcel.SimpleExcelPackage#getSheet_SheetId()
	 * @model
	 * @generated
	 */
	int getSheetId();

	/**
	 * Sets the value of the '{@link SimpleExcel.Sheet#getSheetId <em>Sheet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Id</em>' attribute.
	 * @see #getSheetId()
	 * @generated
	 */
	void setSheetId(int value);

	/**
	 * Returns the value of the '<em><b>Sheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Name</em>' attribute.
	 * @see #setSheetName(String)
	 * @see SimpleExcel.SimpleExcelPackage#getSheet_SheetName()
	 * @model
	 * @generated
	 */
	String getSheetName();

	/**
	 * Sets the value of the '{@link SimpleExcel.Sheet#getSheetName <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Name</em>' attribute.
	 * @see #getSheetName()
	 * @generated
	 */
	void setSheetName(String value);

	/**
	 * Returns the value of the '<em><b>Colobject</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleExcel.ColObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colobject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colobject</em>' containment reference list.
	 * @see SimpleExcel.SimpleExcelPackage#getSheet_Colobject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ColObject> getColobject();

	/**
	 * Returns the value of the '<em><b>Rowobject</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleExcel.RowObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rowobject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowobject</em>' containment reference list.
	 * @see SimpleExcel.SimpleExcelPackage#getSheet_Rowobject()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RowObject> getRowobject();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Sheet
