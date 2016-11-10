/**
 * viene lanciata quando viene violata la prima regola dei numeri romani
 * {@link https://github.com/michelecafagna26/RomanNumerals}
 * @author Michele
 *
 */
public class TooMuchRepeatException extends Exception{
	
	public TooMuchRepeatException(){
		
		super("The symbols 'I', 'X', 'C', and 'M' can be repeated at most 3 times in a row");
	}

}
