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
	
	@Test
	public void testIsNotRoman(){
		assertEquals( false, r.isRoman( "9" ) );
	}
	
	
	@Test
	public void testControl1Max3I(){
		assertEquals( false, r.control1( "IIII" ) );
	}
	
	@Test
	public void testControl1Max3X(){
		assertEquals( false, r.control1( "XXXX" ) );
	}
	
	@Test
	public void testControl1Max3C(){
		assertEquals( false, r.control1( "CCCC" ) );
	}

	@Test
	public void testControl1Max3M(){
		assertEquals( false, r.control1( "MMMM" ) );
	}
	
	@Test
	public void testControl1Positive(){
		assertEquals( true, r.control1( "III" ) );
	}
	
	
	
	
	
	
	
	
	
}
