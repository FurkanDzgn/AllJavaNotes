package Day13_Loops.PracticeLoops;

import java.util.Scanner;

public class ScoreBoard {
	public static void main(String[] args) {
		
		//A
		//B
		//C
		//What is the score for team A -> 3
		//What is the score for team B -> 5
	    //What is the score for team C -> 1
		
		//A***
		//B*****
		//C*
		
		Scanner input=new Scanner(System.in);
	
		String team ="ABC";
		
		System.out.println("What is score for team A?");
		int a = input.nextInt();
		
        System.out.println("What is score for team B?");
		int b = input.nextInt();
		
        System.out.println("What is score for team C?");
		int c = input.nextInt();
		
		for(int teams=0; teams<team.length(); teams++) { //ABC
			
			if(team.charAt(teams)=='A') {
				System.out.print(team.charAt(teams)); //A
				for(int i=0; i<a; i++) { // A*****
					System.out.print("*");
				}
			}
			else if(team.charAt(teams)=='B') { 
				System.out.print("\n"+team.charAt(teams)); //B
				for(int i=0; i<b; i++) {
					System.out.print("*");
				}
			}
			else if(team.charAt(teams)=='C') {
				System.out.print("\n"+team.charAt(teams)); //C
				for(int i=0; i<c; i++) {
					System.out.print("*");
				}
			}
	    }   
      }
   }
