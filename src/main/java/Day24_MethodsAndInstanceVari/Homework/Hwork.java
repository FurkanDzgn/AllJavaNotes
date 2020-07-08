package Day24_MethodsAndInstanceVari.Homework;

public class Hwork {

	        String[] items = { "iPhone 10", "iPhone 6s", "Samsung", "MacbookPro", "ThumbDrive", "Beats HeadPhones",
	                "Mouse", "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch" };
	        double[] prices = { 449, 549, 1149, 1499.99, 39.99, 349.99, 79.99, 39.99, 429, 399, 2199, 559 };
	        double[] monthlyPayments = { 18.71, 22.88, 56.16, 79.49, 2.68, 15.12, 8.98, 4.56, 18.31, 16.25, 89.49, 21.18 };
	        
	        /**
	         * write a method that an item name and returns all details for it.
	         * If item is not in the list then returns null
	         * ex:
	         *  getItemDetails("ThumbDrive") --> ThumbDrive-39.99-2.68
	         *  getItemDetails("Charger") --> Charger-39.99-4.56
	         *  getItemDetails("Potato") --> null
	         * @param item
	         * @return
	         */
	        
	        public String getItemDetails(String item){
	         
	        	for(int i=0; i<items.length; i++) {
	        		if(item==items[i]) {
	        			return items[i]+"-"+prices[i]+"-"+monthlyPayments[i];
	        		}
	        	}
	            return null;
	        }  
	        /**
	         * write a method that accepts a price and returns a Stringbuilder
	         * with items with less than or equal monthly payments
	         * 
	         * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
	                                                   Charger-39.99-4.56
	           getItemsLessThanAMonthlyPrice(1.99) --> ""
	         * 
	         * @param price
	         * @return stringBuilder
	         */
	        public StringBuilder getItemsLessThanAMonthlyPrice(double price) {
	            
	        	StringBuilder result = new StringBuilder();	
	        	for(int i=0; i<monthlyPayments.length; i++) {
	        		if(price>=monthlyPayments[i]) {
	        			result.append(items[i]+"-"+prices[i]+"-"+monthlyPayments[i]+"\n");
	        		}
	        	}	
	           return result;    
	        }
	public static void main(String[] args) {
		Hwork res = new Hwork();
		System.out.println(res.getItemDetails("iPhone 10"));
		System.out.println(res.getItemsLessThanAMonthlyPrice(5.99));
	}
}
