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
	
	@Test(expected = illegalOccourenceLetterIXCM.class)
	public void ExceptionillegalOccourenceLetterM() throws illegalOccourenceLetterIXCM, illegalOccourenceLetterVLD {
		new RomanNumerals().convertToInteger("MMMMCMLXXXIV");
		new RomanNumerals().convertToInteger("MMCMMLXXXIV");
	}
	
	@Test(expected = illegalOccourenceLetterIXCM.class)
	public void ExceptionillegalOccourenceLetterI() throws illegalOccourenceLetterIXCM, illegalOccourenceLetterVLD {
		new RomanNumerals().convertToInteger("MCMLXXXIIIIV");
	}
	@Test(expected = illegalOccourenceLetterIXCM.class)
	public void ExceptionillegalOccourenceLetterX() throws illegalOccourenceLetterIXCM, illegalOccourenceLetterVLD {
		new RomanNumerals().convertToInteger("MCMLXXXXIV");
	}
	@Test(expected = illegalOccourenceLetterIXCM.class)
	public void ExceptionillegalOccourenceLetterC() throws illegalOccourenceLetterIXCM, illegalOccourenceLetterVLD {
		new RomanNumerals().convertToInteger("MCCCCMLXXXIV");
	}
	
	@Test(expected = illegalOccourenceLetterVLD.class)
	public void ExceptionillegalOccourenceLetterV() throws illegalOccourenceLetterIXCM, illegalOccourenceLetterVLD {
		new RomanNumerals().convertToInteger("MCCMLXXXIVV");
	}
	
	@Test(expected = illegalOccourenceLetterVLD.class)
	public void ExceptionillegalOccourenceLetterL() throws illegalOccourenceLetterIXCM, illegalOccourenceLetterVLD {
		new RomanNumerals().convertToInteger("MCCMLLXXXIV");
	}
	
	@Test(expected = illegalOccourenceLetterVLD.class)
	public void ExceptionillegalOccourenceLetterD() throws illegalOccourenceLetterIXCM, illegalOccourenceLetterVLD {
		new RomanNumerals().convertToInteger("MCCMLDDXXXIV");
	}

}
