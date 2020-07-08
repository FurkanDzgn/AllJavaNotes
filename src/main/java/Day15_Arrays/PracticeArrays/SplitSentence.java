package Day15_Arrays.PracticeArrays;

import java.util.Arrays;

public class SplitSentence {
	
	public static void main(String[] args) {
		
		String sentence="We like playing soccer.";
		String [] words=sentence.split(" ");
		
		System.out.println(words[3]);
		System.out.println(words[1]);
		System.out.println(words[2]);
		System.out.println(Arrays.toString(words));
		
		System.out.println("------");
		
		String[] words2=sentence.split("a");
		System.out.println(words2[1]);
		System.out.println(words2[0]);
		System.out.println(Arrays.toString(words2));
		
		System.out.println("------");
		
		String sent="When java ends?";
		
		String[] words3=sent.split("A"); // No A inside of sent
		System.out.println(Arrays.toString(words3));
		
		// What is the return type of String split method?
		//Array
	 	
	   String a = "Hello Therlloe";
		String b = "llo";
		int d = a.indexOf(b);
		int x = a.indexOf(b,11);
		
		System.out.println(x);
		
		System.out.println(a.substring(0,x)+a.substring(x,a.length()));
		
	}

}
