import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

public class TestRomanNumeralsControls {
	RomanNumerals r;
	
	@Before
	public void setUp()
	{
		r = new RomanNumerals();
	}
	
	@Test
	public void testIsRoman(){
		assertEquals(true, r.isRoman( "I" ));
		assertEquals(true, r.isRoman( "V" ));
		assertEquals(true, r.isRoman( "X" ));
		assertEquals(true, r.isRoman( "L" ));
		assertEquals(true, r.isRoman( "C" ));
		assertEquals(true, r.isRoman( "D" ));
		assertEquals(true, r.isRoman( "M" ));
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testIsNotRoman() throws InvalidRomanNumberException{
		r.convertToInteger( "9" );
	}
	
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testControl1Max3I() throws InvalidRomanNumberException{
		r.convertToInteger( "IIII" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testControl1Max3X() throws InvalidRomanNumberException{
		r.convertToInteger( "XXXX" );
	}
	
	@Test(expected = InvalidRomanNumberException.class)
	public void testControl1Max3C() throws InvalidRomanNumberException{
		r.convertToInteger( "CCCC" );
	}

	@Test(expected = InvalidRomanNumberException.class)
	public void testControl1Max3M() throws InvalidRomanNumberException{
		r.convertToInteger( "MMMM" );
	}
	
	@Test
	public void testControl1Positive(){
		assertEquals( true, r.control1( "III" ) );
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
