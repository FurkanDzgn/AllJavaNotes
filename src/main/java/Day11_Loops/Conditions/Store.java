package Day11_Loops.Conditions;

import java.util.Scanner;

public class Store {
	public static void main(String[] args) {
		//less than 10 -> no discount
		// 10-15 -> 10% discount
		// 15-25 -> 15% discount
		// over 25 -> 20% discount
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter number of tables you want to buy?");
		int tables = input.nextInt();
		
		System.out.println("Enter unit price: ");
		int pricePerTable = input.nextInt();
		
		int total = tables*pricePerTable;
//		System.out.println("Your total is: "+total);
		
		if(tables<10 && tables>0 ) {
			System.out.println("Your total is: "+total);
			System.out.println("No Discount");	
			}else if (tables>=10 && tables<15) {
				//120 -> 10% is 12 -> 120-12 =108
				int discount = total*10/100;
				total -=discount;
				System.out.println("Your total is: "+total);
				System.out.println("You have 10% discount.");
		}else if (tables>=15 && tables<25) {
			int discount = total*15/100;
			total-=discount;
			System.out.println("Your total is: "+total);
			System.out.println("You have 15% discount.");
		}else if (tables>=25){
			int discount = total*20/100;
			total-=discount; // local variable
			System.out.println("Your total is: "+total);
			System.out.println("You have 20% discount.");	
		}else {
			System.out.println("Your entry is invalid.");
		}
			
		
	}
	
	

}
