package Day43_Exceptions.Exceptions;

public class CheckedAndUnchecked {
	
	public static void main(String[] args) throws InterruptedException {
		
	
			System.out.println("Sleep for 5 seconds");
//			Thread.sleep(5000);
			System.out.println("Wake Up...");
			int result = 0;
			try {
			result = 5/1;
	//		System.exit(0);  //  We can skip execution of ﬁnally block with 
			return; // execute until finally blocks(cover) 
		//  Return will execute ﬁnally block but will not continue after ﬁnally block
			}catch (ArithmeticException e) {
				System.out.println(e);
			}finally {
				System.out.println("In finally block.");
			}
			
			System.out.println(result);
			System.out.println("After try catch");
	}

}
