package Day10_IfStatements.Homework;

import java.util.Scanner;

public class Task2 {
	public String checkLetter(char item) {
        
		String result;	
		if(item=='a' || item=='e' || item=='u' || item=='i' || item=='o' || item=='A'||
				item=='E' || item=='U' || item=='I' || item=='O') {
			
			result="Vowel";
			return result;		
		}
		else {
			result="Consonant";
			return result;
		}		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Task2 cLtr=new Task2();
		System.out.println("Please enter your value:");
		char item=input.nextLine().charAt(0);   
				
		System.out.println(cLtr.checkLetter(item));	
	}
}


