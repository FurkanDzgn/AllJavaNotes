package Day22_StringBuilder.HomeWork;

import java.util.Arrays;

public class TASK2 {
	public static void main(String[] args) {
		
		StringBuilder str=new StringBuilder("Test1ng-Leet=code-Q!");
	                                       //  "Qedo1ct-eeLg=ntse-T!"     "Test1ng-Leet=code-Q!"
		StringBuilder revstr=new StringBuilder();
	
		int counter=0;
		
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i)>='A' && str.charAt(i)<='Z') && !(str.charAt(i)>='a' && str.charAt(i)<='z')) {		
				counter++;
			}
		}
		System.out.println(counter);
		
		char[] ch=new char[counter];
		int[] arr= new int[counter];
		
		int c=0;
			for(int i=0; i<str.length(); i++) {
				if(!(str.charAt(i)>='A' && str.charAt(i)<='Z') && !(str.charAt(i)>='a' && str.charAt(i)<='z')) {
				ch[c]=str.charAt(i);
				arr[c]=i;
				c++;
				}
		     
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(arr));
		
		/*
		 * delete ch from str
		 * reverse str
		 * insert ch
		 * 
		 */
		
		for(int i=0; i<str.length(); i++) {
			if(!(str.charAt(i)>='A' && str.charAt(i)<='Z') && !(str.charAt(i)>='a' && str.charAt(i)<='z')) {		
				str.deleteCharAt(i);
			}
		}
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		for(int i=0; i<arr.length; i++) {
			str.insert(arr[i], ch[i]);
		}
		System.out.println(str);

	}

}
