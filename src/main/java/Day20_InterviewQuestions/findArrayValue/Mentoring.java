package Day20_InterviewQuestions.findArrayValue;

import java.util.Scanner;

public class Mentoring {
	public static void main(String[] args) {
		
		System.out.println("Heloo future QA tester.The options are:\n"+
		"1.Prime number\n"+
		"2.Perfect Number\n"+
		"3.Fibbonacci Number\n"+
		"4.Palindromic Number\n"+
		"5.Palindromic String\n"
		);
		
//		System.out.println(isPrime(13));
//		FibonacciNumber(100);
//		System.out.println(polindromeNumber(12321));
//		
		Scanner scan =new Scanner(System.in);
		int choice=scan.nextInt();
		switch(choice) {
              
		case 1:
			isPrime(13);
		    break;
		case 2:
			FibonacciNumber(100);
		    break;
		case 3:
			System.out.println(polindromeNumber(12321));
			break;
		default:
			System.out.println("Thank you");
			break;
		}
	}
	public static boolean isPrime(int number) {
		//1,5,7,11,27
		
		int result=0;
		int divisor=2;
		while(divisor!=number) {
			if(number%divisor==0) {
				result+=divisor;
			}
			divisor++;
		}
		if(result==0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void FibonacciNumber(int limit) {
		// 0 1 1 2 3 5 8 ...
		
		int a=0;
		int b=1;
		int sum=0;
		
		do {
			
			sum=a+b;
			a=b;
			b=sum;
			if(sum<=limit) {
			System.out.println(sum);
			}
		}while(sum<=limit);
		
	}
	public static boolean polindromeNumber(int num) {
		//12321 = reversed number
		
		int reversedNum=0;
		int originalNum=num;
		
		while(num!=0) {
			int digit=num%10;
			num=num/10;
			reversedNum=reversedNum*10+digit;
		}
		if(originalNum==reversedNum)
			return true;
		else
			return false;
		
	}

}
