import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class TestRomanNumerals {
	
	int num=0;
	
	@Before
	public void setUp() throws Exception {
		
		num = new RomanNumerals().convertToInteger("MCMLXXXIV");
	}


	@Test
	public void ConversionNumber() {
		//Assertion
		assertEquals(1984, num);
		
		
	}
	
	@Test(expected = illegalOccourenceLetter.class)
	public void ExceptionillegalOccourenceLetterM() throws illegalOccourenceLetter {
		new RomanNumerals().convertToInteger("MMMMCMLXXXIV");
	}
	
	@Test(expected = illegalOccourenceLetter.class)
	public void ExceptionillegalOccourenceLetterI() throws illegalOccourenceLetter {
		new RomanNumerals().convertToInteger("MCMLXXXIIIIV");
	}
	@Test(expected = illegalOccourenceLetter.class)
	public void ExceptionillegalOccourenceLetterX() throws illegalOccourenceLetter {
		new RomanNumerals().convertToInteger("MCMLXXXXIV");
	}
	@Test(expected = illegalOccourenceLetter.class)
	public void ExceptionillegalOccourenceLetterC() throws illegalOccourenceLetter {
		new RomanNumerals().convertToInteger("MCCCCMLXXXIV");
	}

}
