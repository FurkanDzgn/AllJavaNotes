package Day27_Wrappers.StaticPractice;

public class Calculator {
	
	public static double sum(double[] arr) {
		
		int sum=0;
		for(double num:arr) {
			sum+=num;
		}
		
		return sum;
	}

}
