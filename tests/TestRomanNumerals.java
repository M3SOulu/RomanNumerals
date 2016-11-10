import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void convertRomanToIntegerTest() {
		//Arrange
		RomanNumerals roman = new RomanNumerals();
		//Act
		int r = roman.convertToInteger("XX");
		//Assert
		assertEquals(20,r);
	}
	
	@Test
	public void repeatedIXCMSymbolsTest() {
		//Arrange
		RomanNumerals roman = new RomanNumerals();
		//Act
		boolean result =roman.controlRepeatedIXCMymbols("XXXX");
		//Assert
		assertEquals(false, result);
	}
	
	@Test
	public void repeatedVLDSymbolsTest() {
		//Arrange
		RomanNumerals roman = new RomanNumerals();
		//Act
		boolean result =roman.controlRepeatedVLDSymbols("VV");
		//Assert
		assertEquals(false, result);
	}


}
