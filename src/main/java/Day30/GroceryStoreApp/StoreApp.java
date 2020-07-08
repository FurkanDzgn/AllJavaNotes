package Day30.GroceryStoreApp;

public class StoreApp {
	public static void main(String[] args) {
		
	//	GroceryStore store = new GroceryStore(20); // "8 PM" --> it's homework
		
		GroceryStore store = new GroceryStore("9:45 pm");
		
		System.out.println(store.isOpen());
		
		System.out.println(store.items);
	//	System.out.println(store.boughtItems); --> Firstly empty
		
		store.buy("Milk");
		System.out.println(store.items);
		System.out.println(store.boughtItems);
		store.buy("Mushrooms");
		System.out.println(store.items);
		System.out.println(store.boughtItems);
		store.buy("Eggs");
		System.out.println(store.items);
		System.out.println(store.boughtItems);
		
		store.returnItem("Mushrooms");
		System.out.println(store.items);
		System.out.println(store.boughtItems);
		store.returnItem("Bread");
		System.out.println(store.items);
		System.out.println(store.boughtItems);
		
		store.replaceItem("Milk", "Yogurt");
		System.out.println(store.items);
		System.out.println(store.boughtItems);
		
		store.replaceItem("Choccolate", "Coffee");
		System.out.println(store.items);
		System.out.println(store.boughtItems);
		
	}

}
