package Day06.StringMethods;

import java.util.Scanner;

public class homeworkTask3Again {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please print your name, position, location, and company?");
		String x=scan.nextLine();
		
		int a=x.indexOf(',');
		int b=x.indexOf(',',a+1);
		int c=x.indexOf(',',b+1);
		int d=x.indexOf(c+1);
		
		System.out.println("So your name is: "+x.toUpperCase().substring(0,a));
		System.out.println("You work as: "+x.toUpperCase().substring(a+2,b));
		System.out.println("Your location is: "+x.toUpperCase().substring(b+2,c));
		System.out.println("You work for company: "+x.toUpperCase().substring(c+2));
		
		
	}

}
