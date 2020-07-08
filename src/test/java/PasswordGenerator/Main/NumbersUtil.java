package PasswordGenerator.Main;

import java.util.Random;

public class NumbersUtil {
	
	Random random = new Random();
	
	/**
	 * Write a method that will generate random integer 
	 * between 0 and upper number that is provided in 
	 * If negatif number is entered method return -1;
	 * parameter:
	 * For example:
	 * 		getRandomInt(5)  -> 4; -> 4 random number that is generated
	 * 		getRandomInt(10) -> 7; -> 7 random number that is generated
	 * 
	 * @param upper
	 * @return
	 */
	public int getRandomInt(int upper){
		
		if(upper<0) {
			return -1;
		}
		else {
			return random.nextInt(upper);
		}			
	}
}
