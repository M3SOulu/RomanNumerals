
public class moreOneSubException extends Exception {

	public moreOneSubException(){
		super("Una sola sottrazione per numero può essere eseguita!");
	}
	 
	public moreOneSubException(String msg){
		super( msg);
	}
	
}
