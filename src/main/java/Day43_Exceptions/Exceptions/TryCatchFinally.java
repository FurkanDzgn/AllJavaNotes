package Day43_Exceptions.Exceptions;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		try {
			int[] nums= {5,6,0,1};
			System.out.println(nums[0] / nums[2]);
			System.out.println(nums[0]+nums[3]);
		}catch(NullPointerException e){ // RuntimeException  --  ArrayIndexOutOfBoundsException
			System.out.println(e.getMessage());
			System.out.println(e.getClass()); // Exception e = new ArithmeticException(); --> lastOverriden
		}catch(Exception e) {
			System.out.println("****"+e.getMessage());
		}
			finally {
			System.out.println("In finally block.");
		}
		
		System.out.println("I am out of catch.");
		
		// First catch block has to have narrower(sub-classes) or different type of exception than second catch block.
		// First catch block not be super class of second catch block.
	}

}
