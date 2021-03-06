/**
 */
package SimpleTree;

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
 *   <li>{@link SimpleTree.Folder#getSubFolder <em>Sub Folder</em>}</li>
 *   <li>{@link SimpleTree.Folder#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link SimpleTree.Folder#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleTree.SimpleTreePackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends TreeElement {
	/**
	 * Returns the value of the '<em><b>Sub Folder</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleTree.Folder}.
	 * It is bidirectional and its opposite is '{@link SimpleTree.Folder#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Folder</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folder</em>' containment reference list.
	 * @see SimpleTree.SimpleTreePackage#getFolder_SubFolder()
	 * @see SimpleTree.Folder#getParentFolder
	 * @model opposite="parentFolder" containment="true"
	 * @generated
	 */
	EList<Folder> getSubFolder();

	/**
	 * Returns the value of the '<em><b>Parent Folder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SimpleTree.Folder#getSubFolder <em>Sub Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Folder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Folder</em>' container reference.
	 * @see #setParentFolder(Folder)
	 * @see SimpleTree.SimpleTreePackage#getFolder_ParentFolder()
	 * @see SimpleTree.Folder#getSubFolder
	 * @model opposite="subFolder" required="true" transient="false"
	 * @generated
	 */
	Folder getParentFolder();

	/**
	 * Sets the value of the '{@link SimpleTree.Folder#getParentFolder <em>Parent Folder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Folder</em>' container reference.
	 * @see #getParentFolder()
	 * @generated
	 */
	void setParentFolder(Folder value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleTree.File}.
	 * It is bidirectional and its opposite is '{@link SimpleTree.File#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference list.
	 * @see SimpleTree.SimpleTreePackage#getFolder_File()
	 * @see SimpleTree.File#getFolder
	 * @model opposite="folder" containment="true"
	 * @generated
	 */
	EList<File> getFile();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Folder
