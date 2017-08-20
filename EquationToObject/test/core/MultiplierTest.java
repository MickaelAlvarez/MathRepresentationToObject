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
import fr.mickmouette.generated.Multiplier;
import fr.mickmouette.representation.MultiplierRepresentation;

public class MultiplierTest {
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
	public void multiplierRepresentationShouldBeConvertedIntoAMultilpier() {
		MultiplierRepresentation<Void> multiplierRepresentation = new MultiplierRepresentation<Void>() {
			@Override
			protected Multiplier<Void> buildMultiplier(IEquation<Void> leftEq, IEquation<Void> rightEq) {
				return Mockito.mock(Multiplier.class);
			}
		};
		
		try {
			assertTrue(multiplierRepresentation.convert(INPUT) instanceof Multiplier<?>);
		} catch (ConvertionException e) {
			fail();
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testMultiplierRepresentationPriority() {
		int EXPECTED = 4;
				
		MultiplierRepresentation<Void> multiplierRepresentation = new MultiplierRepresentation<Void>() {
			@Override
			protected Multiplier<Void> buildMultiplier(IEquation<Void> leftEq, IEquation<Void> rightEq) {
				return Mockito.mock(Multiplier.class);
			}
		};
		
		assertEquals(EXPECTED, multiplierRepresentation.getPriority());
	}
}
