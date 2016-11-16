import java.util.ArrayList;
import java.util.List;

public class RomanNumerals{
	private List<Character> romanStrings;
	private Integer[] romanNumbers = { 1, 5, 10, 50, 100, 500, 1000 };
	
	public RomanNumerals()
	{
		setRomanNumbers();
	}
	
	/**
	 * set roman numbers
	 */
	private void setRomanNumbers()
	{
		romanStrings = new ArrayList<>();
		
		romanStrings.add( 'I' );
		romanStrings.add( 'V' );
		romanStrings.add( 'X' );
		romanStrings.add( 'L' );
		romanStrings.add( 'C' );
		romanStrings.add( 'D' );
		romanStrings.add( 'M' );
	}
	
	/**
	 * compare roman numbers symbol
	 * @param arg0
	 * @param arg1
	 * @return true if arg0 is lower than arg1
	 */
	private boolean isLower( Character arg0, Character arg1 ) {
		// TODO Auto-generated method stub
		int value0 = romanNumbers[ romanStrings.indexOf( arg0 ) ];
		int value1 = romanNumbers[ romanStrings.indexOf( arg1 ) ];
		
		if( (value0 - value1) < 0 ){
			return true;
		}
		else{
			return false;
		}
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
	 * The '1' symbols ('I', 'X', and 'C') can only be subtracted from the 
	 * 2 next highest values ('IV' and 'IX', 'XL' and 'XC', 'CD' and 'CM').
	 * @param romanNum
	 * @return true if is correct
	 */
	public boolean control3( String romanNum )
	{
		if( romanNum.length() == 1 ){
			return true;	//there arent subtractions
		}

		boolean state = true;
		for( int i = romanNum.length() - 2; i >= 0; i-- ){
			if( romanNum.charAt( i ) == 'I' ){
				//allowed symbols after I are: I, V, X
				state = romanStrings.subList( 0, 3 ).contains( romanNum.charAt( i+1 ) );
			}
			if( romanNum.charAt( i ) == 'X' ){
				//allowed symbols after X are: I, V, X, L, C
				state = romanStrings.subList( 0, 5 ).contains( romanNum.charAt( i+1 ) );
			}
			//after C all symbols are allowed so the control has no sense
			
			//if( romanNum.charAt( i ) == 'C' ){
				//allowed symbols after C are: I, V, X, L, C, D, M
				//state = romanStrings.subList( 0, 7 ).contains( romanNum.charAt( i+1 ) );
			//}
			
			if( state == false ){
				return false;
			}
		}

		return true;
	}
	
	
	/**
	 * Only one subtraction can be made per numeral ('XC' is allowed, 'XXC' is not).
	 * @param romanNum
	 * @return true if is correct
	 */
	public boolean control4( String romanNum )
	{
		if( romanNum.length() == 2 ){
			return true;	//there arent double subtractions
		}

		boolean state = true;
		for( int i = romanNum.length() - 2; i > 0; i-- ){
			if( romanNum.charAt( i ) == 'I' && isLower( 'I', romanNum.charAt( i+1 ) ) ){
				state = (romanNum.charAt( i-1 ) != 'I');
			}
			if( romanNum.charAt( i ) == 'X' && isLower( 'X', romanNum.charAt( i+1 ) ) ){
				state = (romanNum.charAt( i-1 ) != 'X');
			}
			if( romanNum.charAt( i ) == 'C' && isLower( 'C', romanNum.charAt( i+1 ) ) ){
				state = (romanNum.charAt( i-1 ) != 'C');
			}
			if( state == false ){
				return false;
			}
		}

		return true;
	}
	
	/**
	 * The '5' symbols ('V', 'L', and 'D') can never be subtracted.
	 * @param romanNum
	 * @return true if is correct
	 */
	public boolean control5( String romanNum )
	{
		if( romanNum.length() == 1 ){
			return true;	//there arent subtractions
		}

		boolean state = true;
		for( int i = romanNum.length() - 2; i >= 0; i-- ){
			if( romanNum.charAt( i ) == 'V' ){
				state = romanStrings.subList( 0, 1 ).contains( romanNum.charAt( i+1 ) );
			}
			if( romanNum.charAt( i ) == 'L' ){
				state = romanStrings.subList( 0, 3 ).contains( romanNum.charAt( i+1 ) );
			}
			if( romanNum.charAt( i ) == 'D' ){
				state = romanStrings.subList( 0, 5 ).contains( romanNum.charAt( i+1 ) );
			}
			if( state == false ){
				return false;
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
		if( ! control3( romanNum ) ){
			return false;
		}
		if( ! control4( romanNum ) ){
			return false;
		}
		if( ! control5( romanNum ) ){
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
		
		
		int n = 0;
		for( int i = romanNum.length() - 1; i >= 0; i-- ){
			int value = romanNumbers[ romanStrings.indexOf( romanNum.charAt( i ) ) ];
			
			if( (i != romanNum.length() - 1) && isLower( romanNum.charAt( i ), romanNum.charAt( i+1 ) )  ){
				value -= (value*2);		//the value is subtracted
			}
			
			n += value;
		}

		return n;		
	}

	
	
	
	
	
}
