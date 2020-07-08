package Day25_Contructor.ConstructorPractice;

public class Classroom06 {
	public static void main(String[] args) {
		
		Student05 std1 = new Student05();
		Student05 std2 = new Student05("Patel");
		
		std2.id=102;
		std2.age=25;
		
		std1.age=20;
		std1.name="Kumar";
		std1.id=101;
		
		std2.getStudentInfo();
		System.out.println("========");
		std1.getStudentInfo();
		
		System.out.println("=========");
		std1.study();
		std2.study();
		
	}

}
