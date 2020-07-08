package Day11_Loops.Loops;

public class WhileLoop {
	public static void main(String[] args) {
		int a = 10;
		//Do while loop executes the code first once, then it checks the condition
		do {
			System.out.print(a+" ");
			
			a++;
		}while(a<20);
		//while loop will check the condition first.
		System.out.println("---");
		while(a>10)	{ // if condition is false it will not execute the code.
		
			System.out.print(a);
			a--;
		}
	}
}
