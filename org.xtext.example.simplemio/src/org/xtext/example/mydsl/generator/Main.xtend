/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.generator

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.GeneratorDelegate
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import org.xtext.example.mydsl.SimpleMioStandaloneSetup

class Main {

	def static main(String[] args) {
		if (args.empty) {
			System::err.println('Aborting: no path to EMF resource provided!')
			return
		}
		val injector = new SimpleMioStandaloneSetup().createInjectorAndDoEMFRegistration
		val main = injector.getInstance(Main)
		main.runGenerator(args.get(0))
	}

	@Inject Provider<ResourceSet> resourceSetProvider

	@Inject IResourceValidator validator

	@Inject GeneratorDelegate generator

	@Inject JavaIoFileSystemAccess fileAccess

	def protected runGenerator(String string) {
		// Load the resource
		val set = resourceSetProvider.get
		val resource = set.getResource(URI.createFileURI(string), true)

		// Validate the resource
		val issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)
		if (!issues.empty) {
			issues.forEach[System.err.println(it)]
			return
		}

		// Configure and start the generator
		fileAccess.outputPath = 'src-gen/'
		val context = new GeneratorContext => [
			cancelIndicator = CancelIndicator.NullImpl
		]
		generator.generate(resource, fileAccess, context)
		System.out.println('Code generation finished.')
	}
}
