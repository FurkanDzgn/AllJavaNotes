package Day09.Gamer;

import java.util.Scanner;

public class GetGreatest {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter three numbers: ");
		
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=scan.nextInt();
		
		//1. x>y and x>z -> Greatest number is x
		//2. y>x and y>z -> Greatest number is y
		//1. z>x and z>x -> Greatest number is z
		
		//x = 5;
		//y = 5;
		//z = 5;
		//Greatest number is 5
		
		if(x>=y && x>=z ) {
			System.out.println("Greatest number is:"+x);			
		}else if(y>=x && y>=z) {
			System.out.println("Greatest number is:"+y);
		}else if(z>=x && z>=y) {
			System.out.println("Greatest number is:"+z);
		}
		else  {
			System.out.println("invalid");	
		}
		
		
	}

}
