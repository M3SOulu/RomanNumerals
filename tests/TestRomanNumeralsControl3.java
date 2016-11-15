import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumeralsControl3 {
	RomanNumerals r;

	@Before
	public void setUp()
	{
		r = new RomanNumerals();
	}
	
	@Test
	public void testControl3GoodSubIV() throws InvalidRomanNumberException{
		assertEquals( true, r.control3( "IV" ) );
	}

	@Test
	public void testControl3GoodSubIX() throws InvalidRomanNumberException{
		assertEquals( true, r.control3( "IX" ) );
	}

	@Test(expected = InvalidRomanNumberException.class)
	public void testControl3InvalidSubIL() throws InvalidRomanNumberException{
		r.convertToInteger( "IL" );
	}

	@Test
	public void testControl3GoodSubXL() throws InvalidRomanNumberException{
		assertEquals( true, r.control3( "XL" ) );
	}

	@Test
	public void testControl3GoodSubXC() throws InvalidRomanNumberException{
		assertEquals( true, r.control3( "XC" ) );
	}

	@Test(expected = InvalidRomanNumberException.class)
	public void testControl3InvalidSubXD() throws InvalidRomanNumberException{
		r.convertToInteger( "XD" );
	}

	@Test
	public void testControl3GoodSubCD() throws InvalidRomanNumberException{
		assertEquals( true, r.control3( "CD" ) );
	}

	@Test
	public void testControl3GoodSubCM() throws InvalidRomanNumberException{
		assertEquals( true, r.control3( "CM" ) );
	}

}
