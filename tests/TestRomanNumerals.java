import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.IllegalCharacterException;
import exceptions.IllegalSubtractionException;
import exceptions.TooMuchEqualLettersInARowException;
import exceptions.TooMuchSymbolRepetitionsException;

public class TestRomanNumerals {
	

	@Test
	public void  testConversionOfValidString() throws TooMuchEqualLettersInARowException, IllegalCharacterException, TooMuchSymbolRepetitionsException, IllegalSubtractionException{
		//Act
		int number = RomanNumerals.convertToInteger("MCMLXXXIV");
		//Assert
		assertTrue(number == 1984);
	}
	
	@Test
	public void convertAnEmptyStringReturnsZero() throws IllegalCharacterException, TooMuchSymbolRepetitionsException, IllegalSubtractionException{
		assertEquals(0, RomanNumerals.convertToInteger(""));
	}
	
	@Test(expected = IllegalCharacterException.class)
	public void stringContainingAnIllegalCharactersShouldRiseAnException() throws IllegalCharacterException, TooMuchSymbolRepetitionsException, IllegalSubtractionException{
		//Act
		RomanNumerals.convertToInteger("BIV");
	}
	
	@Test(expected = IllegalSubtractionException.class)
	public void consecutiveSubtractionsShouldRiseAnException() throws IllegalCharacterException, TooMuchSymbolRepetitionsException, IllegalSubtractionException{
		//Act
		RomanNumerals.convertToInteger("IIV");
	}
	
	@Test(expected = IllegalSubtractionException.class)
	public void subtractingA1SymbolfromATooHighValueShouldRiseAnException() throws IllegalCharacterException, TooMuchSymbolRepetitionsException, IllegalSubtractionException{
		//Act
		RomanNumerals.convertToInteger("XM");
	}
	

}
