import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void unitIsLongFour() throws InvalidUnitException {
		RomanNumerals n = new RomanNumerals();
		
		assertEquals(n.aggiungiUnita("VIII".toCharArray(), 0), 8);
	}
	
	@Test
	public void unitIsLongThree() throws InvalidUnitException {
		RomanNumerals n = new RomanNumerals();
		
		assertEquals(n.aggiungiUnita("VII".toCharArray(), 0), 7);
		
		assertEquals(n.aggiungiUnita("III".toCharArray(), 0), 3);
	}
	
	@Test(expected = InvalidUnitException.class)
	public void unitIsLongThreeException() throws InvalidUnitException {
		RomanNumerals n = new RomanNumerals();
		
		assertEquals(n.aggiungiUnita("IIV".toCharArray(), 0), 1321);
	}
	
	@Test
	public void unitIsLongTwo() throws InvalidUnitException {
		RomanNumerals n = new RomanNumerals();
		
		assertEquals(n.aggiungiUnita("IX".toCharArray(), 0), 9);
		assertEquals(n.aggiungiUnita("VI".toCharArray(), 0), 6);
		assertEquals(n.aggiungiUnita("IV".toCharArray(), 0), 4);
		assertEquals(n.aggiungiUnita("II".toCharArray(), 0), 2);
	}
	
	@Test(expected = InvalidUnitException.class)
	public void unitIsLongTwoException() throws InvalidUnitException {
		RomanNumerals n = new RomanNumerals();
		
		assertEquals(n.aggiungiUnita("PO".toCharArray(), 0), 45);
	}
	
	@Test
	public void unitIsLongOne() throws InvalidUnitException {
		RomanNumerals n = new RomanNumerals();
		
		assertEquals(n.aggiungiUnita("V".toCharArray(), 0), 5);
		assertEquals(n.aggiungiUnita("I".toCharArray(), 0), 1);
	}
	
	@Test(expected = InvalidUnitException.class)
	public void unitIsLongOneException() throws InvalidUnitException {
		RomanNumerals n = new RomanNumerals();
		
		assertEquals(n.aggiungiUnita("L".toCharArray(), 0), 54654);
	}
	
	@Test
	public void tensAreLongFour() {
		
	}
}
