package Day27_Wrappers.Wrappers;

public class StringConverter {
	
	public static void main(String[] args) {
		
		String[] prices = new String[] {"$30", "$45", "$12", "$89", "$110"};
		
//		int result = priceConverter(prices);
//		System.out.println(result);
		
		System.out.println(priceConverter(prices));
	}
	
	/*
	 * Write a utility method that will accept array of String
	 * with prices like ($10), and this method should return sum
	 * of all the values as int primitive. 
	 */
	
	public static int priceConverter(String[] prices) {
		
		int sum =0;
		
		for(String price: prices) {
			// 1. way
//			StringBuilder remPrice= new StringBuilder(price).deleteCharAt(0);
//			int intValue = Integer.parseInt(remPrice.toString());
			
			//2. way
			// "$30" -> "30"
			String value = price.substring(1);
			// "30" -> 30
			int intValue = Integer.parseInt(value);
			
			sum+= intValue;
			
		}
	     return sum;	
		
	}

}
