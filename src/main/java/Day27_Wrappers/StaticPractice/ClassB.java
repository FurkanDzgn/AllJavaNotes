package Day27_Wrappers.StaticPractice;

public class ClassB {
	public static void main(String[] args) {
		
	//	System.out.println(ClassA.c);
		
		ClassA classA1 = new ClassA(5,2,3); // a=5, b=2, c=3;
		classA1.a = classA1.a+classA1.c; // classA1.a = 5 + 3 = 8
		
		ClassA classA2 = new ClassA(1,2,12); // c=12, classA2.a = 1, classA2.b = 2;
		ClassA.c = ClassA.c +classA2.a; // ClassA.c = 12 + 1= 13
		classA2.a = classA1.a+ classA2.c; // classA2.a = 8 + 13 = 21 
		
		System.out.println(classA1.a); // 8
		System.out.println(ClassA.c);  // 13
		System.out.println(classA2.a); // 21

		
	}

}
