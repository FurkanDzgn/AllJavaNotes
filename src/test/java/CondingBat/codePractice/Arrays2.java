package CondingBat.codePractice;

import java.util.Arrays;
public class Arrays2 {
//	public int sum13(int[] nums) {
//		  
//		  int sum=0;
//		  for(int i=0; i<nums.length; i++){
//		    if(nums[i]!=13){
//		      sum+=nums[i];
//		    }
//		    // if(nums[i]==13){
//		    //   i++;
//		    // }
//		    
//		  }
//		  return sum;
//	}
	public static void main(String[] args) {
		
		int[] nums=new int[] {1, 2, 13, 1, 2};
		
		int sum=0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]!=13){
		      sum+=nums[i];
		    }	
	   }
		  System.out.println(sum);
		  
		  int a[]=new int[] {2, 2, 6, 7, 7};
		  System.out.println(sum67(a));
}
	
	public static int sum67(int[] nums) {
		
		 int sum=0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]<6 ){
		      sum+=nums[i];
		    }
		  
		  }
		  return sum;
			
	}
	public String[] fizzArray2(int n) {
		  
		  String [] arr=new String[n];
		  
		  for(int i=0; i<n ; i++){
		    arr[i]=""+i;
		 // arr[i] = String.valueOf(i);  --> important method.
		  }
		  return arr;
		  
		}
	/**
	 * Given a non-empty array of ints, 
	 * return a new array containing the elements from the original array that come after the last 4 in the original array.
	 * The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
     *   
     *   post4([2, 4, 1, 2]) → [1, 2]
     *   post4([4, 1, 4, 2]) → [2]
     *   post4([4, 4, 1, 2, 3]) → [1, 2, 3]
	 * @param nums
	 * @return
	 */
	public int[] post4(int[] nums) {
		
		int p=nums.length-1;
		int[] arr;
		int c4=0;
		
		while(nums[p]!=4) {
			p--;
		}
		arr=new int[nums.length - 1 - p];
	
		
		
		for(int i=p+1; i<nums.length; i++) {
			arr[i-p-1]=nums[i];	
		}
	
		return arr;
	}
	/**
	 * We'll say that an element in an array is "alone" if there are values before and after it,
	 * and those values are different from it.
	 * Return a version of the given array where every instance of the given value which
	 * is alone is replaced by whichever value to its left or right is larger.
	 * notAlone([1, 2, 3], 2) → [1, 3, 3]
     * notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
     * notAlone([3, 4], 3) → [3, 4]
	 * @param nums
	 * @param val
	 * @return
	 */
	public int[] notAlone(int[] nums, int val) {
		//int[] arr = new int[nums.length];
		
		for(int i=1; i<nums.length-1; i++) {
			
			if(nums[i]==val) {
				if(nums[i-1]>nums[i+1]) {
					nums[i]=nums[i-1];
				}else {
					nums[i]=nums[i+1];
				}
			}
		}
		
		
		return nums;
	}
	
	public int[] zeroFront(int[] nums) {
		
		int temp=nums[0];
		
		for(int i=0;i<nums.length; i++) {
			if(nums[i]==0) {
				nums[i]=temp;
				temp=nums[i];
			}
		}
		
		return nums;
		
		
	}
	/**
	 *This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews.
     *(See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end,
	 *so for example start=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of these numbers,
	 *except for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
	 *In Java, String.valueOf(xxx) will make the String form of an int or other type.
	 *This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing,
	 *and we vary the start/end instead of just always doing 1..100.
     *  fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
     *  fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
     *  fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
	 * @param start
	 * @param end
	 * @return
	 */
	
	public String[] fizzBuzz(int start, int end) {
		  
		  int x=end-start;
		  
		  
		  String[] result=new String[x];
		  
		  for(int i=start,a=0; i<end; i++,a++){
		    if(i%15==0){
		      result[a]="FizzBuzz";
		    }else if(i%5==0){
		      result[a]="Buzz";
		    }else if(i%3==0){
		       result[a]="Fizz";
		    }else{
		      result[a]=String.valueOf(i);
		    }
		  }
		  
		  return result;
		  
		  
		  
		}
	
}
