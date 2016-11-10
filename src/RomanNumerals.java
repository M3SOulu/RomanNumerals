
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		if(romanNum == null){
			return 0;
		}
		
		int length = romanNum.length();
		int sum = 0;
		int pre = 0;
		
		for( int i = length - 1; i >= 0; i-- ){
			int cur = romanTable(romanNum.charAt(i));
			
			if(i == length - 1){
				sum = sum + cur;
			}else{
				if(cur<pre){
					sum = sum - cur;
				}else{
					sum = sum +cur;
				}
			}
			pre = cur;
		}
		return sum;
		
	}
	
	public int romanTable(char c){
		int num = 0;
		switch(c){
		case 'I':
			num = 1;
			break;
			
		case 'V':
			num = 5;
			break;
			
		case 'X':
			num = 10;
			break;
			
		case 'L':
			num = 50;
			break;
			
		case 'C':
			num = 100;
			break;
			
		case 'D':
			num = 500;
			break;
			
		case 'M':
			num = 1000;
			break;
		
		default:
			num = 0;
			break;
		}
		return num;
	}
	
	public boolean controlRepeatedIXCMymbols(String num){
		boolean res = true;
		int countI = 0;
		int countX = 0;
		int countC = 0;
		int countM = 0;
		for(int i = 0; i<num.length(); i++){
			char c = num.charAt(i);
			if(c == 'I'){
				countI++;
			}
			
			if(c == 'X'){
				countX++;
			}
			
			if(c == 'C'){
				countC++;
			}
			
			if(c == 'M'){
				countM++;
			}
				
		}
		
		if(countI>3 || countX>3 || countC>3 || countM>3 ){
			res = false;
		}
		
		return res;
		
	}
	
	public boolean controlRepeatedVLDSymbols(String num){
		boolean res = true;
		int countV = 0;
		int countL = 0;
		int countD = 0;
		
		for(int i = 0; i<num.length(); i++){
			char c = num.charAt(i);
			if(c == 'V'){
				countV++;
			}
			
			if(c == 'L'){
				countL++;
			}
			
			if(c == 'D'){
				countD++;
			}
				
		}
		
		if(countV>1 || countL>1 || countD>1 ){
			res = false;
		}
		
		return res;
		
	}
		
	}

