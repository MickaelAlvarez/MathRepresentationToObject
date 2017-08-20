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
import fr.mickmouette.generated.Exponent;
import fr.mickmouette.representation.ExponentRepresentation;

public class ExponentTest {
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
	public void exponentRepresentationShouldBeConvertedIntoAnExponent() {
		ExponentRepresentation<Void> exponentRepresentation = new ExponentRepresentation<Void>() {
			
			@Override
			protected Exponent<Void> buildExponent(IEquation<Void> leftEq, IEquation<Void> rightEq) {
				return Mockito.mock(Exponent.class);
			}
		};
		
		try {
			assertTrue(exponentRepresentation.convert(INPUT) instanceof Exponent<?>);
		} catch (ConvertionException e) {
			fail();
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testExponentPriority() {
		int EXPECTED = 6;
		
		ExponentRepresentation<Void> exponentRepresentation = new ExponentRepresentation<Void>() {
			
			@Override
			protected Exponent<Void> buildExponent(IEquation<Void> leftEq, IEquation<Void> rightEq) {
				return Mockito.mock(Exponent.class);
			}
		};
		
		assertEquals(EXPECTED, exponentRepresentation.getPriority());
	}
}
