package Day39_Inheritance.Company;
          // Google is a Company, Google is an Object
public class Google extends Company {

	int numberOfEmployees;
	
	public Google(String companyName, int beginYear, int numberOfEmployees) {
        super(); // It calls no-arguments constructor
		
//		super(companyName,beginYear); // It calls two arguments constructor
		super.companyName = companyName;
    	super.beginYear = beginYear;
		this.numberOfEmployees = numberOfEmployees;
	}
	
	// super is calling parent classes variable and methods
	// super() is calling parent classes constructor
	
	

	@Override
	public boolean isHiring() {
		return true;
	}
	
	@Override
	public void service() {
		System.out.println("Google is giving IT service.");
	}
}
