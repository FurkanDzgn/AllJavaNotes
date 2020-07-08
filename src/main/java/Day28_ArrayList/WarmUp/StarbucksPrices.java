package Day28_ArrayList.WarmUp;

import java.util.Arrays;

public class StarbucksPrices {
	
	public static void main(String[] args) {
		
		String[] drinks = {"Coffee $2.10" , "Cappucino $4.5", "Latte $3.4", "Mocha $3.4", "Mocha $4.10", "Tea $2.50"};
		
		/*
		 * Uptade the prices for these drinks raise by 10%
		 * 
		 * Coffee $2.10 -> Coffee 2.31
		 */
	
		for(int i=0; i<drinks.length; i++) {
			
			String priceStr = drinks[i].substring(drinks[i].indexOf("$")+1);
			// "2.10" -> 2.10
			double price = Double.parseDouble(priceStr); // to convert from String to primitive
			// 2.10 -> 2.10*10/100 = 2.10 +2.21 = 2.31
			double newPrice = price + price *10/100;
			String newValue = drinks[i].substring(0,drinks[i].indexOf("$")+1) + newPrice;
			// Coffee 2.31
			
			drinks[i] = newValue;
		}
		
		System.out.println(Arrays.toString(drinks));
	}
	

}
