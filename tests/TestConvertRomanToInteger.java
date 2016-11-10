import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestConvertRomanToInteger {
	RomanNumerals romNum;

	@Before
	public void createNewRomanNum(){
		romNum = new RomanNumerals();
	}
	
	@Test
	public void testconvertToIntegerNumberI() throws InvalidRomanNumberException {
		Assert.assertEquals(1, romNum.convertToInteger());
	}
	
	@Test
	public void testconvertToIntegerNumberII() throws InvalidRomanNumberException {
		romNum.setRomanNum("II");
		Assert.assertEquals(2, romNum.convertToInteger());
	}
	
	@Test
	public void testconvertToIntegerNumberVII() throws InvalidRomanNumberException {
		romNum.setRomanNum("VII");
		Assert.assertEquals(7, romNum.convertToInteger());
	}
	
	@Test
	public void testconvertToIntegerNumberIIX() throws InvalidRomanNumberException {
		romNum.setRomanNum("IX");
		Assert.assertEquals(9, romNum.convertToInteger());
	}
	
	@Test
	public void testconvertToIntegerNumberMDCCCVIII() throws InvalidRomanNumberException {
		romNum.setRomanNum("MDCCCVIII");
		Assert.assertEquals(1808, romNum.convertToInteger());
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testconvertToIntegerNumberInvalidRomanNumber() throws InvalidRomanNumberException {
		romNum.setRomanNum("CCD");
		romNum.convertToInteger();
	}

}
