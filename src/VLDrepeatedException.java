
public class VLDrepeatedException extends Exception {
	
	public VLDrepeatedException(){
		super("V,L,D non possono essere ripetuti");
	}
	 
	public VLDrepeatedException(String msg){
		super( msg);
	}

}
