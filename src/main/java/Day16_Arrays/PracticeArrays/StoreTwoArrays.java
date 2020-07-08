package Day16_Arrays.PracticeArrays;

import java.util.Arrays;

public class StoreTwoArrays {
	public static void main(String[] args) {
		int[] a= {5,2,10,12};
		int[] b= {1,9,0};
		
		//How would store these two arrays to one array?
		
		int [] result = new int [a.length + b.length]; // 4+3 = 7
		
		for(int i=0; i<a.length; i++) {
			result[i] = a[i];
		}
		System.out.println(Arrays.toString(result));
		
		for(int i=0; i<b.length; i++) {
			result[i+a.length] = b[i]; // result[0+4], result[1+4],result[2+4]
		}
		System.out.println(Arrays.toString(result));
	}

}
