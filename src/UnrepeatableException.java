/**
 * viene lanciata quando viene violata la seconda regola dei numeri romani
 * {@link https://github.com/michelecafagna26/RomanNumerals}
 * @author Michele
 *
 */
public class UnrepeatableException extends Exception{
	
	
	public UnrepeatableException(){
		
		super("The symbols 'V', 'L', and 'D' can never be repeated.");
	}

}
