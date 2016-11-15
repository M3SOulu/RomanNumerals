import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRomanException {
	
	private RomanNumerals number;
	
	@Before
	public void setUp(){
		number=new RomanNumerals();
	}
	
	@Test(expected=RowException.class)
	public void test_rawException() throws RowException, VLDrepeatedException, IXCsubException, VLDsubException, moreOneSubException {
		number.convertToInteger("XXIIII");
	}
	
	@Test(expected=VLDrepeatedException.class)
	public void test_VLDrepeatedException() throws RowException, VLDrepeatedException, IXCsubException, VLDsubException, moreOneSubException {
		number.convertToInteger("VV");
	}
	
	@Test(expected=IXCsubException.class)
	public void test_IXCsubException() throws RowException, VLDrepeatedException, IXCsubException, VLDsubException, moreOneSubException {
		number.convertToInteger("IM");
	}
	
	@Test(expected=VLDsubException.class)
	public void test_VLDsubException() throws RowException, VLDrepeatedException, IXCsubException, VLDsubException, moreOneSubException {
		number.convertToInteger("VX");
	}
	
	@Test(expected=moreOneSubException.class)
	public void test_moreOneSubException() throws RowException, VLDrepeatedException, IXCsubException, VLDsubException, moreOneSubException {
		number.convertToInteger("IIX");
	}

}
