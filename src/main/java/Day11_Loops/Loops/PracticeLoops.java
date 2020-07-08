package Day11_Loops.Loops;

public class PracticeLoops {
	public static void main(String[] args) throws InterruptedException {
		
		int num =15;
		
		do {
			System.out.print(num+" ");
			--num;
			Thread.sleep(1000);
		}while(num>0);
		
	}

}
