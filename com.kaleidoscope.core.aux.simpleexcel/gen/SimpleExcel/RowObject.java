/**
 */
package SimpleExcel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Row Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleExcel.RowObject#getCell <em>Cell</em>}</li>
 *   <li>{@link SimpleExcel.RowObject#getRowId <em>Row Id</em>}</li>
 *   <li>{@link SimpleExcel.RowObject#isIsheader <em>Isheader</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleExcel.SimpleExcelPackage#getRowObject()
 * @model
 * @generated
 */
public interface RowObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleExcel.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' containment reference list.
	 * @see SimpleExcel.SimpleExcelPackage#getRowObject_Cell()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cell> getCell();

	/**
	 * Returns the value of the '<em><b>Row Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Id</em>' attribute.
	 * @see #setRowId(int)
	 * @see SimpleExcel.SimpleExcelPackage#getRowObject_RowId()
	 * @model id="true"
	 * @generated
	 */
	int getRowId();

	/**
	 * Sets the value of the '{@link SimpleExcel.RowObject#getRowId <em>Row Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Id</em>' attribute.
	 * @see #getRowId()
	 * @generated
	 */
	void setRowId(int value);

	/**
	 * Returns the value of the '<em><b>Isheader</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isheader</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isheader</em>' attribute.
	 * @see #setIsheader(boolean)
	 * @see SimpleExcel.SimpleExcelPackage#getRowObject_Isheader()
	 * @model
	 * @generated
	 */
	boolean isIsheader();

	/**
	 * Sets the value of the '{@link SimpleExcel.RowObject#isIsheader <em>Isheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isheader</em>' attribute.
	 * @see #isIsheader()
	 * @generated
	 */
	void setIsheader(boolean value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // RowObject
