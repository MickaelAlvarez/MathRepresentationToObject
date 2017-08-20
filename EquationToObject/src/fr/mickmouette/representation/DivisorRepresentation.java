package fr.mickmouette.representation;

import fr.mickmouette.core.elements.IEquation;
import fr.mickmouette.core.elements.generated.BinaryOperator;
import fr.mickmouette.core.elements.representation.BinaryOperatorRepresentation;
import fr.mickmouette.generated.Divisor;

public abstract class DivisorRepresentation<V> extends BinaryOperatorRepresentation<V> {
	protected abstract Divisor<V> buildDivisor(IEquation<V> leftEq, IEquation<V> rightEq);
	
	@Override
	public int getPriority() {
		return 4;
	}

	@Override
	protected BinaryOperator<V> build(IEquation<V> leftEq, IEquation<V> rightEq) {
		return buildDivisor(leftEq, rightEq);
	}

}
