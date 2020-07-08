package Day24_MethodsAndInstanceVari.MethodPractice;

public class MethodOverloading10 {
	
	public void myMethod(String name) {
		System.out.println("Method with String parameter");
	}
	
	public void myMethod(int num) {
		System.out.println("Method with int parameter");
	}
	
	public void myMethod(short num) {
		System.out.println("Method with short parameter");
	}
	
	private void myMethod(double num) {
		System.out.println("Method with double parameter");
	}
	
	private boolean myMethod(boolean value) {
		System.out.println("Method with boolean parameter");
		return false;
	}
	public static void main(String[] args) {
		MethodOverloading10 mo = new MethodOverloading10();
		mo.myMethod("David");
		mo.myMethod(true);
		mo.myMethod(123);
		short num=10;
		mo.myMethod(num);
		mo.myMethod(2.15);
		
		// public --> this method is accessible anywhere
		//Public --> this method is accessible from anywhere
	  	//Private --> can be accessed only within the class
	}

}
