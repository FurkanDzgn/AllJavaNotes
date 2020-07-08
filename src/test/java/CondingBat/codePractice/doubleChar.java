package CondingBat.codePractice;

public class doubleChar {
	public static void main(String[] args) {
		String str ="The";
		String newStr="";
		
		 for(int i=0; i<str.length(); i++) {
		     newStr +=""+str.charAt(i)+str.charAt(i)+str.charAt(i);
		}
		System.out.println(newStr);
		
	}

}
