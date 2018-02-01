/**
 */
package SimpleExcel.impl;

import SimpleExcel.Cell;
import SimpleExcel.ColObject;
import SimpleExcel.SimpleExcelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Col Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleExcel.impl.ColObjectImpl#getColId <em>Col Id</em>}</li>
 *   <li>{@link SimpleExcel.impl.ColObjectImpl#getCell <em>Cell</em>}</li>
 *   <li>{@link SimpleExcel.impl.ColObjectImpl#getNextColumn <em>Next Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColObjectImpl extends EObjectImpl implements ColObject {
	/**
	 * The default value of the '{@link #getColId() <em>Col Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColId()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColId() <em>Col Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColId()
	 * @generated
	 * @ordered
	 */
	protected int colId = COL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCell() <em>Cell</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCell()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cell;

	/**
	 * The cached value of the '{@link #getNextColumn() <em>Next Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextColumn()
	 * @generated
	 * @ordered
	 */
	protected ColObject nextColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleExcelPackage.Literals.COL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColId() {
		return colId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColId(int newColId) {
		int oldColId = colId;
		colId = newColId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.COL_OBJECT__COL_ID, oldColId,
					colId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getCell() {
		if (cell == null) {
			cell = new EObjectResolvingEList<Cell>(Cell.class, this, SimpleExcelPackage.COL_OBJECT__CELL);
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColObject getNextColumn() {
		if (nextColumn != null && nextColumn.eIsProxy()) {
			InternalEObject oldNextColumn = (InternalEObject) nextColumn;
			nextColumn = (ColObject) eResolveProxy(oldNextColumn);
			if (nextColumn != oldNextColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimpleExcelPackage.COL_OBJECT__NEXT_COLUMN, oldNextColumn, nextColumn));
			}
		}
		return nextColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColObject basicGetNextColumn() {
		return nextColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextColumn(ColObject newNextColumn) {
		ColObject oldNextColumn = nextColumn;
		nextColumn = newNextColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.COL_OBJECT__NEXT_COLUMN,
					oldNextColumn, nextColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleExcelPackage.COL_OBJECT__COL_ID:
			return getColId();
		case SimpleExcelPackage.COL_OBJECT__CELL:
			return getCell();
		case SimpleExcelPackage.COL_OBJECT__NEXT_COLUMN:
			if (resolve)
				return getNextColumn();
			return basicGetNextColumn();
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
		case SimpleExcelPackage.COL_OBJECT__COL_ID:
			setColId((Integer) newValue);
			return;
		case SimpleExcelPackage.COL_OBJECT__CELL:
			getCell().clear();
			getCell().addAll((Collection<? extends Cell>) newValue);
			return;
		case SimpleExcelPackage.COL_OBJECT__NEXT_COLUMN:
			setNextColumn((ColObject) newValue);
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
		case SimpleExcelPackage.COL_OBJECT__COL_ID:
			setColId(COL_ID_EDEFAULT);
			return;
		case SimpleExcelPackage.COL_OBJECT__CELL:
			getCell().clear();
			return;
		case SimpleExcelPackage.COL_OBJECT__NEXT_COLUMN:
			setNextColumn((ColObject) null);
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
		case SimpleExcelPackage.COL_OBJECT__COL_ID:
			return colId != COL_ID_EDEFAULT;
		case SimpleExcelPackage.COL_OBJECT__CELL:
			return cell != null && !cell.isEmpty();
		case SimpleExcelPackage.COL_OBJECT__NEXT_COLUMN:
			return nextColumn != null;
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
		result.append(" (colId: ");
		result.append(colId);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ColObjectImpl
