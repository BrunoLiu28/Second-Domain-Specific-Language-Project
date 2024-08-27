/**
 */
package simplemioModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplemioModel.ConditionalSensor#getAnd <em>And</em>}</li>
 *   <li>{@link simplemioModel.ConditionalSensor#getOr <em>Or</em>}</li>
 *   <li>{@link simplemioModel.ConditionalSensor#getNot <em>Not</em>}</li>
 *   <li>{@link simplemioModel.ConditionalSensor#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see simplemioModel.SimplemioModelPackage#getConditionalSensor()
 * @model
 * @generated
 */
public interface ConditionalSensor extends EObject {
	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference.
	 * @see #setAnd(And)
	 * @see simplemioModel.SimplemioModelPackage#getConditionalSensor_And()
	 * @model containment="true"
	 * @generated
	 */
	And getAnd();

	/**
	 * Sets the value of the '{@link simplemioModel.ConditionalSensor#getAnd <em>And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And</em>' containment reference.
	 * @see #getAnd()
	 * @generated
	 */
	void setAnd(And value);

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference.
	 * @see #setOr(Or)
	 * @see simplemioModel.SimplemioModelPackage#getConditionalSensor_Or()
	 * @model containment="true"
	 * @generated
	 */
	Or getOr();

	/**
	 * Sets the value of the '{@link simplemioModel.ConditionalSensor#getOr <em>Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or</em>' containment reference.
	 * @see #getOr()
	 * @generated
	 */
	void setOr(Or value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference.
	 * @see #setNot(Not)
	 * @see simplemioModel.SimplemioModelPackage#getConditionalSensor_Not()
	 * @model containment="true"
	 * @generated
	 */
	Not getNot();

	/**
	 * Sets the value of the '{@link simplemioModel.ConditionalSensor#getNot <em>Not</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' containment reference.
	 * @see #getNot()
	 * @generated
	 */
	void setNot(Not value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference.
	 * @see #setSensor(Sensor)
	 * @see simplemioModel.SimplemioModelPackage#getConditionalSensor_Sensor()
	 * @model containment="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link simplemioModel.ConditionalSensor#getSensor <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' containment reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // ConditionalSensor
