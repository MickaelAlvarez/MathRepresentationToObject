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
import fr.mickmouette.generated.Adder;
import fr.mickmouette.representation.AdderRepresentation;

public class AdderTest {
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
	public void adderRepresentationShouldBeConvertedIntoAnAdder() {
		AdderRepresentation<Void> adderRepresentation = new AdderRepresentation<Void>() {

			@Override
			protected Adder<Void> buildAdder(IEquation<Void> leftEq, IEquation<Void> rightEq) {
				return Mockito.mock(Adder.class);
			}
			
		};
		
		try {
			assertTrue(adderRepresentation.convert(INPUT) instanceof Adder<?>);
		} catch (ConvertionException e) {
			fail();
		}
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testAdderRepresentationPriority() {
		int EXPECTED = 2;
		
		AdderRepresentation<Void> adderRepresentation = new AdderRepresentation<Void>() {

			@Override
			protected Adder<Void> buildAdder(IEquation<Void> leftEq, IEquation<Void> rightEq) {
				return Mockito.mock(Adder.class);
			}
			
		};
		
		assertEquals(EXPECTED, adderRepresentation.getPriority());
	}
	
}
