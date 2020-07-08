package Day12_Loops.Loops;

import java.util.Scanner;

public class PrintNameReversed {
	
	/*
	 * ask for the name:
	 * Then print each character of name in reversed order
	 * example:
	 *       Techtorial
	 *       l
	 *       a
	 *       i
	 *       r
	 *       o
	 *       t
	 *       h
	 *       c
	 *       e
	 *       T
	 */
      public static void main(String[] args) {
    	  Scanner scan=new Scanner(System.in);
    	  
    	  System.out.println("Enter your name:");
    	  String name=scan.next();
    	  int lenghtName=name.length();
    	  int i=lenghtName-1;
    	  
    	  while(i>=0) {
    		  System.out.println(name.charAt(i));
    		  --i;// 9,8,7,6,5,4,3,2,1,0
    	  }
		
	}
}
