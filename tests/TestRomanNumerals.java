
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {

	private RomanNumerals number;
	
	@Before
	public void setUp(){
		number=new RomanNumerals();
	}
	
	@Test
	public void test_of_number(){
		Assert.assertEquals(1984,number.converter("MCMLXXXIV"));
		Assert.assertEquals(1,number.converter("I"));
		Assert.assertEquals(10,number.converter("X"));
		Assert.assertEquals(1000,number.converter("M"));
		Assert.assertEquals(50,number.converter("L"));
		Assert.assertEquals(500,number.converter("D"));
		Assert.assertEquals(100,number.converter("C"));
	}
	
	@Test
	public void test_of_row_condition(){
		Assert.assertFalse(number.stringContainRow("III"));
		Assert.assertTrue(number.stringContainRow("IIII"));
		Assert.assertFalse(number.stringContainRow("XIII"));
		Assert.assertTrue(number.stringContainRow("XXIIII"));
		Assert.assertFalse(number.stringContainRow("XXX"));
		Assert.assertTrue(number.stringContainRow("CCCC"));
		Assert.assertFalse(number.stringContainRow("XMMM"));
		Assert.assertFalse(number.stringContainRow("MCMLXXXIV"));
	}
	
	@Test
	public void test_of_VLDrepeated_condition(){
		Assert.assertFalse(number.stringVLDrepeated("VLD"));
		Assert.assertTrue(number.stringVLDrepeated("VV"));
		Assert.assertFalse(number.stringVLDrepeated("D"));
		Assert.assertTrue(number.stringVLDrepeated("VVD"));
		Assert.assertTrue(number.stringVLDrepeated("VLL"));
		Assert.assertFalse(number.stringVLDrepeated("VLX"));
		Assert.assertFalse(number.stringVLDrepeated("MCMLXXXIV"));
		
	}
	
	@Test
	public void test_of_IXCsub_condition(){
		Assert.assertTrue(number.stringIXCsubs("IM"));
		Assert.assertFalse(number.stringIXCsubs("IX"));
		Assert.assertFalse(number.stringIXCsubs("IV"));
		Assert.assertFalse(number.stringIXCsubs("CD"));
		Assert.assertFalse(number.stringIXCsubs("CM"));
		Assert.assertTrue(number.stringIXCsubs("XM"));
		Assert.assertFalse(number.stringIXCsubs("XC"));
		Assert.assertFalse(number.stringIXCsubs("XL"));
		Assert.assertFalse(number.stringIXCsubs("MCMLXXXIV"));
	}
	
	@Test
	public void test_of_moreOneSub_condition(){
		Assert.assertTrue(number.moreOneSub("XXC"));
		Assert.assertFalse(number.moreOneSub("IX"));
		Assert.assertTrue(number.moreOneSub("IIX"));
		Assert.assertFalse(number.moreOneSub("IX"));
		Assert.assertTrue(number.moreOneSub("VVC"));
		Assert.assertFalse(number.moreOneSub("VX"));
		Assert.assertFalse(number.moreOneSub("MCMLXXXIV"));
		
	}
	
	@Test
	public void test_of_VLDneverSub_condition(){
		Assert.assertTrue(number.stringVLDneverSub("VX"));
		Assert.assertFalse(number.stringVLDneverSub("XV"));
		Assert.assertTrue(number.stringVLDneverSub("LC"));
		Assert.assertFalse(number.stringVLDneverSub("CL"));
		Assert.assertTrue(number.stringVLDneverSub("DM"));
		Assert.assertFalse(number.stringVLDneverSub("MD"));
		Assert.assertFalse(number.stringVLDneverSub("MCMLXXXIV"));
	}
	
	
}
