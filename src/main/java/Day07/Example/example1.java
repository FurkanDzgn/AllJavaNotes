package Day07.Example;

import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter three numbers:");
		
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		
		System.out.println("What is the result?");
		int result=scan.nextInt();
		int sum=x+y+z;
		boolean result2 = result == sum ;
		
		System.out.println(result2 + "! Then sum is: " +sum);
		
	}

}
