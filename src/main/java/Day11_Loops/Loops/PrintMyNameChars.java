package Day11_Loops.Loops;

import java.util.Scanner;

public class PrintMyNameChars {
	public static void main(String[] args) {
		 /*
		  * Write an application which will ask for the name
		  * then it will print each character of name in seperate line:
		  * 
		  * Example:
		  *   Enter your name?
		  *   John
		  *   J
		  *   o
		  *   h
		  *   n
		  */
		Scanner input=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=input.next();
		
		//John -> j o h n
		//David -> D a v i d
		//           0 1 2 3 4 5 6 
		//Vrajesh -> V r a j e s h -> 7
		int lenght=name.length();
		
		int i = 0; // name.charAt(i); i->0,1,2,3,4,5,6, 
		
		name = name.toUpperCase(); // Furkan -> FURKAN
		
		while(lenght > i) { // 7>0     0,1,2,3,4,5,6 -> 7>7
			System.out.println(name.charAt(i));
			i++;
		}
			
			
	}
	
	

}
