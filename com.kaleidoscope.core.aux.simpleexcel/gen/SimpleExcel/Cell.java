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
 *   <li>{@link SimpleExcel.Cell#getRowIndex <em>Row Index</em>}</li>
 *   <li>{@link SimpleExcel.Cell#getColIndex <em>Col Index</em>}</li>
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
	 * @model
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
	 * @model
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
	 * @model
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
	 * @model id="true"
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

	/**
	 * Returns the value of the '<em><b>Row Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Index</em>' attribute.
	 * @see #setRowIndex(int)
	 * @see SimpleExcel.SimpleExcelPackage#getCell_RowIndex()
	 * @model
	 * @generated
	 */
	int getRowIndex();

	/**
	 * Sets the value of the '{@link SimpleExcel.Cell#getRowIndex <em>Row Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Index</em>' attribute.
	 * @see #getRowIndex()
	 * @generated
	 */
	void setRowIndex(int value);

	/**
	 * Returns the value of the '<em><b>Col Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Index</em>' attribute.
	 * @see #setColIndex(int)
	 * @see SimpleExcel.SimpleExcelPackage#getCell_ColIndex()
	 * @model
	 * @generated
	 */
	int getColIndex();

	/**
	 * Sets the value of the '{@link SimpleExcel.Cell#getColIndex <em>Col Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Index</em>' attribute.
	 * @see #getColIndex()
	 * @generated
	 */
	void setColIndex(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Cell
