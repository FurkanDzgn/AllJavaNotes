package Day08.homeWork;

import java.util.Scanner;

public class Homework {
	public boolean canDivide(int num1,int num2) {
		boolean result1 = num1%num2 == 0;
		return result1;
	}
	public static void main(String[] args) {
		Homework cD = new Homework();
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("canDivide"+"("+num1+","+num2+")"+ "->"+ cD.canDivide(num1, num2));
		
		System.out.println("enter a word");
		String name = scan.next();
		System.out.println("middleChars"+"(�"+name+"�)"+ "->"+ cD.middleChars(name));
	
	}
	public String middleChars(String name) {
		
		int nameLenght = name.length();
		
		if (nameLenght%2==0) {
			int a=nameLenght/2;
			String result = name.substring(a-1,a+1);
			//System.out.println(result);
			return result;
			
//			int q = nameLenght/2;
//			char x = name.charAt(q-1);
//			char y = name.charAt(q);
//			String z = ""+x+y;
//			System.out.println(z);
//			return z;
			
			
		} else  {
			int a=nameLenght/2;
			String result1 = name.substring(a,a+1);
			//System.out.println(result);
			return result1;
			
//			char a = name.charAt(nameLenght/2);
//			String b =""+a;
//			System.out.println(b);
//			return b;
			
		}
		
		
	}
}



