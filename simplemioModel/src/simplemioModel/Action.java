/**
 */
package simplemioModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplemioModel.Action#getStrength <em>Strength</em>}</li>
 *   <li>{@link simplemioModel.Action#getActionName <em>Action Name</em>}</li>
 *   <li>{@link simplemioModel.Action#getActionSpecifier <em>Action Specifier</em>}</li>
 * </ul>
 *
 * @see simplemioModel.SimplemioModelPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' attribute.
	 * @see #setStrength(Integer)
	 * @see simplemioModel.SimplemioModelPackage#getAction_Strength()
	 * @model
	 * @generated
	 */
	Integer getStrength();

	/**
	 * Sets the value of the '{@link simplemioModel.Action#getStrength <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' attribute.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Integer value);

	/**
	 * Returns the value of the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Name</em>' attribute.
	 * @see #setActionName(String)
	 * @see simplemioModel.SimplemioModelPackage#getAction_ActionName()
	 * @model
	 * @generated
	 */
	String getActionName();

	/**
	 * Sets the value of the '{@link simplemioModel.Action#getActionName <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Name</em>' attribute.
	 * @see #getActionName()
	 * @generated
	 */
	void setActionName(String value);

	/**
	 * Returns the value of the '<em><b>Action Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Specifier</em>' attribute.
	 * @see #setActionSpecifier(String)
	 * @see simplemioModel.SimplemioModelPackage#getAction_ActionSpecifier()
	 * @model
	 * @generated
	 */
	String getActionSpecifier();

	/**
	 * Sets the value of the '{@link simplemioModel.Action#getActionSpecifier <em>Action Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Specifier</em>' attribute.
	 * @see #getActionSpecifier()
	 * @generated
	 */
	void setActionSpecifier(String value);

} // Action
