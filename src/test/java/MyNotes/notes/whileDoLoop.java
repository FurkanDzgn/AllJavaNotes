package MyNotes.notes;

import java.util.Scanner;

public class whileDoLoop {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// 1234 -> 1+2+3+4=10 exp
		
		System.out.println("Enter a int value");
		int x =input.nextInt();
		
		int y=0;
		do {
			y += x%10;
		//	System.out.println("y: "+y);
			
			x /=10;
		//	System.out.println("x: "+x);
			
		}	
			while(x>0);
		    
		    System.out.println("y: "+y);
		
		
	}

}
