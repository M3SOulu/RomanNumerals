import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCovertIntegerToRoman {
	RomanNumerals romNum;

	@Before
	public void createNewRomanNum(){
		romNum = new RomanNumerals();
	}
	
	@Test
	public void testconvertToIntegerNumberOne() {
		Assert.assertEquals("I", romNum.convertToRomanNumeral());
	}
	
	@Test
	public void testconvertToIntegerNumberTwo() {
		romNum.setDecimalNum(2);
		Assert.assertEquals("II", romNum.convertToRomanNumeral());
	}
	
	@Test
	public void testconvertToIntegerNumberSeven() {
		romNum.setDecimalNum(7);
		Assert.assertEquals("VII", romNum.convertToRomanNumeral());
	}
	
	@Test
	public void testconvertToIntegerNumberNine() {
		romNum.setDecimalNum(9);
		Assert.assertEquals("IX", romNum.convertToRomanNumeral());
	}
	
	@Test
	public void testconvertToIntegerABigNumber() {
		romNum.setDecimalNum(1808);
		Assert.assertEquals("MDCCCVIII", romNum.convertToRomanNumeral());
	}
}
