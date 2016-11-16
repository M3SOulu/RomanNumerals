import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumeralsControl5 {
	RomanNumerals r;

	@Before
	public void setUp()
	{
		r = new RomanNumerals();
	}

	@Test
	public void testControl5VCantBeSubtracted(){
		assertEquals( false, r.control5( "VX" ) );
	}
	
	@Test
	public void testControl5LCantBeSubtracted(){
		assertEquals( false, r.control5( "LC" ) );
	}
	
	@Test
	public void testControl5DCantBeSubtracted(){
		assertEquals( false, r.control5( "DM" ) );
	}
	
	@Test
	public void testControl5DCorrectSub(){
		assertEquals( true, r.control5( "IV" ) );
	}

	@Test
	public void testControl5NoSub(){
		assertEquals( true, r.control5( "D" ) );
	}

}
