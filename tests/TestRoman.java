import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRoman {

	private RomanNumerals number;
	
	@Before
	public void setUp(){
		number=new RomanNumerals();
	}
	
	@Test
	public void test_of_simple_numbers() throws RowException, VLDrepeatedException, IXCsubException, VLDsubException, moreOneSubException {
		Assert.assertEquals(1, number.convertToInteger("I"));
		Assert.assertEquals(5, number.convertToInteger("V"));
		Assert.assertEquals(10, number.convertToInteger("X"));
		Assert.assertEquals(50, number.convertToInteger("L"));
		Assert.assertEquals(100, number.convertToInteger("C"));
		Assert.assertEquals(500, number.convertToInteger("D"));
		Assert.assertEquals(1000, number.convertToInteger("M"));
		
	}
	
	@Test
	public void test_of_complex_numbers() throws RowException, VLDrepeatedException, IXCsubException, VLDsubException, moreOneSubException {
		Assert.assertEquals(1984, number.convertToInteger("MCMLXXXIV"));
		Assert.assertEquals(2014, number.convertToInteger("MMXIV"));
		Assert.assertEquals(549, number.convertToInteger("DXLIX"));
		Assert.assertEquals(937, number.convertToInteger("CMXXXVII"));
		Assert.assertEquals(1514, number.convertToInteger("MDXIV"));
		
	}

}
