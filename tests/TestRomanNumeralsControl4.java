import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumeralsControl4 {
	RomanNumerals r;

	@Before
	public void setUp()
	{
		r = new RomanNumerals();
	}

	@Test
	public void testControl4InvalidDoubleSubI(){
		assertEquals( false, r.control4( "IIV" ));
	}
	
	@Test
	public void testControl4NoDoubleSubI1(){
		assertEquals( true, r.control4( "III" ));
	}
	
	@Test
	public void testControl4NoDoubleSubI2(){
		assertEquals( true, r.control4( "XIV" ));
	}
	
	
	@Test
	public void testControl4InvalidDoubleSubX(){
		assertEquals( false, r.control4( "XXC" ) );
	}
	
	@Test
	public void testControl4NoDoubleSubX1(){
		assertEquals( true, r.control4( "XXX" ));
	}
	
	@Test
	public void testControl4NoDoubleSubX2(){
		assertEquals( true, r.control4( "CXL" ));
	}
	
	@Test
	public void testControl4InvalidDoubleSubC(){
		assertEquals( false, r.control4( "CCM" ) );
	}
	
	@Test
	public void testControl4NoDoubleSubC1(){
		assertEquals( true, r.control4( "CCC" ));
	}
	
	@Test
	public void testControl4NoDoubleSubC2(){
		assertEquals( true, r.control4( "MCD" ));
	}
	
	@Test
	public void testControl4LenghtEqualsTo2(){
		assertEquals( true, r.control4( "IV" ) );
	}
	

}
