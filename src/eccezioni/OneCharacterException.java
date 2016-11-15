package eccezioni;

@SuppressWarnings("serial")
public class OneCharacterException extends Exception{

	public OneCharacterException(){
		super("input non valido, le lettere V L e D non possono ripetersi");
	}

}
