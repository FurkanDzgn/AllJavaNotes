package Day42.Account;

public abstract class BankAccount {
	
	String accountType;
	int balance;
	
	public BankAccount(String accountType, int balance) {
		super();
		this.accountType = accountType;
		this.balance = balance;
	}
	
	public abstract void deposit();
	public abstract void withdraw();

	@Override
	public String toString() {
		return "BankAccount [accountType=" + accountType + ", balance=" + balance + "]";
	}
	
	
	
	
	

}
