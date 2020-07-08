package Day24_MethodsAndInstanceVari.MethodPractice;

public class MeetingRoom05 {
	public static void main(String[] args) {
		
		StudentInfo04 sti = new StudentInfo04();
		
		sti.studentName = "Jhon";
		sti.addStudent();
		
		sti.studentName = "Elizabeth";
		sti.addStudent();
		System.out.println(sti.count);
		
		sti.studentName = "Mark";
		sti.addStudent();
		
		sti.studentName = "Murat";
		sti.addStudent();
		
		sti.studentName = "Patel";
		sti.addStudent();
		
		System.out.println(sti.count);
		
		sti.printNames();
	}


}
