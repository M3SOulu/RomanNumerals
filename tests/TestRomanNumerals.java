import static org.junit.Assert.*;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class TestRomanNumerals {

	@Test
	public void convertDecimalinPositive() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("III");
		assertEquals(3, rm.convertI());
	}
	
	@Test
	public void convertDecimalinNegative() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("IV");
		assertEquals(-1, rm.convertI());
		
	}
	
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertDecimalNegativeFalse() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("GH");
	}
	
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertDecimalNegativeFalse2() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("IIII");
		assertEquals(2, rm.convertI());
	}
	

}
