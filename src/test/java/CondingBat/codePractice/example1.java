package CondingBat.codePractice;

import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
//		int x=20 , y =8;
//		int sum;
//		sum=y%x;
//		System.out.println(sum);
		int num=input.nextInt();
		
		
		    boolean a=true;

			for(int x=2; x<=10; x++) {
		    
		    	for(int y=2; y<=10; y++) {
		    		//System.out.println("x*y"+(x*y));
		    	if( num==x*y) {
		        System.out.println(a);
		        break ;
		    	}  
		  	 } 	
		    	
		 } 
			if(a==false)
	         System.out.println(!a);
	    	
			
		
			
			
	}
}