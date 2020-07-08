package Homework2.UtilityClasses;

//import java.util.Arrays;
//import java.util.Stack;
//
//import Test.Data;
//
///**
// *
// * @author Arslan K.
// *
// */
//public class Methods {
//
//	/**
//	 * This method will return all item names as String array
//	 * from String ITEMS in Data class.
//	 *
//	 * @return
//	 */
//	public static String[] getItemNames() {
//
//		String[] arrS=Data.ITEMS.split(",");
//		String[] str=new String[arrS.length];
//
//		for(int i=0;i<arrS.length;i++) {
//			str[i]=arrS[i].substring(0,arrS[i].indexOf("$")).trim();
//		}
//		return str;
//	}
//
//	/**
//	 * This method will return all item prices as int array
//	 * from String ITEMS in Data class.
//	 *
//	 * @return
//	 */
//	public static double[] getItemPrices() {
//
//		String[] arrS=Data.ITEMS.split(",");
//		double[] arrD=new double[arrS.length];
//
//		for(int i=0;i<arrS.length;i++) {
//			arrD[i]=Double.parseDouble(arrS[i].substring(arrS[i].indexOf("$")+1));
//		}
//		return arrD;
//	}
//
//	/**
//	 * This method will calculate total price if buyer wants to buy
//	 * all items that are in ITEMS in Data class.
//	 *
//	 * Apply %10 discount for special items.
//	 * For example:
//	 *
//	 * @return
//	 */
//	public static double getTotal() {
//
//		String[] str=Methods.getItemNames();
//		double[] arr=Methods.getItemPrices();
//		double total=0;
//
//		OUTHER:
//			for(int i=0;i<str.length;i++) {
//			for(int k=0;k<Data.SPECIAL_ITEMS.length;k++) {
//				if(Data.SPECIAL_ITEMS[k].equalsIgnoreCase(str[i])) {
//					total+=arr[i]-arr[i]*10/100;
//					continue OUTHER;
//				}
//			}
//				total+=arr[i];
//		}
//
//		return total;
//	}
//
//	/**
//	 * This method will calculate total price for buyer who buys
//	 * items that are in items array in parameter.
//	 *
//	 * Apply %10 discount for special items.
//	 * @param items
//	 * @return
//	 */
//	public static double getItemsTotal(String[] items) {
//
//		String[] str=Methods.getItemNames();
//		double[] arr=Methods.getItemPrices();
//		double total=0.0;
//
//		OUTHER:
//			for(int i=0;i<items.length;i++) {
//			for(int k=0;k<Data.SPECIAL_ITEMS.length;k++) {
//				if(Data.SPECIAL_ITEMS[k].equalsIgnoreCase(items[i])) {
//					for(int t=0;t<str.length;t++) {
//						if(str[i].equalsIgnoreCase(items[i])) {
//							total+=arr[t]-arr[t]*10/100;
//							continue OUTHER;
//						}
//					}
//
//				}
//			}
//			for(int l=0;l<str.length;l++) {
//				if(items[i].equalsIgnoreCase(str[l])) {
//					total+=arr[l];
//				}
//			}
//
//		}
//
//		return total;
//	}
//
//	/**
//	 * This method will return a receipt as a String
//	 * for items in parameter. Like below:
//	 * For Example
//	 * 		iPhone 10 $449.00
//	 * 		Mouse $79.99
//	 * 		Total: $528.99
//	 *
//	 * @param items
//	 * @return
//	 */
//	public static StringBuilder printReceipt(String[] items) {
//		//TODO
//		return null;
//	}
//
//}
