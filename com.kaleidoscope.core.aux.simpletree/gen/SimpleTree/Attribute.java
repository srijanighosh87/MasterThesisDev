/**
 */
package SimpleTree;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleTree.Attribute#getNode <em>Node</em>}</li>
 *   <li>{@link SimpleTree.Attribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleTree.SimpleTreePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends TreeElement {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SimpleTree.Node#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see SimpleTree.SimpleTreePackage#getAttribute_Node()
	 * @see SimpleTree.Node#getAttribute
	 * @model opposite="attribute" required="true" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link SimpleTree.Attribute#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see SimpleTree.SimpleTreePackage#getAttribute_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link SimpleTree.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Attribute
