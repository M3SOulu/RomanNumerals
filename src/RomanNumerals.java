
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		
		int risultato = 0;
		int posizione = 0;
		
		for(int i = romanNum.length()-1; i>=0; i--){
			switch(romanNum.charAt(i))
			{
			case 'I':
				if (posizione <= 0)
					risultato+=1;
				else 
					risultato-=1;
				posizione = 0;
				break;
				
			case 'V':
				if (posizione <= 1)
					risultato+=5;
				else 
					risultato-=5;
				posizione = 1;
				break;
				
			case 'X':
				if (posizione <= 2)
					risultato+=10;
				else 
					risultato-=10;
				posizione = 2;
				break;
				
			case 'L':
				if (posizione <= 3)
					risultato+=50;
				else 
					risultato-=50;
				posizione = 3;
				break;
				
			case 'C':
				if (posizione <= 4)
					risultato+=100;
				else 
					risultato-=100;
				posizione = 4;
				break;
				
			case 'D':
				if (posizione <= 5)
					risultato+=500;
				else 
					risultato-=500;
				posizione = 5;
				break;
			
			case 'M':
				if (posizione <= 6)
					risultato+=1000;
				else 
					risultato-=1000;
				posizione = 6;
				break;
			}
		}
		return risultato;
	}
}