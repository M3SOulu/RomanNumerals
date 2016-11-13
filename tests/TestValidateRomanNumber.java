import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestValidateRomanNumber {

	ValidateRomanNumber validator;

	@Before
	public void setUp() throws Exception {
		validator = new ValidateRomanNumber();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void validInputExact() {
		// Assert
		assertTrue(validator.validInput("XXI"));
	}

	@Test
	public void validInputNotExact() {
		// Assert
		assertFalse(validator.validInput("XMXIVC"));
	}

	@Test
	public void validCorrectAlphabetInput() {
		// Assert
		assertTrue(validator.isValidAlphabetInput("XXIV"));
	}

	@Test
	public void validIncorrectAlphabetInput() {
		// Assert
		assertFalse(validator.isValidAlphabetInput("JXXIV"));
	}

	@Test
	public void validCorrectInputCharI() {
		// Assert
		assertTrue(validator.isValidInputMaxIXCM("XXIII"));
	}

	@Test
	public void validIncorrectInputCharI() {
		// Assert
		assertFalse(validator.isValidInputMaxIXCM("XXIIII"));
	}

	@Test
	public void validCorrectInputMaxCharX() {
		// Assert
		assertTrue(validator.isValidInputMaxIXCM("XXX"));
	}

	@Test
	public void validIncorrectInputMaxCharX() {
		// Assert
		assertFalse(validator.isValidInputMaxIXCM("XXXX"));
	}

	@Test
	public void validCorrectInputMaxCharC() {
		// Assert
		assertTrue(validator.isValidInputMaxIXCM("CCC"));
	}

	@Test
	public void validIncorrectInputMaxCharC() {
		// Assert
		assertFalse(validator.isValidInputMaxIXCM("CCCC"));
	}

	@Test
	public void validCorrectInputMaxCharM() {
		// Assert
		assertTrue(validator.isValidInputMaxIXCM("MMM"));
	}

	@Test
	public void validIncorrectInputMaxCharM() {
		// Assert
		assertFalse(validator.isValidInputMaxIXCM("MMMM"));
	}

	@Test
	public void validCorrectInputMaxCharV() {
		// Assert
		assertTrue(validator.isValidInputVLD("V"));
	}

	@Test
	public void validIncorrectInputMaxCharV() {
		// Assert
		assertFalse(validator.isValidInputVLD("VV"));
	}

	@Test
	public void validCorrectInputMaxCharL() {
		// Assert
		assertTrue(validator.isValidInputVLD("L"));
	}

	@Test
	public void validIncorrectInputMaxCharL() {
		// Assert
		assertFalse(validator.isValidInputVLD("LL"));
	}

	@Test
	public void validCorrectInputMaxCharD() {
		// Assert
		assertTrue(validator.isValidInputVLD("D"));
	}

	@Test
	public void validIncorrectInputMaxCharD() {
		// Assert
		assertFalse(validator.isValidInputVLD("DD"));
	}

	@Test
	public void validCorrectInputSubtractionsCharI() {
		// Assert
		assertTrue(validator.isValidSubtractions("IV"));
		assertTrue(validator.isValidSubtractions("IX"));
	}

	@Test
	public void validIncorrectInputSubtractionsCharI() {
		// Assert
		assertFalse(validator.isValidSubtractions("IL"));
		assertFalse(validator.isValidSubtractions("IC"));
		assertFalse(validator.isValidSubtractions("ID"));
		assertFalse(validator.isValidSubtractions("IM"));
		assertFalse(validator.isValidSubtractions("IIV"));
		assertFalse(validator.isValidSubtractions("IIX"));
	}

	@Test
	public void validCorrectInputSubtractionsCharX() {
		// Assert
		assertTrue(validator.isValidSubtractions("XL"));
		assertTrue(validator.isValidSubtractions("XC"));
	}

	@Test
	public void validIncorrectInputSubtractionsCharX() {
		// Assert
		assertFalse(validator.isValidSubtractions("XD"));
		assertFalse(validator.isValidSubtractions("XM"));
		assertFalse(validator.isValidSubtractions("XXL"));
		assertFalse(validator.isValidSubtractions("XXC"));
	}

	@Test
	public void validCorrectInputSubtractionsCharC() {
		// Assert
		assertTrue(validator.isValidSubtractions("CD"));
		assertTrue(validator.isValidSubtractions("CM"));
	}

	@Test
	public void validIncorrectInputSubtractionsCharC() {
		// Assert
		assertFalse(validator.isValidSubtractions("CCD"));
		assertFalse(validator.isValidSubtractions("CCM"));
	}

	@Test
	public void validIncorrectInputSubtractionsCharV() {
		// Assert
		assertFalse(validator.isValidDoNotSubtractions("VX"));
		assertFalse(validator.isValidDoNotSubtractions("VL"));
		assertFalse(validator.isValidDoNotSubtractions("VC"));
		assertFalse(validator.isValidDoNotSubtractions("VD"));
		assertFalse(validator.isValidDoNotSubtractions("VM"));
	}

	@Test
	public void validIncorrectInputSubtractionsCharL() {
		// Assert
		assertFalse(validator.isValidDoNotSubtractions("LC"));
		assertFalse(validator.isValidDoNotSubtractions("LD"));
		assertFalse(validator.isValidDoNotSubtractions("LM"));
	}

	@Test
	public void validIncorrectInputSubtractionsCharD() {
		// Assert
		assertFalse(validator.isValidDoNotSubtractions("DM"));
	}

}
