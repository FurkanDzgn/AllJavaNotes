package Day16_Arrays.PracticeArrays;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String[] args) {
		
		int[] nums = {23,44,1,-10,5,6};
		
		for(int num: nums)
			System.out.println(num); // if we dont use curly braces for loop works/reads until the semicolon.
		    System.out.println("Hello");
		    
	     	Arrays.sort(nums);
	     	
	     	System.out.println(Arrays.toString(nums));
	     	
	     	System.out.println(nums[nums.length-1]); 
	     	System.out.println(nums[0]);
	     	
	     	System.out.println("============");
	     	
	     	int[] nums2 = {5,99,1,-90,3};
	     	
	     	//Give me difference between largest and smallest numbers
	     	
	     	Arrays.sort(nums2);
	     	System.out.println(Arrays.toString(nums2));
	     	
	     	int difference = nums2[nums2.length-1] - nums2[0];
	     	System.out.println(difference);
	     	System.out.println( nums2[nums2.length-1] - nums2[0]);
	     	
	}

}
