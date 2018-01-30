/**
 */
package SimpleTree;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleTree.File#getFolder <em>Folder</em>}</li>
 *   <li>{@link SimpleTree.File#getRootNode <em>Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleTree.SimpleTreePackage#getFile()
 * @model
 * @generated
 */
public interface File extends TreeElement {
	/**
	 * Returns the value of the '<em><b>Folder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SimpleTree.Folder#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' container reference.
	 * @see #setFolder(Folder)
	 * @see SimpleTree.SimpleTreePackage#getFile_Folder()
	 * @see SimpleTree.Folder#getFile
	 * @model opposite="file" required="true" transient="false"
	 * @generated
	 */
	Folder getFolder();

	/**
	 * Sets the value of the '{@link SimpleTree.File#getFolder <em>Folder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' container reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(Folder value);

	/**
	 * Returns the value of the '<em><b>Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Node</em>' containment reference.
	 * @see #setRootNode(TreeElement)
	 * @see SimpleTree.SimpleTreePackage#getFile_RootNode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TreeElement getRootNode();

	/**
	 * Sets the value of the '{@link SimpleTree.File#getRootNode <em>Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Node</em>' containment reference.
	 * @see #getRootNode()
	 * @generated
	 */
	void setRootNode(TreeElement value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // File
