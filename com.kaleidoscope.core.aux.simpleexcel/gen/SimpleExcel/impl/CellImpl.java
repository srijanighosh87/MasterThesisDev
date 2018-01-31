/**
 */
package SimpleExcel.impl;

import SimpleExcel.Cell;
import SimpleExcel.SimpleExcelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleExcel.impl.CellImpl#getText <em>Text</em>}</li>
 *   <li>{@link SimpleExcel.impl.CellImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link SimpleExcel.impl.CellImpl#getCellComments <em>Cell Comments</em>}</li>
 *   <li>{@link SimpleExcel.impl.CellImpl#getCellId <em>Cell Id</em>}</li>
 *   <li>{@link SimpleExcel.impl.CellImpl#getRowIndex <em>Row Index</em>}</li>
 *   <li>{@link SimpleExcel.impl.CellImpl#getColIndex <em>Col Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellImpl extends ExcelElementImpl implements Cell {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellComments() <em>Cell Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellComments()
	 * @generated
	 * @ordered
	 */
	protected static final String CELL_COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellComments() <em>Cell Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellComments()
	 * @generated
	 * @ordered
	 */
	protected String cellComments = CELL_COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellId() <em>Cell Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellId()
	 * @generated
	 * @ordered
	 */
	protected static final int CELL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCellId() <em>Cell Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellId()
	 * @generated
	 * @ordered
	 */
	protected int cellId = CELL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowIndex() <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowIndex()
	 * @generated
	 * @ordered
	 */
	protected int rowIndex = ROW_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getColIndex() <em>Col Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColIndex() <em>Col Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColIndex()
	 * @generated
	 * @ordered
	 */
	protected int colIndex = COL_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleExcelPackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.CELL__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.CELL__BACKGROUND_COLOR,
					oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellComments() {
		return cellComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellComments(String newCellComments) {
		String oldCellComments = cellComments;
		cellComments = newCellComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.CELL__CELL_COMMENTS,
					oldCellComments, cellComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCellId() {
		return cellId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellId(int newCellId) {
		int oldCellId = cellId;
		cellId = newCellId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.CELL__CELL_ID, oldCellId, cellId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowIndex() {
		return rowIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowIndex(int newRowIndex) {
		int oldRowIndex = rowIndex;
		rowIndex = newRowIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.CELL__ROW_INDEX, oldRowIndex,
					rowIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColIndex() {
		return colIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColIndex(int newColIndex) {
		int oldColIndex = colIndex;
		colIndex = newColIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.CELL__COL_INDEX, oldColIndex,
					colIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleExcelPackage.CELL__TEXT:
			return getText();
		case SimpleExcelPackage.CELL__BACKGROUND_COLOR:
			return getBackgroundColor();
		case SimpleExcelPackage.CELL__CELL_COMMENTS:
			return getCellComments();
		case SimpleExcelPackage.CELL__CELL_ID:
			return getCellId();
		case SimpleExcelPackage.CELL__ROW_INDEX:
			return getRowIndex();
		case SimpleExcelPackage.CELL__COL_INDEX:
			return getColIndex();
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
		case SimpleExcelPackage.CELL__TEXT:
			setText((String) newValue);
			return;
		case SimpleExcelPackage.CELL__BACKGROUND_COLOR:
			setBackgroundColor((String) newValue);
			return;
		case SimpleExcelPackage.CELL__CELL_COMMENTS:
			setCellComments((String) newValue);
			return;
		case SimpleExcelPackage.CELL__CELL_ID:
			setCellId((Integer) newValue);
			return;
		case SimpleExcelPackage.CELL__ROW_INDEX:
			setRowIndex((Integer) newValue);
			return;
		case SimpleExcelPackage.CELL__COL_INDEX:
			setColIndex((Integer) newValue);
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
		case SimpleExcelPackage.CELL__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		case SimpleExcelPackage.CELL__BACKGROUND_COLOR:
			setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
			return;
		case SimpleExcelPackage.CELL__CELL_COMMENTS:
			setCellComments(CELL_COMMENTS_EDEFAULT);
			return;
		case SimpleExcelPackage.CELL__CELL_ID:
			setCellId(CELL_ID_EDEFAULT);
			return;
		case SimpleExcelPackage.CELL__ROW_INDEX:
			setRowIndex(ROW_INDEX_EDEFAULT);
			return;
		case SimpleExcelPackage.CELL__COL_INDEX:
			setColIndex(COL_INDEX_EDEFAULT);
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
		case SimpleExcelPackage.CELL__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		case SimpleExcelPackage.CELL__BACKGROUND_COLOR:
			return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null
					: !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
		case SimpleExcelPackage.CELL__CELL_COMMENTS:
			return CELL_COMMENTS_EDEFAULT == null ? cellComments != null : !CELL_COMMENTS_EDEFAULT.equals(cellComments);
		case SimpleExcelPackage.CELL__CELL_ID:
			return cellId != CELL_ID_EDEFAULT;
		case SimpleExcelPackage.CELL__ROW_INDEX:
			return rowIndex != ROW_INDEX_EDEFAULT;
		case SimpleExcelPackage.CELL__COL_INDEX:
			return colIndex != COL_INDEX_EDEFAULT;
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
		result.append(" (text: ");
		result.append(text);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", cellComments: ");
		result.append(cellComments);
		result.append(", cellId: ");
		result.append(cellId);
		result.append(", rowIndex: ");
		result.append(rowIndex);
		result.append(", colIndex: ");
		result.append(colIndex);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CellImpl
