package Day44_ThrowAndThrows.ThrowAndThrows;

public class InsufficientFundsException extends RuntimeException {
	
	public InsufficientFundsException() {
		super();
	}
	
	// throw new InsufficientFundsException("No balance");
	
	public InsufficientFundsException(String message) {
		super(message);
	}
	
	public static void main(String[] args) throws InsufficientFundsException {
		
		throw new InsufficientFundsException("No balance");
	}

}
