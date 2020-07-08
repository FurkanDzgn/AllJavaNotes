package Day07.homework;

import java.util.Scanner;

public class UtilityMethods2 {
	public boolean firstLastChars(String item) {
		int lenghtItem = item.length();
		char lastChar = item.charAt(lenghtItem-1);
		char firstChar = item.charAt(0);
		boolean same = lastChar == firstChar;
		System.out.println(same);
		return same;
		
	}
	public static void main(String[] args) {
		UtilityMethods2 uM = new UtilityMethods2();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a item:");
		String item = scan.nextLine();
		uM.firstLastChars(item);
		
		System.out.println("Please enter a fullName:");
		String fullName = scan.nextLine();
		uM.initials(fullName);
		
	}
	public String initials(String fullName) {
		
		char firstLetter = fullName.toUpperCase().charAt(0);
		int comma = fullName.indexOf(' ');
	    comma++;
		char secondLetter = fullName.toUpperCase().charAt(comma);
		String initials = ""+ firstLetter + secondLetter;
		System.out.println(initials);
		return initials;
	}
	
	

}
