/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Injector;

import simplemioModel.SimplemioModelPackage;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SimpleMioStandaloneSetup extends SimpleMioStandaloneSetupGenerated {

	public static void doSetup() {
		new SimpleMioStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("simplemio")) {
			EPackage.Registry.INSTANCE.put("simplemio", SimplemioModelPackage.eINSTANCE);
		}
		super.register(injector);
	}
}
