package eccezioni;

@SuppressWarnings("serial")
public class ThreeCharactersException extends Exception{

	public ThreeCharactersException(){
		super("Input non valido. 'I', 'X', 'C' e'M' non possono essere ripetute per pi� di 3 volte");
	}

}
