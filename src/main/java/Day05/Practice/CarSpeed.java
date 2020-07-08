package Day05.Practice;

import java.util.Random;
import java.util.Scanner;

public class CarSpeed {
	public static void main(String[] args) {
		
		Random rand = new Random();
		System.out.println(rand.nextInt(10));
		
		
		System.out.println(4%10);
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your speed: ");
		
		int userSpeed = input.nextInt();
		int speedLimit = 35;
		                      // 35        >    25   -> true
		boolean increaseSpeed = speedLimit > userSpeed;
		
		System.out.println("Increase your speed: "+increaseSpeed);//true
		System.out.println("Decrease your speed: "+!increaseSpeed);//false
		
	
		
	}

}
