package Day07.ArithmeticOperators;

import java.util.Scanner;

public class EnglishLevel {
	public static void main(String[] args) {
		
		//What is your TOEFL score? -> 78
		//Did you complete ESL Program? -> Yes
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your TOEFL score?");
		int score=input.nextInt();
		
		System.out.println("Did you complete ESL Program? Yes/No");
        String answer=input.next();
        
        boolean passScore = score >= 78;
        boolean completeESL = answer.equalsIgnoreCase("Yes");
        boolean result = passScore || completeESL;
        System.out.println("You are accepted: "+result);
		
		
	}

}
