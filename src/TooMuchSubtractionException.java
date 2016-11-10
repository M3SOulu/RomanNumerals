/**
 * viene lanciata quando viene violata la quarta regola dei numeri romani
 * {@link https://github.com/michelecafagna26/RomanNumerals}
 * @author Michele
 *
 */
public class TooMuchSubtractionException extends Exception{
	
	public TooMuchSubtractionException(){
		
		super("Only one subtraction can be made per numeral ('XC' is allowed, 'XXC' is not).");
	}

}
