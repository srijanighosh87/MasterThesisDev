/**
 */
package SimpleExcel.impl;

import SimpleExcel.Cell;
import SimpleExcel.ColObject;
import SimpleExcel.RowObject;
import SimpleExcel.Sheet;
import SimpleExcel.SimpleExcelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleExcel.impl.SheetImpl#getSheetId <em>Sheet Id</em>}</li>
 *   <li>{@link SimpleExcel.impl.SheetImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link SimpleExcel.impl.SheetImpl#getColobject <em>Colobject</em>}</li>
 *   <li>{@link SimpleExcel.impl.SheetImpl#getRowobject <em>Rowobject</em>}</li>
 *   <li>{@link SimpleExcel.impl.SheetImpl#getCell <em>Cell</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SheetImpl extends ExcelElementImpl implements Sheet {
	/**
	 * The default value of the '{@link #getSheetId() <em>Sheet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetId()
	 * @generated
	 * @ordered
	 */
	protected static final int SHEET_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSheetId() <em>Sheet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetId()
	 * @generated
	 * @ordered
	 */
	protected int sheetId = SHEET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected String sheetName = SHEET_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColobject() <em>Colobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColobject()
	 * @generated
	 * @ordered
	 */
	protected EList<ColObject> colobject;

	/**
	 * The cached value of the '{@link #getRowobject() <em>Rowobject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowobject()
	 * @generated
	 * @ordered
	 */
	protected EList<RowObject> rowobject;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleExcelPackage.Literals.SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSheetId() {
		return sheetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheetId(int newSheetId) {
		int oldSheetId = sheetId;
		sheetId = newSheetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.SHEET__SHEET_ID, oldSheetId,
					sheetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheetName(String newSheetName) {
		String oldSheetName = sheetName;
		sheetName = newSheetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.SHEET__SHEET_NAME, oldSheetName,
					sheetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColObject> getColobject() {
		if (colobject == null) {
			colobject = new EObjectContainmentEList<ColObject>(ColObject.class, this,
					SimpleExcelPackage.SHEET__COLOBJECT);
		}
		return colobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RowObject> getRowobject() {
		if (rowobject == null) {
			rowobject = new EObjectContainmentEList<RowObject>(RowObject.class, this,
					SimpleExcelPackage.SHEET__ROWOBJECT);
		}
		return rowobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cell> getCell() {
		if (cell == null) {
			cell = new EObjectContainmentEList<Cell>(Cell.class, this, SimpleExcelPackage.SHEET__CELL);
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimpleExcelPackage.SHEET__COLOBJECT:
			return ((InternalEList<?>) getColobject()).basicRemove(otherEnd, msgs);
		case SimpleExcelPackage.SHEET__ROWOBJECT:
			return ((InternalEList<?>) getRowobject()).basicRemove(otherEnd, msgs);
		case SimpleExcelPackage.SHEET__CELL:
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
		case SimpleExcelPackage.SHEET__SHEET_ID:
			return getSheetId();
		case SimpleExcelPackage.SHEET__SHEET_NAME:
			return getSheetName();
		case SimpleExcelPackage.SHEET__COLOBJECT:
			return getColobject();
		case SimpleExcelPackage.SHEET__ROWOBJECT:
			return getRowobject();
		case SimpleExcelPackage.SHEET__CELL:
			return getCell();
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
		case SimpleExcelPackage.SHEET__SHEET_ID:
			setSheetId((Integer) newValue);
			return;
		case SimpleExcelPackage.SHEET__SHEET_NAME:
			setSheetName((String) newValue);
			return;
		case SimpleExcelPackage.SHEET__COLOBJECT:
			getColobject().clear();
			getColobject().addAll((Collection<? extends ColObject>) newValue);
			return;
		case SimpleExcelPackage.SHEET__ROWOBJECT:
			getRowobject().clear();
			getRowobject().addAll((Collection<? extends RowObject>) newValue);
			return;
		case SimpleExcelPackage.SHEET__CELL:
			getCell().clear();
			getCell().addAll((Collection<? extends Cell>) newValue);
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
		case SimpleExcelPackage.SHEET__SHEET_ID:
			setSheetId(SHEET_ID_EDEFAULT);
			return;
		case SimpleExcelPackage.SHEET__SHEET_NAME:
			setSheetName(SHEET_NAME_EDEFAULT);
			return;
		case SimpleExcelPackage.SHEET__COLOBJECT:
			getColobject().clear();
			return;
		case SimpleExcelPackage.SHEET__ROWOBJECT:
			getRowobject().clear();
			return;
		case SimpleExcelPackage.SHEET__CELL:
			getCell().clear();
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
		case SimpleExcelPackage.SHEET__SHEET_ID:
			return sheetId != SHEET_ID_EDEFAULT;
		case SimpleExcelPackage.SHEET__SHEET_NAME:
			return SHEET_NAME_EDEFAULT == null ? sheetName != null : !SHEET_NAME_EDEFAULT.equals(sheetName);
		case SimpleExcelPackage.SHEET__COLOBJECT:
			return colobject != null && !colobject.isEmpty();
		case SimpleExcelPackage.SHEET__ROWOBJECT:
			return rowobject != null && !rowobject.isEmpty();
		case SimpleExcelPackage.SHEET__CELL:
			return cell != null && !cell.isEmpty();
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
		result.append(" (sheetId: ");
		result.append(sheetId);
		result.append(", sheetName: ");
		result.append(sheetName);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SheetImpl
