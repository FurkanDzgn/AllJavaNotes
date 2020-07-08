package Day11_Loops.Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int num = random.nextInt(10);
		
		System.out.println(num);
		
		/*
		 * Generate a random number
		 * then write a program that will a user to enter hidden number
		 * if user will not guess the number the program will ask again
		 * and will give a message if it more than entered number or
		 * less than entered number
		 * 
		 * Example:
		 *       // hidden number: 5
		 *       Enter the hidden number(0-10):
		 *       8
		 *       Your entered number is more than hidden number
		 *       Entered the hidden number(0-10):
		 *       5
		 *       Congratulations you found the hidden number.
		 *       
		 */
		
		Scanner input=new Scanner(System.in);
		Random random2 = new Random();
		
		int hiddenNum=random2.nextInt(20);
		
		int userNum;
		int count=0;
		
		do {
			count++;
			if(count>3) {
				System.out.println("You attemps exceed the limit.");
				System.out.println("Hidden number was "+hiddenNum);
				break;
			}
			System.out.println("Please guess the hidden number? (0-20)");
			userNum = input.nextInt();
			if(userNum>hiddenNum) {
				System.out.println("Entered number is more than hidden number.");
			}else if (userNum<hiddenNum) {
				System.out.println("Entered number is less than hidden number.");
			}else if(userNum==hiddenNum) {
				System.out.println("Congratulations");
			}
		}while(userNum!=hiddenNum); // 5 , 4 -> 5!=4
		
		
		
		// 2 -> 5 -> is more than hidden number
		//0-5 , 3 -> is more than hidden number
		//0-3  -> 2 Congratulations
		
		
		
		
		
	}
	
	
	
}
