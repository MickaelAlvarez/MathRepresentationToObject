package fr.mickmouette.representation;

import fr.mickmouette.core.elements.IEquation;
import fr.mickmouette.core.elements.generated.BinaryOperator;
import fr.mickmouette.core.elements.representation.BinaryOperatorRepresentation;
import fr.mickmouette.generated.Exponent;

public abstract class ExponentRepresentation<V> extends BinaryOperatorRepresentation<V> {
	protected abstract Exponent<V> buildExponent(IEquation<V> leftEq, IEquation<V> rightEq);
	
	@Override
	public int getPriority() {
		return 6;
	}

	@Override
	protected BinaryOperator<V> build(IEquation<V> leftEq, IEquation<V> rightEq) {
		return buildExponent(leftEq, rightEq);
	}

}
