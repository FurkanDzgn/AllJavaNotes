package Day11_Loops.Loops;

import java.util.Scanner;

public class LastStudent {
	public static void main(String[] args) {
		
		/*
		 * We will ask a student his/her name then add her to list
		 * after we ask if you are the last student
		 * If student says yes, then we will print the list in console
		 *  
		 */
		
		Scanner input=new Scanner(System.in);
		
		//Jhon +David +Patel +Harsh
		//Jhon David Patel Harsh
		String list="";
		boolean isLastStudent=false;
			
		
		do {
			System.out.println("What is your name?");
			String studentName=input.next();
			list=list+studentName+" "; //Jhon,Jhon David,Jhon David patel
			System.out.println("Are you the last student? Yes/No");
			String answer=input.next();
			if(answer.equalsIgnoreCase("No")){
				isLastStudent = false;
				
			}else {
				isLastStudent = true;
				
			}
			
		}while (!isLastStudent); //!true -> false
		
		System.out.println(list);
	}

}
