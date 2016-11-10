import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class TestRomanNumerals {

	@Before
	public void setUp() throws Exception {
		RomanNumerals roman = new RomanNumerals();
	}
	
	@Test(expected = controlRepeatedIXCMymbolsException.class )
	public void testConvertRomanToInteger() throws controlRepeatedIXCMymbolsException, controlRepeatedVLDSymbolsException{
		//Arrange
		RomanNumerals roman = new RomanNumerals();
		//Act
		int r = roman.convertToInteger("XXX");
		//Assert
		assertEquals(30,r);
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
