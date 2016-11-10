import static org.junit.Assert.*;


import org.junit.*;

public class TestRomanNumerals {

	int num =0;
	@Before
	public void setUp() throws Exception {
		num = new RomanNumerals().convertToInteger("MCMLXXXIV");
	}
	@Test
	public void testConvertToInteger() {
		assertEquals(1984, num );
	}

	@Test(expected = illegalOccurenceLetterException.class)
	public void testillegalOccurrenceLetterExceptionM() throws illegalOccurenceLetterException, illegalOccurenceLetterLVDException{
		new RomanNumerals().convertToInteger("MCMMMLXXXIV");
		
	}
	
	@Test(expected = illegalOccurenceLetterException.class)
	public void testillegalOccurrenceLetterExceptionI() throws illegalOccurenceLetterException, illegalOccurenceLetterLVDException{
		new RomanNumerals().convertToInteger("MCMLXXXIIIIV");
		
	}
	
	@Test(expected = illegalOccurenceLetterException.class)
	public void testillegalOccurrenceLetterExceptionX() throws illegalOccurenceLetterException, illegalOccurenceLetterLVDException{
		new RomanNumerals().convertToInteger("MCMLXXXXIV");
		
	}
	@Test (expected = illegalOccurenceLetterLVDException.class)
	public void testillegalOccurrenceLetterLVDException() throws illegalOccurenceLetterLVDException, illegalOccurenceLetterException{
		new RomanNumerals().convertToInteger("MCMLLXXXIV");
	}
	
	@Test(expected = illegalOccurenceLetterException.class)
	public void testillegalOccurrenceLetterExceptionC() throws illegalOccurenceLetterException, illegalOccurenceLetterLVDException{
		new RomanNumerals().convertToInteger("MCCCCMLXXXIV");
		
	}
}
