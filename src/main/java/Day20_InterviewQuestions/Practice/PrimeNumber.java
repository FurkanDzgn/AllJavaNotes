package Day20_InterviewQuestions.Practice;

import java.util.Scanner;

public class PrimeNumber {
		public boolean prime(int num) {
			
			if(num<2) {
				return false;
			}
			boolean result=true;
			// num=13
			//  until end               until half of num(Useful)
			// 2,3,4,5,6,7,8,9,10,11,12 or 2,3,4,5,6
			for(int i=2; i<=num/2;i++) {
				if(num%i==0) {
					result=false;
					break;
				}
			}
			return result;
		}
		public static void main(String[] args) {
			
			PrimeNumber pN = new PrimeNumber();
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Please enter num:");
			int num=scan.nextInt();
			
			System.out.println(pN.prime(num));
			System.out.println(pN.prime(3));
			System.out.println(pN.prime(2));
			System.out.println(pN.prime(121));
			System.out.println(pN.prime(66));
			System.out.println(pN.prime(19));
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	

}
