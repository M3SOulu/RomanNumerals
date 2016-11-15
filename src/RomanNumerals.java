import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * classe che implementa un convetitore di numeri romani
 * @author Mikele
 *
 */
public class RomanNumerals {
	
	
	private TreeMap<Character, Integer> romanVal;
	
	
	/**
	 * costruttore di default
	 */
	public RomanNumerals(){
		
		this.romanVal= new TreeMap<Character, Integer>();
		
		this.romanVal.put('I',1);
		this.romanVal.put('V',5);
		this.romanVal.put('X',10);
		this.romanVal.put('L',50);
		this.romanVal.put('C',100);
		this.romanVal.put('D',500);
		this.romanVal.put('M',1000);
		
	}
	
	/**
	 * converte una stringa in numeri romani in un valore intero
	 * @param romanNum stringa in numeri romani
	 * @return un valore intero corrispondente al numero romano
	 */
	public int convertToInteger(String romanNum) throws InvalidRomanNumeralsException{
		
		romanNum=romanNum.toUpperCase();
		int result=0;
		
		if(isValidRomanNumb(romanNum)){
				
			Character character= romanNum.charAt(romanNum.length()-1);
			
			result=romanVal.get(character);
			
			for(int i=romanNum.length()-2; i>=0;i--){
				
				if(romanVal.get(romanNum.charAt(i))<romanVal.get(romanNum.charAt(i+1))){
					
					result-=romanVal.get(romanNum.charAt(i));
					
				}else{
					
					result+=romanVal.get(romanNum.charAt(i));
				}
			}
			
		}else{
			
			throw new InvalidRomanNumeralsException();
		}
		
		
		
		
		return result;
		
	} 
	
	/**
	 * check if the roman number is valid
	 * @param roman not null
	 * @return true if it is valid, false otherwise
	 */
	boolean isValidRomanNumb(String roman){		
		
		return (checkForFirstRule(roman) && checkForSecondRule(roman) && checkForThirdRule(roman) 
				&& checkForFourthRule(roman) && checkForFifthRule(roman));
	}
	
	
	/**
	 * first rule:The symbols 'I', 'X', 'C', and 'M' can be repeated at most 3 times in a row.
	 * 
	 * @param roman
	 * @return true if is abided the rule
	 */
	boolean checkForFirstRule(String roman){
		
		//the regex depict INVALID combinations of chars accepted
		Pattern pattern=Pattern.compile("(IIII+)|(XXXX+)|(CCCC+)|(MMMM+)");
		Matcher matcher= pattern.matcher(roman);
		
		//negation in returned
		return !matcher.find();
	}
	
	/**
	 * second rule:The symbols 'V', 'L', and 'D' can never be repeated.
	 * @param roman
	 * @return true if is adibed the rule
	 */
	boolean checkForSecondRule(String roman){
		
		//the regex depict INVALID combinations of chars accepted
		Pattern pattern=Pattern.compile("(VV+)|(LL+)|(DD+)");
		Matcher matcher= pattern.matcher(roman);
		
		//negation in returned
		return !matcher.find();
	}
	
	/**
	 * third rule: The '1' symbols ('I', 'X', and 'C') can only be subtracted from the 2 next highest values ('IV' and 'IX', 'XL' and 'XC', 'CD' and 'CM').
	 * @param roman
	 * @return true if is adibed the rule
	 */
	boolean checkForThirdRule(String roman){
		
		//the regex depict INVALID combinations of chars accepted
		Pattern pattern=Pattern.compile("(I[LCDM])|(V[XLCDM])|(X[DM])|(L[CDM])|(DM)");
		Matcher matcher= pattern.matcher(roman);
		
		//negation in returned
		return !matcher.find();
	}
	
	
	/**
	 * fourth rule: Only one subtraction can be made per numeral ('XC' is allowed, 'XXC' is not).
	 * @param roman
	 * @return true if is adibed the rule
	 */
	boolean checkForFourthRule(String roman){
		
		//the regex depict INVALID combinations of chars accepted
		Pattern pattern=Pattern.compile("(II[VX])|(XX[LC])|(CC[DM])");
		Matcher matcher= pattern.matcher(roman);
		
		//negation in returned
		return !matcher.find();
	
	}
	
	/**
	 * fifth rule:The '5' symbols ('V', 'L', and 'D') can never be subtracted.
	 * @param roman
	 * @return true if is adibed the rule
	 */
	boolean checkForFifthRule(String roman){
		
		//the regex depict INVALID combinations of chars accepted
		Pattern pattern=Pattern.compile("(V[XLCDM])|(L[CDM])|(DM)");
		Matcher matcher= pattern.matcher(roman);
		
		//negation in returned
		return !matcher.find();
	}
}
