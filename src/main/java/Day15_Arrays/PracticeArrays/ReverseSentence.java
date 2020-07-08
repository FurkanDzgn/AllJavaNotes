package Day15_Arrays.PracticeArrays;

import java.util.Arrays;

public class ReverseSentence {
	
	//How do you reversed a sentence.
	//"It is sunny outside."
	//outside. sunny is It
	public static void main(String[] args) {
		
		String str="It is sunny outside.";
		
		String[] words=str.split(" "); // 4 elements, last index is 3
		System.out.println(Arrays.toString(words));
		
		String reversedSen = "";
		
		int index = words.length-1; // 4-1
		
		for(int i=0; i<=index; index--) { // 3, 2, 1, 0
			reversedSen = reversedSen + words[index]+" ";	
		}
		System.out.println(reversedSen.trim());
		
		System.out.println("------");
		
		String sent="Techtorial is very crowded today.";
		String[] word=sent.split(" ");
		String reversedSent="";
		int index1 = word.length-1;
		
		for( ; 0<=index1; index1--) {
			reversedSent = reversedSent+word[index1]+" ";
		}
		System.out.println(reversedSent.trim());
	}

}







//int first=str.indexOf(" ");
//int second=str.indexOf(" "+first);
//int third=str.indexOf(" "+second);
//
//System.out.println(str.substring(third)+str.substring(second,third)+str.substring(first,second)+str.substring(0,first));
