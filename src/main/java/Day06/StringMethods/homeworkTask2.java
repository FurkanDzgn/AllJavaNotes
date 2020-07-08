package Day06.StringMethods;

import java.util.Scanner;

public class homeworkTask2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you know Java? Yes/No");
		String answer = scan.next();
		boolean a=answer.equalsIgnoreCase("Yes");
		
		System.out.println("How many percent you attending the school out of 100? (0-100)");
		int attending = scan.nextInt();
		boolean b=attending >= 80;
		
		System.out.println("Did you finish all your homework? Yes/No");		
		String answer2 = scan.next();
		boolean c=answer2.equalsIgnoreCase("Yes");
		
		
	    boolean y = a && b && c;
		System.out.println("You are hired:"+y);
	}

}
