package Day20_InterviewQuestions.Practice;

public class FibonacciNumber {
	/*
	 * 0,1,1,2,3,5,8,13,......
	 * Fibonacci number is the sum of last two numbers
	 */
	
	public void recap() {
		
		int f=0;
		int s=1;
		
		System.out.println(f);
		System.out.println(s);
		for(int i=0; i<100;) {
			
			i=f+s;
			f=s;
			s=i;
			System.out.print(i+"\n");
		}
			
	}

	public static void main(String[] args) {
		
		int firstNum=0;
		int secondNum=1;
		int count=0;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		for(int i =0 ; i<100 ; ) {
			
		    i= firstNum+secondNum;// 0+1=1
			firstNum=secondNum;
			secondNum=i;
			if(i<100) {
			System.out.println(i);		
			count++;
			}
		}
		System.out.println("There are "+count+" Fibonacci number before 100");
	}
	

}
