import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

public class TestRomanNumerals {
	RomanNumerals r;
	
	@Before
	public void setUp()
	{
		r = new RomanNumerals();
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testIsRoman() throws InvalidRomanNumberException{
		r.convertToInteger( "XX9VII" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testIsCorrectRomanI() throws InvalidRomanNumberException{
		r.convertToInteger( "IIII" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testIsCorrectRomanX() throws InvalidRomanNumberException{
		r.convertToInteger( "XXXX" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testIsCorrectRomanC() throws InvalidRomanNumberException{
		r.convertToInteger( "CCCC" );
	}

	@Test(expected = InvalidRomanNumberException.class)
	public void testIsCorrectRomanM() throws InvalidRomanNumberException{
		r.convertToInteger( "MMMM" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testIsCorrectRomanV() throws InvalidRomanNumberException{
		r.convertToInteger( "VV" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testIsCorrectRomanL() throws InvalidRomanNumberException{
		r.convertToInteger( "LL" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testIsCorrectRomanD() throws InvalidRomanNumberException{
		r.convertToInteger( "DD" );
	}
}
