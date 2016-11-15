import static org.junit.Assert.*;

import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class TestRomanNumerals {

	@Test
	public void convertUnitinPositive() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("III");
		assertEquals(3, rm.convertI());
	}
	
	@Test
	public void convertUnitinNegative() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("IV");
		assertEquals(-1, rm.convertI());
		
	}
	
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertUnitFalse() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("GH");
	}
	
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertUnitPositiveFalse() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("IIII");
		assertEquals(2, rm.convertI());
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertUnitFalse2() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("IIV");
		assertEquals(3, rm.convertI());
	}
	
	//funzione decimale
	
	@Test
	public void convertDecimalPositive() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("XXX");
		assertEquals(30, rm.convertX());
	}
	
	@Test
	public void convertDecimalNegative() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("XV");
		assertEquals(10, rm.convertX());
		
	}
	
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertDecimalFalse() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("GH");
	}
	
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertDecimalPositiveFalse() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("XXXX");
		rm.convertX();
	}
	
	
	public void convertDecimalFalse2() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("XXV");
		assertEquals(20, rm.convertX());
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertDecimalFalse3() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("XD");
		rm.convertX();
	}
	
	//Test su V
	
	@Test
	public void convertVlPositive() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("V");
		assertEquals(5, rm.convertV());
	}
	
	@Test
	public void convertVlPositive1() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("VI");
		assertEquals(5, rm.convertV());
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertVPositiveFalse() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("VV");
		rm.convertV();
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertVFalse2() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("VD");
		rm.convertV();
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertVFalse3() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("VL");
		rm.convertV();
	}
	
	//Test L
	@Test
	public void convertLlPositive() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("L");
		assertEquals(50, rm.convertL());
	}
	
	@Test
	public void convertLlPositive1() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("LX");
		assertEquals(50, rm.convertL());
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertLPositiveFalse() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("LL");
		rm.convertL();
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertLFalse2() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("LI");
		rm.convertL();
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertLFalse3() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("LD");
		rm.convertL();
	}
	
//Test su D
	@Test
	public void convertDlPositive() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("D");
		assertEquals(500, rm.convertD());
	}
	
	@Test
	public void convertDlPositive1() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("DC");
		assertEquals(500, rm.convertD());
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertDPositiveFalse() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("DDC");
		rm.convertD();
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertDFalse2() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("DI");
		rm.convertD();
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertDFalse3() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("DL");
		rm.convertD();
	}
	
	//Test su C
	@Test
	public void convertCPositive() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("CCC");
		assertEquals(300, rm.convertC());
	}
	
	@Test
	public void convertCNegative() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("CM");
		assertEquals(-100, rm.convertC());
		
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertCPositiveFalse() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("CCCC");
		rm.convertC();
	}
	
	
	public void convertCFalse2() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("CX");
		assertEquals(100, rm.convertC());
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertCFalse3() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("CH");
		rm.convertC();
	}
	
	//Test su M
	
	@Test
	public void converMCPositive() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MMM");
		assertEquals(3000, rm.convertM());
	}
	
	@Test
	public void convertMNegative() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("MX");
		assertEquals(1000, rm.convertM());
		
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertMPositiveFalse() throws IllegalNumberRomanFormatException{
		RomanNumerals rm = new RomanNumerals("MMMM");
		rm.convertM();
	}
	
	
	public void convertMFalse2() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MC");
		assertEquals(1000, rm.convertM());
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertMFalse3() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MH");
		rm.convertM();
	}
	
	//Test finale
	@Test
	public void convertAll() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MCMLXXXIV");
		assertEquals(1984, rm.convertToInteger());
	}
	
	@Test
	public void convertAll2() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MMXIV");
		assertEquals(2014, rm.convertToInteger());
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAllFalse() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("MMH");
		assertEquals(2014, rm.convertToInteger());
	}
	
	@Test(expected = IllegalNumberRomanFormatException.class)
	public void convertAll2False() throws IllegalNumberRomanFormatException {
		RomanNumerals rm = new RomanNumerals("");
		
	}
}
