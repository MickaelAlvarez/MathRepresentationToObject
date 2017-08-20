package core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import fr.mickmouette.core.elements.IEquation;
import fr.mickmouette.core.elements.exception.convertion.ConvertionException;
import fr.mickmouette.core.elements.representation.IElementRepresentation;
import fr.mickmouette.generated.Divisor;
import fr.mickmouette.representation.DivisorRepresentation;

public class DivisorTest {
	public static ArrayList<IElementRepresentation<Void>> INPUT;
	
	@SuppressWarnings("unchecked")
	@BeforeClass
	public static void setUpClass() {
		INPUT = new ArrayList<IElementRepresentation<Void>>();
		INPUT.add(Mockito.mock(IElementRepresentation.class));
		INPUT.add(Mockito.mock(IElementRepresentation.class));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void divisorRepresentationShouldBeConvertedIntoADivisor() {
		DivisorRepresentation<Void> divisorRepresentation = new DivisorRepresentation<Void>() {
			@Override
			protected Divisor<Void> buildDivisor(IEquation<Void> leftEq, IEquation<Void> rightEq) {
				return Mockito.mock(Divisor.class);
			}
		};
		
		try {
			assertTrue(divisorRepresentation.convert(INPUT) instanceof Divisor<?>);
		} catch (ConvertionException e) {
			fail();
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testDivisorRepresentationPriority() {
		int EXPECTED = 4;
		
		DivisorRepresentation<Void> divisorRepresentation = new DivisorRepresentation<Void>() {
			@Override
			protected Divisor<Void> buildDivisor(IEquation<Void> leftEq, IEquation<Void> rightEq) {
				return Mockito.mock(Divisor.class);
			}
		};
		
		assertEquals(EXPECTED, divisorRepresentation.getPriority());
	}
}
