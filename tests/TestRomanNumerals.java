import static org.junit.Assert.*;


import org.junit.Test;

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
	public void testFalseCharactersI(){
		String romanNum = "IIII";
		boolean result = roman.checkCharacters(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersX(){
		String romanNum = "XXXX";
		boolean result = roman.checkCharacters(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersC(){
		String romanNum = "CCCC";
		boolean result = roman.checkCharacters(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersV(){
		String romanNum = "VV";
		boolean result = roman.checkCharacters(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersL(){
		String romanNum = "LL";
		boolean result = roman.checkCharacters(romanNum);
		assertEquals(false, result);
	}
	
	@Test
	public void testFalseCharactersD(){
		String romanNum = "DD";
		boolean result = roman.checkCharacters(romanNum);
		assertEquals(false, result);
	}

}
