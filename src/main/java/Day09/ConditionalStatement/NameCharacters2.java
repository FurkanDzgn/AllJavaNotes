package Day09.ConditionalStatement;

import java.util.Scanner;

public class NameCharacters2 {
	
     /*
      * Small program that will check if your name is
      * less than 5 characters it will print:
      * Your name is less than 5 characters.
      * 
      * If it more than 5 characters it will print:
      * Your name is more than 5 characters.
      */
        public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		
			System.out.println("What is your name:");
			String name = scan.next();
			
			int nameLenght = name.length();
			if(nameLenght < 5) {
				System.out.println("Your name has less than 5 characters.");
			}
			else if(nameLenght == 5){
				System.out.println("Your name has 5 characters.");	
			}
			else {
				System.out.println("Your name has more than 5 characters.");
			}		
		}             
}




