/**
 */
package SimpleTree;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleTree.Text#getParentNode <em>Parent Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleTree.SimpleTreePackage#getText()
 * @model
 * @generated
 */
public interface Text extends TreeElement {
	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SimpleTree.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' container reference.
	 * @see #setParentNode(Node)
	 * @see SimpleTree.SimpleTreePackage#getText_ParentNode()
	 * @see SimpleTree.Node#getChildren
	 * @model opposite="children" required="true" transient="false"
	 * @generated
	 */
	Node getParentNode();

	/**
	 * Sets the value of the '{@link SimpleTree.Text#getParentNode <em>Parent Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' container reference.
	 * @see #getParentNode()
	 * @generated
	 */
	void setParentNode(Node value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Text
