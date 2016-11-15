import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumeralsControl2 {
	RomanNumerals r;

	@Before
	public void setUp()
	{
		r = new RomanNumerals();
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testControl2Max1V() throws InvalidRomanNumberException{
		r.convertToInteger( "VV" );
	}

	@Test(expected = InvalidRomanNumberException.class)
	public void testControl2Max1L() throws InvalidRomanNumberException{
		r.convertToInteger( "LL" );
	}

	@Test(expected = InvalidRomanNumberException.class)
	public void testControl2Max1D() throws InvalidRomanNumberException{
		r.convertToInteger( "DD" );
	}

	@Test
	public void testControl2Positive(){
		assertEquals( true, r.control2( "D" ) );
	}

}
