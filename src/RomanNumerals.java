public class RomanNumerals {
	/* decimal number */
	int decimalNum;

	public int getDecimalNum() {
		return decimalNum;
	}

	public void setDecimalNum(int decimalNum) {
		this.decimalNum = decimalNum;
	}
    
	/* roman number */
	String romanNum;
	
	public String getRomanNum() {
		return romanNum;
	}

	public void setRomanNum(String romanNum){
		this.romanNum = romanNum;
	}

	/* contructors */
	public RomanNumerals(String romanNum) throws InvalidRomanNumberException{
		this.romanNum = romanNum;
		this.decimalNum = this.convertToInteger();
	}
	
	public RomanNumerals(int decimalNum){
		this.decimalNum = decimalNum;
		this.romanNum = this.convertToRomanNumeral();
	}
	
	public RomanNumerals(){
		this.romanNum = "I";
		this.decimalNum = 1;
	}
	
	/* method that verify if the roman number is correct */
	public boolean isRoman(String s){
	    return !s.isEmpty() && s.matches("M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})");
	}
	
	/* method that convert the attribute "romanNum" in a decimal number and assign that decimal at the attribute "decimalNum" */
	public int convertToInteger() throws InvalidRomanNumberException {
		if(!(isRoman(this.romanNum))) throw new InvalidRomanNumberException();
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNum.toUpperCase();
        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
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

	/* a support method for the method "convertToInteger" that sums or subs the next char of the entire roman number */
    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }

    /* method that convert the attribute "decimalNum" in a roman number and assign that roman number at the attribute "romanNum" */
    public String convertToRomanNumeral() {
        if (decimalNum < 1 || decimalNum > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        while (decimalNum >= 1000) {
            s += "M";
            decimalNum -= 1000;        }
        while (decimalNum >= 900) {
            s += "CM";
            decimalNum -= 900;
        }
        while (decimalNum >= 500) {
            s += "D";
            decimalNum -= 500;
        }
        while (decimalNum >= 400) {
            s += "CD";
            decimalNum -= 400;
        }
        while (decimalNum >= 100) {
            s += "C";
            decimalNum -= 100;
        }
        while (decimalNum >= 90) {
            s += "XC";
            decimalNum -= 90;
        }
        while (decimalNum >= 50) {
            s += "L";
            decimalNum -= 50;
        }
        while (decimalNum >= 40) {
            s += "XL";
            decimalNum -= 40;
        }
        while (decimalNum >= 10) {
            s += "X";
            decimalNum -= 10;
        }
        while (decimalNum >= 9) {
            s += "IX";
            decimalNum -= 9;
        }
        while (decimalNum >= 5) {
            s += "V";
            decimalNum -= 5;
        }
        while (decimalNum >= 4) {
            s += "IV";
            decimalNum -= 4;
        }
        while (decimalNum >= 1) {
            s += "I";
            decimalNum -= 1;
        }    
        return s;
    }
}
