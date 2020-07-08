package Day16_Arrays.PracticeArrays;

import java.util.Arrays;

public class SortString {
	
	public static void main(String[] args) {
		
		String [] values = {"Table", "Coffee", "Camera", "Computer", "Website","1","9"};
		
		System.out.println(Arrays.toString(values));
		
		Arrays.sort(values);
		
		System.out.println(Arrays.toString(values)); // Print acording to ASCII numbers.
		
		/*
		 * Once we sorting Strings numbers come first then capital letter and lowercase letters
		 * 
		 * 1.Numbers
		 * 2.Capital letter
		 * 3.Lowercase
		 */
		
		String values2 [] = {"10A","111", "101","01","9","705","-1","0.45","1.1","10" };
		
		System.out.println(Arrays.toString(values2));
		
		Arrays.sort(values2);
		
		System.out.println(Arrays.toString(values2));
	
	}
}
