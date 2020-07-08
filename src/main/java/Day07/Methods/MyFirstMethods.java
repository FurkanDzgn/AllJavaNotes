package Day07.Methods;

public class MyFirstMethods {
	public void printMyName() {
		
		System.out.println("My name is David.");
		
	}
	
	// public -> access modifier
	// void   -> return type
	// printMyName -> name of the method
	// () -> for parameters
	// {} -> method body 
	
	public static void main(String[] args) {
		MyFirstMethods myMethod = new MyFirstMethods();
		
		myMethod.printMyName();
		
		myMethod.printParamName("Furkan");
		
	}
	
	public void printParamName(String name) {
		System.out.println("My name is "+ name);
	}
    
}
