package Day09.Gamer;

import java.util.Scanner;

public class Gamer {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please choose a number of your game: \n1. Ping Pong \n2. Soccer \n3. Chess");
		
		int number = input.nextInt();
		
		GameMachine gm=new GameMachine();
		
		if (number == 1) {
			gm.game1();
		}
		else if(number == 2) {
			gm.game2();
		}
		else if (number == 3) {
			gm.game3();
		}
		else {
			System.out.println("Please come back later!");
		}
	}

}
