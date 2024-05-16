/**
 */
package simplemioModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplemioModel.Event#getActions <em>Actions</em>}</li>
 *   <li>{@link simplemioModel.Event#getConditionalsensor <em>Conditionalsensor</em>}</li>
 * </ul>
 *
 * @see simplemioModel.SimplemioModelPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link simplemioModel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see simplemioModel.SimplemioModelPackage#getEvent_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Conditionalsensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionalsensor</em>' containment reference.
	 * @see #setConditionalsensor(ConditionalSensor)
	 * @see simplemioModel.SimplemioModelPackage#getEvent_Conditionalsensor()
	 * @model containment="true"
	 * @generated
	 */
	ConditionalSensor getConditionalsensor();

	/**
	 * Sets the value of the '{@link simplemioModel.Event#getConditionalsensor <em>Conditionalsensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionalsensor</em>' containment reference.
	 * @see #getConditionalsensor()
	 * @generated
	 */
	void setConditionalsensor(ConditionalSensor value);

} // Event
