/**
 */
package SimpleExcel;

import org.eclipse.emf.common.util.EList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleExcel.Folder#getFile <em>File</em>}</li>
 *   <li>{@link SimpleExcel.Folder#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link SimpleExcel.Folder#getSubFolder <em>Sub Folder</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleExcel.SimpleExcelPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends ExcelElement {
	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleExcel.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference list.
	 * @see SimpleExcel.SimpleExcelPackage#getFolder_File()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFile();

	/**
	 * Returns the value of the '<em><b>Parent Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Folder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Folder</em>' containment reference.
	 * @see #setParentFolder(Folder)
	 * @see SimpleExcel.SimpleExcelPackage#getFolder_ParentFolder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Folder getParentFolder();

	/**
	 * Sets the value of the '{@link SimpleExcel.Folder#getParentFolder <em>Parent Folder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Folder</em>' containment reference.
	 * @see #getParentFolder()
	 * @generated
	 */
	void setParentFolder(Folder value);

	/**
	 * Returns the value of the '<em><b>Sub Folder</b></em>' reference list.
	 * The list contents are of type {@link SimpleExcel.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Folder</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folder</em>' reference list.
	 * @see SimpleExcel.SimpleExcelPackage#getFolder_SubFolder()
	 * @model
	 * @generated
	 */
	EList<Folder> getSubFolder();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Folder
