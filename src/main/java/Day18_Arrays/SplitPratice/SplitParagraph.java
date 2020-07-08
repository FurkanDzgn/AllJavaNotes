package Day18_Arrays.SplitPratice;

import java.util.Arrays;

public class SplitParagraph {
	public static void main(String[] args) {
		
		String paragraph = "The method split() splits a String into multiple Strings "
				+"given the delimeter that seperates them.The returned object is an "
				+"array which contains the split Strings. We can also pass a limit "
				+"to the number of elements in the returned array. The method split() "
				+"splits a String into multiple Strings given the delimiter that separates them.";
				
		System.out.println(paragraph);
	/*
	 * Print only words that has only 4 letters.
	 * 
	 */
		
		String[] words = paragraph.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		
		for(int i=0; i<words.length; i++) {
			
			//  If the word has 4 letters OR words has 5 letters and last characters is '.'
			if(words[i].length()==4 || words[i].length()==5 && words[i].charAt(words[i].length()-1)=='.') {
				System.out.println(words[i]);
			}
		}
		
//		int a=0;
//		for(String word:words) {
//			if(words[a].length()==4) {
//				System.out.println(words[a]);		
//			}
//			a++;
//		}
				
	
	
	}
	

}
