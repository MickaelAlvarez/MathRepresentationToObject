package fr.mickmouette.representation;

import fr.mickmouette.core.elements.IEquation;
import fr.mickmouette.core.elements.generated.BinaryOperator;
import fr.mickmouette.core.elements.representation.BinaryOperatorRepresentation;
import fr.mickmouette.generated.Subtractor;

public abstract class SubtractorRepresentation<V> extends BinaryOperatorRepresentation<V> {
	protected abstract Subtractor<V> buildSubtractor(IEquation<V> leftEq, IEquation<V> rightEq);
	
	@Override
	public int getPriority() {
		return 2;
	}

	@Override
	protected BinaryOperator<V> build(IEquation<V> leftEq, IEquation<V> rightEq) {
		return buildSubtractor(leftEq, rightEq);
	}

}
