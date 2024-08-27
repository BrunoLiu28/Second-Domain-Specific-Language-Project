/**
 */
package simplemioModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import simplemioModel.Sensor;
import simplemioModel.SimplemioModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplemioModel.impl.SensorImpl#getSensorName <em>Sensor Name</em>}</li>
 *   <li>{@link simplemioModel.impl.SensorImpl#getSensorSpecifier <em>Sensor Specifier</em>}</li>
 *   <li>{@link simplemioModel.impl.SensorImpl#getStrength <em>Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends ConditionalSensorImpl implements Sensor {
	/**
	 * The default value of the '{@link #getSensorName() <em>Sensor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorName()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorName() <em>Sensor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorName()
	 * @generated
	 * @ordered
	 */
	protected String sensorName = SENSOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensorSpecifier() <em>Sensor Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorSpecifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_SPECIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorSpecifier() <em>Sensor Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorSpecifier()
	 * @generated
	 * @ordered
	 */
	protected String sensorSpecifier = SENSOR_SPECIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected Integer strength = STRENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemioModelPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSensorName() {
		return sensorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorName(String newSensorName) {
		String oldSensorName = sensorName;
		sensorName = newSensorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemioModelPackage.SENSOR__SENSOR_NAME,
					oldSensorName, sensorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSensorSpecifier() {
		return sensorSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorSpecifier(String newSensorSpecifier) {
		String oldSensorSpecifier = sensorSpecifier;
		sensorSpecifier = newSensorSpecifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemioModelPackage.SENSOR__SENSOR_SPECIFIER,
					oldSensorSpecifier, sensorSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrength(Integer newStrength) {
		Integer oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemioModelPackage.SENSOR__STRENGTH, oldStrength,
					strength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplemioModelPackage.SENSOR__SENSOR_NAME:
			return getSensorName();
		case SimplemioModelPackage.SENSOR__SENSOR_SPECIFIER:
			return getSensorSpecifier();
		case SimplemioModelPackage.SENSOR__STRENGTH:
			return getStrength();
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
		case SimplemioModelPackage.SENSOR__SENSOR_NAME:
			setSensorName((String) newValue);
			return;
		case SimplemioModelPackage.SENSOR__SENSOR_SPECIFIER:
			setSensorSpecifier((String) newValue);
			return;
		case SimplemioModelPackage.SENSOR__STRENGTH:
			setStrength((Integer) newValue);
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
		case SimplemioModelPackage.SENSOR__SENSOR_NAME:
			setSensorName(SENSOR_NAME_EDEFAULT);
			return;
		case SimplemioModelPackage.SENSOR__SENSOR_SPECIFIER:
			setSensorSpecifier(SENSOR_SPECIFIER_EDEFAULT);
			return;
		case SimplemioModelPackage.SENSOR__STRENGTH:
			setStrength(STRENGTH_EDEFAULT);
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
		case SimplemioModelPackage.SENSOR__SENSOR_NAME:
			return SENSOR_NAME_EDEFAULT == null ? sensorName != null : !SENSOR_NAME_EDEFAULT.equals(sensorName);
		case SimplemioModelPackage.SENSOR__SENSOR_SPECIFIER:
			return SENSOR_SPECIFIER_EDEFAULT == null ? sensorSpecifier != null
					: !SENSOR_SPECIFIER_EDEFAULT.equals(sensorSpecifier);
		case SimplemioModelPackage.SENSOR__STRENGTH:
			return STRENGTH_EDEFAULT == null ? strength != null : !STRENGTH_EDEFAULT.equals(strength);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sensorName: ");
		result.append(sensorName);
		result.append(", sensorSpecifier: ");
		result.append(sensorSpecifier);
		result.append(", strength: ");
		result.append(strength);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
