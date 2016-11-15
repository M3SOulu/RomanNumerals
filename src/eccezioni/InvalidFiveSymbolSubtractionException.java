package eccezioni;

@SuppressWarnings("serial")
public class InvalidFiveSymbolSubtractionException extends Exception{

	public InvalidFiveSymbolSubtractionException(){
		super("Input non valido: i simboli V, L, D non possono essere sottratti");
	}
}
