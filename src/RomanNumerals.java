import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
	private List<Character> romanStrings;
	private static Integer[] romanNumbers = { 1, 5, 10, 50, 100, 500, 1000 };
	
	public RomanNumerals()
	{
		romanStrings = getRomanNumbers();
	}

	/**
	 * a roman number is made up of: I, V, X, L, C, D, M
	 * @param romanNum
	 * @return true if the string contains only roman characters
	 */
	public boolean isRoman( String romanNum )
	{
		for( int i = 0; i < romanNum.length(); i++ ){
			if( ! romanStrings.contains( romanNum.charAt( i ) ) )
				return false;
		}

		return true;
	}

	/**
	 * The symbols 'I', 'X', 'C', and 'M' can be repeated at most 3 times in a row.
	 * @param romanNum
	 * @return true if is correct
	 */
	public boolean control1( String romanNum )
	{
		int countI = 0;
		int countX = 0;
		int countC = 0;
		int countM = 0;

		for( int i = 0; i < romanNum.length(); i++ ){
			if( romanNum.charAt( i ) == 'I' ){
				countI++;
			}
			if( romanNum.charAt( i ) == 'X' ){
				countX++;
			}
			if( romanNum.charAt( i ) == 'C' ){
				countC++;
			}
			if( romanNum.charAt( i ) == 'M' ){
				countM++;
			}

		}

		if( countI > 3 || countX > 3 || countC > 3 || countM > 3 ){
			return false;
		}

		return true;
	}

	/**
	 * The symbols 'V', 'L', and 'D' can never be repeated.
	 * @param romanNum
	 * @return true if is correct
	 */
	public boolean control2( String romanNum )
	{
		int countV = 0;
		int countL = 0;
		int countD = 0;

		for( int i = 0; i < romanNum.length(); i++ ){
			if( romanNum.charAt( i ) == 'V' ){
				countV++;
			}
			if( romanNum.charAt( i ) == 'L' ){
				countL++;
			}
			if( romanNum.charAt( i ) == 'D' ){
				countD++;
			}

		}

		if( countV > 1 || countL > 1 || countD > 1 ){
			return false;
		}

		return true;
	}


	/**
	 * 
	 * @param romanNum
	 * @return
	 */
	public boolean control3( String romanNum )
	{
		if( romanNum.length() == 1 ){
			return true;
		}

		for( int i = romanNum.length() - 2; i >= 0; i-- ){
			if( romanNum.charAt( i ) == 'I' ){
				
			}
			if( romanNum.charAt( i ) == 'X' ){

			}
			if( romanNum.charAt( i ) == 'C' ){

			}
		}

		return true;
	}

	/**
	 * execute all controls on roman number
	 * @param romanNum
	 * @return true if the string is a valid roman number
	 */
	public boolean isValidRoman( String romanNum )
	{
		if( ! isRoman( romanNum ) ){
			return false;
		}
		if( ! control1( romanNum ) ){
			return false;
		}
		if( ! control2( romanNum ) ){
			return false;
		}
		
		return true;
	}

	/**
	 * convert a roman number into an integer
	 * @param romanNum
	 * @return the number
	 * @throws InvalidRomanNumberException
	 */
	public int convertToInteger( String romanNum ) throws InvalidRomanNumberException{
		if( ! isValidRoman( romanNum ) ){
			throw new InvalidRomanNumberException();
		}



		return 0;		
	}
	
	
	
	/**
	 * 
	 * @return a list that contains roman numbers
	 */
	public static List<Character> getRomanNumbers()
	{
		List<Character> romanNumbers = new ArrayList<>();
		romanNumbers.add( 'I' );
		romanNumbers.add( 'V' );
		romanNumbers.add( 'X' );
		romanNumbers.add( 'L' );
		romanNumbers.add( 'C' );
		romanNumbers.add( 'D' );
		romanNumbers.add( 'M' );
		
		return romanNumbers;
	}
}
