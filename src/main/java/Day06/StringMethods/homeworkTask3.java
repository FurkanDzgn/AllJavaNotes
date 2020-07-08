package Day06.StringMethods;

import java.util.Scanner;

public class homeworkTask3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please print your name, position, location, and company?");
		String x = input.nextLine();
		
		int a=x.indexOf(',');
		int b=x.indexOf(',',a+1);
		int c=x.indexOf(',',b+1);
	   
		System.out.println("So your name is: "+x.substring(0,a).toUpperCase());
		
		System.out.println("So you work as: "+x.substring(a+2,b).toUpperCase());
		
		System.out.println("Your location is: "+x.substring(b+2,c).toUpperCase());
		
		System.out.println("You work for company: "+x.substring(c+2).toUpperCase());
	}

}
