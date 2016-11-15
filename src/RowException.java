
public class RowException extends Exception {
	public RowException(){
		super("I,X,C,M non possono essere ripetuti più di tre volte consecutivamente!");
	}
	 
	public RowException(String msg){
		super( msg);
	}

}
