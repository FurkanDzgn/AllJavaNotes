package Day42.Account;

public class CreditAccount extends BankAccount {

	public CreditAccount(String accountType, int balance) {
		super(accountType, balance);
	}

	@Override
	public void deposit() {
		System.out.println("Depositing to credit account.");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawing from credit account.");
		
	}
	

}
