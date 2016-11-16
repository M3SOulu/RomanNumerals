import static org.junit.Assert.*;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class TestRomanNumerals {

	// Test classi valide e invalide per I

	@Test
	public void convertAll1() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("III");
		assertEquals(3, rm.convertToInteger());
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll32() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("IIX");
		rm.convertToInteger();
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll33() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("IIV");
		rm.convertToInteger();
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll2() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("IIII");
		rm.convertToInteger();
	}

	@Test
	public void convertAll3() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("IV");
		assertEquals(4, rm.convertToInteger());
	}

	@Test
	public void convertAll4() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("IX");
		assertEquals(9, rm.convertToInteger());
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll5() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("IL");
		rm.convertToInteger();
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll6() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("ID");
		rm.convertToInteger();
	}

	// Test per V
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll7() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("VV");
		rm.convertToInteger();
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll8() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("VX");
		rm.convertToInteger();
	}

	@Test
	public void convertAll9() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("V");
		assertEquals(5, rm.convertToInteger());
	}

	// Test per X

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll10() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("XXXX");
		rm.convertToInteger();
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll11() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("XM");
		rm.convertToInteger();
	}

	@Test
	public void convertAll12() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("XC");
		assertEquals(90, rm.convertToInteger());
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll13() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("XXC");
		rm.convertToInteger();
	}

	// Test per L

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll14() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("LL");
		rm.convertToInteger();
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll15() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("LM");
		rm.convertToInteger();
	}

	@Test
	public void convertAll16() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("L");
		assertEquals(50, rm.convertToInteger());
	}

	// Test per C

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll17() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("CCCC");
		rm.convertToInteger();
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll34() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("CCM");
		rm.convertToInteger();
	}
	
	@Test
	public void convertAll18() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("CM");
		assertEquals(900, rm.convertToInteger());
	}

	@Test
	public void convertAll19() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("CD");
		assertEquals(400, rm.convertToInteger());
	}

	@Test
	public void convertAll20() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("CCC");
		assertEquals(300, rm.convertToInteger());
	}

	// Test per D

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll21() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("DD");
		rm.convertToInteger();
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll22() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("DM");
		rm.convertToInteger();
	}

	@Test
	public void convertAll23() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("D");
		assertEquals(500, rm.convertToInteger());
	}

	// Test per M

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll24() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MMMM");
		rm.convertToInteger();
	}

	@Test
	public void convertAll25() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("M");
		assertEquals(1000, rm.convertToInteger());
	}

	@Test
	public void convertAll26() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MM");
		assertEquals(2000, rm.convertToInteger());
	}

	@Test
	public void convertAll27() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MMM");
		assertEquals(3000, rm.convertToInteger());
	}

	// Test sul comportamento completo

	@Test
	public void convertAll28() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MCMLXXXIV");
		assertEquals(1984, rm.convertToInteger());
	}

	@Test
	public void convertAll29() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MMXIV");
		assertEquals(2014, rm.convertToInteger());
	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll30() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MMH");

	}

	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll31() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("");

	}
}
