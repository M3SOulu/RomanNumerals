import static org.junit.Assert.*;


import org.junit.Test;

import eccezioni.*;

public class TestRomanNumerals {
	
	private int decimal;
	private String romanNum;
	private RomanNumerals roman = new RomanNumerals();

	@Test
	public void testTreeCharactersNumber() {
		String romanNum = "III";
		decimal = roman.convertToInteger(romanNum);
		assertEquals(3, decimal);
	}
	
	@Test
	public void testUltraThousandNumber(){
		String romanNum = "MMXIV";
		decimal = roman.convertToInteger(romanNum);
		assertEquals(2014, decimal);
	}
	
	@Test
	public void testDecimalNumber(){
		String romanNum = "XL";
		decimal = roman.convertToInteger(romanNum);
		assertEquals(40, decimal);
	}
	
	@Test
	public void testFalseCharactersI() throws ThreeCharactersException{
		String romanNum = "IIII";
		boolean result = roman.checkNoMoreThanThreeCharacters(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersX() throws ThreeCharactersException{
		String romanNum = "XXXX";
		boolean result = roman.checkNoMoreThanThreeCharacters(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersC() throws ThreeCharactersException{
		String romanNum = "CCCC";
		boolean result = roman.checkNoMoreThanThreeCharacters(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersM() throws ThreeCharactersException{
		String romanNum = "MMMMIX";
		boolean result = roman.checkNoMoreThanThreeCharacters(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersV() throws OneCharacterException{
		String romanNum = "VVXXIV";
		boolean result = roman.checkNoMoreThanOneCharacter(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersL() throws OneCharacterException{
		String romanNum = "LLCLXXXVIII";
		boolean result = roman.checkNoMoreThanOneCharacter(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersD() throws OneCharacterException{
		String romanNum = "DD";
		boolean result = roman.checkNoMoreThanOneCharacter(romanNum);
		assertEquals(false, result);
	}
	
	@Test(expected = InvalidSubtractionException.class)
	public void testFalseSubtractionCharacters() throws InvalidSubtractionException{
		String romanNum = "XM";
		boolean result = roman.subtractionFromTheTwoHighestValues(romanNum);
		assertNotEquals(990, result);
	}
	
	@Test
	public void testSubtractionCharacters() throws InvalidSubtractionException{
		String romanNum = "MCMXCIX";
		boolean result = roman.subtractionFromTheTwoHighestValues(romanNum);
		assertEquals(true, result);
	}
	
	@Test(expected = InvalidFiveSymbolSubtractionException.class)
	public void testFalseLSymbolSubtraction() throws InvalidFiveSymbolSubtractionException{
		String romanNum = "LCVII";
		boolean result = roman.noSubtractionWithFiveSymbols(romanNum);
		assertEquals(false, result);
	}
	
	@Test(expected = InvalidFiveSymbolSubtractionException.class)
	public void testFalseVSymbolSubtraction() throws InvalidFiveSymbolSubtractionException{
		String romanNum = "VXII";
		boolean result = roman.noSubtractionWithFiveSymbols(romanNum);
		assertEquals(false, result);
	}
	
	@Test(expected = InvalidFiveSymbolSubtractionException.class)
	public void testFalseDSymbolSubtraction() throws InvalidFiveSymbolSubtractionException{
		String romanNum = "DMCCCXXX";
		boolean result = roman.noSubtractionWithFiveSymbols(romanNum);
		assertEquals(false, result);
	}
	
	@Test(expected = InvalidSubtractionException.class)
	public void testFalseISubtractionCharacters() throws InvalidSubtractionException{
		String romanNum = "XXLIIIX";
		boolean result = roman.onlyOneSubtraction(romanNum);
		assertEquals(false, result);
	}


}
