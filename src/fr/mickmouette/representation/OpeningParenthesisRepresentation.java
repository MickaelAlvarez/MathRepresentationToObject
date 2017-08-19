package fr.mickmouette.representation;

import fr.mickmouette.core.elements.representation.BlockStartOperatorRepresentation;

public class OpeningParenthesisRepresentation<V> extends BlockStartOperatorRepresentation<V> {

	@Override
	public int getPriority() {
		return 1;
	}

}
