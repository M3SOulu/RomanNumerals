
public class RomanNumerals {

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
		int numberToSum = 0;

		romanNum = romanNum.toUpperCase();

		// Scelgo di processare la stringa da destra a sinistra
		for (int i = romanNum.length() - 1; i >= 0; i--) {

			// Estraggo i caratteri romani uno per uno
			char charToConvert = romanNum.charAt(i);

			switch (charToConvert) {

			case 'M':

				if (numberOfM < 3) {	
					/*
					 * Se l'ultima operazione è stata una sottrazione ed il prossimo simbolo 
					 * ha un valore minore o uguale a quello sottratto in precedenza
					 * si tratta di due sottrazioni consecutive (illegale)
					 */
					if (numberToSum < 0 && Math.abs(addOrSubtract(1000, lastValue)) <= lastValue)
						throw new IllegalSubtractionException();
					
					numberToSum = addOrSubtract(1000, lastValue);
					arabianNum += numberToSum;
					lastValue = 1000;
					numberOfM++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'D':

				if (numberOfD < 1) {
					
					if (numberToSum < 0 && Math.abs(addOrSubtract(500, lastValue)) <= lastValue)
						throw new IllegalSubtractionException();
					numberToSum = addOrSubtract(500, lastValue);
					arabianNum += numberToSum;
					lastValue = 500;
					numberOfD++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'C':
				
				if (numberOfC < 3) {
					
					if (numberToSum < 0 && Math.abs(addOrSubtract(100, lastValue)) <= lastValue)
						throw new IllegalSubtractionException();
					
					numberToSum = addOrSubtract(100, lastValue);
					arabianNum += numberToSum;
					lastValue = 100;
					numberOfC++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'L':
				
				if (numberOfL < 1) {
					
					if (numberToSum < 0 && Math.abs(addOrSubtract(50, lastValue)) <= lastValue)
						throw new IllegalSubtractionException();
					
					numberToSum = addOrSubtract(50, lastValue);
					arabianNum += numberToSum;
					lastValue = 50;
					numberOfL++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'X':
				if (numberOfX < 3) {
					if (numberToSum < 0 && Math.abs(addOrSubtract(10, lastValue)) <= lastValue)
						throw new IllegalSubtractionException();
					numberToSum = addOrSubtract(10, lastValue);
					arabianNum += numberToSum;
					lastValue = 10;
					numberOfX++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'V':
				if (numberOfV < 1) {
					if (numberToSum < 0 && Math.abs(addOrSubtract(5, lastValue)) <= lastValue)
						throw new IllegalSubtractionException();
					numberToSum = addOrSubtract(5, lastValue);
					arabianNum += numberToSum;
					lastValue = 5;
					numberOfV++;
				} else {
					throw new TooMuchSymbolRepetitionsException();
				}
				break;

			case 'I':
				if (numberOfI < 3) {
					
					if (numberToSum < 0 && Math.abs(addOrSubtract(1, lastValue)) <= lastValue)
						throw new IllegalSubtractionException();
					
					numberToSum = addOrSubtract(1, lastValue);
					arabianNum += numberToSum;
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

	private static int addOrSubtract(int actualValue, int previousValue) throws IllegalSubtractionException {

		/*
		 * Nel caso in cui il valore del carattere da processare è minore del
		 * valore del carattere più a destra sottrailo al numero calcolato
		 * finora. Altrimenti sommalo.
		 */
		if (actualValue < previousValue) {

			// The '5' symbols ('V', 'L', and 'D') can never be subtracted.
			if (actualValue == 5 || actualValue == 50 || actualValue == 500)
				throw new IllegalSubtractionException();

			/*
			 * The '1' symbols ('I', 'X', and 'C') can only be subtracted from
			 * the 2 next highest values ('IV' and 'IX', 'XL' and 'XC', 'CD' and
			 * 'CM').
			 */
			if ((actualValue == 1 && previousValue != 5 && previousValue != 10)
					|| (actualValue == 10 && previousValue != 50 && previousValue != 100)
					|| (actualValue == 100 && previousValue != 500 && previousValue != 1000)) {
				throw new IllegalSubtractionException();
			}

			return -actualValue;

		} else {
			return actualValue;
		}

	}

}
