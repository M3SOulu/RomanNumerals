import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {

	private RomanNumerals romanNumerals;
	
	@Before
	public void setObject() {
		romanNumerals = new RomanNumerals();
	}
	
	@Test
	public void unitIsLongFour() throws InvalidUnitException {
		assertEquals(romanNumerals.aggiungiUnita("VIII".toCharArray(), 0), 8);
	}
	
	@Test
	public void unitIsLongThree() throws InvalidUnitException {
		assertEquals(romanNumerals.aggiungiUnita("VII".toCharArray(), 0), 7);
		assertEquals(romanNumerals.aggiungiUnita("III".toCharArray(), 0), 3);
	}
	
	@Test(expected = InvalidUnitException.class)
	public void unitIsLongThreeException() throws InvalidUnitException {
		assertEquals(romanNumerals.aggiungiUnita("IIV".toCharArray(), 0), 1321);
	}
	
	@Test
	public void unitIsLongTwo() throws InvalidUnitException {
		assertEquals(romanNumerals.aggiungiUnita("IX".toCharArray(), 0), 9);
		assertEquals(romanNumerals.aggiungiUnita("VI".toCharArray(), 0), 6);
		assertEquals(romanNumerals.aggiungiUnita("IV".toCharArray(), 0), 4);
		assertEquals(romanNumerals.aggiungiUnita("II".toCharArray(), 0), 2);
	}
	
	@Test(expected = InvalidUnitException.class)
	public void unitIsLongTwoException() throws InvalidUnitException {
		assertEquals(romanNumerals.aggiungiUnita("PO".toCharArray(), 0), 45);
	}
	
	@Test
	public void unitIsLongOne() throws InvalidUnitException {
		assertEquals(romanNumerals.aggiungiUnita("V".toCharArray(), 0), 5);
		assertEquals(romanNumerals.aggiungiUnita("I".toCharArray(), 0), 1);
	}
	
	@Test(expected = InvalidUnitException.class)
	public void unitIsLongOneException() throws InvalidUnitException {
		assertEquals(romanNumerals.aggiungiUnita("L".toCharArray(), 0), 54654);
	}
	
	@Test
	public void tensAreLongFour() throws InvalidTensException, InvalidUnitException {
		assertEquals(romanNumerals.aggiungiDecine("LXXXVIII".toCharArray(), 0), 88);
	}
	
	@Test(expected = InvalidTensException.class)
	public void tensAreLongFourException() throws InvalidTensException, InvalidUnitException {
		assertEquals(romanNumerals.aggiungiDecine("XXXLVIII".toCharArray(), 0), 456);
	}
	
	@Test
	public void tensAreLongThree() throws InvalidTensException, InvalidUnitException {
		assertEquals(romanNumerals.aggiungiDecine("LXXIII".toCharArray(), 0), 73);
		assertEquals(romanNumerals.aggiungiDecine("XXXIII".toCharArray(), 0), 33);
	}
	
	@Test(expected = InvalidTensException.class)
	public void tensAreLongThreeException() throws InvalidTensException, InvalidUnitException {
		assertEquals(romanNumerals.aggiungiDecine("TTTIII".toCharArray(), 0), 123);
	}
	
	@Test
	public void tensAreLongTwo() throws InvalidTensException, InvalidUnitException {
		assertEquals(romanNumerals.aggiungiDecine("XCIX".toCharArray(), 0), 99);
		assertEquals(romanNumerals.aggiungiDecine("LXVI".toCharArray(), 0), 66);
		assertEquals(romanNumerals.aggiungiDecine("XLIV".toCharArray(), 0), 44);
		assertEquals(romanNumerals.aggiungiDecine("XXII".toCharArray(), 0), 22);
	}
	
	@Test(expected = InvalidTensException.class)
	public void tensAreLongTwoException() throws InvalidTensException, InvalidUnitException {
		assertEquals(romanNumerals.aggiungiDecine("ZZIII".toCharArray(), 0), 123);
	}
	
	@Test
	public void tensAreLongOne() throws InvalidTensException, InvalidUnitException {
		assertEquals(romanNumerals.aggiungiDecine("LV".toCharArray(), 0), 55);
		assertEquals(romanNumerals.aggiungiDecine("XI".toCharArray(), 0), 11);
	}
	
	@Test(expected = InvalidTensException.class)
	public void tensAreLongOneExcpetion() throws InvalidTensException, InvalidUnitException {
		assertEquals(romanNumerals.aggiungiDecine("K".toCharArray(), 0), 10);
	}
	
	@Test
	public void OneHundredsAreLongFour() throws InvalidTensException, InvalidUnitException, InvalidOneHundredException {
		assertEquals(romanNumerals.aggiungiCentinaia("DCCCXCIX".toCharArray(), 0), 899);
	}
	
	@Test(expected = InvalidOneHundredException.class)
	public void OneHundredsAreLongFourException() throws InvalidTensException, InvalidUnitException, InvalidOneHundredException {
		assertEquals(romanNumerals.aggiungiCentinaia("CCCD".toCharArray(), 0), 4984);
	}
}
