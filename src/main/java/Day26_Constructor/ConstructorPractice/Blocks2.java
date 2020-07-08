package Day26_Constructor.ConstructorPractice;

public class Blocks2 {
	
	{
		System.out.println("1");
	}
	
	{
		System.out.println("2");
	}
	
	static {
		System.out.println("3");
	}
	
	public Blocks2() {
		System.out.println("4");
	}
	
	static {
		System.out.println("5");
	}
	
	public static void main(String[] args) {
		
		Blocks2 blocks = new Blocks2();
		System.out.println("-----------");
		Blocks2 blocks2 = new Blocks2();
		
	}

}
