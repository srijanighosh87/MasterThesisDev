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
 *   <li>{@link SimpleExcel.RowObject#getNextRow <em>Next Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleExcel.SimpleExcelPackage#getRowObject()
 * @model
 * @generated
 */
public interface RowObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' reference list.
	 * The list contents are of type {@link SimpleExcel.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' reference list.
	 * @see SimpleExcel.SimpleExcelPackage#getRowObject_Cell()
	 * @model required="true"
	 * @generated
	 */
	EList<Cell> getCell();

	/**
	 * Returns the value of the '<em><b>Next Row</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Row</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Row</em>' reference.
	 * @see #setNextRow(RowObject)
	 * @see SimpleExcel.SimpleExcelPackage#getRowObject_NextRow()
	 * @model
	 * @generated
	 */
	RowObject getNextRow();

	/**
	 * Sets the value of the '{@link SimpleExcel.RowObject#getNextRow <em>Next Row</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Row</em>' reference.
	 * @see #getNextRow()
	 * @generated
	 */
	void setNextRow(RowObject value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // RowObject
