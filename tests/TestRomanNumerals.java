import static org.junit.Assert.*;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class TestRomanNumerals {

//	@Test
//	public void convertUnitinPositive() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("III");
//		assertEquals(3, rm.convertI());
//	}
//	
//	@Test
//	public void convertUnitinNegative() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("IV");
//		assertEquals(-1, rm.convertI());
//		
//	}
//	
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertUnitFalse() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("GH");
//	}
//	
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertUnitPositiveFalse() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("IIII");
//		assertEquals(2, rm.convertI());
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertUnitFalse2() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("IIV");
//		assertEquals(3, rm.convertI());
//	}
//	
//	//funzione decimale
//	
//	@Test
//	public void convertDecimalPositive() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("XXX");
//		assertEquals(30, rm.convertX());
//	}
//	
//	@Test
//	public void convertDecimalNegative() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("XV");
//		assertEquals(10, rm.convertX());
//		
//	}
//	
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertDecimalFalse() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("GH");
//	}
//	
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertDecimalPositiveFalse() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("XXXX");
//		rm.convertX();
//	}
//	
//	
//	public void convertDecimalFalse2() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("XXV");
//		assertEquals(20, rm.convertX());
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertDecimalFalse3() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("XD");
//		rm.convertX();
//	}
//	
//	//Test su V
//	
//	@Test
//	public void convertVlPositive() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("V");
//		assertEquals(5, rm.convertV());
//	}
//	
//	@Test
//	public void convertVlPositive1() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("VI");
//		assertEquals(5, rm.convertV());
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertVPositiveFalse() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("VV");
//		rm.convertV();
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertVFalse2() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("VD");
//		rm.convertV();
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertVFalse3() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("VL");
//		rm.convertV();
//	}
//	
//	//Test L
//	@Test
//	public void convertLlPositive() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("L");
//		assertEquals(50, rm.convertL());
//	}
//	
//	@Test
//	public void convertLlPositive1() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("LX");
//		assertEquals(50, rm.convertL());
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertLPositiveFalse() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("LL");
//		rm.convertL();
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertLFalse2() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("LI");
//		rm.convertL();
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertLFalse3() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("LD");
//		rm.convertL();
//	}
//	
////Test su D
//	@Test
//	public void convertDlPositive() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("D");
//		assertEquals(500, rm.convertD());
//	}
//	
//	@Test
//	public void convertDlPositive1() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("DC");
//		assertEquals(500, rm.convertD());
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertDPositiveFalse() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("DDC");
//		rm.convertD();
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertDFalse2() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("DI");
//		rm.convertD();
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertDFalse3() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("DL");
//		rm.convertD();
//	}
//	
//	//Test su C
//	@Test
//	public void convertCPositive() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("CCC");
//		assertEquals(300, rm.convertC());
//	}
//	
//	@Test
//	public void convertCNegative() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("CM");
//		assertEquals(-100, rm.convertC());
//		
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertCPositiveFalse() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("CCCC");
//		rm.convertC();
//	}
//	
//	
//	public void convertCFalse2() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("CX");
//		assertEquals(100, rm.convertC());
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertCFalse3() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("CH");
//		rm.convertC();
//	}
//	
//	//Test su M
//	
//	@Test
//	public void converMCPositive() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("MMM");
//		assertEquals(3000, rm.convertM());
//	}
//	
//	@Test
//	public void convertMNegative() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("MX");
//		assertEquals(1000, rm.convertM());
//		
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertMPositiveFalse() throws IllegalNumberRomanFormatException{
//		RomanNumerals rm = new RomanNumerals("MMMM");
//		rm.convertM();
//	}
//	
//	
//	public void convertMFalse2() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("MC");
//		assertEquals(1000, rm.convertM());
//	}
//	
//	@Test(expected = IllegalNumberRomanFormatException.class)
//	public void convertMFalse3() throws IllegalNumberRomanFormatException {
//		RomanNumerals rm = new RomanNumerals("MH");
//		rm.convertM();
//	}
	
	//Test finale
	
	//Test classi valide e invalide per I
	
	
	
	@Test
	public void convertAll1() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("III");
		assertEquals(3, rm.convertToInteger());
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
	
	//Test per V
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
	
	//Test per X
	
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
	
	//Test per L
	
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
	
	//Test per C
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll17() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("CCCC");
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
	
	//Test per D
	
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
	
	
	//Test per M
	
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

	//Test sul comportamento completo
	
	
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
