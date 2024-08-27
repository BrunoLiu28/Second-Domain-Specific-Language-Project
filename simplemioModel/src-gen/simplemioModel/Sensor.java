/**
 */
package simplemioModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplemioModel.Sensor#getSensorName <em>Sensor Name</em>}</li>
 *   <li>{@link simplemioModel.Sensor#getSensorSpecifier <em>Sensor Specifier</em>}</li>
 *   <li>{@link simplemioModel.Sensor#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @see simplemioModel.SimplemioModelPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends ConditionalSensor {
	/**
	 * Returns the value of the '<em><b>Sensor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Name</em>' attribute.
	 * @see #setSensorName(String)
	 * @see simplemioModel.SimplemioModelPackage#getSensor_SensorName()
	 * @model
	 * @generated
	 */
	String getSensorName();

	/**
	 * Sets the value of the '{@link simplemioModel.Sensor#getSensorName <em>Sensor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Name</em>' attribute.
	 * @see #getSensorName()
	 * @generated
	 */
	void setSensorName(String value);

	/**
	 * Returns the value of the '<em><b>Sensor Specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor Specifier</em>' attribute.
	 * @see #setSensorSpecifier(String)
	 * @see simplemioModel.SimplemioModelPackage#getSensor_SensorSpecifier()
	 * @model
	 * @generated
	 */
	String getSensorSpecifier();

	/**
	 * Sets the value of the '{@link simplemioModel.Sensor#getSensorSpecifier <em>Sensor Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Specifier</em>' attribute.
	 * @see #getSensorSpecifier()
	 * @generated
	 */
	void setSensorSpecifier(String value);

	/**
	 * Returns the value of the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' attribute.
	 * @see #setStrength(Integer)
	 * @see simplemioModel.SimplemioModelPackage#getSensor_Strength()
	 * @model
	 * @generated
	 */
	Integer getStrength();

	/**
	 * Sets the value of the '{@link simplemioModel.Sensor#getStrength <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' attribute.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Integer value);

} // Sensor
