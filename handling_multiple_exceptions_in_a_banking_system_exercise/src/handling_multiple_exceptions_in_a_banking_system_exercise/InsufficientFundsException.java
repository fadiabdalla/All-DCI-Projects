package handling_multiple_exceptions_in_a_banking_system_exercise;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String message) {
		super(message);
	
	}
}
