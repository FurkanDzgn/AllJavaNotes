package Day22_StringBuilder.HomeWork;

import java.util.Scanner;

public class Task1again {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 6 times A, L or P");
		
		StringBuilder str=new StringBuilder(scan.nextLine());
		
		int c1=0;
		int c2=0;
		int c3=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='A') {
				c1++;
			}
			if(str.charAt(i)=='L') {
				c2++;
			}	
			if(str.charAt(i)=='P') {
				c3++;
			}
		}
		if(c1<=1 && c2<=2 && c3<=6) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
