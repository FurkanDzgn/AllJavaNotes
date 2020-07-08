package ReplyIt.Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class isAnagramWithArrays {
	public boolean isAnagram(String s, String t) {
		
		boolean answer=false;
		int lengthS = s.length();
		int lengthT = t.length();
		
		if(lengthS==lengthT) {
		char [] wordS = s.toCharArray();
		char [] wordT = t.toCharArray();
		
		Arrays.sort(wordS);
		Arrays.sort(wordT);
		
		for(int i=0; i<wordS.length; i++) {
			if(wordS[i]==wordT[i]) {
				answer=true;
			}
				
		}
		}
		return answer;
	}
	
	public static boolean anagram(String s, String t) {
		
		boolean result=false;
		
		if(s.length()==t.length()) {
		char[] charS = s.toCharArray();
		char[] charT = t.toCharArray();
		
		Arrays.sort(charS);
		Arrays.sort(charT);
		
		String s1 = Arrays.toString(charS);
		String s2 = Arrays.toString(charT);
		
//		String word="";
//		for(int i=0; i<charS.length; i++) {
//			word+=charS[i];
//		}
		
		if(s1.equals(s2)) {
			result=true;
		}
		
		}
	
		return result;
	}
	
	public static void main(String[] args) {
		isAnagramWithArrays ang = new isAnagramWithArrays();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter s and t");
		String s=scan.next();
		String t=scan.next();
		
		System.out.println(ang.isAnagram(s, t));
		
		System.out.println(anagram(s,t));
		
		
		
		
	}
	
}
