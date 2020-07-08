package Day26_Constructor.ConstructorPractice;

public class Employees04 {
	
	public static void main(String[] args) {
		
		// static variables can be called with class name
		Employee03.company = "Google";
//		Employee03.count = 0;
		
		Employee03 employee1 = new Employee03("Patel", 101); // Google
		Employee03 employee2 = new Employee03("Srikkanth", 102); // Google
		Employee03 employee3 = new Employee03("Murat", 103); // Google
		
		System.out.println(employee3.company);
		System.out.println(employee2.company);
		System.out.println(employee1.company);
		
		Employee03.company = "Apple";
		
		System.out.println(employee3.company);
		System.out.println(employee2.company);
		System.out.println(employee1.company);
		
		employee2.company = "JP Morgan Chase";
		
		System.out.println(employee3.company);
		System.out.println(employee2.company);
		System.out.println(employee1.company);
		
		System.out.println(Employee03.count);
		System.out.println(employee1.count);
		
		employee1.work();
	}

}
