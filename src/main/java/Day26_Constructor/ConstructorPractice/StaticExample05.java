package Day26_Constructor.ConstructorPractice;

public class StaticExample05 {
	
	int a;
	int b;
	static int c; // class variables
	
	public StaticExample05(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public static void main(String[] args) {
		
		StaticExample05 se1 = new StaticExample05(5,6,2);
		int sum=se1.a+se1.c; // 5+2
	//	System.out.println(sum);
	//	System.out.println(se1.c);
		
		StaticExample05 se2 = new StaticExample05(2,1,10);
	    sum+=se2.a+se1.c; // 7+2+10=19
	//    System.out.println(sum);
	    
		StaticExample05 se3 = new StaticExample05(8,5,8);
		sum = sum + se3.c+se1.c+se2.c; // 19+8+8+8=43
	//	System.out.println(se1.c);
		
		System.out.println(sum);
	}

}
