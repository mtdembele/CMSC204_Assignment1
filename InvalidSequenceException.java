/**
 * 
 * @author MDembele
 *
 */
public class InvalidSequenceException extends Exception {

public InvalidSequenceException() {
		super();
	}
	
	private static final String message = "The password cannot contain more than two of the same character in sequence.";

	 /**
	  * @returns message
	  */
	public String getMessage() {
		return message;
	}
}
