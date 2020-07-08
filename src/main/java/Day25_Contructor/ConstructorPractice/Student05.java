package Day25_Contructor.ConstructorPractice;

public class Student05 {
	
	String name;
	int id;
	int age;

	//If we don't have any constructor java will create default constructor
	// If we create constructor with parameters, it will remove no argument constructor.
	
	public Student05(String name) {
	//	this.name = name;
	}
	
	public Student05() {
		
	}
	
	public Student05(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void getStudentInfo() {
		System.out.println("Name: "+name+"\nid: "+id+"\nAge: "+age);
	}
	
	public void study() {
		System.out.println(name+ " is studying");
	}
	
	
	
}
