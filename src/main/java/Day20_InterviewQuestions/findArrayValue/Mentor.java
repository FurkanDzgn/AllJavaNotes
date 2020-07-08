package Day20_InterviewQuestions.findArrayValue;

import java.util.Arrays;
import java.util.Scanner;

public class Mentor {
	 public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in);
	        System.out.println("Please enter your name" );
	        
	        
	        String []newNames = new String[6];
	        for (int i = 0; i < newNames.length; i++) {
	            newNames[i]=input.next();
	            
	        }System.out.println(Arrays.toString(newNames));
	    }


}
