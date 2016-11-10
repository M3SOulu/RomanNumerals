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
	
}
