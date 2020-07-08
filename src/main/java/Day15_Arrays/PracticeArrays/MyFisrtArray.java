package Day15_Arrays.PracticeArrays;

//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;

import java.util.*;
import java.lang.*; // this is reduntant(gereksiz) import

//reduntant import -> no need to import as it is imported by java by default
// java.util.* -> will import all classes under java.util package


public class MyFisrtArray {
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
		
		System.out.println(numbers[2]);
		System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
		System.out.println(""+numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
		System.out.println(Arrays.toString(numbers));
		
		//The size of array has to be specified.
		//The size of array is fixed.
		int[] nums = new int[3];
		
		nums[0]=5;
		System.out.println(nums[0]);
		//Java by default will give 0 value if you didnt gave values for any array.
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		String[] words = new String[4];
		
		words[0]="Hello";
		words[1]="Good Morning";
		words[2]="This is me Java";
		words[3]="5";
		
		System.out.println(words);
		System.out.println(Arrays.toString(words));
		
		//Arrays class is provided by Java -> java.util
		//String is another class in Java -> by default java will import java.lang
		//System is a class in java -> it comes from java.lang
		
		Scanner input = new Scanner(System.in);
		
		Random random=new Random();
	}

}
