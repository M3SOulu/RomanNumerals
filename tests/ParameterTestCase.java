import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class ParameterTestCase {

	private RomanNumerals roman;

	private String input;
	private int expected;
	
	@Parameters
	public static Collection<Object[]> data() {

		return Arrays.asList(new Object[][] {

			{ "LXXXIX", 89 }, { "LXXXVIII", 88 }, { "CMXCIX", 999 }, { "MMMCMXCIX", 3999 }

		});
	}

	
	public ParameterTestCase(String input, int expected) {
		
		roman = new RomanNumerals();
		this.input=input;
		this.expected=expected;
		

	}


	@Test
	public void test() throws InvalidRomanNumeralsException{
		
		Assert.assertEquals(expected, roman.convertToInteger(input));
	}

}
