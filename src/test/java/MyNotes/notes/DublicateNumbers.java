package MyNotes.notes;

import java.util.Arrays;
                                     //    {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
public class DublicateNumbers {
	public int[] removeDuplicates(int[] nums) {
		//TODO
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
	      for(int i=0; i<result.length; i++) { // 2,5,6,0,
	    	result[i] = store[i];
	}
	 	return result;

	}
	public static void main(String[] args) {
		DublicateNumbers dN = new DublicateNumbers();
		
		int [] nums = {2,5,3,6,6};
		
		
		System.out.println(Arrays.toString(dN.removeDuplicates(nums)));
		
		
		
		
	}
	
	
	
	

}
