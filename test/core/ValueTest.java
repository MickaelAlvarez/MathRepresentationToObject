package core;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.mickmouette.core.elements.exception.DontHaveAValueException;
import fr.mickmouette.core.elements.exception.convertion.ConvertionException;
import fr.mickmouette.core.elements.generated.ValueOperator;
import fr.mickmouette.representation.ValueRepresentation;

public class ValueTest {

	@Test
	public void valueRepresentationShouldBeConvertedIntoAValueOperator() {
		ValueRepresentation<Void> valueRepresentation = new ValueRepresentation<Void>(null) {

			@Override
			protected ValueOperator<Void> build() {
				return new ValueOperator<Void>(value) {
					@Override
					public Void apply() {
						return null;
					}
				};
			}
			
		};
		
		try {
			assertTrue(valueRepresentation.convert(null) instanceof ValueOperator<?>);
		} catch (ConvertionException e) {
			fail();
		}
	}
	
	@Test
	public void valueRepresentationShouldReturnItValue() {
		int EXPECTED = 42;
		ValueRepresentation<Integer> valueRepresentation = new ValueRepresentation<Integer>(EXPECTED) {
			@Override
			protected ValueOperator<Integer> build() {
				return new ValueOperator<Integer>(value) {
					@Override
					public Integer apply() {
						return null;
					}
				};
			}
		};
		
		try {
			assertEquals(EXPECTED, valueRepresentation.getValue().intValue());
		} catch (DontHaveAValueException e) {
			fail();
		}
	}
	
}
