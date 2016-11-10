import java.util.TreeMap;

public class RomanNumerals {
	
	private TreeMap<Character, Integer> romanVal;
	
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
