/**
 */
package simplemioModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import simplemioModel.Action;
import simplemioModel.SimplemioModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplemioModel.impl.ActionImpl#getStrength <em>Strength</em>}</li>
 *   <li>{@link simplemioModel.impl.ActionImpl#getActionName <em>Action Name</em>}</li>
 *   <li>{@link simplemioModel.impl.ActionImpl#getActionSpecifier <em>Action Specifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
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
	 * The default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected String actionName = ACTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionSpecifier() <em>Action Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSpecifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_SPECIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionSpecifier() <em>Action Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSpecifier()
	 * @generated
	 * @ordered
	 */
	protected String actionSpecifier = ACTION_SPECIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemioModelPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(Integer newStrength) {
		Integer oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemioModelPackage.ACTION__STRENGTH, oldStrength, strength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionName() {
		return actionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionName(String newActionName) {
		String oldActionName = actionName;
		actionName = newActionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemioModelPackage.ACTION__ACTION_NAME, oldActionName, actionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionSpecifier() {
		return actionSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionSpecifier(String newActionSpecifier) {
		String oldActionSpecifier = actionSpecifier;
		actionSpecifier = newActionSpecifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplemioModelPackage.ACTION__ACTION_SPECIFIER, oldActionSpecifier, actionSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplemioModelPackage.ACTION__STRENGTH:
				return getStrength();
			case SimplemioModelPackage.ACTION__ACTION_NAME:
				return getActionName();
			case SimplemioModelPackage.ACTION__ACTION_SPECIFIER:
				return getActionSpecifier();
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
			case SimplemioModelPackage.ACTION__STRENGTH:
				setStrength((Integer)newValue);
				return;
			case SimplemioModelPackage.ACTION__ACTION_NAME:
				setActionName((String)newValue);
				return;
			case SimplemioModelPackage.ACTION__ACTION_SPECIFIER:
				setActionSpecifier((String)newValue);
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
			case SimplemioModelPackage.ACTION__STRENGTH:
				setStrength(STRENGTH_EDEFAULT);
				return;
			case SimplemioModelPackage.ACTION__ACTION_NAME:
				setActionName(ACTION_NAME_EDEFAULT);
				return;
			case SimplemioModelPackage.ACTION__ACTION_SPECIFIER:
				setActionSpecifier(ACTION_SPECIFIER_EDEFAULT);
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
			case SimplemioModelPackage.ACTION__STRENGTH:
				return STRENGTH_EDEFAULT == null ? strength != null : !STRENGTH_EDEFAULT.equals(strength);
			case SimplemioModelPackage.ACTION__ACTION_NAME:
				return ACTION_NAME_EDEFAULT == null ? actionName != null : !ACTION_NAME_EDEFAULT.equals(actionName);
			case SimplemioModelPackage.ACTION__ACTION_SPECIFIER:
				return ACTION_SPECIFIER_EDEFAULT == null ? actionSpecifier != null : !ACTION_SPECIFIER_EDEFAULT.equals(actionSpecifier);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (strength: ");
		result.append(strength);
		result.append(", actionName: ");
		result.append(actionName);
		result.append(", actionSpecifier: ");
		result.append(actionSpecifier);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
