import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals romNum;

	@Before
	public void createNewRomanNum(){
		romNum = new RomanNumerals();
	}
	
	@Test
	public void testconvertToIntegerNumberI() {
		Assert.assertEquals(1, romNum.convertToInteger());
	}
	
	@Test
	public void testconvertToIntegerNumberII() {
		romNum.setRomanNum("II");
		Assert.assertEquals(2, romNum.convertToInteger());
	}
	
	@Test
	public void testconvertToIntegerNumberVII() {
		romNum.setRomanNum("VII");
		Assert.assertEquals(7, romNum.convertToInteger());
	}
	
	@Test
	public void testconvertToIntegerNumberIIX() {
		romNum.setRomanNum("IX");
		Assert.assertEquals(9, romNum.convertToInteger());
	}

}
