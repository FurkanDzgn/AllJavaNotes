package Day41_Interface.InterfaceEx;

public class Bird implements Flyable,Noise {


	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Chik chik");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird is flying.");
	}

	
	
}
