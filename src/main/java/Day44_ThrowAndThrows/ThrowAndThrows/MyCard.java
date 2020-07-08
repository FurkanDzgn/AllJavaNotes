package Day44_ThrowAndThrows.ThrowAndThrows;

public class MyCard {
	
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount();
		ca.balance=100;
		
		ca.charge(50);
		
		ca.deposit(100);
		
		try {
     		ca.withdraw(200);
		} catch (Exception e) {
	         System.out.println(e);	
		}
	}

}
