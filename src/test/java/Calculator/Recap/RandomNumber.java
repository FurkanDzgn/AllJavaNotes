package Calculator.Recap;

import java.util.Random;

public class RandomNumber {
	
	/**
	 * 	This class will generate random numbers
		TODO:
		1. Add a static method getRandomInteger:
		parameter: type Range
		return: random generated int value within range of min and max values of the Range object
		
		2. overload a static method getRandomInteger:
		parameter: type int
		return: random generated positive int value within range of 1 and the 
		value of parameter

	 */
	
	static Random random = new Random();
	
	public static int getRandomInteger(Range range) {
		
		int num=range.getMax()-range.getMin();
		
		int result = random.nextInt(num)+range.getMin();
		
		return result;
		
	}
	
	public static int getRandomInteger(int number) {
		
		int num=number-1;
		int result = random.nextInt(number)+1;
		return result;
		
	}
	


}
