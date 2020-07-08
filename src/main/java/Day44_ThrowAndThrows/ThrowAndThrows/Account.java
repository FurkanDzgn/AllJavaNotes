package Day44_ThrowAndThrows.ThrowAndThrows;

public class Account {
	
	int balance;
	
	public void charge(int amount) throws Exception{
		if(amount>balance) {
			throw new RuntimeException();
		}
		balance = balance-amount;
	}
	
	public void deposit(int amount) throws NullPointerException{
		balance =  balance+amount;
	}
	
	public void withdraw(int amount) throws Exception{
		if(amount>balance) {
			throw new Exception();
		}
		balance = balance - amount;
		
	//	charge(amount);
		
	}
	
}
