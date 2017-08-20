package fr.mickmouette.representation;

import fr.mickmouette.core.elements.representation.BlockEndOperatorRepresentation;

public class ClosingParenthesisRepresentation<V> extends BlockEndOperatorRepresentation<V> {

	@Override
	public int getPriority() {
		return 1;
	}

}
