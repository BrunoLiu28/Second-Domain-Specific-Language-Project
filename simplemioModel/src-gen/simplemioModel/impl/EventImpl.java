/**
 */
package simplemioModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplemioModel.Action;
import simplemioModel.ConditionalSensor;
import simplemioModel.Event;
import simplemioModel.SimplemioModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplemioModel.impl.EventImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link simplemioModel.impl.EventImpl#getConditionalsensor <em>Conditionalsensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

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
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemioModelPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, SimplemioModelPackage.EVENT__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplemioModelPackage.EVENT__CONDITIONALSENSOR, oldConditionalsensor, newConditionalsensor);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionalsensor(ConditionalSensor newConditionalsensor) {
		if (newConditionalsensor != conditionalsensor) {
			NotificationChain msgs = null;
			if (conditionalsensor != null)
				msgs = ((InternalEObject) conditionalsensor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SimplemioModelPackage.EVENT__CONDITIONALSENSOR, null, msgs);
			if (newConditionalsensor != null)
				msgs = ((InternalEObject) newConditionalsensor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SimplemioModelPackage.EVENT__CONDITIONALSENSOR, null, msgs);
			msgs = basicSetConditionalsensor(newConditionalsensor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemioModelPackage.EVENT__CONDITIONALSENSOR,
					newConditionalsensor, newConditionalsensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplemioModelPackage.EVENT__ACTIONS:
			return ((InternalEList<?>) getActions()).basicRemove(otherEnd, msgs);
		case SimplemioModelPackage.EVENT__CONDITIONALSENSOR:
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
		case SimplemioModelPackage.EVENT__ACTIONS:
			return getActions();
		case SimplemioModelPackage.EVENT__CONDITIONALSENSOR:
			return getConditionalsensor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimplemioModelPackage.EVENT__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case SimplemioModelPackage.EVENT__CONDITIONALSENSOR:
			setConditionalsensor((ConditionalSensor) newValue);
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
		case SimplemioModelPackage.EVENT__ACTIONS:
			getActions().clear();
			return;
		case SimplemioModelPackage.EVENT__CONDITIONALSENSOR:
			setConditionalsensor((ConditionalSensor) null);
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
		case SimplemioModelPackage.EVENT__ACTIONS:
			return actions != null && !actions.isEmpty();
		case SimplemioModelPackage.EVENT__CONDITIONALSENSOR:
			return conditionalsensor != null;
		}
		return super.eIsSet(featureID);
	}

} //EventImpl
