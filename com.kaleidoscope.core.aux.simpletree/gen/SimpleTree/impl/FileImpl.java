/**
 */
package SimpleTree.impl;

import SimpleTree.File;
import SimpleTree.Folder;
import SimpleTree.SimpleTreePackage;
import SimpleTree.TreeElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleTree.impl.FileImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link SimpleTree.impl.FileImpl#getRootNode <em>Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends TreeElementImpl implements File {
	/**
	 * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootNode()
	 * @generated
	 * @ordered
	 */
	protected TreeElement rootNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleTreePackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder getFolder() {
		if (eContainerFeatureID() != SimpleTreePackage.FILE__FOLDER)
			return null;
		return (Folder) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolder(Folder newFolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFolder, SimpleTreePackage.FILE__FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolder(Folder newFolder) {
		if (newFolder != eInternalContainer()
				|| (eContainerFeatureID() != SimpleTreePackage.FILE__FOLDER && newFolder != null)) {
			if (EcoreUtil.isAncestor(this, newFolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFolder != null)
				msgs = ((InternalEObject) newFolder).eInverseAdd(this, SimpleTreePackage.FOLDER__FILE, Folder.class,
						msgs);
			msgs = basicSetFolder(newFolder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleTreePackage.FILE__FOLDER, newFolder,
					newFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeElement getRootNode() {
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootNode(TreeElement newRootNode, NotificationChain msgs) {
		TreeElement oldRootNode = rootNode;
		rootNode = newRootNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimpleTreePackage.FILE__ROOT_NODE, oldRootNode, newRootNode);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootNode(TreeElement newRootNode) {
		if (newRootNode != rootNode) {
			NotificationChain msgs = null;
			if (rootNode != null)
				msgs = ((InternalEObject) rootNode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SimpleTreePackage.FILE__ROOT_NODE, null, msgs);
			if (newRootNode != null)
				msgs = ((InternalEObject) newRootNode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SimpleTreePackage.FILE__ROOT_NODE, null, msgs);
			msgs = basicSetRootNode(newRootNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleTreePackage.FILE__ROOT_NODE, newRootNode,
					newRootNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleTreePackage.FILE__FOLDER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFolder((Folder) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleTreePackage.FILE__FOLDER:
			return basicSetFolder(null, msgs);
		case SimpleTreePackage.FILE__ROOT_NODE:
			return basicSetRootNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SimpleTreePackage.FILE__FOLDER:
			return eInternalContainer().eInverseRemove(this, SimpleTreePackage.FOLDER__FILE, Folder.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleTreePackage.FILE__FOLDER:
			return getFolder();
		case SimpleTreePackage.FILE__ROOT_NODE:
			return getRootNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimpleTreePackage.FILE__FOLDER:
			setFolder((Folder) newValue);
			return;
		case SimpleTreePackage.FILE__ROOT_NODE:
			setRootNode((TreeElement) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SimpleTreePackage.FILE__FOLDER:
			setFolder((Folder) null);
			return;
		case SimpleTreePackage.FILE__ROOT_NODE:
			setRootNode((TreeElement) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SimpleTreePackage.FILE__FOLDER:
			return getFolder() != null;
		case SimpleTreePackage.FILE__ROOT_NODE:
			return rootNode != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FileImpl
