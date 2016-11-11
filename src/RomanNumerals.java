import java.util.ArrayList;

public class RomanNumerals {
	private ArrayList<String> romanStrings;
	private static Integer[] romanNumbers = { 1, 5, 10, 50, 100, 500, 1000 };

	public RomanNumerals()
	{
		romanStrings = new ArrayList<>();
		romanStrings.add( "I" );
		romanStrings.add( "V" );
		romanStrings.add( "X" );
		romanStrings.add( "L" );
		romanStrings.add( "C" );
		romanStrings.add( "D" );
		romanStrings.add( "M" );
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


	public boolean control3( String romanNum )
	{
		if( romanNum.length() == 1 ){
			return true;
		}

		for( int i = romanNum.length() - 2; i >= 0; i-- ){
			if( romanNum.charAt( i ) == 'I' && ! ( romanNum.charAt( i + 1 ) == 'I' || 
					romanNum.charAt( i + 1 ) == 'V' || 
					romanNum.charAt( i + 1 ) == 'X' ) ){
				return false;
			}
			if( romanNum.charAt( i ) == 'X' ){

			}
			if( romanNum.charAt( i ) == 'C' ){

			}
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
		if( ! isRoman( romanNum ) ){
			throw new InvalidRomanNumberException();
		}

		if( ! control1( romanNum ) ){
			throw new InvalidRomanNumberException();
		}

		if( ! control2( romanNum ) ){
			throw new InvalidRomanNumberException();
		}



		return 0;		
	}
}
