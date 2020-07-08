package Bank3.project;

public class AccountInfo {
	
	// Create other instance variables
	// String balance;
    
	String name;
    String lastName;
    String city;
    Integer balance;
	
	public AccountInfo(String name, String lastName, Integer balance, String city) {
	    this.name = name;
	    this.lastName = lastName;
	    this.city = city;
	    this.balance = balance;
	}
	public String toString() {
		                           //  String.valueOf(balance) ,,,   balance.toString();
			String result = name+" "+lastName+","+balance+","+city;

		return result;
		}

}
