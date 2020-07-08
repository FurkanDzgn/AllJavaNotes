package Day43_Exceptions.Exceptions;

public class ThrowDemo {
	                                   // throws Exception
	public static void main(String[] args)  {
		
		// throws -> is used declare exception in method signature		
		// exception object is created -> is handled to JVM -> terminates the code based on that exception
		System.err.println("Hello World");
		try {
			throw new Exception("Bla Bla Bla...");
		}catch (Exception e) {
			System.out.println(e);
		}catch (Throwable e) {
			System.out.println(e);
		}
		System.out.println("After");
		
		
		
		
//		try {
//	       throw new Exception("You entered invalid credentials...");
//		}catch (Exception e) {
//		    System.out.println(e);
//		}catch( Throwable e ) {
//			System.out.println(e);
//		}
//	    System.out.println("After Exception.");	    	    
	}
}
