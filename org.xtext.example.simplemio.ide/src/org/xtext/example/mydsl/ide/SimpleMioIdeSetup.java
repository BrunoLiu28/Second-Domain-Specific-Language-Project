/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.SimpleMioRuntimeModule;
import org.xtext.example.mydsl.SimpleMioStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class SimpleMioIdeSetup extends SimpleMioStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SimpleMioRuntimeModule(), new SimpleMioIdeModule()));
	}
	
}
