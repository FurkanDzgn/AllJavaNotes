package Day16_Arrays.PracticeArrays;

import java.util.Arrays;

public class MissingNumber {
	
	/*
	 * 0 - 10
	 * 2,5,7,1,0,10,4,6,8,9
	 * 
	 * Our program will find a missing number
	 * 
	 */
	public static void main(String[] args) {
		
	
	int[] numbers = {2,5,7,1,0,10,4,6,8,9} ;
	
	for(int i = 0; i<=10; i++) {
		boolean notFound=true; // notFound is true
		 for(int num : numbers) {
			 if(i==num) {
				 notFound=false; // if we find that number notFound will be false
			 }
		 }
		 if(notFound==true) { // notFound is false do not go inside of if statement
			 System.out.println(i);
		 }
	}
	
	 meth(numbers);

  }
	
	
	public static void meth(int [] nums) {
		
		Arrays.sort(nums);
		OUTHER:
			for(int i=0;i<=10;i++) {
			
			if(i!=nums[i]) {
				System.out.println(i);
				break OUTHER;
			}
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
