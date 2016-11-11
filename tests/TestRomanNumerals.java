import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void DCequal600() {
		RomanNumerals n = new RomanNumerals();
		
		assertEquals(n.aggiungiCentinaia("DCCCXC".toCharArray(), 0), 890);
	}
	
}
