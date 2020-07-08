package Day17_Arrays.MultiDimensionalArrays;

import java.util.Arrays;

public class LongestPolindrome {
	
	public static void main(String[] args) {
		
		/*
		 * Lets say you have a words of palindrome as a String
		 * How would find longest polindrome word of word
		 */
		
		
                             //5     7      5     5      7      5      5 		
		String palindromes = "Kayak racecar civic madam rotator refer level";
		
		//1. we will split the words and store them in array
		//2.we will get the length of each word
		
		String[] words=palindromes.split(" ");
	//    System.out.println(Arrays.toString(words));
		
		int[] lengths = new int[words.length];
	//	System.out.println(Arrays.toString(lengths));
		
	    int index=0;
		for(String word : words) {
			lengths[index] = word.length(); 
			index++;
		}
		
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(lengths));
		
		Arrays.sort(lengths);
		System.out.println(Arrays.toString(lengths));
		System.out.println(lengths[lengths.length-1]);
		
		int largestLength = lengths[lengths.length-1];
		
		for(String word: words) {
			if(word.length() == largestLength) {
				System.out.println(word);
			}
		}
		
		
		
		
		
	}


	
	

}
