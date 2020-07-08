package Day10_IfStatements.IfStatements;

import java.util.Scanner;

public class Calculator {
	/*
	 * 5
	 * 6
	 * What operation you want to do? (plus/minus/multiply/divide)
	 * plus
	 * Your result for 5+6=11
	 * 
	 */
      public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two numbers.");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		System.out.println("Please Choose your operator? plus/minus/multiply/divide");
		
		String operator=scan.next();
		
//		if(operator.equalsIgnoreCase("plus")) {
//			System.out.println("Your result for"+num1+"+"+num2+"is"+(num1+num2));	
//		}
//		else if(operator.equalsIgnoreCase("minus")) {
//			System.out.println("Your result for"+num1+"-"+num2+"is"+(num1-num2));
//	}
//        else if(operator.equalsIgnoreCase("multiply")) {
//		     System.out.println("Your result for"+num1+"*"+num2+"is"+(num1*num2));
//      }else if(operator.equalsIgnoreCase("divide")){
//    	  if(num2==0) {
//    		  System.out.println("You can not divide any number to zero.");  
//    	  }
//    	  else {
//    		  System.out.println("Your result for"+num1+"/"+num2+"is"+((double)num1/(double)num2));
//    	  }
//      }else {
//    	  System.out.println("Your operator is invalid.");
//      }
		//Switch statement
//		operator.equalsIgnoreCase("plus");
//		operator.equalsIgnoreCase("minus");
//		operator.equalsIgnoreCase("multiply");
//		operator.equalsIgnoreCase("divide");
		
		switch(operator) {
		case"plus":
			System.out.println("Your result for "+num1+"+"+num2+" is "+(num1+num2));
			break;
		case"minus":
			System.out.println("Your result for "+num1+"-"+num2+" is "+(num1-num2));
			break;
		case"multiply":
			System.out.println("Your result for "+num1+"*"+num2+" is "+(num1*num2));
			break;
		case"divide":
			if(num2==0) {
	    		  System.out.println("You can not divide any number to zero.");  
	    	  }else {
	    	System.out.println("Your result for "+num1+"/"+num2+" is "+(num1/num2));
	    	  }
			break;
		}
	
   }
}