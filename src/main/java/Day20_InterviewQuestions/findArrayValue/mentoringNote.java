package Day20_InterviewQuestions.findArrayValue;
import java.util.Scanner;
public class mentoringNote {
	public static void main(String[] args) {
        int choice=0;
        do {
            System.out.println("HEllo future QA tester . The options are:\n" +
                    "1. Prime number\n" +
                    "2. Perfect Number\n" +
                    "3. Fibbonaci Number\n" +
                    "4. Palindromic Number\n"
            );
            Scanner scanner = new Scanner(System.in);
           choice = scanner.nextInt();
            switch (choice) {
                case 1:
                   isPrime(17);
                    break;
                case 2:
                    FibonacciNumber(67);
                    break;
                case 3:
                    System.out.println(PalindromeNumber(12321));
                    break;
                case 0:
                    System.out.println("Thank you for using our machine");
                    break;
            }
        } while (choice!=0);
    
}
	 public static boolean isPrime(int number ){
	        // 1,5,7,11,17
	        int result=0;
	        int divisor=2;
	        while(divisor!=number){
	            if(number%divisor==0){
	                result+=divisor;
	            }
	                divisor++;
	        }
	        if(result==0){
	            System.out.println(number +" is prime");
	            return true;
	        }else{
	            System.out.println(number +" is not prime");
	            return false;
	        }
	    }
	     public static boolean isPerfectNumber( int number ){
	        //6 =1+2+3
	    boolean result=false;
	    int sum=0;
	    for(int i=1; i<number; i++){
	        if (number%i==0){
	            sum+=i;
	        }
	    }
	    if(sum==number){
	        System.out.println(number +" is perfect");
	        return true;
	         }else {
	        System.out.println(number +" is not perfect");
	        return false;
	    }
	     }
	public static void FibonacciNumber(int limit){
	        // 0 1 1 2 3 5 8
	    int a=0;
	    int b=1;
	    int sum=0;
	    do{
	        sum=a+b; //0 1
	        a=b; //a= 1
	        b=sum; //b=1
	        if(sum<=limit){
	            System.out.println(sum);
	        }
	    }while (sum<=limit);
	}
	public static boolean PalindromeNumber( int number ){
	       int reversedNumber=0;
	       int originalNumber=number;
	       while (number!=0){
	           int digit=number%10;
	           number=number/10;
	           reversedNumber=reversedNumber*10+digit;
	    }
	       if(originalNumber==reversedNumber){
	           return true;
	       }else {
	           return false;
	       }
	}
	}



