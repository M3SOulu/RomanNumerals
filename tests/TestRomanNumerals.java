import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {

	RomanNumerals myNumRom;

	@Before
	public void setUp() throws Exception {
		myNumRom = new RomanNumerals();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isValidSimpleInput() {
		// Assert
		assertEquals(6, myNumRom.convertToInteger("VI"));
	}

	@Test
	public void isValidComplexInput() {
		// Assert
		assertEquals(2521, myNumRom.convertToInteger("MMDXXI"));
	}

	@Test
	public void isValidIncorrectInputIV() {
		// Assert
		assertEquals(0, myNumRom.convertToInteger("MKVI"));
	}

	@Test
	public void sequenceIncorrectCharacters() {
		// Assert
		assertEquals(0, myNumRom.convertToInteger("VID"));
	}

	@Test
	public void lowerLimitRight() {
		// Assert
		assertEquals(0, myNumRom.convertToInteger(""));
	}

	@Test
	public void lowerLimitLeft() {
		// Assert
		assertEquals(1, myNumRom.convertToInteger("I"));
	}

	@Test
	public void higherLimitRight() {
		// Assert
		assertEquals(3888, myNumRom.convertToInteger("MMMDCCCLXXXVIII"));
	}

	@Test
	public void higherLimitLeft() {
		// Assert
		assertEquals(0, myNumRom.convertToInteger("MMMDCCCLXXXVIIII"));
	}

}
