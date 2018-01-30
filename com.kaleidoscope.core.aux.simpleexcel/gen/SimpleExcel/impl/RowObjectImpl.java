/**
 */
package SimpleExcel.impl;

import SimpleExcel.Cell;
import SimpleExcel.RowObject;
import SimpleExcel.SimpleExcelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Row Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleExcel.impl.RowObjectImpl#getCell <em>Cell</em>}</li>
 *   <li>{@link SimpleExcel.impl.RowObjectImpl#getRowId <em>Row Id</em>}</li>
 *   <li>{@link SimpleExcel.impl.RowObjectImpl#isIsheader <em>Isheader</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RowObjectImpl extends EObjectImpl implements RowObject {
	/**
	 * The cached value of the '{@link #getCell() <em>Cell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCell()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cell;

	/**
	 * The default value of the '{@link #getRowId() <em>Row Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowId()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowId() <em>Row Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowId()
	 * @generated
	 * @ordered
	 */
	protected int rowId = ROW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsheader() <em>Isheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsheader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISHEADER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsheader() <em>Isheader</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsheader()
	 * @generated
	 * @ordered
	 */
	protected boolean isheader = ISHEADER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleExcelPackage.Literals.ROW_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getCell() {
		if (cell == null) {
			cell = new EObjectContainmentEList<Cell>(Cell.class, this, SimpleExcelPackage.ROW_OBJECT__CELL);
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowId() {
		return rowId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowId(int newRowId) {
		int oldRowId = rowId;
		rowId = newRowId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.ROW_OBJECT__ROW_ID, oldRowId,
					rowId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsheader() {
		return isheader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsheader(boolean newIsheader) {
		boolean oldIsheader = isheader;
		isheader = newIsheader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.ROW_OBJECT__ISHEADER, oldIsheader,
					isheader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleExcelPackage.ROW_OBJECT__CELL:
			return ((InternalEList<?>) getCell()).basicRemove(otherEnd, msgs);
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
		case SimpleExcelPackage.ROW_OBJECT__CELL:
			return getCell();
		case SimpleExcelPackage.ROW_OBJECT__ROW_ID:
			return getRowId();
		case SimpleExcelPackage.ROW_OBJECT__ISHEADER:
			return isIsheader();
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
		case SimpleExcelPackage.ROW_OBJECT__CELL:
			getCell().clear();
			getCell().addAll((Collection<? extends Cell>) newValue);
			return;
		case SimpleExcelPackage.ROW_OBJECT__ROW_ID:
			setRowId((Integer) newValue);
			return;
		case SimpleExcelPackage.ROW_OBJECT__ISHEADER:
			setIsheader((Boolean) newValue);
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
		case SimpleExcelPackage.ROW_OBJECT__CELL:
			getCell().clear();
			return;
		case SimpleExcelPackage.ROW_OBJECT__ROW_ID:
			setRowId(ROW_ID_EDEFAULT);
			return;
		case SimpleExcelPackage.ROW_OBJECT__ISHEADER:
			setIsheader(ISHEADER_EDEFAULT);
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
		case SimpleExcelPackage.ROW_OBJECT__CELL:
			return cell != null && !cell.isEmpty();
		case SimpleExcelPackage.ROW_OBJECT__ROW_ID:
			return rowId != ROW_ID_EDEFAULT;
		case SimpleExcelPackage.ROW_OBJECT__ISHEADER:
			return isheader != ISHEADER_EDEFAULT;
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
		result.append(" (rowId: ");
		result.append(rowId);
		result.append(", isheader: ");
		result.append(isheader);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //RowObjectImpl
