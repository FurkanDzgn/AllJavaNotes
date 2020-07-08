package Day42.Account;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String accountType, int balance) {
		super(accountType, balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposited to Checking account.");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawing from Checking account.");
		
	}
	
	
	public void transaction(Integer amount) {
		System.out.println("Integer transaction.");
	}
	
	public void transaction(Double amount) {
		System.out.println("Double transaction.");
	}
	
	

}
