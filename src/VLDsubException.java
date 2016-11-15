
public class VLDsubException extends Exception {

	public VLDsubException(){
		super("V,L,D non possono essere sottratti!");
	}
	 
	public VLDsubException(String msg){
		super( msg);
	}
	
}
