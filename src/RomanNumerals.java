import java.util.HashSet;

public class RomanNumerals {
	public static int convertToInteger(String romanNumber) throws InvalidRomanNumbersException {

		int decimal = 0;
		int lastNumber = 0;
		String romanNumeral = romanNumber.toUpperCase();

		// Check if Roman number is OK
		checkRomanNumerals(romanNumeral);
		/*
		 * operation to be performed on upper cases even if user enters roman
		 * values in lower case chars
		 */
		for (int x = romanNumeral.length() - 1; x >= 0; x--) {
			char convertToDecimal = romanNumeral.charAt(x);

			switch (convertToDecimal) {
			case 'M':
				decimal = processDecimal(1000, lastNumber, decimal);
				lastNumber = 1000;
				break;

			case 'D':
				decimal = processDecimal(500, lastNumber, decimal);
				lastNumber = 500;
				break;

			case 'C':
				decimal = processDecimal(100, lastNumber, decimal);
				lastNumber = 100;
				break;

			case 'L':
				decimal = processDecimal(50, lastNumber, decimal);
				lastNumber = 50;
				break;

			case 'X':
				decimal = processDecimal(10, lastNumber, decimal);
				lastNumber = 10;
				break;

			case 'V':
				decimal = processDecimal(5, lastNumber, decimal);
				lastNumber = 5;
				break;

			case 'I':
				decimal = processDecimal(1, lastNumber, decimal);
				lastNumber = 1;
				break;
			}
		}
		return decimal;
	}

	private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
		if (lastNumber > decimal) {
			return lastDecimal - decimal;
		} else {
			return lastDecimal + decimal;
		}
	}

	private static void checkRomanNumerals(String romanNumber) throws InvalidRomanNumbersException {
		/*
		 * There were certain rules that the numerals followed which should be
		 * observed:
		 * 
		 * The symbols 'I', 'X', 'C', and 'M' can be repeated at most 3 times in
		 * a row. The symbols 'V', 'L', and 'D' can never be repeated. The '1'
		 * symbols ('I', 'X', and 'C') can only be subtracted from the 2 next
		 * highest values ('IV' and 'IX', 'XL' and 'XC', 'CD' and 'CM'). Only
		 * one subtraction can be made per numeral ('XC' is allowed, 'XXC' is
		 * not). The '5' symbols ('V', 'L', and 'D') can never be subtracted.
		 */

		HashSet<String> stringeInvalide = new HashSet<>();
		stringeInvalide.add("IIII");
		stringeInvalide.add("XXXX");
		stringeInvalide.add("CCCC");
		stringeInvalide.add("MMMM");
		stringeInvalide.add("VV");
		stringeInvalide.add("LL");
		stringeInvalide.add("DD");
		stringeInvalide.add("IIV");
		stringeInvalide.add("IIX");
		stringeInvalide.add("XXL");
		stringeInvalide.add("XXC");
		stringeInvalide.add("CCD");
		stringeInvalide.add("CCM");

		if (stringeInvalide.contains(romanNumber)) {
			throw new InvalidRomanNumbersException();
		}

	}

}
