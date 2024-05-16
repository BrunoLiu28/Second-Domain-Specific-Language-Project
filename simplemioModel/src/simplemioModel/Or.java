/**
 */
package simplemioModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplemioModel.Or#getLeft <em>Left</em>}</li>
 *   <li>{@link simplemioModel.Or#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see simplemioModel.SimplemioModelPackage#getOr()
 * @model
 * @generated
 */
public interface Or extends ConditionalSensor {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ConditionalSensor)
	 * @see simplemioModel.SimplemioModelPackage#getOr_Left()
	 * @model containment="true"
	 * @generated
	 */
	ConditionalSensor getLeft();

	/**
	 * Sets the value of the '{@link simplemioModel.Or#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ConditionalSensor value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ConditionalSensor)
	 * @see simplemioModel.SimplemioModelPackage#getOr_Right()
	 * @model containment="true"
	 * @generated
	 */
	ConditionalSensor getRight();

	/**
	 * Sets the value of the '{@link simplemioModel.Or#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ConditionalSensor value);

} // Or
