/**
 * Copyright 2019 Techtorial LLC
 */
package Bank3.project;

import Bank3.project.AccountInfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * 
 * @author Arslan K.
 *
 */
public class BankAccount {
 
	ArrayList<AccountInfo> customers;

	{
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("data/names.txt"));
			String line = br.readLine();
			customers = new ArrayList<>();
			while (line != null) {
				String[] accountDetails = line.split(",");
				String[] nameLastName = accountDetails[0].split(" ");
				AccountInfo o1 = new AccountInfo(nameLastName[0], nameLastName[1], Integer.parseInt(accountDetails[1]),
						accountDetails[2]);
				customers.add(o1);
				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("File not loaded");
		} finally {
		}
	}

	/**
	 * Write a method that will count customers only from Chicago 
	 * Use customers -> holds all Customer AccountInfo objects as ArrayList
	 * 
	 * @return int -> number of customers from Chicago
	 */
	public int countChicagoCustomers() {
		
		int result=0;
		
		for(int i=0; i<customers.size(); i++) {
			if(customers.get(i).city.equalsIgnoreCase("Chicago")) {
				result++;
			}
		}
		return result;
		
//		int count = 0;
//		for(int i=0; i< customers.size(); i++) {
//			if(customers.get(i).city.equalsIgnoreCase("chicago")) {
//				 count++;
//			}
//		}
//		
//		return count;
	}

	/**
	 * Write a method that will return person name who has highest balance
	 * Use customers -> holds all Customer AccountInfo objects as ArrayList
	 * 
	 * @return String (name of person who has highest balance)
	 */

	public String highestBalance() {
		
		int temp = customers.get(0).balance;
		int i=1;
		int index=0;
		
		for(; i<customers.size();i++) {
			if(customers.get(i).balance>temp) {
				temp=customers.get(i).balance;
				index=i;
			}
		}
		
		return customers.get(index).name;
		
//		int temp=customers.get(0).balance;
//		int i=1;
//		int index=0;
//		for(;i<customers.size(); i++) {
//			if(customers.get(i).balance>temp) {	
//				temp=customers.get(i).balance;
//				index=i;
//			}
//		}	
//		return customers.get(index).name;
	}

	/**
	 * Write a method that will accept Arrays of accountInfo object and 
	 * will add them to ArrayList customers and then return customers with
	 * added new customers as ArrayList
	 * 
	 * @parameter array of accountInfo
	 * @return ArrayList -> returns customers ArrayList with added new customers
	 */
	public ArrayList<AccountInfo> addArray(AccountInfo[] newCustomers) {
		
		
		for(int i=0; i<newCustomers.length; i++) {
			customers.add(newCustomers[i]);
		}
	
		return customers;
	}

	/**
	 * Write a code that will set up a new balance for the customer who made some
	 * transaction. If customer is not in the list then return null 
	 * Use customers -> holds all Customer AccountInfo objects as ArrayList
	 * 
	 * For example: 
	 * 		Original record: Anna Dennis,300,atlanta -> parameter provided to
	 * 		method updateCustomer(new accountInfo("Anna", "Dennis", 50, "atlanta")); ->
	 * 		return should be Anna Dennis,250,atlanta as AccountInfo object
	 * 
	 * @parameter accountInfo Object
	 * @return accountInfo object
	 * 
	 */

	public AccountInfo updateBalance(AccountInfo transaction) {
		
		for(AccountInfo cst:customers) {
			
			if(cst.name.equals(transaction.name ) 
					&& cst.lastName.equals(transaction.lastName) 
					&& cst.city.equals(transaction.city)) {
			cst.balance = cst.balance - transaction.balance;
			return cst;
			}
		}
		return null;
	}
	
	
	/**
	 * This method will transfer money within bank customers.
	 * from -> is an object that money will be transfered from
	 * to -> is an object that money will be transfered from
	 * Method should update their balance accordingly, 
	 * and return the same customers list with updated 
	 * balance for those customers who transfered money.
	 * 
	 * 
	 * @param from
	 * @param to
	 * @param amount
	 * @return
	 */
	
	public ArrayList<AccountInfo> transferMoney(AccountInfo from, AccountInfo to, int amount){
		
		int newBalance1 = from.balance - amount;
		int newBalance2 = to.balance + amount;
		
		customers.get(customers.indexOf(from)).balance = newBalance1;
		
		customers.get(customers.indexOf(to)).balance = newBalance2;

		return customers;
	}

	/**
	 * Write a method that will remove all duplicate customers from customers
	 * ArrayList and return number of unique customers
	 * 
	 * @return ArrayList of unique customers
	 */

	public int removeDuplicate() {
		
		int result =customers.size();
		
		for(int i=0; i<customers.size(); i++) {
			for(int a=0; a<customers.size();a++) {
				if(customers.get(i).name.equals(customers.get(a).name)  && 
						customers.get(i).lastName.equals(customers.get(a).lastName)&&
						customers.get(i).balance.equals(customers.get(a).balance)&&
						customers.get(i).city.equals(customers.get(a).city)&&
						i!=a) {
					customers.remove(a);
					result--;
				}	
			}
		}

		return result;
	}

}