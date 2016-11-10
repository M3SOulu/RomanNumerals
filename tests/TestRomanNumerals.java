import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRomanNumerals {
	private RomanNumerals numeroRomano;
	String uno, quattro, cinque, n1984, n2014;
	
	@Before
	public void dichiaro(){
		numeroRomano = new RomanNumerals();
		uno = "I";
		quattro = "IV";
		cinque = "V";
		n1984 = "MCMLXXXIV";
		n2014 = "MMXIV";
	}
	
	@Test
	public void test_1() {
		Assert.assertTrue("I = 1", numeroRomano.convertToInteger(uno) == 1);
	}
	
	@Test
	public void test_4() {
		Assert.assertTrue("IV = 4", numeroRomano.convertToInteger(quattro) == 4);
	}
	
	@Test
	public void test_5() {
		Assert.assertTrue("V = 5", numeroRomano.convertToInteger(cinque) == 5);
	}
	
	@Test
	public void test_1984() {
		Assert.assertTrue("MCMLXXXIV = 1984", numeroRomano.convertToInteger(n1984) == 1984);
	}
	
	@Test
	public void test_2014() {
		Assert.assertTrue("MMXIV = 2014", numeroRomano.convertToInteger(n2014) == 2014);
	}
	
	@Test
	public void test_fail2014() {
		Assert.assertFalse("I = 2014", numeroRomano.convertToInteger(uno) == 2014);
	}

	@After
	public void azzero(){
		uno = null;
		quattro = null;
		cinque = null;
		n1984 = null;
		n2014 = null;
	}
}
