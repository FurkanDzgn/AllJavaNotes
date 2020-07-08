package Day08.homeWork;

import java.util.Scanner;

public class HomeWork02{
	public boolean canDivide(int num1,int num2) {
		boolean result = num1 % num2 ==0;
		System.out.println("canDivide"+"("+num1+","+num2+")"+ "->"+result);
		return result;
	}
	public static void main(String[] args) {
		HomeWork02 trY = new HomeWork02();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two int nums:");		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		trY.canDivide(num1,num2);
		
		System.out.println("Please enter a word");
		String item = input.next();
		trY.middleChars(item);
	}
	public String middleChars(String item) {
		
		int lenghtItem = item.length();
		if (lenghtItem % 2 == 0) {
			
			char item1 = item.charAt((lenghtItem/2)-1);
			char item2 = item.charAt(lenghtItem/2);
			String item3 = "" + item1 + item2;
			System.out.println(item3);
			return item3;
		}else {
			char item4 = item.charAt(lenghtItem/2);
			String item5 = ""+item4;
			System.out.println(item5);
			return item5;
			
		}
			
		
	}
}

