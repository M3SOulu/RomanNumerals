/**
 * thrown when is trying to convert an invalid roman number to an int value
 * @author Michele
 *
 */
public class InvalidRomanNumeralsException extends Exception{
	
	InvalidRomanNumeralsException(){
		
		super("Invalid Roman number");
	}

}
