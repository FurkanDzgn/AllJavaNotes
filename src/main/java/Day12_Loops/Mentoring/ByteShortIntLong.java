package Day12_Loops.Mentoring;

import java.util.Arrays;

public class ByteShortIntLong {
	public static void main(String[] args) {
		int myMinIntValue = Integer.MIN_VALUE-1; // underflow
		int myMaxIntValue = Integer.MAX_VALUE+1; //overflow
		System.out.println(myMinIntValue);
		System.out.println(myMaxIntValue);
		
		short myMinShortValue = Short.MIN_VALUE /2 ; // underflow
		short myMaxShortValue = Short.MAX_VALUE/2; //overflow
		System.out.println(myMinShortValue);
		System.out.println(myMaxShortValue);
		
		System.out.println("------------------");
		
		int num = 5;
		int n = num;
		
		System.out.println("Value of num first "+ num);
		System.out.println("value of n second "+n);
		num=6;
		System.out.println("Value of num "+ num);
		System.out.println("value of n "+n);
		
		System.out.println("------------------");
		
		int [] myIntArr = {1, 2, 3, 4};
		
		int[] secondIntArr = myIntArr;
		System.out.println(Arrays.toString(myIntArr));
		System.out.println(Arrays.toString(secondIntArr));
		secondIntArr[0]=5;
		System.out.println(Arrays.toString(myIntArr));
		System.out.println(Arrays.toString(secondIntArr));
		secondIntArr = null;
		System.out.println(Arrays.toString(myIntArr));
		System.out.println(Arrays.toString(secondIntArr));
		
		
		
	}

}
