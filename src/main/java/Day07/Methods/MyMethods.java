package Day07.Methods;

public class MyMethods {
	public void twoparams(String firstName, String lastName) {
		System.out.println(firstName+" "+lastName);
	}
	
	
	public static void main(String[] args) {
		MyMethods myMethod = new MyMethods();
		
		myMethod.twoparams("John", "Doe");
		
		myMethod.getAge(25);
	}
	
	public void getAge(int age) {
		System.out.println("My age is "+age);
		
	}

}
