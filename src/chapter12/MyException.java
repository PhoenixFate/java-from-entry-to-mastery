package chapter12;

public class MyException extends Exception{

	/**
	 * 
	 */
	String message;
	private static final long serialVersionUID = 1L;
	public MyException(String ErrorMessage){
		message=ErrorMessage;
	}
	@Override
	public String getMessage() {
		
		return message;
	}
	
}
