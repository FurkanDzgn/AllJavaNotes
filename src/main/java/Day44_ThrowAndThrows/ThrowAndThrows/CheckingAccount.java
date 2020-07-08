package Day44_ThrowAndThrows.ThrowAndThrows;

public class CheckingAccount extends Account{
	
	int balance;
	
	@Override
	public void charge(int amount) throws InsufficientFundsException  { // same or sub-classes.
		if(balance<amount) {
			throw new InsufficientFundsException(balance+" is less than"+amount);
		}
		balance -=amount;
	}
	
	@Override
	public void deposit(int amount) throws NullPointerException { // or sub-classes
		balance = balance+ amount;
	}
	
	@Override
	public void withdraw(int amount) {
		if(balance<amount) {
			try {
			throw new Exception();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		balance -=amount;
	}
	

}
