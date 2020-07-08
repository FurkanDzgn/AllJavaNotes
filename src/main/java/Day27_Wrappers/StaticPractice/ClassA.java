package Day27_Wrappers.StaticPractice;

public class ClassA {
	
	int a;
	int b;
	static int c;
	
	public ClassA(int a,int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	static {
        c=10;
    }

}
