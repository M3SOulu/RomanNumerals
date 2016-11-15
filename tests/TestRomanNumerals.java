import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestRomanNumerals {
	
	private RomanNumerals roman;
	
	@Before
	public void setUp() {
		
		this.roman=new RomanNumerals();
		
	}
	
	@Test 
	public void singleCharTest(){
		
		Assert.assertEquals(1,roman.convertToInteger("I"));
		Assert.assertEquals(5,roman.convertToInteger("V"));
		Assert.assertEquals(10,roman.convertToInteger("X"));
		Assert.assertEquals(50,roman.convertToInteger("L"));
		Assert.assertEquals(100,roman.convertToInteger("C"));
		Assert.assertEquals(500,roman.convertToInteger("D"));
		Assert.assertEquals(1000,roman.convertToInteger("M"));
		
	}
	
	@Test
	public void minorPrevChar(){
		
		Assert.assertEquals(4,roman.convertToInteger("IV"));
		Assert.assertEquals(9,roman.convertToInteger("IX"));
		Assert.assertEquals(40,roman.convertToInteger("XL"));
		Assert.assertEquals(90,roman.convertToInteger("XC"));
		Assert.assertEquals(400,roman.convertToInteger("CD"));
		Assert.assertEquals(900,roman.convertToInteger("CM"));
	}
	
	@Test
	public void countMatchesTest(){
		
		Assert.assertEquals(RomanNumerals.countMatches("CCC", "M"),0);
		Assert.assertEquals(RomanNumerals.countMatches("MCMQMMPMMM", "M"),7);
	}
	
	@Test
	public void checkForFirstRuleTest(){
		
		Assert.assertTrue(roman.checkForFirstRule("XCCMMM"));
		Assert.assertFalse(roman.checkForFirstRule("IIIICMM"));
		Assert.assertFalse(roman.checkForFirstRule("XXIMXX"));
		Assert.assertFalse(roman.checkForFirstRule("CCCIXXC"));
		Assert.assertFalse(roman.checkForFirstRule("IIXXXMMMM"));
	}
	
	@Test
	public void checkForThirdRuleTest(){
		
		Assert.assertFalse(roman.checkForFirstRule("IL"));

	}

}
