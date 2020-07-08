package Day17_Arrays.MultiDimensionalArrays;

public class CoinsJar1 {
	public static void main(String[] args) {
		
		/*
		 * We will have an array of coins
		 * and we will write a program that will
		 * count how many quarters, nickels and dimes we have.
		 * 
		 */
		
		int[] coins = {10, 5, 5, 5, 25, 10, 5, 25,10};
		
		// You have 2 quarters, 3 dimes, 4 nickles
		//It is 1 dollar
		
		int quarters,dimes,nickels;
		quarters = dimes = nickels = 0;
		
		for(int coin:coins) {
			switch(coin) {// BSCI -> byte, char, short, int, String
			case 25:
				quarters++; // quarters=2
				break;
			case 10:
				dimes++; // dimes=3
			    break;
			case 5:
				nickels++; // nickles=4
				break;
				default:
					System.out.println("There is no coins");
					break;
			}
		}
		
		System.out.println("You have "+quarters+" quarters "+dimes+" dimes "+nickels+" nickels ");
	
		int sum=0;
		for(int coin : coins) {
			sum = sum + coin; // 100
		}
		System.out.println("It makes "+sum/100+" dollars.");
	}

}
