package Day39_Inheritance.Company;

public class TestCompany {
	public static void main(String[] args) {
		
		Google google = new Google("Google", 1995, 10000);
		
		google.service();
		System.out.println("****");
		System.out.println(google.isHiring());
		System.out.println("***");
		
		Starbucks starbucks = new Starbucks("Starbucks", 2000);
		System.out.println("**");
		starbucks.service();
	}

}
