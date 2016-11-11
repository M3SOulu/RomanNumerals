
public class RomanNumerals {
	
	enum numbers{I,V,X,L,C,D,M};
	
	public int convertToInteger(String romanNum) {
		int arabicNumber = 0;
		char[] romanNumber = romanNum.toCharArray();

		if(romanNumber[0] == 'M') {
			arabicNumber = aggiungiMigliaia(romanNumber);
			
		} 
		
		return 0;
	}
	
	public int aggiungiMigliaia(char[] romanNumber) {
		int migliaia = 0;
		
		if(romanNumber[0] == 'M' && romanNumber[1] == 'M' && romanNumber[2] == 'M') {
			migliaia = 3000 + aggiungiCentinaia(romanNumber, 3);
		} else if(romanNumber[0] == 'M' && romanNumber[1] == 'M' && romanNumber[2] != 'M') {
			migliaia = 2000 + aggiungiCentinaia(romanNumber, 2);
		} else if(romanNumber[0] == 'M' && romanNumber[1] != 'M') {
			migliaia = 1000 + aggiungiCentinaia(romanNumber, 1);
		} else {
			migliaia = 0 + aggiungiCentinaia(romanNumber, 0);
		}
		
		return migliaia;
	}
	
	public int aggiungiCentinaia(char[] romanNumber, int index) {
		int centinaia = 0;
		int lunghezza = computeOneHundredLength(romanNumber, index);
		
		
		
		if(lunghezza == 4) {
			centinaia = 800 + aggiungiDecine(romanNumber, 4);
		} else if(lunghezza == 3) {
			if(romanNumber[index] == 'D' && romanNumber[index + 1] == 'C' && romanNumber[index + 2] == 'C' && romanNumber[index + 3] != 'C') {
				centinaia = 700 + aggiungiDecine(romanNumber, 3);
			} else {
				centinaia = 300 + aggiungiDecine(romanNumber, 3);
			}
		} else if(lunghezza == 2) {
			if(romanNumber[index] == 'C' && romanNumber[index + 1] == 'M') {
				centinaia = 900 + aggiungiDecine(romanNumber, 2);
			} else if(romanNumber[index] == 'D' && romanNumber[index + 1] == 'C') {
				centinaia = 600 + aggiungiDecine(romanNumber, 2);
			} else if(romanNumber[index] == 'C' && romanNumber[index + 1] == 'D') {
				centinaia = 400 + aggiungiDecine(romanNumber, 2);
			} else {
				centinaia = 200 + aggiungiDecine(romanNumber, 2);
			}
		} else if(lunghezza == 1) {
			if(romanNumber[index] == 'D') {
				centinaia = 500 + aggiungiDecine(romanNumber, 1);
			} else {
				centinaia = 100 + aggiungiDecine(romanNumber, 1);
			}
		} else {
			centinaia = 0 + aggiungiDecine(romanNumber, 0);
		}
		
		return centinaia;
	}
	
	public int aggiungiDecine(char[] romanNumber, int index) {
		int decine = 0;
		int lunghezza = computeTensLength(romanNumber, index);
		
		if(lunghezza == 4) {
			decine = 80;
		} else if(lunghezza == 3) {
			if(romanNumber[index] == 'L' && romanNumber[index + 1] == 'X' && romanNumber[index + 2] == 'X') {
				decine = 70;
			} else {
				decine = 30;
			}
		} else if(lunghezza == 2) {
			if(romanNumber[index] == 'X' && romanNumber[index + 1] == 'C') {
				decine = 90;
			} else if(romanNumber[index] == 'L' && romanNumber[index + 1] == 'X') {
				decine = 60;
			} else if(romanNumber[index] == 'X' && romanNumber[index + 1] == 'L') {
				decine = 40;
			} else if(romanNumber[index] == 'X' && romanNumber[index + 1] == 'X') {
				decine = 20;
			} else {
				decine = 0;
			}
		} else if(lunghezza == 1) {
			if(romanNumber[index] == 'L') {
				decine = 50;
			} else if(romanNumber[index] == 'X') {
				decine = 10;
			} else {
				decine = 0;
			}
		} else {
			decine = 0;
		}
		
		return decine;
	}
	
	int computeOneHundredLength(char[] romanNumber, int index) {
		int length=0;
		boolean flag = false;
		
		while(index < romanNumber.length && !flag) {
			if(romanNumber[index] == 'X' || romanNumber[index] == 'V' || romanNumber[index] == 'I'){
				flag = true;
			} else {
				index++;
				length++;
			}
		}
		
		return length;
	}
	
	int computeTensLength(char[] romanNumber, int index) {
		int length = 0;
		boolean flag = false;
		
		while(index < romanNumber.length && !flag) {
			if(romanNumber[index] == 'I' || romanNumber[index] == 'V') {
				flag = true;
			} else {
				index++;
				length++;
			}
		}
		
		return length;
	}
}
