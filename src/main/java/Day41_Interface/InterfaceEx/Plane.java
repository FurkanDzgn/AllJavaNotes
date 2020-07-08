package Day41_Interface.InterfaceEx;

public class Plane extends Vehicle implements Flyable,Noise  {

	// To achive multiple inheritance we need an interface.
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Zhhhhhhhhhh");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Plane is flying.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Plane can drive.");
	}
	
	
}
