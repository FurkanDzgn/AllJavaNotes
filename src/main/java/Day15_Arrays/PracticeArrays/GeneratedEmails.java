package Day15_Arrays.PracticeArrays;

import java.util.Arrays;

public class GeneratedEmails {
	public static void main(String[] args) {
		
		/*
		 * firstNames -> {"Lisa", "Erick", "John", "Tim", "Kevin"}
		 * lastNames -> {"Connor","Clark", "Doe", "Cook", "DeBruyne"}
		 * 
		 * lisa.connor@gmail.com , erick.clark@gmail.com , ..... 
		 */
		
		String[] firstNames = {"Lisa", "Erick", "John", "Tim", "Kevin"}; // 5
		String[] lastNames  = {"Connor","Clark", "Doe", "Cook", "DeBruyne"};
		
		String [] emails = new String[firstNames.length];
	//	System.out.println(Arrays.toString(emails));
		
		for(int i=0; i<firstNames.length; i++) {
			 emails[i] = firstNames[i].toLowerCase()+"."+lastNames[i].toLowerCase()+"@gmail.com";
		}
		System.out.println(Arrays.toString(emails));
		
		System.out.println("---------------");
		
		String [] emails2 = new String[firstNames.length];
		
		for(int i=0; i<firstNames.length; i++) {
			               // Lisa -> lisa -> l                + Connor -> connor
			emails2[i] = firstNames[i].toLowerCase().charAt(0) + lastNames[i].toLowerCase()+"@gmail.com";
		}
		System.out.println(Arrays.toString(emails2));
		
	}
}
