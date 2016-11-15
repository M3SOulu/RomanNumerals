import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

public class TestRomanNumeralsControl1 {
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
	
	
	
	
	
	
	
	
	
}
