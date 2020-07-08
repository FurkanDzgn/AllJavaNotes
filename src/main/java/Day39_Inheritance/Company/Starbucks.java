package Day39_Inheritance.Company;

public class Starbucks extends Company {
	
	public Starbucks(String companyName , int beginYear) {
		super(); // It is default constructor calling
		super.companyName = companyName;
		super.beginYear = beginYear;
	}
	
	@Override
	public boolean isHiring() {
		return false;
	}
	
	@Override
	public void service() {
		System.out.println("Starbucks is serving beverages.");
	}

}
