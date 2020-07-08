package Day29.Practice;

import java.util.Arrays;
import java.util.List;

public class Classroom {
	public static void main(String[] args) {
		
		Student student1 = new Student("Murat", 101, 123456, "123 Devon Rd.");
	
		System.out.println(student1.getName());
		
	    student1.setName("Furkan ");
		System.out.println(student1.getName());
		
		// Name address StudentId
		
		System.out.println(student1.getName()+student1.getAddress()+student1.getId());
	//	System.out.println(student1.toString());
		
		List<Student> students = Arrays.asList(new Student("Patel", 102, 4567876, "22 Dee Rd."),
				new Student("Jhon", 103, 4245637, "4 Clark St."),
				new Student("David", 104, 1594465, "100 Washington ave."),
				new Student("Kate", 105, 8461651, "101 Sheridan Rd."));
		
		// Encapsulation purpose is to prevent changes on variables.
		
		for(Student student:students) {
			System.out.println(student.getSSN());
		}
		
		// Encryption -> Original value and converting it to some code value
		// numbers -> characters ---->>> Encrypt value 
		
		
		
	}

}
