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
 *   <li>{@link SimpleExcel.impl.CellImpl#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link SimpleExcel.impl.CellImpl#getCellComments <em>Cell Comments</em>}</li>
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
	 * The default value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForegroundColor() <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected String foregroundColor = FOREGROUND_COLOR_EDEFAULT;

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
	public String getForegroundColor() {
		return foregroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForegroundColor(String newForegroundColor) {
		String oldForegroundColor = foregroundColor;
		foregroundColor = newForegroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleExcelPackage.CELL__FOREGROUND_COLOR,
					oldForegroundColor, foregroundColor));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimpleExcelPackage.CELL__TEXT:
			return getText();
		case SimpleExcelPackage.CELL__BACKGROUND_COLOR:
			return getBackgroundColor();
		case SimpleExcelPackage.CELL__FOREGROUND_COLOR:
			return getForegroundColor();
		case SimpleExcelPackage.CELL__CELL_COMMENTS:
			return getCellComments();
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
		case SimpleExcelPackage.CELL__FOREGROUND_COLOR:
			setForegroundColor((String) newValue);
			return;
		case SimpleExcelPackage.CELL__CELL_COMMENTS:
			setCellComments((String) newValue);
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
		case SimpleExcelPackage.CELL__FOREGROUND_COLOR:
			setForegroundColor(FOREGROUND_COLOR_EDEFAULT);
			return;
		case SimpleExcelPackage.CELL__CELL_COMMENTS:
			setCellComments(CELL_COMMENTS_EDEFAULT);
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
		case SimpleExcelPackage.CELL__FOREGROUND_COLOR:
			return FOREGROUND_COLOR_EDEFAULT == null ? foregroundColor != null
					: !FOREGROUND_COLOR_EDEFAULT.equals(foregroundColor);
		case SimpleExcelPackage.CELL__CELL_COMMENTS:
			return CELL_COMMENTS_EDEFAULT == null ? cellComments != null : !CELL_COMMENTS_EDEFAULT.equals(cellComments);
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
		result.append(", foregroundColor: ");
		result.append(foregroundColor);
		result.append(", cellComments: ");
		result.append(cellComments);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CellImpl
