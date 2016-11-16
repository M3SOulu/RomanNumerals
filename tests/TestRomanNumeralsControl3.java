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
	public void testControl3NoSub(){
		assertEquals( true, r.control3( "I" ) );
	}
	
	@Test
	public void testControl3GoodSubIV(){
		assertEquals( true, r.control3( "IV" ) );
	}

	@Test
	public void testControl3GoodSubIX(){
		assertEquals( true, r.control3( "IX" ) );
	}

	@Test
	public void testControl3InvalidSubIL(){
		assertEquals( false, r.control3( "IL" ) );
	}

	@Test
	public void testControl3GoodSubXL(){
		assertEquals( true, r.control3( "XL" ) );
	}

	@Test
	public void testControl3GoodSubXC(){
		assertEquals( true, r.control3( "XC" ) );
	}

	@Test
	public void testControl3InvalidSubXD(){
		assertEquals( false, r.control3( "XD" ) );
		
	}

	@Test
	public void testControl3GoodSubCD(){
		assertEquals( true, r.control3( "CD" ) );
	}

	@Test
	public void testControl3GoodSubCM(){
		assertEquals( true, r.control3( "CM" ) );
	}

}
