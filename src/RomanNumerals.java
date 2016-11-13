
public class RomanNumerals {

	
	/**
	 * 
	 * @param romanNum
	 * @return translated into Arabic number Roman number - returns 0 if the input is wrong
	 */
	
	public int convertToInteger(String romanNum) {
		int numDecimale = 0;
		int lastNumber = 0;
		String romanNumUp = romanNum.toUpperCase();
		ValidateRomanNumber validator = new ValidateRomanNumber();

		if (validator.validInput(romanNumUp)) {
			char convertToDecimal;
			for (int i = romanNumUp.length() - 1; i >= 0; i--) {
				convertToDecimal = romanNumUp.charAt(i);

				switch (convertToDecimal) {
				case 'M':
					numDecimale = processDecimal(1000, lastNumber, numDecimale);
					lastNumber = 1000;
					break;

				case 'D':
					numDecimale = processDecimal(500, lastNumber, numDecimale);
					lastNumber = 500;
					break;

				case 'C':
					numDecimale = processDecimal(100, lastNumber, numDecimale);
					lastNumber = 100;
					break;

				case 'L':
					numDecimale = processDecimal(50, lastNumber, numDecimale);
					lastNumber = 50;
					break;

				case 'X':
					numDecimale = processDecimal(10, lastNumber, numDecimale);
					lastNumber = 10;
					break;

				case 'V':
					numDecimale = processDecimal(5, lastNumber, numDecimale);
					lastNumber = 5;
					break;

				case 'I':
					numDecimale = processDecimal(1, lastNumber, numDecimale);
					lastNumber = 1;
					break;
				}
			}
		}
		return numDecimale;
	}

	public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
		if (lastNumber > decimal) {
			return lastDecimal - decimal;
		} else {
			return lastDecimal + decimal;
		}
	}

}
