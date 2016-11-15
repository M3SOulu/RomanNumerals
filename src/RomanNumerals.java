
public class RomanNumerals {

	//Serve a tener traccia se l'ultima operazione fatta è stata una sottrazione.
	private static boolean subtractionJustMade = false;
	
	public static int convertToInteger(String romanNum)
			throws IllegalCharacterException, TooMuchSymbolRepetitionsException, IllegalSubtractionException {

		int numberOfM = 0;
		int numberOfD = 0;
		int numberOfC = 0;
		int numberOfL = 0;
		int numberOfX = 0;
		int numberOfV = 0;
		int numberOfI = 0;

		int arabianNum = 0;
		int lastValue = 0;
		
		romanNum = romanNum.toUpperCase();

		// Scelgo di processare la stringa da destra a sinistra
		for (int i = romanNum.length() - 1; i >= 0; i--) {

			// Estraggo i caratteri romani uno per uno
			char charToConvert = romanNum.charAt(i);

			switch (charToConvert) {

			case 'M':
				if (numberOfM < 3) {
					arabianNum += addOrSubtract(1000, lastValue);
					lastValue = 1000;
					numberOfM++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'D':
				if (numberOfD < 1) {
					arabianNum += addOrSubtract(500, lastValue);
					lastValue = 500;
					numberOfD++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'C':
				if (numberOfC < 3) {
					arabianNum += addOrSubtract(100, lastValue);
					lastValue = 100;
					numberOfC++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'L':
				if (numberOfL < 1) {
					arabianNum += addOrSubtract(50, lastValue);
					lastValue = 50;
					numberOfL++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'X':
				if (numberOfX < 3) {
					arabianNum += addOrSubtract(10, lastValue);
					lastValue = 10;
					numberOfX++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'V':
				if (numberOfV < 1) {
					arabianNum += addOrSubtract(5, lastValue);
					lastValue = 5;
					numberOfV++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'I':
				if (numberOfI < 3) {
					arabianNum += addOrSubtract(1, lastValue);
					lastValue = 1;
					numberOfI++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			default:
				throw new IllegalCharacterException();
			}
		}
		return arabianNum;
	}

	public static int addOrSubtract(int actualValue, int previousValue) throws IllegalSubtractionException {

		/*
		 * Nel caso in cui il valore del carattere da processare è minore del
		 * valore del carattere più a destra sottrailo al numero calcolato
		 * finora. Altrimenti sommalo.
		 */
		if (actualValue < previousValue) {
			
			//Only	one	subtraction	can	be	made	per	numeral	('XC'	is	allowed,	'XXC'	is	not).	
			if(subtractionJustMade)
				throw new IllegalSubtractionException();

			// The '5' symbols ('V', 'L', and 'D') can never be subtracted.
			if (actualValue == 5 || actualValue == 50 || actualValue == 500)
				throw new IllegalSubtractionException();
			
			/*
			 * The   '1'	symbols	('I',	'X',	and	'C')	can	only	be	subtracted	
			 * from	the	2	next	highest	values	('IV'	and	
			 * 'IX',	'XL'	and	'XC',	'CD'	and	'CM').	
			 */
			if( (actualValue == 1 && previousValue != 5 && previousValue != 10) || 
					(actualValue == 10 && previousValue != 50 && previousValue != 100) ||
					(actualValue == 100 && previousValue != 500 && previousValue != 1000)){
				throw new IllegalSubtractionException();
			}
			
			subtractionJustMade = true;
			return -actualValue;

		} else {
			subtractionJustMade = false;
			return actualValue;
		}

	}

}
