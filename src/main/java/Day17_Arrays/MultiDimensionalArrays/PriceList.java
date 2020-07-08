package Day17_Arrays.MultiDimensionalArrays;

public class PriceList {
	public static void main(String[] args) {
		
		String [][] products= { // [3][];
				{"Apple","Orange","Banana","Grapes","Kiwi"}, // a=0 ,  b -> 5 times
				{"Carrot","Potatos","Cabbage","Cucumber"},//a=1 ,  b -> 4 times
				{"Orange Juice","Coke","Water","Pepsi"}	//a=2  ,  b -> 4 times
		};
		
		double[][] prices = {
				{1.99, 2.49, 0.69, 1.39, 2.59},
				{0.59, 1.19, 3.0, 2.49},
				{3.99, 1.99, 0.99, 1.99}
		};
		
		int[][] inventory = {
				{50, 20, 45, 20, 10},
				{100, 200, 50, 10},
				{120, 250, 500, 150}	
		};
		
		/*
		 * Product name is Apple price is 1.99 and number of pounds in inventory is 50
		 */
//		
//		System.out.println("Product name is "+ products[0][0]+ "\nprice is"+prices[0][0]+
//				"\nNumber of pounds "+inventory[0][0] );
//		System.out.println("Product name is "+ products[2][2]+ "\nprice is"+prices[2][2]+
//				"\nNumber of pounds "+inventory[2][2] );
		
		for(int a=0; a<products.length; a++) {
			for(int b=0; b<products[a].length; b++) {
				System.out.println("Product name is "+ products[a][b]+ "\nprice is"+prices[a][b]+
						"\nInventory number "+inventory[a][b]+"\n" );
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
