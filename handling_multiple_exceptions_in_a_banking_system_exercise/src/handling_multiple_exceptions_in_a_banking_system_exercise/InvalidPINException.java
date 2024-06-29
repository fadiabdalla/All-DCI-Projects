package handling_multiple_exceptions_in_a_banking_system_exercise;

public class InvalidPINException extends Exception {

	public InvalidPINException(String message) {
		super(message);
	
	}
}
