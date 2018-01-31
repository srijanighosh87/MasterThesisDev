/**
 */
package SimpleExcel.impl;

import SimpleExcel.File;
import SimpleExcel.Folder;
import SimpleExcel.SimpleExcelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleExcel.impl.FolderImpl#getFile <em>File</em>}</li>
 *   <li>{@link SimpleExcel.impl.FolderImpl#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link SimpleExcel.impl.FolderImpl#getSubFolder <em>Sub Folder</em>}</li>
 *   <li>{@link SimpleExcel.impl.FolderImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FolderImpl extends ExcelElementImpl implements Folder {
	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList<File> file;

	/**
	 * The cached value of the '{@link #getParentFolder() <em>Parent Folder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentFolder()
	 * @generated
	 * @ordered
	 */
	protected Folder parentFolder;

	/**
	 * The cached value of the '{@link #getSubFolder() <em>Sub Folder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFolder()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> subFolder;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleExcelPackage.Literals.FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFile() {
		if (file == null) {
			file = new EObjectContainmentEList<File>(File.class, this, SimpleExcelPackage.FOLDER__FILE);
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder getParentFolder() {
		return parentFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFolder(Folder newParentFolder, NotificationChain msgs) {
		Folder oldParentFolder = parentFolder;
		parentFolder = newParentFolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimpleExcelPackage.FOLDER__PARENT_FOLDER, oldParentFolder, newParentFolder);
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
	public void setParentFolder(Folder newParentFolder) {
		if (newParentFolder != parentFolder) {
			NotificationChain msgs = null;
			if (parentFolder != null)
				msgs = ((InternalEObject) parentFolder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SimpleExcelPackage.FOLDER__PARENT_FOLDER, null, msgs);
			if (newParentFolder != null)
				msgs = ((InternalEObject) newParentFolder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SimpleExcelPackage.FOLDER__PARENT_FOLDER, null, msgs);
			msgs = basicSetParentFolder(newParentFolder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.FOLDER__PARENT_FOLDER,
					newParentFolder, newParentFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getSubFolder() {
		if (subFolder == null) {
			subFolder = new EObjectResolvingEList<Folder>(Folder.class, this, SimpleExcelPackage.FOLDER__SUB_FOLDER);
		}
		return subFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleExcelPackage.FOLDER__FILE:
			return ((InternalEList<?>) getFile()).basicRemove(otherEnd, msgs);
		case SimpleExcelPackage.FOLDER__PARENT_FOLDER:
			return basicSetParentFolder(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleExcelPackage.FOLDER__FILE:
			return getFile();
		case SimpleExcelPackage.FOLDER__PARENT_FOLDER:
			return getParentFolder();
		case SimpleExcelPackage.FOLDER__SUB_FOLDER:
			return getSubFolder();
		case SimpleExcelPackage.FOLDER__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimpleExcelPackage.FOLDER__FILE:
			getFile().clear();
			getFile().addAll((Collection<? extends File>) newValue);
			return;
		case SimpleExcelPackage.FOLDER__PARENT_FOLDER:
			setParentFolder((Folder) newValue);
			return;
		case SimpleExcelPackage.FOLDER__SUB_FOLDER:
			getSubFolder().clear();
			getSubFolder().addAll((Collection<? extends Folder>) newValue);
			return;
		case SimpleExcelPackage.FOLDER__NAME:
			setName((String) newValue);
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
		case SimpleExcelPackage.FOLDER__FILE:
			getFile().clear();
			return;
		case SimpleExcelPackage.FOLDER__PARENT_FOLDER:
			setParentFolder((Folder) null);
			return;
		case SimpleExcelPackage.FOLDER__SUB_FOLDER:
			getSubFolder().clear();
			return;
		case SimpleExcelPackage.FOLDER__NAME:
			setName(NAME_EDEFAULT);
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
		case SimpleExcelPackage.FOLDER__FILE:
			return file != null && !file.isEmpty();
		case SimpleExcelPackage.FOLDER__PARENT_FOLDER:
			return parentFolder != null;
		case SimpleExcelPackage.FOLDER__SUB_FOLDER:
			return subFolder != null && !subFolder.isEmpty();
		case SimpleExcelPackage.FOLDER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FolderImpl
