package Day30.GroceryStoreApp;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore {
	
	/**
	 * 
	 * Once instance is created out of this class.
	 * it will automatically store all items in list
	 * which has to be purchased from grocery store.
	 * And it will also print message: 'List is ready 
	 * and heading to store';
	 * 
	 * We will have methods like buy();, return ;, replace();
	 * buy(item); -> is going to remove item from your list.
	 * return(item); -> is going to add item back to your list.
	 * replace(oldItem, newItem); -> it will replace an old item to new item.
	 * isOpen(); -> it will check if grocery store is open or not. (true/false).
	 * 
	 * We will have one parameter constructor that will accept a int time.
	 * 
	 */
	
	static List<String> items = new ArrayList<>(); 
	
	static{
		items.add("Bread");
		items.add("Milk");
		items.add("Patato");
		items.add("Cereal");
		items.add("Tomato");
		items.add("Eggs");
		items.add("Mushrooms");
		items.add("Carrot");
	}
	
//	static int time;
	
	static String time;
	
	List<String> boughtItems = new ArrayList<>();
	
	public GroceryStore(String time) { // Constructor
		this.time = time;
		System.out.println("List is ready heading to grocery store");
	}
	
	public void buy(String item) {
		if(items.remove(item)) {
			System.out.println(item+" is bougth.");
			boughtItems.add(item);
		}else {
			System.out.println(item+" is bought but we didn't have it in our list.");
			boughtItems.add(item);
		}
	}
	
	public void returnItem(String item) {
		if(boughtItems.contains(item)) {
			items.add(item);
			boughtItems.remove(item);
			System.out.println(item+" is returned");
		}else {
			 System.out.println(item+" is not in bought list.");
		}
	
		
		
	}
	
	public void replaceItem(String oldItem, String newItem) {
		
		for(int i=0; i<boughtItems.size(); i++) {
			if(boughtItems.get(i).equals(oldItem)) {
				boughtItems.remove(i);
				boughtItems.add(i,newItem);
				System.out.println(oldItem + " is replaced with "+newItem);
			}else if(boughtItems.size()-1 == i) {
				System.out.println("There is no "+oldItem+" in your list.");
			}
		}
	//	boughtItems.set(boughtItems.indexOf(oldItem), newItem); // IndexOutOfBoundException
		// If there is no value in list indexOf() will return -1
		
//		int index = boughtItems.indexOf(oldItem);
//		if(index == -1) {
//			System.out.println("There is no "+oldItem+" in your list.");
//		}else {
//			boughtItems.set(index, newItem);
//			System.out.println(oldItem + " is replaced with "+newItem);
//		}
	}
	
	public boolean isOpen() {
		
		int x=Integer.parseInt(time.substring(0,time.indexOf(":")).trim());
		String y = time.substring(time.indexOf(" ")+1).trim();
		int a = Integer.parseInt(time.substring(time.indexOf(":")+1, time.indexOf(" ")).trim());
		
//		if(time>=9 && time<=21) {
//			return true;
//		}
//		return false;
		
		if(x==9 && a==0 && y.equals("pm")) {
			return true;
		}else if((x>=9 && y.equals("am")) || (x<=9 && y.equals("pm"))) {
			return true;
		}
		return false;
	}

}
