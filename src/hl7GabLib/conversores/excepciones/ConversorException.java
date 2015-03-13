package hl7GabLib.conversores.excepciones;

public class ConversorException extends Exception{

	private Exception exception=null;
	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message="";
	
	private ConversorException() {
		// TODO Auto-generated constructor stub
	}
	
	public ConversorException(String m,Exception e){
		this.message=e.getMessage();
		this.exception=e;
		
	}

}
