package Day26_Constructor.ConstructorPractice;

public class Employee03 {
	
	String name;
	int employeeId;
	static String company; // static variables / Class variable
    static int  count; // static variables / Class variable
	
	public Employee03(String name,int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
		count++;
		
	}
	
	public void work() {
		System.out.println(name+" is working in"+company);
	}
	

}
