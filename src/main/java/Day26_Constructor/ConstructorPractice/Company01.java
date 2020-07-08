package Day26_Constructor.ConstructorPractice;

public class Company01 {
	
	String name;
	String location;
	int yearlyBudget;
	int numberOfEmployees;
	
	public Company01(String name, String location, int yearlyBudget, int numberOfEmployees) {
		this.name=name;
		this.location=location;
		this.yearlyBudget=yearlyBudget;
		this.numberOfEmployees=numberOfEmployees;
	}
	
	public void displayInfo() {
		System.out.println(name+"\n"+location+"\n"+yearlyBudget+"\n"+numberOfEmployees);
	}
	
	
	
	

}
