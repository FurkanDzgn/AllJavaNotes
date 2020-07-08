package Day06.StringMethods;

import java.util.Scanner;

public class StrMethods {
/*
 * Write a program that will aske a user to enter
 * any word and application will output like below
 * 
 * Please enter any word?
 * Techtorial
 * 
 * Techtorial Please enter any word? true
 * 
 * Hello word numbers are 5 which is even: false
 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter any word?");
		String word = input.next();
		
		//Calculate the number of letters
		int length=word.length();
		
		//Hello 5 , hi 2
		          //  Techtorial -> 10 
		             //     0==0 true
		boolean result= length%2 == 0; //  5%2 -> 1
		System.out.println(word+" letter numbers are "+length+" which is even: "+result);
		System.out.println(word+" letter numbers are "+length+" which is odd: "+!result);
		
		
		
	}
}
