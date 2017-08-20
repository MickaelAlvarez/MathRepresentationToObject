package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.mickmouette.representation.ClosingParenthesisRepresentation;

public class ClosingParenthesisTest {

	@Test
	public void testClosingParenthesisPriority() {
		int EXPECTED = 1;
		
		ClosingParenthesisRepresentation<Void> openingRepresentation = new ClosingParenthesisRepresentation<>();
		assertEquals(EXPECTED, openingRepresentation.getPriority());
	}
}
