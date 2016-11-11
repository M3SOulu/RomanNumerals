import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {
	String romanNum;
	
	@Before
	public void setUp(){
		romanNum = "";
	}

	@Test
	public void  test() throws TooMuchEqualLettersInARowException{
		//Arrange
		romanNum = "MCMLXXXIV";
		//Act
		int number = RomanNumerals.convertToInteger(romanNum);
		//Assert
		assertTrue(number == 1984);
	}

}
