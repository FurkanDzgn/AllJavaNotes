package Day24_MethodsAndInstanceVari.MethodPractice;

import java.util.Arrays;

public class ArraySort01 {
	
	/*
	 * That will accept array of integers 
	 * and this method will return another array
	 * with the size of3, which will include
	 * max number, min number and average number
	 * of parameter array.
	 * 
	 * Method name: arrayNums
	 * param: int[] nums
	 * return nums
	 * 
	 * [1,5,3,8,5,10] --> [10,1,5]
	 */
	
	
	public int[] arrayNums(int[] nums) {
		
		int[] arr=new int[3];
		Arrays.sort(nums);	
	
		int avrSum=0;
		for(int num:nums) {
			avrSum+=num;
		}
		
		avrSum=avrSum/nums.length;
		arr[0]=nums[nums.length-1]; // max num
		arr[1]=nums[0]; // min num
		arr[2]=avrSum;  // average num
	
		return arr;
			
	}
	public static void main(String[] args) {
		ArraySort01 exp = new ArraySort01();
		
		int[] nums=new int[] {1,5,3,8,5,10};
		System.out.println(Arrays.toString(exp.arrayNums(nums)));
		
		int [] array= {6,4,2,10,15,3};
		int [] values = exp.arrayNums(array);
		System.out.println(Arrays.toString(values));
		
	}

}
