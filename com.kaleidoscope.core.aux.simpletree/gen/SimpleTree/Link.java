/**
 */
package SimpleTree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SimpleTree.Link#getTargets <em>Targets</em>}</li>
 *   <li>{@link SimpleTree.Link#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see SimpleTree.SimpletreePackage#getLink()
 * @model
 * @generated
 */
public interface Link extends TreeElement {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link SimpleTree.TreeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see SimpleTree.SimpletreePackage#getLink_Targets()
	 * @model
	 * @generated
	 */
	EList<TreeElement> getTargets();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link SimpleTree.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see SimpleTree.SimpletreePackage#getLink_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

} // Link
