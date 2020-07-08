package Day39_Inheritance.Company;

public class Company extends Object {
   // we have default extends Objects and default constructor
	
	public Company() {
		super();  // no argument constructor comes from object class
		System.out.println("Company class no-argument constructor.");
	}
	
	String companyName;
	int beginYear;
	
	public Company(String companyName, int beginYear) {
	// 	super(); //  if didn't call no argument constructor we need use super();
		this();
		this.companyName = companyName;
		this.beginYear = beginYear;
		System.out.println("Company class two argument constructor.");
	//	this(); it has to come before variables
	}
	
	public boolean isHiring() {
		return false;
	}
	
	public void service() {
		System.out.println("Company service.");
	}

}
