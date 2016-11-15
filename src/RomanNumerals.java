
public class RomanNumerals {
	enum symbolRoman {
		I, C, X, L, D, M, V;
	}

	private String romanNum;
	private final static int I = 1;
	private final static int V = 5;
	private final static int X = 10;
	private final static int L = 50;
	private final static int C = 100;
	private final static int D = 500;
	private final static int M = 1000;

	public RomanNumerals(String romanNum) throws IllegalNumberRomanFormatException {

		this.controlFormat(romanNum);
		this.romanNum = romanNum;

	}

	public int convertToInteger() throws IllegalNumberRomanFormatException {
		int Ivalue = -1;
		int Vvalue = -1;
		int Xvalue = -1;
		int Lvalue = -1;
		int Cvalue = -1;
		int Dvalue = -1;
		int Mvalue = -1;

		Ivalue = convertI();
		Vvalue = convertV();
		Xvalue = convertX();
		Lvalue = convertL();
		Cvalue = convertC();
		Dvalue = convertD();
		Mvalue = convertM();

		int integer = Ivalue + Vvalue + Xvalue + Lvalue + Cvalue + Dvalue + Mvalue;

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

	private int convertI() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberICurrence = 0;
		int x = 0;
		int value = 0;

		for (char c : romanNumA) {
			x++;
			if (c == symbolRoman.I.toString().charAt(0)) {
				numberICurrence++;
			}
		}

		if (numberICurrence > 0) {
			if (numberICurrence > 3) {

				throw new IllegalNumberRomanFormatException();

			} else if (numberICurrence == 1 && x > 1) {

				char d2 = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.I.toString().charAt(0)) + 1);
				if (romanNumA[romanNumA.length - 1] != 'I') {

					char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.I.toString().charAt(0)) + 1);

					if ((d != 'V') && (d != 'X')) {

						throw new IllegalNumberRomanFormatException();

					} else if ((d == 'V') || (d == 'X')) {

						value = -numberICurrence * 1;

					} else {
						value = numberICurrence * 1;
					}
				}

			} else {

				value = numberICurrence * 1;
			}

		}
		return value;

	}

	private int convertX() throws IllegalNumberRomanFormatException {
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

			} else {

				if (romanNumA[romanNumA.length - 1] != 'X') {

					char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.X.toString().charAt(0)) + 1);

					if ((d != 'L') && (d != 'C') && (d != 'V') && (d != 'I')) {

						throw new IllegalNumberRomanFormatException();

					} else if ((d == 'L') || (d == 'C')) {
						if (numberXCurrene >= 2) {
							throw new IllegalNumberRomanFormatException();
						} else {
							value = -numberXCurrene * 10;
						}
					}else{
						value = numberXCurrene * 10;
					}
				} else {
					value = numberXCurrene * 10;
				}
			}

		}
		return value;

	}

	private int convertV() throws IllegalNumberRomanFormatException {
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

	private int convertL() throws IllegalNumberRomanFormatException {
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
			} else if (romanNumA[romanNumA.length - 1] != 'L') {

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

	private int convertD() throws IllegalNumberRomanFormatException {
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
			} 
			else if (romanNumA[romanNumA.length -1] != 'D') {

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

	private int convertC() throws IllegalNumberRomanFormatException {
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

		if (numberXCurrene > 0) {

			if (numberXCurrene > 3) {

				throw new IllegalNumberRomanFormatException();

			} else if (numberXCurrene == 1 && cicleCount > 1) {

				if (romanNumA[romanNumA.length - 1] != 'C') {

					char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.C.toString().charAt(0)) + 1);

					if ((d == 'D') || (d == 'M')) {

						value = -numberXCurrene * 100;

					} else {
						value = numberXCurrene * 100;
					}
				} else {
					value = numberXCurrene * 100;
				}

			} else {

				value = numberXCurrene * 100;
			}
		}

		return value;

	}

	private int convertM() throws IllegalNumberRomanFormatException {
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
