package Day16_Arrays.PracticeArrays;

import java.util.Arrays;

public class BSearch {
	public static void main(String[] args) {
		
		int[] values = {5,2,9,10,6};
		
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.binarySearch(values, 5));
		System.out.println(Arrays.binarySearch(values, 10));
		System.out.println(Arrays.binarySearch(values, 3));
		
		
	    //	[2, 5, 6, 9, 10] -> [2, 3, 5, 6, 9, 10] -> 1 + 1-> -2 
		
		System.out.println(Arrays.binarySearch(values, 12));
		
		// [2, 5, 6, 9, 10] -> [2, 5, 6, 9, 10, 12] -> 5 -> 5+1=6 -> -6
		
		System.out.println(Arrays.binarySearch(values, 1));
		
		// [2, 5, 6, 9, 10] -> [1, 2, 5, 6, 9, 10] -> 0 -> 0+1 -> -1
		
		int[] values2 = {10,20,40,30,1};
		
		System.out.println(Arrays.binarySearch(values2, 1));
		
        /*
         * a. 2
         * b. 3
         * c.-6 -> correct
         * d. 6
         * 
         */
	}

}
