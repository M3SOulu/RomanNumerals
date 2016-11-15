import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {
	String romanNum;
	
	@Before
	public void setUp(){
		romanNum = "";
	}
	

	@Test
	public void  testConversionOfValidString() throws TooMuchEqualLettersInARowException, IllegalCharacterException, TooMuchSymbolRepetitionsException, IllegalSubtractionException{
		//Arrange
		romanNum = "MCMLXXXIV";
		//Act
		int number = RomanNumerals.convertToInteger(romanNum);
		//Assert
		assertTrue(number == 1984);
	}
	
	@Test
	public void convertAnEmptyStringReturnsZero() throws IllegalCharacterException, TooMuchSymbolRepetitionsException, IllegalSubtractionException{
		assertEquals(0, RomanNumerals.convertToInteger(romanNum));
	}
	
	@Test(expected = IllegalCharacterException.class)
	public void stringContainingAnIllegalCharactersShouldRiseAnException() throws IllegalCharacterException, TooMuchSymbolRepetitionsException, IllegalSubtractionException{
		//Arrange
		romanNum = "BIV";
		//Act
		RomanNumerals.convertToInteger(romanNum);
	}
	
	@Test
	public void test(){
		fail();
	}

}
