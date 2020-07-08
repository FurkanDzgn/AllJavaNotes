package Day08.Objects;

public class Student {
	/*
	 * Variable-> fiels, attribute
	 * Methods-> functions, behaviours
	 */
	
	String name; // Instance variable - public variable
	int studentId; //
	char gender; //'M' / 'F'
	
	public void study() {
		int studyHours = 6; // Local variable 
		System.out.println(name + " is studying "+studyHours+" hours.");
	}
	
	public void attend () {
		// Kumar is atttending 6 hours class on weekends.
		int studyHours = 6; // local variable
		System.out.println(name+" is attending"+studyHours + " hours class on weekends.");
	}
	public void work(String position){ 
		// Kumar will work as position after completing a course
		// String position -> is my local variable
		System.out.println(name + " will work as "+position+" after completing a course.");
	}
	public void learn(String instructor) {
		// Kumar is learning from instructor
		//String instructor -> is my local variable
		System.out.println(name + " is learning from "+ instructor);	
	}
    public static void main(String[] args) {
    	Student student = new Student(); // object ,   student-> object name
    	
    	student.name = "Kumar";
    	student.studentId = 101;
    	student.gender = 'M';
    	
    	student.study();
    	student.attend();
    	student.work("SDET");
    	student.learn("Patel");
    	
    	Student student2 = new Student(); 
    	
    	student2.name = "John";
    	student2.studentId = 102;
    	student2.gender = 'M';
    	
    	Student student3 = new Student();
    	
    	student3.name = "Patel";
    	student3.studentId = 103;
    	student3.gender = 'M';
    	
    	System.out.println(student2.name);
    	student.name = "Harsh";
    	System.out.println(student.name);
    	
    	System.out.println(student3.name);
    	
    	/*\
    	 * Name Patel student id 103
    	 * Name John student id 102
    	 * Name Harsh student id 101
    	 */
    	System.out.println("Name "+student3.name +" studend id "+ student3.studentId);
    	System.out.println("Name "+student2.name +" studend id "+ student2.studentId);
    	System.out.println("Name "+student.name +" studend id "+ student.studentId);
    	
    	// Variables -> attributes of class
    	// Methods -> behaviours od class
    	student.study();  // Behaviour of student object
    	student2.study(); //behaviour os student2 object
    }
}
