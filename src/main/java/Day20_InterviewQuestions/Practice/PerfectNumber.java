package Day20_InterviewQuestions.Practice;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean perfectNum(int number) {

	//	boolean result=false;
		int sum=0;
		for(int i=1; i<=number/2; i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		if(sum==number) {
		//	result=true;
			return true;
		}else 	
			return false;
			
	}
	public boolean perfectNumber(int number) {

		boolean result=false;
		int sum=0;
		for(int i=1; i<=number/2; i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		if(sum==number) {
			result=true;
			System.out.println(number+" is perfect number");
			return result;
		}
		    System.out.println(number+" is not perfect number");
			return result;
			
	}
			
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number:");
		int number=scan.nextInt(); // 28, 8128
		
		//100 --> 50
		//28 --> 1,2,3,4,5,6,....14 
		//we divide 2 because more fast and we cant divide
		
		
		int sum=0;
		for(int i=1; i<=number/2; i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		if(sum==number) 
			System.out.println(number+" is perfect number."+"Sum is "+sum);
		else 
			System.out.println(number+" is not perfect number."+"Sum is "+sum);
		
		
		System.out.println(perfectNum(28));
		System.out.println(perfectNum(496));
		
		PerfectNumber pN = new PerfectNumber();
		System.out.println(pN.perfectNumber(8128));
		System.out.println(recap(8128));
	}
	
	public static boolean recap(int num) {
		
		int sum=0;
		for(int i=1; i<=num/2; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num)
			return true;
		else
			return false;		
	}

}
