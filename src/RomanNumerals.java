
public class RomanNumerals {
	String romanNum;

	enum symbolRoman {
		I, C, X, L, D, M, V;
	}

	public RomanNumerals(String romanNum) throws IllegalNumberRomanFormatException {

		this.controlFormat(romanNum);
		this.romanNum = romanNum;

	}

	public int convertToInteger() throws IllegalNumberRomanFormatException {
		int integer = -1;

		integer = convertI() + convertV() + convertX() + convertL() + convertC() + convertD() + convertM();

		return integer;

	}

	private void controlFormat(String romanNum) throws IllegalNumberRomanFormatException {
		char c[] = romanNum.toCharArray();

		if (c.length == 0) {
			throw new IllegalNumberRomanFormatException();
		} else {
			for (char d : c) {
				if (!(d == symbolRoman.I.toString().charAt(0)) && !(d == symbolRoman.C.toString().charAt(0))
						&& !(d == symbolRoman.X.toString().charAt(0)) && !(d == symbolRoman.D.toString().charAt(0))
						&& !(d == symbolRoman.M.toString().charAt(0)) && !(d == symbolRoman.L.toString().charAt(0))
						&& !(d == symbolRoman.V.toString().charAt(0))) {
					throw new IllegalNumberRomanFormatException();

				}

			}

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
		if (count > 0) {
			if (count > 3) {
				throw new IllegalNumberRomanFormatException();
			} else if (count == 1 && x > 0) {
				value = -count;
			} else if (count > 1 && count != x) {
				if (!romanNum.endsWith(symbolRoman.I.toString())) {
					throw new IllegalNumberRomanFormatException();
				}
			} else {

				value = count;
			}
		}
		return value;

	}

	public int convertX() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberXCurrene = 0;
		int cicleCount = 0;
		int value = 0;

		for (char c : romanNumA) {
			cicleCount++;
			if (c == symbolRoman.X.toString().charAt(0)) {
				numberXCurrene++;
			}
		}
		if (numberXCurrene > 0) {
			if (numberXCurrene > 3) {

				throw new IllegalNumberRomanFormatException();

			} else if (numberXCurrene == 1 && cicleCount > 1) {

				if (romanNum.length() > 1) {
					char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.X.toString().charAt(0)) + 1);
					if ((d != 'L') && (d != 'C') && (d != 'V') && (d != 'I')) {

						throw new IllegalNumberRomanFormatException();

					} else if ((d == 'L') && (d == 'C')) {

						value = -numberXCurrene * 10;

					} else {
						value = numberXCurrene * 10;
					}
				}

			} else {

				value = numberXCurrene * 10;
			}
		}
		return value;

	}

	public int convertV() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberVoccurrence = 0;

		int value = 0;

		for (char c : romanNumA) {

			if (c == symbolRoman.V.toString().charAt(0)) {
				numberVoccurrence++;
			}
		}
		if (numberVoccurrence > 0) {
			if (numberVoccurrence >= 2) {
				throw new IllegalNumberRomanFormatException();
			} else if (romanNumA[romanNumA.length - 1] != 'V') {

				char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.V.toString().charAt(0)) + 1);
				if (d == 'I') {
					value = numberVoccurrence * 5;
				} else {
					throw new IllegalNumberRomanFormatException();
				}
			} else {
				value = numberVoccurrence * 5;
			}
		}
		return value;

	}

	public int convertL() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberVoccurrence = 0;

		int value = 0;

		for (char c : romanNumA) {

			if (c == symbolRoman.L.toString().charAt(0)) {
				numberVoccurrence++;
			}
		}
		if (numberVoccurrence > 0) {
			if (numberVoccurrence >= 2) {
				throw new IllegalNumberRomanFormatException();
			} else if (romanNum.length() > 1) {

				char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.L.toString().charAt(0)) + 1);
				if (d == 'X') {
					value = numberVoccurrence * 50;
				} else {
					throw new IllegalNumberRomanFormatException();
				}
			} else {
				value = numberVoccurrence * 50;
			}
		}
		return value;

	}

	public int convertD() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberVoccurrence = 0;

		int value = 0;

		for (char c : romanNumA) {

			if (c == symbolRoman.D.toString().charAt(0)) {
				numberVoccurrence++;
			}
		}

		if (numberVoccurrence > 0) {
			if (numberVoccurrence >= 2) {
				throw new IllegalNumberRomanFormatException();
			} else if (romanNum.length() > 1) {

				char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.D.toString().charAt(0)) + 1);
				if (d == 'C') {
					value = numberVoccurrence * 500;
				} else {
					throw new IllegalNumberRomanFormatException();
				}
			} else {
				value = numberVoccurrence * 500;
			}
		}
		return value;

	}

	public int convertC() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberXCurrene = 0;
		int cicleCount = 0;
		int value = 0;

		for (char c : romanNumA) {
			cicleCount++;
			if (c == symbolRoman.C.toString().charAt(0)) {
				numberXCurrene++;
			}
		}

		if (numberXCurrene > 3) {

			throw new IllegalNumberRomanFormatException();

		} else if (numberXCurrene == 1 && cicleCount > 1) {

			if (romanNum.length() > 1) {
				char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.C.toString().charAt(0)) + 1);
				if ((d == 'D') || (d == 'M')) {

					value = -numberXCurrene * 100;

				} else {
					value = numberXCurrene * 100;
				}
			}

		} else {

			value = numberXCurrene * 100;
		}

		return value;

	}

	public int convertM() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberXCurrene = 0;

		int value = 0;

		for (char c : romanNumA) {

			if (c == symbolRoman.M.toString().charAt(0)) {
				numberXCurrene++;
			}
		}

		if (numberXCurrene > 3) {

			throw new IllegalNumberRomanFormatException();

		} else {
			value = numberXCurrene * 1000;
		}

		return value;

	}

}
