package Day40.Student;

public abstract class Student { // by default extents Object
	
	String studentName;
	int studentId;
	
    abstract void watchClass();  // access modifier is default
	
	public void study() {
		System.out.println("Student is studying.");
	}
	
	

}
