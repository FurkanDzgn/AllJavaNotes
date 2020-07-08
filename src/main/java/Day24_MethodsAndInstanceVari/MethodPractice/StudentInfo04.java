package Day24_MethodsAndInstanceVari.MethodPractice;

import java.util.Arrays;

public class StudentInfo04 {
	
	String studentName;
	int count; // how many students we have at class
	String[] students = new String[5];
	
	public void addStudent() {
		students[count] = studentName;
		count++;
		
	}
	
	public void printNames() {
		
	//	System.out.println(Arrays.toString(students));
		for(String name: students) {
			System.out.println(name);
		}
	}

}
