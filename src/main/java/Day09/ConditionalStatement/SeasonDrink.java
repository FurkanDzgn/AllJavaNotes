package Day09.ConditionalStatement;

import java.util.Scanner;

public class SeasonDrink {
	
	/*
	 * In strabucks you will have an option to choose season drink.
	 * The application will ask you to enter number of mounth.
	 * 
	 * If input: 6,7,8 -> it will print: Season drink is iced Coffee
	 * If input: 3,4,5 -> it will print: Caramel Machiato
	 * If input: 9,10,11 -> it will print: Mocha
	 * If input: 12,1,2 -> it will print: Cappucino
	 * If then month number is out of this numbers: -> then it will print input is invalid
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter mounth:");
		int mounth = input.nextInt();
		if(mounth==6 || mounth==7|| mounth==8) {
			System.out.println("Season drink is iced Coffe");
		}
		else if(mounth==3 || mounth==4 || mounth==5){
			System.out.println("Season drink is Caramel Machiato");
		}
		else if(mounth==9 || mounth==10 || mounth==11){
			System.out.println("Season drink is Mocha");	
	}
		else if(mounth==12 || mounth==1 || mounth==2){
			System.out.println("Season drink is Cappucino");
		}
		else {
			System.out.println("You entery is invalid value");
		}
    }
}