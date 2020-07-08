package Day22_StringBuilder.HomeWork;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
//		StringBuilder absent=new StringBuilder('A');
//		StringBuilder late=new StringBuilder('L');
//		StringBuilder present=new StringBuilder('P');
		
		
//		String Absent="A";
//		String Late="L";
//		String Present="P";
		
		System.out.println("Enter 6 times A, L or P");
		
//		String[] arr=new String[6];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=scan.next();
//		}
		
//		StringBuilder one=new StringBuilder(scan.next());
//		StringBuilder two=new StringBuilder(scan.next());
//		StringBuilder three=new StringBuilder(scan.next());
//		StringBuilder four=new StringBuilder(scan.next());
//		StringBuilder five=new StringBuilder(scan.next());
//		StringBuilder six=new StringBuilder(scan.next());
//		
//		StringBuilder[] arr=new StringBuilder[] {one,two,three,four,five,six};
	//	StringBuilder[] result= {one,two,three,four,five,six};
		
		StringBuilder arr=new StringBuilder(scan.next());
		// PPALLL
		
		int c1=0;
		int c2=0;
		
		for(int i=0; i<arr.length(); i++) {
			if(arr.charAt(i)=='A') {
				c1++;
			}
			if(arr.charAt(i)=='L') {
				c2++;
			}	
		}
		
//		for(String res:arr) {
//			if(res.equals(Absent)) {
//				c1++;
//			}
//			if(res.equals(Late)) {
//				c2++;
//			}
//		}
		
		if(c1<=1 && c2<=2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
