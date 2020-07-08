package Day13_Loops.PracticeLoops;

import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("What is your total amount?");
		int total=input.nextInt();
		
		System.out.println("Split or Not Split? Yes/No");
		String answer=input.next();
		
		if(answer.equalsIgnoreCase("No")) {
			System.out.println("Please choose tip level:\nPoor\nFair\nGood\nGreat\nExcellent");
			int tipPercentange=0;
			String level = input.next();
			if(level.equalsIgnoreCase("Poor"))
				tipPercentange = 5;
			else if(level.equalsIgnoreCase("Fair"))
				tipPercentange = 10;
			else if(level.equalsIgnoreCase("Good"))
				tipPercentange = 15;
			else if(level.equalsIgnoreCase("Great"))
				tipPercentange = 20;
			else if(level.equalsIgnoreCase("Excellent"))
				tipPercentange = 25;
			
			int tipAmount = total * tipPercentange/100; // 500*5/100=25
			int totalAmount = total + tipAmount;
			
			System.out.println("Your tip amount is: "+tipAmount+"\nYour total is: "+totalAmount);
			
			
		}else if(answer.equalsIgnoreCase("Yes")) {
			System.out.println("For how many people?");
			int numberOfPeople = input.nextInt();
			System.out.println("Please choose tip level:\nPoor\nFair\nGood\nGreat\nExcellent");
			int tipPercentange=0;
			String level = input.next();
			if(level.equalsIgnoreCase("Poor"))
				tipPercentange = 5;
			else if(level.equalsIgnoreCase("Fair"))
				tipPercentange = 10;
			else if(level.equalsIgnoreCase("Good"))
				tipPercentange = 15;
			else if(level.equalsIgnoreCase("Great"))
				tipPercentange = 20;
			else if(level.equalsIgnoreCase("Excellent"))
				tipPercentange = 25;
			
			
			int tipAmount = total * tipPercentange/100; // 500*5/100=25
			int totalAmount = total + tipAmount;
			
			System.out.println("Your tip amount is:"+tipAmount+"\nYour total is:"+totalAmount);
			
			int tipPerPerson = tipAmount/numberOfPeople;
			int amountPerPerson = totalAmount/numberOfPeople;
			//5 -> &&&&&
			String people="";
			for(int i=0; i<numberOfPeople; i++) {
				people += "&";
			}
			
			System.out.println("Number of people:"+people+"\nTip per person:"+tipPerPerson+"\nAmount per person:"+amountPerPerson);
			
		}
	}
}
