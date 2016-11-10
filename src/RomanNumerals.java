public class RomanNumerals {
	String romanNum;
	
	public RomanNumerals(String romanNum){
		this.romanNum = romanNum;
	}
	
	public RomanNumerals(){
		this.romanNum = "I";
	}
	
	public int convertToInteger() {
		int decimal = 0;

	    String romanNumeral = romanNum.toUpperCase();
	    for(int i = 0; i<romanNumeral.length(); i++)
	    {
	        char convertToDecimal = romanNum.charAt(i);

	        switch (convertToDecimal)
	        {
	        case 'M':
	            decimal += 1000;
	            break;

	        case 'D':
	            decimal += 500;
	            break;

	        case 'C':
	            decimal += 100;
	            break;

	        case 'L':
	            decimal += 50;
	            break;

	        case 'X':
	            decimal += 10;
	            break;

	        case 'V':
	            decimal += 5;
	            break;

	        case 'I':
	            decimal += 1;
	            break;
	        }
	    }
	    if (romanNumeral.contains("IV"))
	    {
	        decimal-=2;
	    }
	    if (romanNumeral.contains("IX"))
	    {
	        decimal-=2;
	    }
	    if (romanNumeral.contains("XL"))
	    {
	        decimal-=10;
	    }
	    if (romanNumeral.contains("XC"))
	    {
	        decimal-=10;
	    }
	    if (romanNumeral.contains("CD"))
	    {
	        decimal-=100;
	    }
	    if (romanNumeral.contains("CM"))
	    {
	        decimal-=100;
	    }
	    return decimal;	
	}



	public String getRomanNum() {
		return romanNum;
	}



	public void setRomanNum(String romanNum) {
		this.romanNum = romanNum;
	}
}
