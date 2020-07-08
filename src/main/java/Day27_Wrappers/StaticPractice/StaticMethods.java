package Day27_Wrappers.StaticPractice;

public class StaticMethods {
	
	public static void method1() {
		System.out.println("I am static method 1.");
		
	}
	
	public void method2() {
		System.out.println("I am non-stactic method 2.");
		method1(); //  we can call static method under different non-static method
		method4(); //  we can call non-static method under different non-static method
		method3();
	}
	
	public static void method3() {
		System.out.println("I am static method 3.");
		method1(); // we can call static method under different static method
	}
	
	public void method4() {
		System.out.println("I am non-static method 4.");
	}
	
	
	public static void main(String[] args) {
	
		StaticMethods.method1(); // we don't need Staticmethods because same class name
	    method3();
	    
	    StaticMethods sm = new StaticMethods();
	    
	    sm.method2();
	    sm.method4();
	   
	    
	    // 1. The performance of the application.
	    // 2. It is very useful for utility classes.
	    	
	}

}
