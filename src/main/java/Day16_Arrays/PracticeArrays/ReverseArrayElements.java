package Day16_Arrays.PracticeArrays;

import java.util.Arrays;

public class ReverseArrayElements {
	
	public static void main(String[] args) {
		
		String words[] = {"Tech", "String", "int", "Arrays", "Class", "Object" };
		
		//1. Get each value of array using for each
		//2. Reverse the chars using for loop
		//3. Store in new array
		
		String [] reversed = new String[words.length];
		
		int i = 0;
		for(String word : words) {
			String reverseStr = "";
			int length = word.length()-1;
			for( ; 0<=length; length--) {
				reverseStr = reverseStr + word.charAt(length);
			}
			reversed[i] = reverseStr;
			i++;
		}
		
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(reversed));
		
	}
}
