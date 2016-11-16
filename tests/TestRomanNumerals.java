import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals r;

	@Before
	public void setUp()
	{
		r = new RomanNumerals();
	}

	@Test(expected = InvalidRomanNumberException.class)
	public void testIsNotRoman() throws InvalidRomanNumberException{
		r.convertToInteger( "9" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testControl1Fail() throws InvalidRomanNumberException{
		r.convertToInteger( "IIII" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testControl2Fail() throws InvalidRomanNumberException{
		r.convertToInteger( "VV" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testControl3Fail() throws InvalidRomanNumberException{
		r.convertToInteger( "IL" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testControl4Fail() throws InvalidRomanNumberException{
		r.convertToInteger( "XXC" );
	}

	@Test(expected = InvalidRomanNumberException.class)
	public void testControl5Fail() throws InvalidRomanNumberException{
		r.convertToInteger( "VX" );		
	}
	
	@Test
	public void testCorrectConvertFrom1To10()throws InvalidRomanNumberException{
		assertEquals( 1, r.convertToInteger( "I" ) );
		assertEquals( 2, r.convertToInteger( "II" ) );
		assertEquals( 3, r.convertToInteger( "III" ) );
		assertEquals( 4, r.convertToInteger( "IV" ) );
		assertEquals( 5, r.convertToInteger( "V" ) );
		assertEquals( 6, r.convertToInteger( "VI" ) );
		assertEquals( 7, r.convertToInteger( "VII" ) );
		assertEquals( 8, r.convertToInteger( "VIII" ) );
		assertEquals( 9, r.convertToInteger( "IX" ) );
		assertEquals( 10, r.convertToInteger( "X" ) );
	}
	
	@Test
	public void testCorrectConvertFrom20To100()throws InvalidRomanNumberException{
		assertEquals( 20, r.convertToInteger( "XX" ) );
		assertEquals( 30, r.convertToInteger( "XXX" ) );
		assertEquals( 40, r.convertToInteger( "XL" ) );
		assertEquals( 50, r.convertToInteger( "L" ) );
		assertEquals( 60, r.convertToInteger( "LX" ) );
		assertEquals( 70, r.convertToInteger( "LXX" ) );
		assertEquals( 80, r.convertToInteger( "LXXX" ) );
		assertEquals( 90, r.convertToInteger( "XC" ) );
		assertEquals( 100, r.convertToInteger( "C" ) );
	}
	
	@Test
	public void testCorrectConvertFrom200To1000()throws InvalidRomanNumberException{
		assertEquals( 200, r.convertToInteger( "CC" ) );
		assertEquals( 300, r.convertToInteger( "CCC" ) );
		assertEquals( 400, r.convertToInteger( "CD" ) );
		assertEquals( 500, r.convertToInteger( "D" ) );
		assertEquals( 600, r.convertToInteger( "DC" ) );
		assertEquals( 700, r.convertToInteger( "DCC" ) );
		assertEquals( 800, r.convertToInteger( "DCCC" ) );
		assertEquals( 900, r.convertToInteger( "CM" ) );
		assertEquals( 1000, r.convertToInteger( "M" ) );
	}
	
	@Test
	public void testCorrectConvert() throws InvalidRomanNumberException{
		assertEquals( 17, r.convertToInteger( "XVII" ) );
		assertEquals( 140, r.convertToInteger( "CXL" ) );
		assertEquals( 64, r.convertToInteger( "LXIV" ) );
		assertEquals( 127, r.convertToInteger( "CXXVII" ) );
		assertEquals( 729, r.convertToInteger( "DCCXXIX" ) );
		assertEquals( 1035, r.convertToInteger( "MXXXV" ) );
		assertEquals( 1719, r.convertToInteger( "MDCCXIX" ) );
		assertEquals( 1984, r.convertToInteger( "MCMLXXXIV" ) );
		assertEquals( 2014, r.convertToInteger( "MMXIV" ) );
	}
}
