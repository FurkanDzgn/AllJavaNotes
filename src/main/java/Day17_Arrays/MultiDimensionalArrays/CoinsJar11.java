package Day17_Arrays.MultiDimensionalArrays;

public class CoinsJar11 {
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
		
		int quarters,dimes,nickles;
		quarters = dimes = nickles = 0;
		
		for(int i=0; i<coins.length; i++) {
			if(coins[i]==25)
				quarters++;
			if(coins[i]==10)
				dimes++;
			if(coins[i]==5)
				nickles++;
		}
		System.out.println("You have"+quarters+dimes+nickles);
		
		
	}
	

}
