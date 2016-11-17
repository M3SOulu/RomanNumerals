import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestExceptionRomanNumerals {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "IIII" }, { "XXXX" }, { "CCCC" }, { "XXXX" }, { "MMMM" }, { "VV" },
				{ "LL" }, { "DD" }, { "IIV" }, { "IIX" }, { "XXL" }, { "XXC" }, { "CCD" }, { "CCM" }

		});
	}

	private String fInput;

	public TestExceptionRomanNumerals(String input) {
		fInput = input;
	}

	@Test(expected = InvalidRomanNumbersException.class)
	public void testException() throws InvalidRomanNumbersException {
		RomanNumerals.convertToInteger(fInput);
	}

}
