import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestRomanNumerals {
	
	private RomanNumerals roman;
	
	@Before
	public void setUp() {
		
		this.roman=new RomanNumerals();
		
	}
	
	@Test 
	public void genericTest(){
		
		Assert.assertEquals(1984,roman.convertToInteger("MCMLXXXIV"));
	}

}
