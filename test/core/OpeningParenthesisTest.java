package core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.mickmouette.representation.OpeningParenthesisRepresentation;

public class OpeningParenthesisTest {

	@Test
	public void testOpeningParenthesisPriority() {
		int EXPECTED = 1;
		
		OpeningParenthesisRepresentation<Void> openingRepresentation = new OpeningParenthesisRepresentation<>();
		assertEquals(EXPECTED, openingRepresentation.getPriority());
	}
	
}
