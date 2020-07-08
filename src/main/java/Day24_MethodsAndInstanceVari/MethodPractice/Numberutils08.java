package Day24_MethodsAndInstanceVari.MethodPractice;

import java.util.Random;

public class Numberutils08 {
	
	Random random = new Random();
	
	/**
	 * This method will print some random number between 0 and 100
	 */
	public void printRandomInt() {
		System.out.println(random.nextInt(100));
	}
	
	// method overloading same method name, different parameters
	
	/**
	 * This method will print random number between 0 and bound
	 * @param bound
	 */
	public void printRandomInt(int bound) {
		if(bound<0) {
			System.out.println("Number has to be Positive");
		}else {
		System.out.println(random.nextInt(bound));
		}
	}
	
	/**
	 * This method will print random number between lower and upper numbers
	 * @param lower
	 * @param upper
	 */
	public int getIntRange(int lower, int upper) {
		if(lower > upper) {
			System.out.println("Invalid range");
			return -1;
		}
		else {
	//		random.nextInt(upper); --> will return between 0 and upper
			//we need between lower and upper
			
			// lower = 10; upper = 25 -> random.nextInt(25) -> 10 - 25
//			int result=0;
//			if(result>=random.nextInt(lower) && result<=random.nextInt(upper)){
//				
//			}
			
			// lower - upper
			// 10    - 25
			// 25- 10 =15
			//0 - 15 -> random number -> 15 -> 15+10 -> 25
			//0 - 15 -> random number -> 0  -> 0+10  ->10
			
			int result = random.nextInt(upper-lower)+lower;
		//	System.out.println(result);
			return result;
		}
	}
	
	/**
	 * This method will return max number of three numbers.
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int getMax(int num1, int num2, int num3) {
		
		if(num1>=num2 && num1>=num3) {
			return num1;
		}else if(num2>=num1 && num2>=num3) {
			return num2;
		}else {
		return num3;	
	   }
		
    }
}