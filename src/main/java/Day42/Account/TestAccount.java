package Day42.Account;

import java.util.ArrayList;
import java.util.List;

public class TestAccount {
	public static void main(String[] args) {
		
		BankAccount account1 = new CheckingAccount("Visa", 500);
	
		// Virtual Method ***
		// Dynamic Polymorphism ***
		account1.deposit();// While code is compiling it is looking to BankAccount class's method
		                   // once code is running it will run from CheckingAccount class.
		 // method comes from BankAccount, implemantation comes from CheckingAccount
		
	
		 // method comes from CheckingAccount, implemantation comes from CheckingAccount
	   ((CheckingAccount)account1).deposit(); //  --> casting
		
  //    CheckingAccount c= account1;// --> this is imposible  
		
		CheckingAccount account2 = new CheckingAccount("Master Card", 1000);
		// Static Polymorphism ***
		account2.transaction(100.2d); // at compile time this method will determine which method exactly run
		
		BankAccount account3 = new CreditAccount("AMEX", 800);
		
		List<BankAccount> accounts = new ArrayList();
		
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		for(BankAccount account:accounts) {
			System.out.println(account.balance);
		}
		
	}	
	
}
