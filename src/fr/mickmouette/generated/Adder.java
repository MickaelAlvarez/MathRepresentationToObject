package fr.mickmouette.generated;

import fr.mickmouette.core.elements.IEquation;
import fr.mickmouette.core.elements.generated.BinaryOperator;

public abstract class Adder<V> extends BinaryOperator<V> {

	public Adder(IEquation<V> leftOperand, IEquation<V> rightOperand) {
		super(leftOperand, rightOperand);
	}

}
