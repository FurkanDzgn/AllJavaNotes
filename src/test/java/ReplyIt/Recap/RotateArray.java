package ReplyIt.Recap;

import java.util.Arrays;

public class RotateArray {
	/*
	 * Input: [1,2,3,4,5,6,7] and k = 3
     *Output: [5,6,7,1,2,3,4]
     */
	
	public int[] rotArr(int[] arr, int k) {
		
		int [] res= new int[arr.length];
		
		if(arr.length>k) {			
			int len1=arr.length-k;
			for(int i=0;i<k;i++,len1++) {
				res[i]=arr[len1];
			}
			int y=k;
			for(int i=0;i<arr.length-k;i++,y++) {
				res[y]=arr[i];
			}
			return res;
		}
		return null;
	}
	public static void main(String[] args) {
		RotateArray rt = new RotateArray();
		int [] arr = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(rt.rotArr(arr, 3)));
	}

}
