package PhoneApp.packApp;

public class Contact {

    /*
    1-  Create the Private instance variables
    firstName, lastName, Company, phoneNumber, emails, city
    2- Create getters and setter for this variables
    3- Create the constructor to initialize your instance variables and constructor must be private
    4- Create one method to instantiate object of contact,
    otherwise since constructor is private you can not instantiate
     */
	
	private String firstName;
	private String lastName;
	private String company;
	private long phoneNumber;
	private String emails;
	private String city;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmails() {
		return emails;
	}
	public void setEmails(String emails) {
		this.emails = emails;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	private Contact(String firstName, String lastName, String company, long phoneNumber, String emails, String city) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.company=company;
		this.phoneNumber=phoneNumber;
		this.emails=emails;
		this.city=city;
		
	}
	
	public static Contact getConcat(String firstName, String lastName, String company,
			long phoneNumber, String emails, String city) {
		
		Contact cont = new Contact( firstName,  lastName,  company, phoneNumber,  emails,  city);
		return cont;
	}

	
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", company=" + company + ", phoneNumber="
				+ phoneNumber + ", emails=" + emails + ", city=" + city + "]";
	}
	
}
