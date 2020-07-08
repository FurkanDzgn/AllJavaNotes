package Day23_StringBuilder.Homework;

import java.util.Arrays;

public class Tech {
	
	// initialization variables
	
	 public String[] ITEMS = {"Cactus", "T Shirt", "Gum", "Terracotta Necklace", "Coffee Mug", "Wood Crate Wall Storage", "Blanket", "Spoon", "Copper Coffee and Tea Kettle", "Wall Art", 
	            "Marble Clock", "Natural Bench", "Llama Valley Framed Print", "Gold Metal Frame Mirror", "Fork", "Star Wars game", "Baby toys", "Anchor", "Sunlight", "planet Saturn"}; 
	    public double[] PRICES = {49.99, 13.99, 5.99, 14.99, 29.99, 11.50, 79.99, 23.80, 27.99, 39.44, 78.40, 299.30, 55.00, 176.89, 4.99, 67.00, 8.19, 50.00, 1500, 400};
	    
	    public int[] INVENTORYNUM = {4,12,32,4,8,90,88,1,4,55,6,3,4,2,8,67,9,10,11,12};
	    
	    // ************** Method 1******************
	    
	    /**
	     * Write a method that reads values from above arrays and 
	     * returns a stringbuilder with all item details:
	     * Method name:getAllDetails
	     *  
	     * return format:
	     *      Cactus-49.99-4
	            T Shirt-13.99-12
	            ...
	            String[] items, double[]prices, int[] inventorynum
	     * @return StringBuilder
	     */
	    public StringBuilder getAllDetails() {
	    	
	    	StringBuilder arr = new StringBuilder();
	    	for(int i=0; i<ITEMS.length; i++) {
	    		arr.append(ITEMS[i]+"-"+PRICES[i]+"-"+INVENTORYNUM[i]+"\n");
	    	}
	    	return arr;
	    }
	    
	    
	    // ************** Method 2******************
	    
	    /**
	     * Write a method that will find price of the item and return it
	     * Item index in the ITEMS array is corresponding to the index in the PRICES array
	     * Method name: findItemPrice
	     * 
	     * @param String item from ITEMS least 
	     * @return double price for that item
	     */
    
	    public double findItemPrice(String product) {
	    	
	    	int i=0;
	    	for(; i<ITEMS.length; i++) {
	    		if(product==ITEMS[i]) {
	    			break;
	    		}
	    	}
	   // 	double result = PRICES[i];
	    	
	    	return PRICES[i];
	    }
	    
         public static void main(String[] args) {
        	 Tech aaa = new Tech();
        	 System.out.println(aaa.getAllDetails());	 
        	 System.out.println(aaa.findItemPrice("Gum"));
        	 
		}
}
