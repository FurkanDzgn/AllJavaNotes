package Day17_Arrays.MultiDimensionalArrays;

import java.util.Arrays;

public class LongestPolindromeAgain {
	public static void main(String[] args) {
	
	String palindromes = "Kayak racecar civic madam rotator refer level";
	
	String[] arrayPa = palindromes.split(" ");
	System.out.println(Arrays.toString(arrayPa));
	
	int[] leng = new int[arrayPa.length];
//	System.out.println(Arrays.toString(leng));
	
	int i=0;
	for(String palind : arrayPa) {
		leng[i]=palind.length();
		i++;
	}
	System.out.println(Arrays.toString(leng));
	
	Arrays.sort(leng);
	System.out.println(Arrays.toString(leng));
	
	int lastLength = leng[leng.length-1];
	
	for(String word:arrayPa) {
		if(word.length()==lastLength) {
			System.out.println(word);
		}
	}
	
	
	
	
	}
}
