

public class RomanNumerals {
	
	public void countCharOccurrences(String romanNum) throws illegalOccurenceLetterLVDException {
		int counterL = 0;
		int counterV = 0;
		int counterD = 0;

		//
		// Loop through the string and increment the counter if the
		// target character found in the string.
		//
		for (int i = 0; i < romanNum.length(); i++) {
			if (romanNum.charAt(i) == 'L') {
				counterL++;
			}
			if (romanNum.charAt(i) == 'V') {
				counterV++;
			}
			if (romanNum.charAt(i) == 'D') {
				counterD++;
			}
			if (counterL>1 || counterV>1 || counterD>1) throw new illegalOccurenceLetterLVDException();
		}
		
	}
	
	
	
	public int convertToInteger(String romanNum) throws illegalOccurenceLetterException, illegalOccurenceLetterLVDException {
		
		countCharOccurrences(romanNum);

		int value = 0;
		byte x = 0;
		int iCounter=0;
		int xCounter=0;
		int cCounter=0;
		int mCounter = 0;
		char target;
		
		

		for (int i = romanNum.length() - 1; i >= 0; i--) {

			switch (romanNum.charAt(i)) {
			case 'I':
				iCounter++;
				if (iCounter > 3)
					throw new illegalOccurenceLetterException();
				else{

				if (x <= 0)
					value += 1;
				else
					value -= 1;
				x = 0;
				
				}
				break;
				
			case 'V':
				if (x <= 1)
					value += 5;
				else
					value -= 5;
				x = 1;
				break;
			case 'X':
				xCounter++;
				if(xCounter>3) throw new illegalOccurenceLetterException();
				else{
					
				if (x <= 2)
					value += 10;
				else
					value -= 10;
				x = 2;
				
				}
				break;
				
			case 'L':
				if (x <= 3)
					value += 50;
				else
					value -= 50;
				x = 3;
				break;
			case 'C':
				cCounter++;
				if (cCounter>3) throw new illegalOccurenceLetterException();
				else {
				if (x <= 4)
					value += 100;
				else
					value -= 100;
				x = 4;
				
				}
				break;
				
			case 'D':
				if (x <= 5)
					value += 500;
				else
					value -= 500;
				x = 5;
				
				break;
				
			case 'M':
				mCounter++;
				if (mCounter>3) throw new illegalOccurenceLetterException();
				else{
				if (x <= 6)
					value += 1000;
				else
					value -= 1000;
				x = 6;
				
				}
				break;
			}
		}
		return value;

	}

	private void countCharOccurrences(String romanNum, char target) {
		// TODO Auto-generated method stub
		
	}
}
