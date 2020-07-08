package CondingBat.codePractice;

public class sandwich {
	public static String getSandwich(String str) {
	
		int x=str.indexOf("bread");
		int y=str.lastIndexOf("bread");
		
		if(!(y==-1) && (x!=y)) {
			return str.substring(x+5,y);
		}
		

		return "";
	}public static void main(String[] args) {
		
		System.out.println(getSandwich("breadjambread"));
	}

}
