package Day25_Contructor.ConstructorPractice;

public class Job07 {
	
	String position;
	double salary;
	String location;
	
	public Job07(String position) {
		this.position = position;
	}
	
	public Job07(String position,double salary) {
		this.position = position;
		this.salary = salary;
	}
	
	public Job07(String position,double salary, String location) {
		this(position,salary);  //  this() --> calling the constructor.
		this.location = location; // this --> calling instance variables.
	}
	
	public Job07() {
		
	}
	
	public static void main(String[] args) {
		Job07 job = new Job07("SDET", 1000000, "Chicago");
		System.out.println(job.location);
		System.out.println(job.position);
		System.out.println(job.salary);
		
		Job07 job2 = new Job07(); // by default i have no argument constructor
		
		job.getDetails();
		System.out.println("========");
		job2.getDetails();
		
	}
	
	public void getDetails() {
		System.out.println("position: "+position+"\nsalary: "+salary+"\nlocation: "+location); // each details are different objects
	}
}
