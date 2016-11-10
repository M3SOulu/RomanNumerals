import java.util.Scanner;

//import com.sun.java.util.jar.pack.Instruction.Switch;

public class RomanNumerals {
	
	public static int convertToInteger(String romanNum) {
		int value = 0; 
		byte x = 0;
		
		for(int i=romanNum.length()-1; i>=0; i--){
			switch(romanNum.charAt(i)){
		case 'I': 
			if(x>0) value++;
			else	  value--;
			x=0;
			break;
		case 'V':
			if (x<=1)	value+=5;
			else		value-=5;
			x=1;
			break;
		case 'X':
			if (x<=2)	value+=10;
			else		value-=10;
			x=2;
			break;
		case 'L':
			if (x<=3)	value+=50;
			else		value-=50;
			x=3;
			break;
		case 'C':
			if (x<=4)	value+=100;
			else		value-=100;
			x=4;
			break;
		case 'D':
			if (x<=5)	value+=500;
			else		value-=500;
			x=5;
			break;
		case 'M':
			if (x<=6)	value+=1000;
			else		value-=1000;
			x=6;
			break;
	}
}
		return value;
}
	public static void main(){
		
		//System.out.println();
	}
}
