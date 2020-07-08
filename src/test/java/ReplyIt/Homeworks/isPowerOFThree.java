package ReplyIt.Homeworks;

import java.util.Scanner;

public class isPowerOFThree {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=scan.nextInt();
//		System.out.println(45%199);
		boolean result=false;
		
		for(int i=1; i<2147483647; i++) {
			if(i<=num && num%i==0 && num%3==0 && i!=3) {
			   result=true;
			}
		}
		System.out.println(result);
	
	}
	public boolean isPowerOfThree(int n) {
		
		 if (n == 0)
	        return false;
			
		while(n%3==0) {
			n=n/3;
		}
		if(n==1) {
			return true;
		}
		return false;
		
		 //   if(n%3==0 && n%2!=0 && n%5!=0 && n%7!=0)
		//   return true;
		 
	 // else
		//   return false;
		
		
	}

}
