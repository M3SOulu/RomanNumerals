
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		
		int decimal = 0;
		int lastNumber = 0;
		
		String romanNumber = romanNum.toUpperCase();
		for(int x = romanNum.length() - 1; x >= 0 ; x--){
			char convertToDecimal = romanNum.charAt(x);
			
			switch(convertToDecimal){
			case 'M':
				decimal = processDecimal(1000, lastNumber, decimal);
                lastNumber = 1000;
                break;
			
			case 'D':
				decimal = processDecimal(500, lastNumber, decimal);
                lastNumber = 500;
                break;
			
			case 'C':
				decimal = processDecimal(100, lastNumber, decimal);
                lastNumber = 100;
                break;

				
			case 'L':
				decimal = processDecimal(50, lastNumber, decimal);
                lastNumber = 50;
                break;
				
			case 'X':
				decimal = processDecimal(10, lastNumber, decimal);
                lastNumber = 10;
                break;
				
			case 'V':
				decimal = processDecimal(5, lastNumber, decimal);
                lastNumber = 5;
                break;
				
			case 'I':
				decimal = processDecimal(1, lastNumber, decimal);
                lastNumber = 1;
                break;
			}	
		}
		
		return decimal;
		
	}
	public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }
	
	public boolean checkCharacters(String romanNum){
		int counterI = 0;
		int counterX = 0;
		int counterC = 0;
		int counterV = 0;
		int counterL = 0;
		int counterD = 0;
		for(int i = 0; i < romanNum.length(); i++){
			if(romanNum == "I")
				counterI++;
			if(romanNum == "X")
				counterX++;
			if(romanNum == "C")
				counterC++;
			if(romanNum == "V")
				counterV++;
			if(romanNum == "L")
				counterL++;
			if(romanNum == "D")
				counterD++;
		}
		if(counterI > 3)
			return false;
		if(counterX > 3)
			return false;
		if(counterC > 3)
			return false;
		if(counterV > 1)
			return false;
		if(counterL > 1)
			return false;
		if(counterD > 1)
			return false;
		return false;
	}
}
