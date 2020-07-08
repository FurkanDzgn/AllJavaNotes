package Day08.Vehicles;

public class Car {
	
	String brandName;
	String color;
	String model;
	int year;
	int currentSpeed; // 30 -> 35 -> 5
	
	public void drive() {
		System.out.println("Car is driving.");
	}
	public void accelarate(int moreSpeed) {
		currentSpeed += moreSpeed;	
		
//		public int accelarate(int moreSpeed) {
//		currentSpeed += moreSpeed;	
//		return currentSpeed;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	

}
