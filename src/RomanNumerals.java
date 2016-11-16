
public class RomanNumerals {

	enum symbolRoman {

		I(1, 'I'), C(100, 'C'), X(10, 'X'), L(50, 'L'), D(500, 'D'), M(1000, 'M'), V(5, 'V');

		private int valueINT;
		private char valueCHAR;

		private symbolRoman(int i, char c) {
			valueINT = i;
			valueCHAR = c;

		}

	}

	private String romanNum;

	/**
	 * Costruttore per la classe RomanNumerals
	 * 
	 * @param romanNum
	 *            stringa di numeri romani da convertire in numero arabo.
	 * @throws IllegalNumberRomanFormatException
	 */
	public RomanNumerals(String romanNum) throws IllegalNumberRomanFormatException {

		this.controlFormat(romanNum);
		this.romanNum = romanNum;

	}

	/**
	 * Funzione per convertire una stringa di numeri romani in numero arabo
	 * 
	 * @return la stringa convertita in numero arabo
	 * @throws IllegalNumberRomanFormatException
	 */
	public int convertToInteger() throws IllegalNumberRomanFormatException {

		return convertI() + convertV() + convertX() + convertL() + convertC() + convertD() + convertM();

	}

	/*
	 * Controlla il formato della stringa. Se i caratteri nella stringa non sono
	 * tutti simboli romani lancia un'eccezzione.
	 */
	private void controlFormat(String romanNum) throws IllegalNumberRomanFormatException {
		char c[] = romanNum.toCharArray();

		if (c.length == 0) {
			throw new IllegalNumberRomanFormatException();
		} else {
			for (char d : c) {
				if (!(d == symbolRoman.I.valueCHAR) && !(d == symbolRoman.C.valueCHAR)
						&& !(d == symbolRoman.X.valueCHAR) && !(d == symbolRoman.D.valueCHAR)
						&& !(d == symbolRoman.M.valueCHAR) && !(d == symbolRoman.L.valueCHAR)
						&& !(d == symbolRoman.V.valueCHAR)) {
					throw new IllegalNumberRomanFormatException();

				}

			}

		}

	}

	/*
	 * Converte le I presenti nella stringa in 1. Ritorna 1,2 o 3 a se nella
	 * stringa è presente, rispettivamente: I,II,III. Ritorna -1 se nella
	 * stringa è presente: IV o IX. Lancia un'eccezzione in tutti gli altri
	 * casi.
	 */

	private int convertI() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberICurrence = 0;
		int x = 0;
		int value = 0;

		for (char c : romanNumA) {
			x++;
			if (c == symbolRoman.I.valueCHAR) {
				numberICurrence++;
			}
		}

		// Controlla se ci sono occorenze di I

		if (numberICurrence > 0) {

			// Controlla se le occorenze di I sono più di 3, in quel caso lancia
			// un'eccezzione

			if (numberICurrence > 3) {

				throw new IllegalNumberRomanFormatException();

			} else {

				// controlla se la stringa finisce con I quindi se la stringa è
				// "I" o "I...".
				if (romanNumA[romanNumA.length - 1] != 'I') {
					// se la stringa non finisce con I, memorizza, in d,
					// l'ultimo carattere dopo l'ultima I.
					char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.I.valueCHAR) + 1);
					// se d non è uguale a 'V' o a 'X' lancia un'eccezzione.
					if ((d != symbolRoman.V.valueCHAR) && (d != symbolRoman.X.valueCHAR)) {

						throw new IllegalNumberRomanFormatException();

						// se d è uguale a 'V' o a 'X' restituisce -1

					} else if ((d == symbolRoman.V.valueCHAR) || (d == symbolRoman.X.valueCHAR)) {
						// se d è guuale a 'V' o a 'X' ma prima ci sono più
						// occorenze di I lancia un'eccezzione
						// es. "IIV"
						if (numberICurrence >= 2) {
							throw new IllegalNumberRomanFormatException();
							// altrimenti, se l'occorenza di I è uguale a 1,
							// ritorna -1.
						} else {
							value = -numberICurrence * symbolRoman.I.valueINT;
						}
					}
					// se la stringa finisce con I, e I è presente 1,2 o 3
					// volte, restituisce, rispettivamente; 1,2 o 3.
				} else {
					value = numberICurrence * symbolRoman.I.valueINT;
				}

			}

		}
		return value;

	}

	/*
	 * Converte le X presenti nella stringa in 10 o miltipli di esso. Se dopo la
	 * X è presente la C o la L restituiesce -10 In tutti gli altri casi
	 * restituisce errore
	 */
	private int convertX() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberXCurrene = 0;
		int value = 0;

		for (char c : romanNumA) {

			if (c == symbolRoman.X.valueCHAR) {
				numberXCurrene++;
			}
		}
		// controlla se ci sono X nella stringa
		if (numberXCurrene > 0) {
			// controlla se ci sono più di 3 X nella stringa, in quel caso
			// restitusice errore
			if (numberXCurrene > 3) {

				throw new IllegalNumberRomanFormatException();

			} else {
				// controlla che la stringa non finisca con X, quindi che non
				// sia X,XX,XXX o ..X[..X]
				if (romanNumA[romanNumA.length - 1] != symbolRoman.X.valueCHAR) {
					// si fa restituire l'ultimo carattere dopo l'ultima X e lo
					// memorizza in d
					char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.X.valueCHAR) + 1);
					// se d non è nessuna delle seguenti lettere L, V, C, I
					// restituisce errore
					if ((d != symbolRoman.L.valueCHAR) && (d != symbolRoman.C.valueCHAR)
							&& (d != symbolRoman.V.valueCHAR) && (d != symbolRoman.I.valueCHAR)) {

						throw new IllegalNumberRomanFormatException();
						// se che d sia uguale a L o a C
					} else if ((d == symbolRoman.L.valueCHAR) || (d == symbolRoman.C.valueCHAR)) {
						// d è uguale a L o a C, controlla che le occorenze di X
						// non sia più di 1 cioè che la stringa non sia XXL o
						// XXC. In caso contrario restituisce errore.
						if (numberXCurrene >= 2) {
							throw new IllegalNumberRomanFormatException();
							// altrimenti restituisce -10
						} else {
							value = -numberXCurrene * symbolRoman.X.valueINT;
						}
						// se d è uguale a V o I restituisce 10, 20 o 30 a
						// seconda del numero di occorenze
					} else {
						value = numberXCurrene * symbolRoman.X.valueINT;
					}
					// se la stringa è X, XX o XXX restitisce 10, 20 o 30 a
					// seconda del numero di occorrenze
				} else {
					value = numberXCurrene * symbolRoman.X.valueINT;
				}
			}

		}
		return value;

	}

	/*
	 * Converte le V presenti nella stringa in 5. Ritorna 5 o un'eccezzione. 5
	 * se non ci sono più di 2 occorrenze di V nella stringa, se la stringa è
	 * "V" o se dopo la V c'è I. Lancia un'eccezzione in tutti gli altri casi.
	 */
	private int convertV() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberVoccurrence = 0;

		int value = 0;

		for (char c : romanNumA) {

			if (c == symbolRoman.V.valueCHAR) {
				numberVoccurrence++;
			}
		}
		// controlla se ci sono occorrenze di V
		if (numberVoccurrence > 0) {
			// controlla che non ci siano più di 5 occorrenze
			if (numberVoccurrence >= 2) {
				throw new IllegalNumberRomanFormatException();
				// controlla che la stringa non sia V
			} else if (romanNumA[romanNumA.length - 1] != symbolRoman.V.valueCHAR) {
				// se la stringa non è V, si fa restituire il carattere
				// successivo alla V
				char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.V.valueCHAR) + 1);
				// se il carattere è uguale a I restituisce 5
				if (d == symbolRoman.I.valueCHAR) {
					value = numberVoccurrence * symbolRoman.V.valueINT;
					// altrimenti restituisce errore
				} else {
					throw new IllegalNumberRomanFormatException();
				}
				// se la stringa è "V" restituisce 5.
			} else {
				value = numberVoccurrence * symbolRoman.V.valueINT;
			}
		}
		return value;

	}

	/*
	 * Converte le L presenti nella stringa in 50. Ritorna 50 o un'eccezzione.
	 * 50 se non c'è più di 1 occorrenza di L nella stringa, se la stringa è "L"
	 * o se dopo la L c'è X. Lancia un'eccezzione in tutti gli altri casi.
	 */

	private int convertL() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberLoccurrence = 0;

		int value = 0;

		for (char c : romanNumA) {

			if (c == symbolRoman.L.valueCHAR) {
				numberLoccurrence++;
			}
		}
		// Controlla se ci sono occorrenze di L
		if (numberLoccurrence > 0) {
			// controlla che le occorrenze di L non siano più di 1, altrimenti
			// lancia un'eccezzione
			if (numberLoccurrence >= 2) {
				throw new IllegalNumberRomanFormatException();
				// controlla che la stringa non sia "L"
			} else if (romanNumA[romanNumA.length - 1] != symbolRoman.L.valueCHAR) {
				// si fa restituire l'ultimo carattere dopo l'ultima L
				char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.L.valueCHAR) + 1);
				// Se il carattere dopo L è X, restituisce 50.
				if (d == symbolRoman.X.valueCHAR) {
					value = numberLoccurrence * symbolRoman.L.valueINT;
					// altrimenti lancia un'eccezzione
				} else {
					throw new IllegalNumberRomanFormatException();
				}
				// se la stringa è L restituisce 50.
			} else {
				value = numberLoccurrence * symbolRoman.L.valueINT;
			}
		}
		return value;

	}
	/*
	 * Converte le D presenti nella stringa in 500. Ritorna 500 o un'eccezzione.
	 * 500 se non c'è più di 1 occorrenza di D nella stringa, se la stringa è
	 * "D" o se dopo la D c'è C. Lancia un'eccezzione in tutti gli altri casi.
	 */

	private int convertD() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberDoccurrence = 0;

		int value = 0;

		for (char c : romanNumA) {

			if (c == symbolRoman.D.valueCHAR) {
				numberDoccurrence++;
			}
		}

		// controlla che ci siano occorrenze di D
		if (numberDoccurrence > 0) {
			// se le occorrenze di D sono maggiori di 1 restituisce errore
			if (numberDoccurrence >= 2) {
				throw new IllegalNumberRomanFormatException();
				// controlla se la stringa è "D" o "D..."
			} else if (romanNumA[romanNumA.length - 1] != symbolRoman.D.valueCHAR) {
				// se la stringa è "D.." si fa restituire il carattere dopo D.
				char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.D.valueCHAR) + 1);
				// se il carattere dopo D è 'C' restituisce 500.
				if (d == symbolRoman.C.valueCHAR) {
					value = numberDoccurrence * symbolRoman.D.valueINT;
				} else {
					// altrimenti lancia un'eccezzione
					throw new IllegalNumberRomanFormatException();
				}
				// se la stringa è "D" o finisce con "D" restituisce 500
			} else {
				value = numberDoccurrence * symbolRoman.D.valueINT;
			}
		}
		return value;

	}

	/*
	 * Converte le C presenti nella stringa in 100. Ritorna 100, multipli di
	 * esso, - 100 o un'eccezzione. 100 o multipli di esso se dopo l'ultima C
	 * non è presente 'D' o 'M' e se le occorrenze di C non sono maggiori di 3.
	 * -100 se c'è solo una C e dopo di questa c'è 'D' o 'M'. 
	 * Lancia un'eccezzione in tutti gli altri casi.
	 */

	private int convertC() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberCCurrene = 0;

		int value = 0;

		for (char c : romanNumA) {

			if (c == symbolRoman.C.valueCHAR) {
				numberCCurrene++;
			}
		}
		// controlla se ci sono occorrenze di C
		if (numberCCurrene > 0) {
			// controlla se ci sono pià di 3 occorrenze di C, in quel caso
			// lancia un'eccezzione
			if (numberCCurrene > 3) {

				throw new IllegalNumberRomanFormatException();
				// se è presenta una sola occorenza di C ma la stringa è formata
				// da più caratteri
			} else {
				// controlla che il carattere dopo l'ultima C non sia C.
				if (romanNumA[romanNumA.length - 1] != symbolRoman.C.valueCHAR) {
					// si fa restituire l'ultimo carattere dopo l'ultima C e lo
					// memorizza in d
					char d = romanNum.charAt(romanNum.lastIndexOf(symbolRoman.C.valueCHAR) + 1);
					// se è uguale a D o a M
					if ((d == symbolRoman.D.valueCHAR) || (d == symbolRoman.M.valueCHAR)) {
						// lancia un'eccezzione se le occorrenze di C sono
						// maggiori di 1, quindi se la stringa è "CCD" o "CCM"
						if (numberCCurrene >= 2) {
							throw new IllegalNumberRomanFormatException();
							// altrimenti restituisce -100.
						} else {
							value = -numberCCurrene * symbolRoman.C.valueINT;
						}
						// in tutti gli altri casi restituisce il numero di
						// occorrenze per 100.
					} else {
						value = numberCCurrene * symbolRoman.C.valueINT;
					}
					// se la stringa è C, CC o CCC restituisce, rispettivamente
					// 100,200,300
				} else {
					value = numberCCurrene * symbolRoman.C.valueINT;
				}

			}
		}

		return value;

	}
	/*
	 * Converte le M presenti nella stringa in 1000. Ritorna 1000, multipli di
	 * esso o un'eccezzione. 
	 * 1000 o multipli di esso se le occorrense di M non sono maggiori di 3. 
	 * Lancia un'eccezzione in tutti gli altri casi.
	 */
	private int convertM() throws IllegalNumberRomanFormatException {
		char[] romanNumA = this.romanNum.toCharArray();
		int numberMCurrene = 0;

		int value = 0;

		for (char c : romanNumA) {

			if (c == symbolRoman.M.valueCHAR) {
				numberMCurrene++;
			}
		}
		// controlla che le occorrenze di M non sono maggiori di 3, in tal caso
		// lancia un'eccezzione
		if (numberMCurrene > 3) {

			throw new IllegalNumberRomanFormatException();
			// altrimenti restituisce il numero di occorrenze di M * 1000;
		} else {
			value = numberMCurrene * symbolRoman.M.valueINT;
		}

		return value;

	}

}
