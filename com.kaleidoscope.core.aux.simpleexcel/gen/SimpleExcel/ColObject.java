/**
 */
package SimpleExcel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Col Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleExcel.ColObject#getColId <em>Col Id</em>}</li>
 *   <li>{@link SimpleExcel.ColObject#getCell <em>Cell</em>}</li>
 *   <li>{@link SimpleExcel.ColObject#getNextColumn <em>Next Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleExcel.SimpleExcelPackage#getColObject()
 * @model
 * @generated
 */
public interface ColObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Col Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Id</em>' attribute.
	 * @see #setColId(int)
	 * @see SimpleExcel.SimpleExcelPackage#getColObject_ColId()
	 * @model id="true"
	 * @generated
	 */
	int getColId();

	/**
	 * Sets the value of the '{@link SimpleExcel.ColObject#getColId <em>Col Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Id</em>' attribute.
	 * @see #getColId()
	 * @generated
	 */
	void setColId(int value);

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
	 * @see SimpleExcel.SimpleExcelPackage#getColObject_Cell()
	 * @model required="true"
	 * @generated
	 */
	EList<Cell> getCell();

	/**
	 * Returns the value of the '<em><b>Next Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Column</em>' reference.
	 * @see #setNextColumn(ColObject)
	 * @see SimpleExcel.SimpleExcelPackage#getColObject_NextColumn()
	 * @model
	 * @generated
	 */
	ColObject getNextColumn();

	/**
	 * Sets the value of the '{@link SimpleExcel.ColObject#getNextColumn <em>Next Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Column</em>' reference.
	 * @see #getNextColumn()
	 * @generated
	 */
	void setNextColumn(ColObject value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ColObject
