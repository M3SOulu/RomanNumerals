
public class RomanNumerals {

	public static int convertToInteger(String romanNum) throws IllegalCharacterException{
		
		int arabianNum = 0;
		int lastValue = 0;
		romanNum = romanNum.toUpperCase();
		
		//Scelgo di processare la stringa da destra a sinistra
		for (int i = romanNum.length() - 1; i >= 0; i--) {
			
			//Estraggo i caratteri romani uno per uno
			char charToConvert = romanNum.charAt(i);

			switch (charToConvert) {
			
			case 'M':
				arabianNum = addOrSubtract(1000, lastValue, arabianNum);
				lastValue = 1000;
				break;

			case 'D':
				arabianNum = addOrSubtract(500, lastValue, arabianNum);
				lastValue = 500;
				break;

			case 'C':
				arabianNum = addOrSubtract(100, lastValue, arabianNum);
				lastValue = 100;
				break;

			case 'L':
				arabianNum = addOrSubtract(50, lastValue, arabianNum);
				lastValue = 50;
				break;

			case 'X':
				arabianNum = addOrSubtract(10, lastValue, arabianNum);
				lastValue = 10;
				break;

			case 'V':
				arabianNum = addOrSubtract(5, lastValue, arabianNum);
				lastValue = 5;
				break;

			case 'I':
				arabianNum = addOrSubtract(1, lastValue, arabianNum);
				lastValue = 1;
				break;
				
			default:
				throw new IllegalCharacterException();
			}
		}
		return arabianNum;
	}

	public static int addOrSubtract(int actualValue, int previousValue, int arabianNum) {
		
		/*
		 * Nel caso in cui il valore del carattere da processare è minore del valore del carattere più a destra
		 * sottrailo al numero calcolato finora. Altrimenti sommalo.
		 */
		if (actualValue < previousValue) {
			return arabianNum - actualValue;
		} else {
			return arabianNum + actualValue;
		}
	}
}
