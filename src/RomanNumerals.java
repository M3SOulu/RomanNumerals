import java.util.TreeMap;

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
	public int convertToInteger(String romanNum) {
		
		romanNum=romanNum.toUpperCase();
		
		Character character= romanNum.charAt(romanNum.length()-1);
		
		int result=romanVal.get(character);
		
		for(int i=romanNum.length()-2; i>=0;i--){
			
			if(romanVal.get(romanNum.charAt(i))<romanVal.get(romanNum.charAt(i+1))){
				
				result-=romanVal.get(romanNum.charAt(i));
				
			}else{
				
				result+=romanVal.get(romanNum.charAt(i));
			}
		}
		
		
		return result;
		
	} 
	
	boolean isValidRomanNumb(String roman){
		
		
		//TODO implementation
		
		return false;
	}
	
	
	/**
	 * first rule:The symbols 'I', 'X', 'C', and 'M' can be repeated at most 3 times in a row.
	 * 
	 * @param roman
	 * @return true if is abided the rule
	 */
	boolean checkForFirstRule(String roman){
		
		boolean result=false;
		
		if(countMatches(roman, "I")<=3 && countMatches(roman, "X")<=3 && countMatches(roman, "C")<=3 && countMatches(roman, "M")<=3)
			result=true;
			 
		return result;
	}
	
	/**
	 * second rule:The symbols 'V', 'L', and 'D' can never be repeated.
	 * @param roman
	 * @return
	 */
	boolean checkForSecondRule(String roman){
		
		boolean result=false;
		
		if(countMatches(roman, "V")<=1 && countMatches(roman, "L")<=1 && countMatches(roman, "D")<=1)
			result=true;
			 
		return result;
	}
	
	boolean checkforThirdRule(String roman){
		
		boolean result=false;
		
		if(!roman.matches("(I[LCDM])|(V[XLCDM])|(X[DM])|(L[CDM])|DM"))
			result=true;
		
		return result;
	}
	
	/**
	 * return the number of occurences of substr in string 
	 * 
	 * @param string not null
	 * @param substr not null
	 * @return
	 */
	 static int countMatches(String string, String substr ){
		
		return string.length() -string.replace(substr, "").length();
	}
	
}
