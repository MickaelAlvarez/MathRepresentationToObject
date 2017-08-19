package fr.mickmouette.representation;

import fr.mickmouette.core.elements.IEquation;
import fr.mickmouette.core.elements.generated.BinaryOperator;
import fr.mickmouette.core.elements.representation.BinaryOperatorRepresentation;
import fr.mickmouette.generated.Adder;

public abstract class AdderRepresentation<V> extends BinaryOperatorRepresentation<V> {
	protected abstract Adder<V> buildAdder(IEquation<V> leftEq, IEquation<V> rightEq);
	
	@Override
	public int getPriority() {
		return 2;
	}

	@Override
	protected BinaryOperator<V> build(IEquation<V> leftEq, IEquation<V> rightEq) {
		return buildAdder(leftEq, rightEq);
	}

	

}
