package Day19_Arrays.ArraysPractice;

import java.util.Arrays;

public class ThelasrgestValue {
	/*
	 * Finding largest value in array without sorting

     1-Create one int variable
     2-Assign first value to your int variable
     3-Loop your all the element
     4-If the element is bigger than your int variable change value of int variable else do not change.
     5-int variable

     TASK
     Create the method will take one int array and it will return largest value.
      Implement the code without sort method.
 
	 */
	
	
	
	public static int recap(int[] num) {
		
		int x=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>x)
				x=num[i];
		}
		return x;
	}
	
	public int withoutSort (int[] nums) { // method signature --> method name+parameters -->  withoutSort (int[] nums)
		
		int x=nums[0];
		
		for(int i=1;i<nums.length; i++) {
			if(x<nums[i]) {
				x=nums[i];
			}
		}
		
		return x;
	}
	public int againSort(int nums[]) {
		
		Arrays.sort(nums);
		
		return nums[nums.length-1];
	}
	public static void main(String[] args) {
		ThelasrgestValue ws = new ThelasrgestValue();
		
		int nums[]= {4,2,5,7,11,7,10};
		
		System.out.println(ws.withoutSort(nums));
		int largest=ws.withoutSort(nums);
		System.out.println(largest);
		
		//System.out.println(ws.againSort(nums));
		
		// methods are reusable, create one time and use everywhere
		
		
		
	}

}
