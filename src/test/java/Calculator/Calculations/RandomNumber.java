package Calculator.Calculations;
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
	
	public static int getRandomInteger (Range range) {
		
		Random random = new Random();
		
		int res = range.getMax()-range.getMin();
		int x1=random.nextInt(res)+range.getMin();
		
		return x1;
	}
	
	public static int getRandomInteger (int temp) {
		Random random = new Random();
		
		int res = random.nextInt(temp-1);
		int res2= res+1;
		return res2;
	}

}
