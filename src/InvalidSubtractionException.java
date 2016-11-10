/**
 * viene lanciata quando viene violata la quinta regola dei numeri romani
 * {@link https://github.com/michelecafagna26/RomanNumerals}
 * @author Michele
 *
 */
public class InvalidSubtractionException extends Exception{
	
	public InvalidSubtractionException(){
		
		super("The '1' symbols ('I', 'X', and 'C') can only be subtracted "
				+ "from the 2 next highest values ('IV' and 'IX', 'XL' and 'XC', 'CD' and 'CM').");
	}

}
