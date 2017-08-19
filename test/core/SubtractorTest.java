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
import fr.mickmouette.generated.Subtractor;
import fr.mickmouette.representation.SubtractorRepresentation;

public class SubtractorTest {
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
	public void subtractorRepresentationShouldBeConvertedIntoASubtractor() {
		SubtractorRepresentation<Void> subtractorRepresentation = new SubtractorRepresentation<Void>() {

			@Override
			protected Subtractor<Void> buildSubtractor(IEquation<Void> leftEq, IEquation<Void> rightEq) {
				return Mockito.mock(Subtractor.class);
			}
			
		};
		
		try {
			assertTrue(subtractorRepresentation.convert(INPUT) instanceof Subtractor<?>);
		} catch (ConvertionException e) {
			fail();
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testSubtractorRepresentationPriority() {
		int EXPECTED = 2;
		
		SubtractorRepresentation<Void> subtractorRepresentation = new SubtractorRepresentation<Void>() {

			@Override
			protected Subtractor<Void> buildSubtractor(IEquation<Void> leftEq, IEquation<Void> rightEq) {
				return Mockito.mock(Subtractor.class);
			}
			
		};
		
		assertEquals(EXPECTED, subtractorRepresentation.getPriority());
	}
}
