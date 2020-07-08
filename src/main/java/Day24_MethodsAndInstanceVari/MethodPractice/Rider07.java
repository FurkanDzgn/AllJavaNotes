package Day24_MethodsAndInstanceVari.MethodPractice;

public class Rider07 {
	public static void main(String[] args) {
		
		Bicycle06 bicyle = new Bicycle06();
		
		bicyle.model="MountBike";
		bicyle.price=100;
		
		bicyle.ride();
		bicyle.stop();
		bicyle.numOfTires=2;
		
		System.out.println(bicyle.getNumOfTires());
		
		System.out.println(bicyle.getPrice()); // .getPrice() will return some value which will be printed
		
		System.out.println(bicyle.changePrice(189.2));
	}

}
