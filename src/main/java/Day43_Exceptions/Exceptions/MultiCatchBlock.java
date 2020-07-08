package Day43_Exceptions.Exceptions;

public class MultiCatchBlock {
	
	public static void main(String[] args) {
		
		String value="125a";
		
		try {
		int intValue=Integer.parseInt(value);
		
		System.out.println(intValue+5);
		System.out.println(value.length());
		}catch (NumberFormatException e) {
			 System.out.println(e.getMessage());
		}catch (NullPointerException e) {
			 System.out.println( "This is null pointer exception"+ e.getMessage());
		}
		finally { // will always execute 
			System.out.println("In finally block."); // so in finally block we close the database with "close" keyword
		}
		
		System.out.println("After try catch.");
		
//		String value=null;
//		
//		try {
////			int intValue = Integer.parseInt(value);
////			System.out.println(intValue+5);
//			System.out.println(value.length());
//		}catch (NumberFormatException e) {
//			System.out.println("****"+e.getMessage());
//			e.printStackTrace();
//		}catch(NullPointerException e) {
//			System.out.println("This is nullPointerException "+ e.getMessage());
//		}finally {
//			System.out.println("IN Finally Block");
//		}
//		
//		System.out.println("After try catch");
	}
}
