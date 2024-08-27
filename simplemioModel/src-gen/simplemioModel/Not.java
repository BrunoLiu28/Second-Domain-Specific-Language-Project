/**
 */
package simplemioModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplemioModel.Not#getConditionalsensor <em>Conditionalsensor</em>}</li>
 * </ul>
 *
 * @see simplemioModel.SimplemioModelPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends ConditionalSensor {
	/**
	 * Returns the value of the '<em><b>Conditionalsensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionalsensor</em>' containment reference.
	 * @see #setConditionalsensor(ConditionalSensor)
	 * @see simplemioModel.SimplemioModelPackage#getNot_Conditionalsensor()
	 * @model containment="true"
	 * @generated
	 */
	ConditionalSensor getConditionalsensor();

	/**
	 * Sets the value of the '{@link simplemioModel.Not#getConditionalsensor <em>Conditionalsensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionalsensor</em>' containment reference.
	 * @see #getConditionalsensor()
	 * @generated
	 */
	void setConditionalsensor(ConditionalSensor value);

} // Not
