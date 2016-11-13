import java.util.Arrays;

public class ValidateRomanNumber {

	private char[] romanN;

	public boolean validInput(String romanNum) {
		if (!(isValidAlphabetInput(romanNum) && isValidInputMaxIXCM(romanNum) && isValidInputVLD(romanNum)
				&& isValidSubtractions(romanNum) && isValidDoNotSubtractions(romanNum)))
			return false;
		return true;
	}

	public boolean isValidAlphabetInput(String romanNum) {
		romanN = tempRomanNumber(romanNum);
		for (char c : romanN) {
			if (!(c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M')) {
				return false;
			}
		}
		return true;
	}

	public boolean isValidInputMaxIXCM(String romanNum) {
		romanN = tempRomanNumber(romanNum);
		if (!(isValidInputMax3('I') && isValidInputMax3('X') && isValidInputMax3('C') && isValidInputMax3('M')))
			return false;
		return true;
	}

	public boolean isValidInputVLD(String romanNum) {
		romanN = tempRomanNumber(romanNum);
		if (!(isValidInputMax1('V') && isValidInputMax1('L') && isValidInputMax1('D')))
			return false;
		return true;
	}

	public boolean isValidSubtractions(String romanNum) {
		romanN = tempRomanNumber(romanNum);
		char[] validI = { 'V', 'X' };
		char[] validX = { 'L', 'C', 'I', 'V' };
		char[] validC = { 'D', 'M', 'I', 'V', 'X', 'L' };
		if (!(isValidateCharFollowing('I', validI) && isValidateCharFollowing('X', validX)
				&& isValidateCharFollowing('C', validC)))
			return false;
		return true;
	}

	public boolean isValidDoNotSubtractions(String romanNum) {
		romanN = tempRomanNumber(romanNum);
		char[] invalidV = { 'X', 'L', 'C', 'D', 'M' };
		char[] invalidL = { 'C', 'D', 'M' };
		char[] invalidD = { 'M' };
		if (!(isValidateCharDoNotSubtractions('V', invalidV) && isValidateCharDoNotSubtractions('L', invalidL)
				&& isValidateCharDoNotSubtractions('D', invalidD)))
			return false;
		return true;
	}

	private boolean isValidInputMax3(char x) {
		if (countOccurrences(x) > 3)
			return false;
		return true;
	}

	private boolean isValidInputMax1(char x) {
		if (countOccurrences(x) > 1)
			return false;
		return true;
	}

	private int countOccurrences(char x) {
		int count = 0;
		for (char c : romanN) {
			if (c == x)
				count++;
		}
		return count;
	}

	private char[] tempRomanNumber(String romanNum) {
		String romanNumUp = romanNum.toUpperCase();
		char[] numR = romanNumUp.toCharArray();
		return numR;
	}

	private boolean isValidateCharFollowing(char x, char[] charValid) {
		char c = 'K';// K è un simbolo fasullo per il primo ciclo del for
		char d = 'K';// K è un simbolo fasullo nel caso lunghezza 1 del romanN;
		char[] charInvalid = Arrays.copyOfRange(charValid, 0, 2);

		for (int i = romanN.length - 1; i >= 1; i--) {
			d = romanN[i - 1];
			if (romanN[i] == x) {
				if ((d == x) && (isEqualElementOfArray(c, charInvalid)))
					return false;
				if (c != 'K' && !(c == x || isEqualElementOfArray(c, charValid)))
					return false;
			}
			c = romanN[i];
		}
		if (d == x && !(c == x || isEqualElementOfArray(c, charValid)))
			return false;
		return true;
	}

	private boolean isValidateCharDoNotSubtractions(char x, char[] charInvalid) {
		char d;
		for (int i = romanN.length - 2; i >= 0; i--) {
			d = romanN[i + 1];
			if (romanN[i] == x) {
				for (char c : charInvalid) {
					if (d == c)
						return false;
				}
			}
		}
		return true;
	}

	private boolean isEqualElementOfArray(char x, char[] charInvalid) {
		for (char c : charInvalid) {
			if (x == c)
				return true;
		}
		return false;
	}

}
