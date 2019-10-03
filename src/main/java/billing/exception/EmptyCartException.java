package billing.exception;

public class EmptyCartException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyCartException(String message) {
		super(message);
	}
}
