import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.Assert;

public class TestRomanNumerals {
	
	private RomanNumerals roman;

	
	@Before
	public void setUp() {
		
		this.roman=new RomanNumerals();
		
	}
	
	@Test 
	public void singleCharTest() throws InvalidRomanNumeralsException{
		
		Assert.assertEquals(1,roman.convertToInteger("I"));
		Assert.assertEquals(5,roman.convertToInteger("V"));
		Assert.assertEquals(10,roman.convertToInteger("X"));
		Assert.assertEquals(50,roman.convertToInteger("L"));
		Assert.assertEquals(100,roman.convertToInteger("C"));
		Assert.assertEquals(500,roman.convertToInteger("D"));
		Assert.assertEquals(1000,roman.convertToInteger("M"));
		
	}
	
	@Test
	public void minorPrevChar() throws InvalidRomanNumeralsException{
		
		Assert.assertEquals(4,roman.convertToInteger("IV"));
		Assert.assertEquals(9,roman.convertToInteger("IX"));
		Assert.assertEquals(40,roman.convertToInteger("XL"));
		Assert.assertEquals(90,roman.convertToInteger("XC"));
		Assert.assertEquals(400,roman.convertToInteger("CD"));
		Assert.assertEquals(900,roman.convertToInteger("CM"));
	}
	
	@Test
	public void convertToIntegerTest() throws InvalidRomanNumeralsException{
		
		Assert.assertEquals(89,roman.convertToInteger("LXXXIX"));
		Assert.assertEquals(88,roman.convertToInteger("LXXXVIII"));
		Assert.assertEquals(999,roman.convertToInteger("CMXCIX"));
		Assert.assertEquals(3999,roman.convertToInteger("MMMCMXCIX"));
		Assert.assertEquals(898,roman.convertToInteger("DCCCXCVIII"));
		Assert.assertEquals(900,roman.convertToInteger("CM"));
	}
	
	@Test(expected=InvalidRomanNumeralsException.class)
	public void InvalidRomanNumeralsExceptionTest() throws InvalidRomanNumeralsException{
		
		roman.convertToInteger("XXXMMXMLP");
	}
	
	@Test
	public void checkForFirstRuleTest(){
		
		Assert.assertTrue(roman.checkForFirstRule("XCCMMM"));
		Assert.assertTrue(roman.checkForFirstRule("XXIMXX"));
		Assert.assertFalse(roman.checkForFirstRule("IIIICMM"));
		Assert.assertFalse(roman.checkForFirstRule("CCCCIXXC"));
		Assert.assertFalse(roman.checkForFirstRule("IIXXXMMMM"));
	}
	
	@Test
	public void checkForSecondRuleTest(){
		
		Assert.assertFalse(roman.checkForSecondRule("XXVVMQ"));
		Assert.assertFalse(roman.checkForSecondRule("LLDXM"));
		Assert.assertFalse(roman.checkForSecondRule("DDI"));
		
		
	}
	@Test
	public void checkForThirdRuleTest(){
		
		Assert.assertFalse(roman.checkForThirdRule("XXIXMQ"));
		Assert.assertFalse(roman.checkForThirdRule("XLDXM"));
		Assert.assertFalse(roman.checkForThirdRule("XIMLCII"));
		Assert.assertTrue(roman.checkForThirdRule("XXLLLI"));

	}
	
	@Test
	public void checkForFourthRuleTest(){
		
		Assert.assertTrue(roman.checkForFourthRule("IX"));
		Assert.assertTrue(roman.checkForFourthRule("XL"));
		Assert.assertTrue(roman.checkForFourthRule("XC"));
		Assert.assertFalse(roman.checkForFourthRule("IIX"));
		Assert.assertFalse(roman.checkForFourthRule("XXL"));
		Assert.assertFalse(roman.checkForFourthRule("CCM"));

	}
	
	@Test
	public void checkForFifthRuleTest(){
		
		Assert.assertFalse(roman.checkForFifthRule("XXVL"));
		Assert.assertFalse(roman.checkForFifthRule("IXVM"));
		Assert.assertFalse(roman.checkForFifthRule("MMDM"));
		Assert.assertFalse(roman.checkForFifthRule("LC"));
		Assert.assertTrue(roman.checkForFifthRule("CL"));

	}

}
