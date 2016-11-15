
public class IXCsubException extends Exception {
		
	public IXCsubException(){
		super("I,X,C non possono essere sottratte");
	}
	 
	public IXCsubException(String msg){
		super( msg);
	}
	
}
