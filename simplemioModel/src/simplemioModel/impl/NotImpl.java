/**
 */
package simplemioModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplemioModel.ConditionalSensor;
import simplemioModel.Not;
import simplemioModel.SimplemioModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplemioModel.impl.NotImpl#getConditionalsensor <em>Conditionalsensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotImpl extends ConditionalSensorImpl implements Not {
	/**
	 * The cached value of the '{@link #getConditionalsensor() <em>Conditionalsensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalsensor()
	 * @generated
	 * @ordered
	 */
	protected ConditionalSensor conditionalsensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemioModelPackage.Literals.NOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalSensor getConditionalsensor() {
		return conditionalsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalsensor(ConditionalSensor newConditionalsensor, NotificationChain msgs) {
		ConditionalSensor oldConditionalsensor = conditionalsensor;
		conditionalsensor = newConditionalsensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplemioModelPackage.NOT__CONDITIONALSENSOR, oldConditionalsensor, newConditionalsensor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalsensor(ConditionalSensor newConditionalsensor) {
		if (newConditionalsensor != conditionalsensor) {
			NotificationChain msgs = null;
			if (conditionalsensor != null)
				msgs = ((InternalEObject)conditionalsensor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimplemioModelPackage.NOT__CONDITIONALSENSOR, null, msgs);
			if (newConditionalsensor != null)
				msgs = ((InternalEObject)newConditionalsensor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimplemioModelPackage.NOT__CONDITIONALSENSOR, null, msgs);
			msgs = basicSetConditionalsensor(newConditionalsensor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemioModelPackage.NOT__CONDITIONALSENSOR, newConditionalsensor, newConditionalsensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplemioModelPackage.NOT__CONDITIONALSENSOR:
				return basicSetConditionalsensor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplemioModelPackage.NOT__CONDITIONALSENSOR:
				return getConditionalsensor();
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
			case SimplemioModelPackage.NOT__CONDITIONALSENSOR:
				setConditionalsensor((ConditionalSensor)newValue);
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
			case SimplemioModelPackage.NOT__CONDITIONALSENSOR:
				setConditionalsensor((ConditionalSensor)null);
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
			case SimplemioModelPackage.NOT__CONDITIONALSENSOR:
				return conditionalsensor != null;
		}
		return super.eIsSet(featureID);
	}

} //NotImpl
