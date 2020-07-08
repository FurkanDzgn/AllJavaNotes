package Day24_MethodsAndInstanceVari.MethodPractice;

public class Bicycle06 {
	
	// instance variables
	String model;
	double price;
	int numOfTires;
	
	public void ride() {
		System.out.println(model+" Bicycle is riding.");
	}	
	
	public void stop() {
		System.out.println("Bicyle is stopped");
	}

	public double getPrice() {
		return price;
	}
	
	public double changePrice(double newPrice) {
		price=newPrice;
		return  getPrice();
	}
	
	public int getNumOfTires() {
		return numOfTires;
	}

}
