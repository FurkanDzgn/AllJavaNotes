package Day43_Exceptions.Exceptions;

public class MyError {
	
	public static void execute() {
		System.out.println("Execute......");
		execute();
	}
	public static void main(String[] args) {
		execute();
	}

}
