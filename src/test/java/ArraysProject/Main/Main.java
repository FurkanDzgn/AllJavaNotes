// Copyright 2020 Techtorial LLC
package ArraysProject.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
	/**
	 * Write a method that will accept an array as parameter
	 * and return maximum value from array.
	 * 
	 * for example:
	 * {3,9,55,73,99,2,10} -> return 99
	 * 
	 * @param arrays of numbers
	 * @return maximum value from array 
	 */
	public int maxNum(int[] arrays) {
		
		Arrays.sort(arrays);  
		return arrays[arrays.length-1];
	}
	
	/**
	 * Write a method that received an integer array and returns the sum of all
	 * odd numbers in the array
	 * 
	 * @param array
	 * @return sum of odd numbers in the array
	 */
	public int sumOfOdds(int[] array) {
		
		int sum =0;
		for(int x : array) {
			if(x%2==1 || x%2==-1)
			sum+=x;
		}
        return sum;	
	}
	
	/**
	 * Write a method that takes an array of integers and returns a boolean. You
	 * method should return true if array contains three consecutive even number
	 * or three consecutive odd numbers. Return false otherwise. 
	 * threeAmigos([2, 1, 3, 5]) -> true 
	 * threeAmigos([2, 1, 2, 5]) -> false 
	 * threeAmigos([2, 4, 2, 5]) -> true
	 * 
	 */

	public boolean threeAmigos(int[] array) {
		
		
		for (int i = 2; i<array.length; i++) {
			if ((array[i]%2 == 0 && array[i-1]%2 == 0 && array[i-2]%2 == 0) ||
					(array[i]%2 == 1 && array[i-1]%2 == 1 && array[i-2]%2 == 1))
				return true;	
		}
		return false;
//		for(int i=0;i<array.length-2;i++) {
//			if(array[i]%2==1 && array[i+1]%2==1 && array[i+1]%2==1) {
//				return true;
//			} else if(array[i]%2==0 && array[i+1]%2==0 && array[i+1]%2==0) {
//				return true;
//			}
//		}
//		return false;
	
	}		  
		
	/**
	 * Write a method that takes an array of ints and returns a boolean. 
	 * Return true if that array contains two numbers anywhere in the array
	 * whose sum is 100
	 * 
	 * @param nums
	 * @return boolean
	 */
	public boolean make100With2(int[] nums) {
		
		
		for(int i=0; i<nums.length; i++) {
			for(int y=0; y<nums.length; y++) {
				if(nums[i]+nums[y]==100 && nums[i]!=nums[y]) {
	
				return true;
				}
			}
		}
		
		return false;
	}


	/**
	  * 
 	  * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion. 
	  * Your method should switch the order of the first two values, 
	  * then switch the order of the next two, switch the order of the next two, and so on. 
	  * 
	  * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
	  * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
	  *  
	  * Method that is using String[]
	  * @param Array
	  * @return switched pairs array
	  */
	public String[] switchPairs(String[] list){
		
		
		for (int i=1; i<list.length; i +=2) {
			String temp = list[i];
			list[i] = list[i-1];
			list[i-1] = temp;
		}
		return list;
}
			
	/**
	 * 
	 * @param array of book pages
	 * @return page that is out of order; if all pages in the order return -1;
	 * 
	 * For example you given an array 
	 *  int[]pages={20,100,55,78,44,90}; -> method will return 55
	 *	int[]pages2={20,21,22,78,44,90};-> method will return 44
	 *  int[]pages3={20,21,22,78,84,90};-> method will return -1
	 */
	public int outOfOrder(int[] arr){
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				return arr[i];	
			}
		}	
		return -1;
	}

	/**
	 * 
	 * Write a method that takes an array of integers and returns a boolean.
	 * Return true if the array contains 1 and 2 later somewhere in the array,
	 * and 1 has to come before 2.
	 * 
	 * contains12([1, 3, 2]) -> true 
	 * contains12([3, 1, 2]) -> true 
	 * contains12([3, 1, 4, 5, 2]) -> true 
	 * contains12([3, 2, 4, 5, 1]) -> false
	 * 
	 * @param nums
	 * @return boolean
	 */

	public boolean contains12(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			for(int x=i+1; i<nums.length; x++) {
				if(nums[i]==1 && nums[x]==2) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Write a method that will accept array of integers as parameter
	 * and will return one long number of combined numbers.
	 * If the number is negative accept it as positive
	 * 
	 * For example:
	 * {2,66,3,90,1,-10} -> return int 266390110
	 * {0,34,5,3,8} -> return int 34538
	 * 
	 * @param array of numbers
	 * @return combined numbers of array
	 */
	public long combineNumbers(int[] numbers) {
		
		long result = 0;
		for (int i = 0; i<numbers.length; i++) {
			if (numbers[i] < 0)
				numbers[i] = 0 - numbers[i];
			if (numbers[i] <10)
				result = result*10 + numbers[i];
			if (numbers[i] >10)
				result = result*100 + numbers[i];
			
		
			
		}
		return result;
 }
	
	/**
	 * Write a method that will accept one array as parameter and will remove duplicates
	 * and return will have unique numbers inside
	 * 
	 * for example:
	 * {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
	 * {-1,5,8,-1,-55,55,0} -> return {-1,5,8,-55,55,0}
	 * 
	 * @param array of numbers
	 * @return array of unique numbers
	 */
	public int[] removeDuplicates(int[] nums) {
		//TODO
		
//		Integer[] nms=new Integer[nums.length];
//		for(int i=0;i<nums.length;i++) {
//			nms[i]=nums[i];
//		}
//		
//		Set<Integer> set=new HashSet<>(Arrays.asList(nms));
//		
//		List<Integer> list=new ArrayList<Integer>(set);
//		
//		int[] result = new int[nums.length];
//		int i=0;
//		for(Object lt:list) {
//			result[i]=(int)lt;
//			i++;
//		}
//		return result;
		
	
				int count=0; // count will count duplicate numbers 2,5,6,2,6 -> 2
				int[] store = new int[nums.length]; // store only unique number 2,5,6,2,6 -> 2,5,6,0,0
				String values=""; // values it is to store duplicate numbers as String so we will check if "2, 6"
				for(int i=0, x=0; i<nums.length; i++) { // 2,5,6,2,6
					int count2=0; // if current number is duplicate it will increment so we will not store that number
					for(int a=0; a<nums.length; a++) { // 2,5,6,2,6
						if(nums[i]==nums[a] && i<a) { // 2 == 2 && 0 < 0
							count++;
							count2++;
							values+=nums[i];
							store[x] = nums[i];
							x++;
						}
					}
					if(count2==0 && !values.contains(nums[i]+"" )) {
						store[x] = nums[i];
						x++;
					}
				}
				//  2,5,6,0,0 -> 5 - 2 = 3
				int[] result = new int[nums.length-count]; // 3
				for(int i=0; i<result.length; i++) { // 2,5,6,0,0
					result[i] = store[i];
				}
				return result;
				
				
				
				
				

	}

}
