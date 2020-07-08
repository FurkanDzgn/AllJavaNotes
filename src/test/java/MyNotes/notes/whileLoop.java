package MyNotes.notes;

import java.util.Scanner;

public class whileLoop {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a int value: ");
	
	int x = scan.nextInt();
	int y = 1;
	
	while (x>=1) {
		
		y=y*x;
		System.out.println(y);
		System.out.println(x);
		x--;
	}
      System.out.println("y: "+ y);	

  }
	
}