import eccezioni.*;

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
	
	public boolean checkNoMoreThanThreeCharacters(String romanNum) throws ThreeCharactersException{
		int counterI = 0;
		int counterX = 0;
		int counterC = 0;
		int counterM = 0;
		for(int i = 0; i < romanNum.length(); i++){
			if(romanNum == "I")
				counterI++;
			if(romanNum == "X")
				counterX++;
			if(romanNum == "C")
				counterC++;
			if(romanNum == "M")
				counterM++;
		}
		if(counterI > 3 || counterX > 3 || counterC > 3 || counterM > 3)
			throw new ThreeCharactersException();
		return false;	
		
	}
	
	public boolean checkNoMoreThanOneCharacter(String romanNum) throws OneCharacterException{
		
		int counterV = 0;
		int counterL = 0;
		int counterD = 0;
		for(int i = 0; i < romanNum.length(); i++){
			if(romanNum == "V")
				counterV++;
			if(romanNum == "L")
				counterL++;
			if(romanNum == "D")
				counterD++;
		}
		if(counterV > 1 || counterL > 1 || counterD > 1)
			throw new OneCharacterException();
		return false;
	}
	
	public boolean subtractionFromTheTwoHighestValues(String romanNum) throws InvalidSubtractionException{
		char [] charVector = new char[romanNum.length()];
		charVector = romanNum.toCharArray();
		for(int i = 0; i < charVector.length - 1; i++){
			switch(charVector[i]){
			case 'I':
				if(charVector[i+1] == 'L' || charVector[i+1] == 'C' || charVector[i+1] == 'D' || charVector[i+1] == 'M'){
					throw new InvalidSubtractionException();
				}
				break;
			case 'X':
				if(charVector[i+1] == 'D' || charVector[i+1] == 'M'){
					throw new InvalidSubtractionException();
				}
				break;
			case 'C':
				if(charVector[i+1] == 'D' || charVector[i+1] == 'M'){
					return true;
				}
				break;
			}
		}
		return false;
	}
	
	public boolean onlyOneSubtraction(String romanNum) throws InvalidSubtractionException{
		char[] charVector = new char[romanNum.length()];
		charVector = romanNum.toCharArray(); 
		for(int i = 0; i < charVector.length - 1; i++){
		
			switch(charVector[i]){
			case 'I':
				if((charVector[i+1] == 'I' && charVector[i+2] == 'V') || (charVector[i+1] == 'I' && charVector[i+2] == 'X')
				|| (charVector[i+1] == 'X' && charVector[i+2] == 'L') || (charVector[i+1] == 'X' && charVector[i+2] == 'C')
				|| (charVector[i+1] == 'C' && charVector[i+2] == 'D') || (charVector[i+1] == 'C' && charVector[i+2] == 'M'))
					throw new InvalidSubtractionException();
				break;
			case 'X':
				if((charVector[i+1] == 'X' && charVector[i+2] == 'L') || (charVector[i+1] == 'X' && charVector[i+2] == 'C')
				|| (charVector[i+1] == 'C' && charVector[i+2] == 'D') || (charVector[i+1] == 'C' && charVector[i+2] == 'M'))
					throw new InvalidSubtractionException();
				break;
			case 'C':
				if((charVector[i+1] == 'C' && charVector[i+2] == 'D') || (charVector[i+1] == 'C' && charVector[i+2] == 'M'))
					throw new InvalidSubtractionException();
			}
		}
		return false;
	}
	
	public boolean noSubtractionWithFiveSymbols(String romanNum) throws InvalidFiveSymbolSubtractionException{
		char[] charVector = new char[romanNum.length()];
		charVector = romanNum.toCharArray(); 
		for(int i = 0; i < charVector.length - 1; i++){
			switch(charVector[i]){
			case 'V':
				if(charVector[i+1] == 'X' || charVector[i+1] == 'L' || charVector[i+1] == 'C' || charVector[i+1] == 'D' || charVector[i+1] == 'M')
					throw new InvalidFiveSymbolSubtractionException();
				break;
			case 'L':
				if(charVector[i+1] == 'C' || charVector[i+1] == 'D' || charVector[i+1] == 'M')
					throw new InvalidFiveSymbolSubtractionException();
				break;
			case 'D':
				if(charVector[i+1] == 'M')
					throw new InvalidFiveSymbolSubtractionException();
				break;
			}
		}
		return false;
	}
}
