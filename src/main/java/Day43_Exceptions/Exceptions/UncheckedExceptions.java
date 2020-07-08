package Day43_Exceptions.Exceptions;

public class UncheckedExceptions {
	
	public static void main(String[] args) {
		
		// new ArrayIndexOutOfBoundsException("Index 3 out of bounds for length 3");
		            //  0   ,   1  ,    2 
		String[] str= {"one","two,","three"};
		
		try {
		System.out.println("Before exception");
		System.out.println(str[3]); // new ArrayIndexOutOfBoundsException();     -->> Jvm told us 
		System.out.println("After exception");
		} catch (RuntimeException myException) { // Exception myException = new ArrayIndexOutOfBoundsException();
			                              // RuntimeException myException = new ArrayIndexOutOfBoundsException();
			                             
			System.out.println("Exception is caught.");
			
		}
		System.out.println("After try catch block.");
		Exception myException = new ArrayIndexOutOfBoundsException();
	 
	    System.out.println("========================================");
		
		int num1 = 100;
//		int num2  = num1/9;
	//	System.out.println(num2);
		
		 try {
		        int num2=num1/0;
		        }catch(ArithmeticException e){
		            
		             System.out.println(e.getMessage());
	                 e.printStackTrace();
		        }

		
	}

}
