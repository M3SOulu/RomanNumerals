import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	String RomanNumber;
	
	@Before
	public void setUp(){
		RomanNumber =  "XX";
	}
	@Test
	
	public void TestRomanNumeralsq345() {
		//arrange
		String ten = "X";		
		//act
	
		//assert
		assertTrue("da decimale in romano", 10 == RomanNumerals.convertToInteger(ten));
	}

}
