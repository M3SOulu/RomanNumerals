
public class RomanNumerals {
	
	public int convertToInteger(String romanNum) throws InvalidTensException, InvalidUnitException, InvalidOneHundredException {
		int arabicNumber = 0;
		char[] romanNumber = romanNum.toCharArray();

		arabicNumber = aggiungiMigliaia(romanNumber);
		
		return arabicNumber;
	}
	
	public int aggiungiMigliaia(char[] romanNumber) throws InvalidTensException, InvalidUnitException, InvalidOneHundredException {
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
	
	public int aggiungiCentinaia(char[] romanNumber, int index) throws InvalidTensException, InvalidUnitException, InvalidOneHundredException {
		int centinaia = 0;
		int lunghezza = computeOneHundredLength(romanNumber, index);
		
		
		
		if(lunghezza == 4) {
			if(romanNumber[index] == 'D' && romanNumber[index + 1] == 'C' && romanNumber[index + 2] == 'C' && romanNumber[index + 3] == 'C') {
				centinaia = 800 + aggiungiDecine(romanNumber, 4);				
			} else {
				throw new InvalidOneHundredException();
			}
		} else if(lunghezza == 3) {
			if(romanNumber[index] == 'D' && romanNumber[index + 1] == 'C' && romanNumber[index + 2] == 'C' && romanNumber[index + 3] != 'C') {
				centinaia = 700 + aggiungiDecine(romanNumber, 3);
			} else if(romanNumber[index] == 'C' && romanNumber[index + 1] == 'C' && romanNumber[index + 2] == 'C') {
				centinaia = 300 + aggiungiDecine(romanNumber, 3);
			} else {
				throw new InvalidOneHundredException();
			}
		} else if(lunghezza == 2) {
			if(romanNumber[index] == 'C' && romanNumber[index + 1] == 'M') {
				centinaia = 900 + aggiungiDecine(romanNumber, 2);
			} else if(romanNumber[index] == 'D' && romanNumber[index + 1] == 'C') {
				centinaia = 600 + aggiungiDecine(romanNumber, 2);
			} else if(romanNumber[index] == 'C' && romanNumber[index + 1] == 'D') {
				centinaia = 400 + aggiungiDecine(romanNumber, 2);
			} else if(romanNumber[index] == 'C' && romanNumber[index + 1] == 'C'){
				centinaia = 200 + aggiungiDecine(romanNumber, 2);
			} else {
				throw new InvalidOneHundredException();
			}
		} else if(lunghezza == 1) {
			if(romanNumber[index] == 'D') {
				centinaia = 500 + aggiungiDecine(romanNumber, 1);
			} else if(romanNumber[index] == 'C'){
				centinaia = 100 + aggiungiDecine(romanNumber, 1);
			} else {
				throw new InvalidOneHundredException();
			}
		} else {
			centinaia = 0 + aggiungiDecine(romanNumber, 0);
		}
		
		return centinaia;
	}
	
	public int aggiungiDecine(char[] romanNumber, int index) throws InvalidTensException, InvalidUnitException {
		int decine = 0;
		int lunghezza = computeTensLength(romanNumber, index);
		
		if(lunghezza == 4) {
			if(romanNumber[index] == 'L' && romanNumber[index + 1] == 'X' && romanNumber[index + 2] == 'X' && romanNumber[index + 3] == 'X') {
				decine = 80 + aggiungiUnita(romanNumber, 4);	
			} else {
				throw new InvalidTensException();
			}
			
		} else if(lunghezza == 3) {
			if(romanNumber[index] == 'L' && romanNumber[index + 1] == 'X' && romanNumber[index + 2] == 'X') {
				decine = 70 + aggiungiUnita(romanNumber, 3);
			} else if(romanNumber[index] == 'X' && romanNumber[index + 1] == 'X' && romanNumber[index + 2] == 'X'){
				decine = 30 + aggiungiUnita(romanNumber, 3);
			} else {
				throw new InvalidTensException();
			}
		} else if(lunghezza == 2) {
			if(romanNumber[index] == 'X' && romanNumber[index + 1] == 'C') {
				decine = 90 + aggiungiUnita(romanNumber, 2);
			} else if(romanNumber[index] == 'L' && romanNumber[index + 1] == 'X') {
				decine = 60 + aggiungiUnita(romanNumber, 2);
			} else if(romanNumber[index] == 'X' && romanNumber[index + 1] == 'L') {
				decine = 40 + aggiungiUnita(romanNumber, 2);
			} else if(romanNumber[index] == 'X' && romanNumber[index + 1] == 'X') {
				decine = 20 + aggiungiUnita(romanNumber, 2);
			} else {
				throw new InvalidTensException();
			}
		} else if(lunghezza == 1) {
			if(romanNumber[index] == 'L') {
				decine = 50 + aggiungiUnita(romanNumber, 1);
			} else if(romanNumber[index] == 'X') {
				decine = 10 + aggiungiUnita(romanNumber, 1);
			} else {
				throw new InvalidTensException();
			}
		} else {
			decine = 0 + aggiungiUnita(romanNumber, 0);
		}
		
		return decine;
	}
	
	public int aggiungiUnita(char[] romanNumber, int index) throws InvalidUnitException {
		int unita = 0;
		int lunghezza = (romanNumber.length - index);
		
		if(lunghezza == 4) {
			unita = 8;
		} else if(lunghezza == 3) {
			if(romanNumber[index] == 'V' && romanNumber[index + 1] == 'I' && romanNumber[index + 2] == 'I') {
				unita = 7;
			} else if(romanNumber[index] == 'I' && romanNumber[index + 1] == 'I' && romanNumber[index + 2] == 'I') {
				unita = 3;
			} else {
				throw new InvalidUnitException();
			}
		} else if(lunghezza == 2) {
			if(romanNumber[index] == 'I' && romanNumber[index + 1] == 'X') {
				unita = 9;
			} else if(romanNumber[index] == 'V' && romanNumber[index + 1] == 'I') {
				unita = 6;
			} else if(romanNumber[index] == 'I' && romanNumber[index + 1] == 'V') {
				unita = 4;
			} else if(romanNumber[index] == 'I' && romanNumber[index + 1] == 'I') {
				unita = 2;
			} else {
				throw new InvalidUnitException();
			}
		} else if(lunghezza == 1) {
			if(romanNumber[index] == 'V') {
				unita = 5;
			} else if(romanNumber[index] == 'I') {
				unita = 1;
			} else {
				throw new InvalidUnitException();
			}
		} else {
			unita = 0;
		}
		
		return unita;
	}
	
	
	
	private int computeOneHundredLength(char[] romanNumber, int index) {
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
	
	private int computeTensLength(char[] romanNumber, int index) {
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
