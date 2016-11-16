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
	
	@Test
	public void testControl2Max1V(){
		assertEquals( false, r.control2( "VV" ) );
	}

	@Test
	public void testControl2Max1L(){
		assertEquals( false, r.control2( "LL" ) );
	}

	@Test
	public void testControl2Max1D(){
		assertEquals( false, r.control2( "DD" ) );
	}

	@Test
	public void testControl2Positive(){
		assertEquals( true, r.control2( "D" ) );
	}

}
