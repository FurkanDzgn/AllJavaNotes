package Bank3.project;

import static org.junit.Assert.assertEquals;

import Bank3.project.AccountInfo;
import Bank3.project.BankAccount;
import org.junit.Test;
/**
 * 	
 * @author Arslan K.
 *
 */
public class Tests {
	
	BankAccount b=new BankAccount();
	
	@Test
	public void testTask1() {
		System.out.println(b.customers);
		String name="Sarah";
		String lastName="Mclain";
		Integer balance=1000;
		String city="chicago";
		AccountInfo accountinfo=new AccountInfo(name,lastName,balance,city);
		b.customers.add(accountinfo);
		assertEquals("Sarah Mclain,1000,chicago",b.customers.get(b.customers.size()-1).toString());
	}
	
	@Test
	public void testHighestBalance() {
		String name="Pete";
		assertEquals(name,b.highestBalance());
	}
	
	@Test
	public void testAddArray() {
		AccountInfo[] newCustom=new AccountInfo[] {new AccountInfo("john","peterson", 500,"chicago"),new AccountInfo("colleen","clark", 2500,"los angeles"),new AccountInfo("David","Mel", 99000,"chicago")};
		assertEquals(63,b.addArray(newCustom).size());
	}
	
	@Test
	public void testCountChicago() {
		assertEquals(20,b.countChicagoCustomers());
	}
	
	@Test
	public void testUpdateBalance1() {
		AccountInfo customer1=new AccountInfo("Henry", "Holloway",200,"los angeles");
		AccountInfo customer2=new AccountInfo("Juan", "Wilkins",200,"seattle");
		assertEquals(new AccountInfo("Henry", "Holloway",1800,"los angeles").toString(),b.updateBalance(customer1).toString());
		assertEquals(new AccountInfo("Juan", "Wilkins",8800,"seattle").toString(),b.updateBalance(customer2).toString());
	}
	
	
	@Test
	public void testUpdateBalance2() {
		AccountInfo customer=new AccountInfo("Joann", "Scott",200,"seattle");
		assertEquals(null,b.updateBalance(customer));
	}
	
	@Test
	public void testRemoveDuplicates() {
		assertEquals(54,b.removeDuplicate());
	}
	
	@Test
	public void testTransferMoney1() {
		AccountInfo from = b.customers.get(5);
		AccountInfo to = b.customers.get(6);
		b.transferMoney(from, to, 5000);
		assertEquals(b.customers.get(5).balance,new Integer(50000));
		assertEquals(b.customers.get(6).balance,new Integer(7000));
	}
	
	@Test
	public void testTransferMoney2() {
		AccountInfo from = b.customers.get(2);
		AccountInfo to = b.customers.get(4);
		b.transferMoney(from, to, 65);
		assertEquals(b.customers.get(2).balance,new Integer(500));
		assertEquals(b.customers.get(4).balance,new Integer(2065));
	}
	
	

}
