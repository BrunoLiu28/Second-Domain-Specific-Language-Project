/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import simplemioModel.Action;
import simplemioModel.Sensor;

/**
 * See
 * https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
public class SimpleMioProposalProvider extends AbstractSimpleMioProposalProvider {

	@Override
	public void completeSensor_SensorSpecifier(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		if (model instanceof Sensor) {
			Sensor sensor = (Sensor) model;
			String sensorName = sensor.getSensorName();
			if (sensorName != null) {
				switch (sensorName) {
				case "obstacle":
					acceptor.accept(createCompletionProposal("front", "front", null, context));
					acceptor.accept(createCompletionProposal("back", "back", null, context));
					acceptor.accept(createCompletionProposal("left", "left", null, context));
					acceptor.accept(createCompletionProposal("right", "right", null, context));
					break;
				case "line":
					acceptor.accept(createCompletionProposal("left", "left", null, context));
					acceptor.accept(createCompletionProposal("right", "right", null, context));
					break;
				case "button":
					acceptor.accept(createCompletionProposal("left", "left", null, context));
					acceptor.accept(createCompletionProposal("right", "right", null, context));
					acceptor.accept(createCompletionProposal("up", "up", null, context));
					acceptor.accept(createCompletionProposal("down", "down", null, context));
					acceptor.accept(createCompletionProposal("center", "center", null, context));
					break;
				}
			}
		}
	}

	@Override
	public void completeAction_ActionSpecifier(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (model instanceof Action) {
			Action action = (Action) model;
			String actionName = action.getActionName();
			if (actionName != null)
				switch (actionName) {
				case "move":
					acceptor.accept(createCompletionProposal("forward", "forward", null, context));
					acceptor.accept(createCompletionProposal("backward", "backward", null, context));
					acceptor.accept(createCompletionProposal("stop", "stop", null, context));
					break;
				case "led":
					acceptor.accept(createCompletionProposal("red", "red", null, context));
					acceptor.accept(createCompletionProposal("green", "green", null, context));
					acceptor.accept(createCompletionProposal("blue", "blue", null, context));
					break;
				case "turn":
					acceptor.accept(createCompletionProposal("left", "left", null, context));
					acceptor.accept(createCompletionProposal("right", "right", null, context));
					break;
				}
		}
	}

}
