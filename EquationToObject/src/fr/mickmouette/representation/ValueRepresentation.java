package fr.mickmouette.representation;

import fr.mickmouette.core.elements.exception.DontHaveAValueException;
import fr.mickmouette.core.elements.representation.ValueOperatorRepresentation;

public abstract class ValueRepresentation<V> extends ValueOperatorRepresentation<V> {

	public ValueRepresentation(V value) {
		super(value);
	}

	@Override
	public V getValue() throws DontHaveAValueException {
		return value;
	}

}
