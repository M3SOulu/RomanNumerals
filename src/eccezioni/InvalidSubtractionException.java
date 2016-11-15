package eccezioni;

@SuppressWarnings("serial")
public class InvalidSubtractionException extends Exception{
	
	public InvalidSubtractionException(){
		super("Input non valido: 'I' 'X' 'C' si possono trovare in queste combinazioni: (IV, IX, XL, XC, CD, CM )");
	}

}
