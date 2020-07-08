package Day32_DateAndTimes.OCA_Test;

public class Drink {
	
	public Drink() {
		this("yyd",8);
	}
	
	public Drink(int num) {
		this("sff",5);
		
	}
	
	public Drink(String name, int lit) {
		//this();
	}
	
	public Drink(String name) {
		this();
	}
	
	public static void drinkwater() {
		
	}
	public void getDrink() {
		// 3 way of call methods
		this.drinkwater();
		drinkwater();
		Drink.drinkwater();
		
		
	}
	public static void main(String[] args) {
		
	}

}
