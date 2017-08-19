package fr.mickmouette.generated;

import fr.mickmouette.core.elements.IEquation;
import fr.mickmouette.core.elements.generated.BinaryOperator;

public abstract class Subtractor<V> extends BinaryOperator<V> {

	public Subtractor(IEquation<V> leftOperand, IEquation<V> rightOperand) {
		super(leftOperand, rightOperand);
	}

}
