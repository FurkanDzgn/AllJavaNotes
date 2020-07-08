package Day12_Loops.ForLoops;

public class GetSumNumbers {
	
	/*
	 * 10 -> 1+2+3+4+5+6+7+8+9+10 =......
	 */
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int num=10; num>0; num--) {
			sum +=num;
		
		}
		System.out.println(sum);
		
     int factorial=1;
		
		for(int num=5; num>0; --num) { // num--
		factorial *=num;
		
		}
		System.out.println(factorial);
		
		//Factorial number -> 5! -> 5*4*3*2*1 -> factorial of 5
	}

}
