package fr.mickmouette.generated;

import fr.mickmouette.core.elements.IEquation;
import fr.mickmouette.core.elements.generated.BinaryOperator;

public abstract class Multiplier<V> extends BinaryOperator<V> {

	public Multiplier(IEquation<V> leftOperand, IEquation<V> rightOperand) {
		super(leftOperand, rightOperand);
	}

}
