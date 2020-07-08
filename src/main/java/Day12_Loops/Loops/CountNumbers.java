package Day12_Loops.Loops;

//import java.util.Scanner;

public class CountNumbers {
	public static void main(String[] args) {
		
		// number -234 -> 4+3+2 = 9
	//	Scanner scan=new Scanner(System.in);
		
		int num=456;
		
		int rem1 = 456%10;
		System.out.println(rem1);
		
		//123 -> 12
		
		int num2 = num/10; // 123/10 -> 12.3 -> 12
		System.out.println(num2);
		
		int rem2=num2%10; // 12%10 -> 2
		
		//12 ->1
		
		int num3 = num2/10; // 12/10 -> 1.2 -> 1
		
		int rem3 = num3%10; // 1%10 -> 1
		
		System.out.println("The sum of digits: "+(rem1+rem2+rem3));
		
	}

}
