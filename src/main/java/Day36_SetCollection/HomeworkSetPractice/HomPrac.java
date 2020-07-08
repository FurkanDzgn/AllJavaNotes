package Day36_SetCollection.HomeworkSetPractice;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomPrac {
	
	/**
	 * Create one method takes String Arraylist with duplicate values,
	 * this method need to return array with descending order of unique element from arrayList.
	 *   �Input: [�java�, �phython�, �javascript�, �c++�, �java�, �c++�]
	 *    Returns new String[]�> {�phython�, �javascript�, �java�, �c++�}
	 */	
	public static String [] method1(ArrayList<String> arr){
		
//		TreeSet<String> meth = new TreeSet(arr);
//		TreeSet<String> meth2 = (TreeSet<String>) meth.descendingSet();
//		ArrayList<String> meth3 = new ArrayList(meth2);
//		String [] meth4 = new String[meth3.size()]; // we can not convert Object[] to String [] cuz og we use for each loop
//		for(int i=0; i<meth3.size(); i++) {
//			meth4[i] = meth3.get(i);
//		}
//		return meth4;
		
		TreeSet<String> tre = new TreeSet<>(arr);
		TreeSet<String> tre1 = (TreeSet<String>) tre.descendingSet(); // Autoboxing
		ArrayList<String> tre2 = new ArrayList(tre1);
		String []  result = new String[tre2.size()];
		for(int i=0; i< tre2.size(); i++) {
			result[i]=tre2.get(i);
		}
		return result;	
	}
	
	/**
	 * Create one method takes one String Array and needs to return ArrayList
	 *  with unique elements with ascending from String Array.
	 * � Input: [�java�, �phython�, �javascript�, �c++�, �java�, �c++�]
	 *  Returns new ArrayList �> [�c++�,�java�, �javascript�,�phython�]
 
	 */	
	public static ArrayList<String> method2(String [] arr){
		
		TreeSet<String> tree = new TreeSet(Arrays.asList(arr));
		ArrayList<String> arrayList = new ArrayList(tree);
		
		return arrayList;		
	}
	
	/**
	 * Create one method takes one String array.
	 * This method needs to return how many unique element you have in array.
	 *  � Input: [�java�, �phython�, �javascript�, �c++�, �java�, �c++�]
	 *    Output: 4
	 */
	public static int method3(String [] arr) {
		
//		List<String> arr1 =Arrays.asList(arr);		
//		Set <String> has = new HashSet<>(arr1);
		Set<String> has1 = new HashSet<>(Arrays.asList(arr));
		
		return has1.size();
	}
	
	/**
	 * Create one method takes one int array.
	 * This methods needs to print all unique element from array in descending order.
	 *  � Input: [2,3,4,4,7,2,1]
	 *    Output: 7, 4, 3, 2, 1
	 */	
	public static String [] method4(int[] arr) {
		
//		TreeSet<Integer> tree = new TreeSet<>(Arrays.asList(arr)); // We need put inside () Object not primitive
//		
//		TreeSet<Integer> tree1 = (TreeSet<Integer>) tree.descendingSet();
//		ArrayList<Integer> arrlist = new ArrayList<Integer>(tree1);
//		String[] ar = new String[arrlist.size()];
//		for(int i=0; i<arrlist.size(); i++) {
//			ar[i] = String.valueOf(arrlist.get(i));
//		}
//		return ar;
		
		ArrayList<Integer> meth = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			meth.add(arr[i]);
		}
		TreeSet<Integer> meth1 = new TreeSet(meth);
		TreeSet<Integer> meth2 = (TreeSet<Integer>) meth1.descendingSet();
		ArrayList<Integer> meth3 = new ArrayList(meth2);
		String [] meth4 = new String[meth3.size()];
		for(int i=0; i<meth3.size(); i++) {
			meth4[i] = String.valueOf(meth3.get(i)); // ""+ meth3.get(i);
		}
		return meth4;
		
//		Integer [] arr1 = new Integer[arr.length];
//		for(int i=0; i<arr.length; i++) {
//			arr1[i] = Integer.valueOf(arr[i]);
//		}
//		
//		TreeSet<Integer> tr = new TreeSet(Arrays.asList(arr1));
//		TreeSet<Integer> tr1 = (TreeSet<Integer>) tr.descendingSet();
//		ArrayList<Integer> tr2 = new ArrayList(tr1);
//		Object [] tr3 = tr2.toArray();
//	          
//		return tr3;
	}
	
	/**
	 * Create one method takes one int array.
	 * This methods need to print all unique elements from array ascending order.
	 *   � Input: [2,3,4,4,7,2,1]
	 *   � Output: 1, 2, 3, 4, 7
 
	 */
	
	public static String [] method5(int[] arr) {
		
//		ArrayList<Integer> meth = new ArrayList();
//		for(int i=0; i<arr.length; i++) {
//			meth.add(arr[i]);
//		}
		
		Integer [] arr1 = new Integer[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr1[i] = arr[i];
		}
		
		TreeSet<Integer> meth2 = new TreeSet(Arrays.asList(arr1));
		ArrayList<Integer> meth3 = new ArrayList<Integer>(meth2);
		String[] meth4 = new String[meth3.size()];
		for(int i=0; i<meth3.size(); i++) {
			meth4[i] =""+ meth3.get(i);
		}
		return meth4;
		
		

//		Integer [] arr1 = new Integer[arr.length];
//		for(int i=0; i<arr.length; i++) {
//			arr1[i] = Integer.valueOf(arr[i]);
//		}
//		
//		TreeSet<Integer> tree = new TreeSet(Arrays.asList(arr1));
//		ArrayList<Integer> tree1 = new ArrayList(tree);
//		Object [] result = tree1.toArray();
//		return result;
	}

}
