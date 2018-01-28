/**
 */
package SimpleTree;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SimpleTree.SimpletreeFactory
 * @model kind="package"
 * @generated
 */
public interface SimpletreePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SimpleTree";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/com.kaleidoscope.core.aux.simpletree/model/SimpleTree.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SimpleTree";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimpletreePackage eINSTANCE = SimpleTree.impl.SimpletreePackageImpl.init();

	/**
	 * The meta object id for the '{@link SimpleTree.impl.TreeElementImpl <em>Tree Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleTree.impl.TreeElementImpl
	 * @see SimpleTree.impl.SimpletreePackageImpl#getTreeElement()
	 * @generated
	 */
	int TREE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__LINKS = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__INDEX = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tree Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SimpleTree.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleTree.impl.AttributeImpl
	 * @see SimpleTree.impl.SimpletreePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LINKS = TREE_ELEMENT__LINKS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INDEX = TREE_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = TREE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NODE = TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = TREE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = TREE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = TREE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleTree.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleTree.impl.FileImpl
	 * @see SimpleTree.impl.SimpletreePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LINKS = TREE_ELEMENT__LINKS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__INDEX = TREE_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = TREE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FOLDER = TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ROOT_NODE = TREE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = TREE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = TREE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleTree.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleTree.impl.FolderImpl
	 * @see SimpleTree.impl.SimpletreePackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__LINKS = TREE_ELEMENT__LINKS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__INDEX = TREE_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = TREE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SUB_FOLDER = TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Folder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PARENT_FOLDER = TREE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FILE = TREE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = TREE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = TREE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleTree.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleTree.impl.LinkImpl
	 * @see SimpleTree.impl.SimpletreePackageImpl#getLink()
	 * @generated
	 */
	int LINK = 3;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINKS = TREE_ELEMENT__LINKS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INDEX = TREE_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = TREE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGETS = TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ATTRIBUTE = TREE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = TREE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = TREE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleTree.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleTree.impl.TextImpl
	 * @see SimpleTree.impl.SimpletreePackageImpl#getText()
	 * @generated
	 */
	int TEXT = 5;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LINKS = TREE_ELEMENT__LINKS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__INDEX = TREE_ELEMENT__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME = TREE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__PARENT_NODE = TREE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = TREE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = TREE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SimpleTree.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SimpleTree.impl.NodeImpl
	 * @see SimpleTree.impl.SimpletreePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LINKS = TEXT__LINKS;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INDEX = TEXT__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = TEXT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT_NODE = TEXT__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FILE = TEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = TEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ATTRIBUTE = TEXT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__START_INDEX = TEXT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Line Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__START_LINE_INDEX = TEXT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stop Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STOP_INDEX = TEXT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stop Line Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STOP_LINE_INDEX = TEXT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = TEXT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link SimpleTree.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see SimpleTree.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the container reference '{@link SimpleTree.Attribute#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see SimpleTree.Attribute#getNode()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Node();

	/**
	 * Returns the meta object for the attribute '{@link SimpleTree.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see SimpleTree.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link SimpleTree.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see SimpleTree.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the container reference '{@link SimpleTree.File#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Folder</em>'.
	 * @see SimpleTree.File#getFolder()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Folder();

	/**
	 * Returns the meta object for the containment reference '{@link SimpleTree.File#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Node</em>'.
	 * @see SimpleTree.File#getRootNode()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_RootNode();

	/**
	 * Returns the meta object for class '{@link SimpleTree.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see SimpleTree.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleTree.Folder#getSubFolder <em>Sub Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folder</em>'.
	 * @see SimpleTree.Folder#getSubFolder()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_SubFolder();

	/**
	 * Returns the meta object for the container reference '{@link SimpleTree.Folder#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Folder</em>'.
	 * @see SimpleTree.Folder#getParentFolder()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_ParentFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleTree.Folder#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File</em>'.
	 * @see SimpleTree.Folder#getFile()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_File();

	/**
	 * Returns the meta object for class '{@link SimpleTree.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see SimpleTree.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference list '{@link SimpleTree.Link#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see SimpleTree.Link#getTargets()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Targets();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleTree.Link#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see SimpleTree.Link#getAttribute()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Attribute();

	/**
	 * Returns the meta object for class '{@link SimpleTree.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see SimpleTree.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the container reference '{@link SimpleTree.Node#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>File</em>'.
	 * @see SimpleTree.Node#getFile()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_File();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleTree.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see SimpleTree.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleTree.Node#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see SimpleTree.Node#getAttribute()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link SimpleTree.Node#getStartIndex <em>Start Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Index</em>'.
	 * @see SimpleTree.Node#getStartIndex()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_StartIndex();

	/**
	 * Returns the meta object for the attribute '{@link SimpleTree.Node#getStartLineIndex <em>Start Line Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Line Index</em>'.
	 * @see SimpleTree.Node#getStartLineIndex()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_StartLineIndex();

	/**
	 * Returns the meta object for the attribute '{@link SimpleTree.Node#getStopIndex <em>Stop Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Index</em>'.
	 * @see SimpleTree.Node#getStopIndex()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_StopIndex();

	/**
	 * Returns the meta object for the attribute '{@link SimpleTree.Node#getStopLineIndex <em>Stop Line Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Line Index</em>'.
	 * @see SimpleTree.Node#getStopLineIndex()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_StopLineIndex();

	/**
	 * Returns the meta object for class '{@link SimpleTree.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see SimpleTree.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the container reference '{@link SimpleTree.Text#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node</em>'.
	 * @see SimpleTree.Text#getParentNode()
	 * @see #getText()
	 * @generated
	 */
	EReference getText_ParentNode();

	/**
	 * Returns the meta object for class '{@link SimpleTree.TreeElement <em>Tree Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Element</em>'.
	 * @see SimpleTree.TreeElement
	 * @generated
	 */
	EClass getTreeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link SimpleTree.TreeElement#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see SimpleTree.TreeElement#getLinks()
	 * @see #getTreeElement()
	 * @generated
	 */
	EReference getTreeElement_Links();

	/**
	 * Returns the meta object for the attribute '{@link SimpleTree.TreeElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see SimpleTree.TreeElement#getIndex()
	 * @see #getTreeElement()
	 * @generated
	 */
	EAttribute getTreeElement_Index();

	/**
	 * Returns the meta object for the attribute '{@link SimpleTree.TreeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SimpleTree.TreeElement#getName()
	 * @see #getTreeElement()
	 * @generated
	 */
	EAttribute getTreeElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimpletreeFactory getSimpletreeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SimpleTree.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleTree.impl.AttributeImpl
		 * @see SimpleTree.impl.SimpletreePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__NODE = eINSTANCE.getAttribute_Node();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link SimpleTree.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleTree.impl.FileImpl
		 * @see SimpleTree.impl.SimpletreePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__FOLDER = eINSTANCE.getFile_Folder();

		/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__ROOT_NODE = eINSTANCE.getFile_RootNode();

		/**
		 * The meta object literal for the '{@link SimpleTree.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleTree.impl.FolderImpl
		 * @see SimpleTree.impl.SimpletreePackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Sub Folder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__SUB_FOLDER = eINSTANCE.getFolder_SubFolder();

		/**
		 * The meta object literal for the '<em><b>Parent Folder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__PARENT_FOLDER = eINSTANCE.getFolder_ParentFolder();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__FILE = eINSTANCE.getFolder_File();

		/**
		 * The meta object literal for the '{@link SimpleTree.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleTree.impl.LinkImpl
		 * @see SimpleTree.impl.SimpletreePackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGETS = eINSTANCE.getLink_Targets();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__ATTRIBUTE = eINSTANCE.getLink_Attribute();

		/**
		 * The meta object literal for the '{@link SimpleTree.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleTree.impl.NodeImpl
		 * @see SimpleTree.impl.SimpletreePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FILE = eINSTANCE.getNode_File();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ATTRIBUTE = eINSTANCE.getNode_Attribute();

		/**
		 * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__START_INDEX = eINSTANCE.getNode_StartIndex();

		/**
		 * The meta object literal for the '<em><b>Start Line Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__START_LINE_INDEX = eINSTANCE.getNode_StartLineIndex();

		/**
		 * The meta object literal for the '<em><b>Stop Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__STOP_INDEX = eINSTANCE.getNode_StopIndex();

		/**
		 * The meta object literal for the '<em><b>Stop Line Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__STOP_LINE_INDEX = eINSTANCE.getNode_StopLineIndex();

		/**
		 * The meta object literal for the '{@link SimpleTree.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleTree.impl.TextImpl
		 * @see SimpleTree.impl.SimpletreePackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Parent Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT__PARENT_NODE = eINSTANCE.getText_ParentNode();

		/**
		 * The meta object literal for the '{@link SimpleTree.impl.TreeElementImpl <em>Tree Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SimpleTree.impl.TreeElementImpl
		 * @see SimpleTree.impl.SimpletreePackageImpl#getTreeElement()
		 * @generated
		 */
		EClass TREE_ELEMENT = eINSTANCE.getTreeElement();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_ELEMENT__LINKS = eINSTANCE.getTreeElement_Links();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_ELEMENT__INDEX = eINSTANCE.getTreeElement_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_ELEMENT__NAME = eINSTANCE.getTreeElement_Name();

	}

} //SimpletreePackage
