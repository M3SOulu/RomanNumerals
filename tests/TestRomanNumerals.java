import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestRomanNumerals {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ "I", 1 }, { "II", 2 }, { "III", 3 }, { "IV", 4 },
			{ "V", 5 }, { "VI", 6 }, { "VII", 7 }, { "VIII", 8 },
			{ "IX", 9 }, { "X", 10 }, { "XX", 20 }, { "XXX", 30 },
			{ "XL", 40 }, { "L", 50 }, { "LX", 60 }, { "LXX", 70 },
			{ "LXXX", 80 }, { "XC", 90 }, { "C", 100 }, { "CC", 200 },
			{ "CCC", 300 }, { "CD", 400 }, { "D", 500 }, { "DC", 600 },
			{ "DCC", 700 }, { "DCCC", 800 }, { "CM", 900 }, { "M", 1000 },
			{ "MCMLXXXIV", 1984 }, { "MMXIV", 2014 }, {"XXXX", 40}
		});
	}

	private String fInput;
	private int fExpected;

	public TestRomanNumerals(String input, int expected) {
		fInput = input;
		fExpected = expected;
	}

	@Test
	public void testRomanNumerals() {
		assertEquals(fExpected, RomanNumerals.convertToInteger(fInput));
	}

}
