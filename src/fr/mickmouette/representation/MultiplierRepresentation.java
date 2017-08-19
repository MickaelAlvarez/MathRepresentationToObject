package fr.mickmouette.representation;

import fr.mickmouette.core.elements.IEquation;
import fr.mickmouette.core.elements.generated.BinaryOperator;
import fr.mickmouette.core.elements.representation.BinaryOperatorRepresentation;
import fr.mickmouette.generated.Multiplier;

public abstract class MultiplierRepresentation<V> extends BinaryOperatorRepresentation<V> {
	protected abstract Multiplier<V> buildMultiplier(IEquation<V> leftEq, IEquation<V> rightEq);
	
	@Override
	public int getPriority() {
		return 4;
	}

	@Override
	protected BinaryOperator<V> build(IEquation<V> leftEq, IEquation<V> rightEq) {
		return buildMultiplier(leftEq, rightEq);
	}

}
