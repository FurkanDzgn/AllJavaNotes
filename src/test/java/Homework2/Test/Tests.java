package Homework2.Test;

//import static org.junit.Assert.*;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import UtilityClasses.Methods;
//
///**
// *
// * @author Arslan K.
// *
// */
//
//public class Tests {
//
//	@Test
//	public void testGetItemNames() {
//		String[] expectedItems = { "iPhone 10", "iPhone 6s", "Samsung", "MacbookPro", "ThumbDrive", "Beats HeadPhones",
//	            "Mouse", "Charger", "iPad", "Dyson Vacuum", "TV", "Apple Watch" };
//		assertArrayEquals(expectedItems, Methods.getItemNames());
//	}
//
//	@Test
//	public void testGetItemPrices() {
//		double[] expectedPrices = { 449, 549, 1149, 1499.99, 39.99, 349.99, 79.99, 39.99, 429, 399, 2199, 559 };
//		assertArrayEquals(expectedPrices, Methods.getItemPrices(),2);
//	}
//
//	@Test
//	public void testGetTotal() {
//		double expectedPrices = 7577.15;
//		Assert.assertEquals(expectedPrices, Methods.getTotal(),2);
//	}
//
//	@Test
//	public void testGetItemsTotal1() {
//		double actualPrice = Methods.getItemsTotal(new String[] {"Samsung", "iPhone 10","Charger"});
//		double expectedPrice = 1523.09;
//		Assert.assertEquals(expectedPrice, actualPrice,2);
//	}
//
//	@Test
//	public void testGetItemsTotal2() { // 968..
//		double actualPrice = Methods.getItemsTotal(new String[] {"iPad", "ThumbDrive", "Apple Watch"});
//		double expectedPrice = 985.09;
//		Assert.assertEquals(expectedPrice, actualPrice,2);
//	}
//
//	@Test
//	public void testGetItemsTotal3() { // 968..
//		double actualPrice = Methods.getItemsTotal(new String[] {"iPhone 10", "TV", "Apple Watch","Dyson Vacuum"});
//		double expectedPrice = 3606.00;
//		Assert.assertEquals(expectedPrice, actualPrice,2);
//	}
//
//	@Test
//	public void testPrintReceipt1() {
//		StringBuilder actualPrice = Methods.printReceipt((new String[] {"iPhone 10", "TV", "Apple Watch","Dyson Vacuum"}));
//		StringBuilder expectedPrice = new StringBuilder("iPhone 10 $449.0\n" +
//				"TV $2199.0\n" +
//				"Apple Watch $559.0\n" +
//				"Dyson Vacuum $399.0\n" +
//				"Total: 3606.0");
//		Assert.assertEquals(expectedPrice.toString(), actualPrice.toString());
//	}
//
//	@Test
//	public void testPrintReceipt2() {
//		StringBuilder actualPrice = Methods.printReceipt((new String[] {"iPad", "TV"}));
//		StringBuilder expectedPrice = new StringBuilder("iPad $429.0\n" +
//				"TV $2199.0\n" +
//				"Total: 2628.0");
//		Assert.assertEquals(expectedPrice.toString(), actualPrice.toString());
//	}
//
//}
