
public class RomanNumerals {
	String romanNum;
	char[] romanSymbol = { 'I', 'C', 'X', 'L', 'D', 'M', 'V' };

	enum symbolRoman {
		I, C, X, L, D, M, V;
	}

	public RomanNumerals(String romanNum) throws IllegalNumberRomanFormatException {
		
			this.controlFormat(romanNum);
			this.romanNum = romanNum;
		

	}

	public int convertToInteger(String romanNum) {
		// To be Implemented
		return 0;

	}

	private void controlFormat(String romanNum) throws IllegalNumberRomanFormatException {
		if (!romanNum.contains("I") && !romanNum.contains("C") && !romanNum.contains("X") && !romanNum.contains("D")
				&& !romanNum.contains("M") && !romanNum.contains("L")) {
			throw new IllegalNumberRomanFormatException();

		}

	}

	public int convertI() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int count = 0;
		int x = 0;
		int value = 0;

		for (char c : romanNumA) {
			x++;
			if (c == symbolRoman.I.toString().charAt(0)) {
				count++;
			}
		}
		if (count > 3) {
			throw new IllegalNumberRomanFormatException();
		} else if (count == 1 && x > 0) {
			value = -count;
		} else {
			value = count;
		}
		
		return value;

	}

}
