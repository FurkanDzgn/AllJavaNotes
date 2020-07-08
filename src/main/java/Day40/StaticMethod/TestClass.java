package Day40.StaticMethod;

public class TestClass {
	
	public static void main(String[] args) {
		
		Sofa sofa = new Sofa();
		
		System.out.println(sofa.isMovable());
		sofa.furnitureType = "Home Furniture";
		sofa.material = "leather";
		System.out.println(sofa.isNew());
		
	}

}
