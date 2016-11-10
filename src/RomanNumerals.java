
public class RomanNumerals {

	public int convertToInteger(String romanNum) throws illegalOccourenceLetterIXCM, illegalOccourenceLetterVLD {

		{
			int value = 0;
			byte x = 0;
			
			countCharOccurrences(romanNum,'V');
			countCharOccurrences(romanNum,'L');
			countCharOccurrences(romanNum,'D');

			int countCharI = 0;
			int countCharX = 0;
			int countCharC = 0;
			int countCharM = 0;

			for (int i = romanNum.length() - 1; i >= 0; i--) {
				if (countCharI > 3 || countCharX > 3 || countCharC > 3 || countCharM > 3)
					throw new illegalOccourenceLetterIXCM();

				switch (romanNum.charAt(i)) {
				case 'I':
					countCharI++;
					if (x <= 0)
						value += 1;
					else
						value -= 1;
					x = 0;
					break;
				case 'V':
					if (x <= 1)
						value += 5;
					else
						value -= 5;
					x = 1;
					break;
				case 'X':
					countCharX++;
					if (x <= 2)
						value += 10;
					else
						value -= 10;
					x = 2;
					break;
				case 'L':
					if (x <= 3)
						value += 50;
					else
						value -= 50;
					x = 3;
					break;
				case 'C':
					countCharC++;
					if (x <= 4)
						value += 100;
					else
						value -= 100;
					x = 4;
					break;
				case 'D':
					if (x <= 5)
						value += 500;
					else
						value -= 500;
					x = 5;
					break;
				case 'M':
					countCharM++;
					if (x <= 6)
						value += 1000;
					else
						value -= 1000;
					x = 6;
					break;
				}
			}
			return value;
		}

	}

	public static int countCharOccurrences(String source, char target) throws illegalOccourenceLetterVLD {

		int counter = 0;

		// Loop through the string and increment the counter if the
		// target character found in the string.

		for (int i = 0; i < source.length(); i++) {

			if (source.charAt(i) == target) {

				counter++;

			}
			if (counter>1)
				throw new illegalOccourenceLetterVLD();

		}

		return counter;

	}
}
