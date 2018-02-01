/**
 */
package SimpleExcel;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleExcel.Cell#getText <em>Text</em>}</li>
 *   <li>{@link SimpleExcel.Cell#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link SimpleExcel.Cell#getCellComments <em>Cell Comments</em>}</li>
 *   <li>{@link SimpleExcel.Cell#getCellId <em>Cell Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleExcel.SimpleExcelPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends ExcelElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see SimpleExcel.SimpleExcelPackage#getCell_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link SimpleExcel.Cell#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #setBackgroundColor(String)
	 * @see SimpleExcel.SimpleExcelPackage#getCell_BackgroundColor()
	 * @model unique="false"
	 * @generated
	 */
	String getBackgroundColor();

	/**
	 * Sets the value of the '{@link SimpleExcel.Cell#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(String value);

	/**
	 * Returns the value of the '<em><b>Cell Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Comments</em>' attribute.
	 * @see #setCellComments(String)
	 * @see SimpleExcel.SimpleExcelPackage#getCell_CellComments()
	 * @model unique="false"
	 * @generated
	 */
	String getCellComments();

	/**
	 * Sets the value of the '{@link SimpleExcel.Cell#getCellComments <em>Cell Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Comments</em>' attribute.
	 * @see #getCellComments()
	 * @generated
	 */
	void setCellComments(String value);

	/**
	 * Returns the value of the '<em><b>Cell Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cell Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Id</em>' attribute.
	 * @see #setCellId(int)
	 * @see SimpleExcel.SimpleExcelPackage#getCell_CellId()
	 * @model
	 * @generated
	 */
	int getCellId();

	/**
	 * Sets the value of the '{@link SimpleExcel.Cell#getCellId <em>Cell Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Id</em>' attribute.
	 * @see #getCellId()
	 * @generated
	 */
	void setCellId(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Cell
