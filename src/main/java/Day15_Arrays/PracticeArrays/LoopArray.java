package Day15_Arrays.PracticeArrays;

import java.util.Arrays;

public class LoopArray {
	
	/*
	 * String
	 * int
	 * boolean
	 * Array
	 * 
	 */
	
	public static void main(String[] args) {
		
		String animals[]=new String[10];
		
		animals[0]="Dog";
		animals[1]="Cat";
		animals[2]="Monkey";
		animals[3]="Cow";
		animals[4]="Horse";
		animals[5]="Donkey";
		animals[6]="Bear";
		animals[7]="Panda";
		animals[8]="Giraff";
		animals[9]="Bird";
		
		System.out.println(Arrays.toString(animals));
		
		for(int i=0; i<animals.length; i++) {
			System.out.println(i+1+"."+animals[i]);
		}
	}

}
