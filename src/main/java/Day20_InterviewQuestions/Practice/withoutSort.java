package Day20_InterviewQuestions.Practice;

import java.util.Arrays;

public class withoutSort {
	
	public static int[] sortWithoutSort(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			for(int k=i+1; k<nums.length; k++) {
				if(nums[i]<nums[k]) {
					int temp=nums[i];
					nums[i]=nums[k];
					nums[k]=temp;
					
				}
			}
		}
		
		return nums;
	}
	public static void main(String[] args) {
		
		int nums[]= {9,2,6,8,3,5};
		// int temp =nums[1]; // 3
		//nums[1]=nums[4]; // nums[1]=2
		//nums[4]==temp;
//		Arrays.sort(nums);
//		System.out.println(Arrays.toString(nums));
		
		
		System.out.println(Arrays.toString( sortWithoutSort(nums)));
		
		
		
	}
}
