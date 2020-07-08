package CondingBat.codePractice;

public class mixString {
	
	public static void main(String[] args) {
		
		String a="Hi";
	    String b="There";
	    
	    int min = Math.min(a.length(),b.length());
	    String mix= "";
	    for(int i = 0; i < min; i++) {
	     mix = mix + a.charAt(i) + b.charAt(i);
	    }
	    
	    System.out.println(mix+ b.substring(min) + a.substring(min)); 
	    
	    			
	}

}
