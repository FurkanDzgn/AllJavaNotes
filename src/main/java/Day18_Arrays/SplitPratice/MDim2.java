package Day18_Arrays.SplitPratice;

import java.util.Arrays;

public class MDim2 {
	public static void main(String[] args) {
		
		int[][][] nums = {
				{{5,10},{2,3}},
				{{11,22},{20,50}}
				};
		
		System.out.println(nums[0][0][1]); // 10
		System.out.println(nums[1][1][0]); //20
	//	System.out.println(nums.length);
		
		
		int sum=0;
		for(int[][] a:nums) { // a -> two dimensional array
			for(int[] b:a) {  // b -> one dimensional array
				for(int c:b) { // c -> int primitive
					System.out.println(c);
					sum+=c;
				//	System.out.println(sum);
				}
			}
		}
		System.out.println(sum);
		
	//	System.out.println(Arrays.toString(nums[0][0]));
	}

}
