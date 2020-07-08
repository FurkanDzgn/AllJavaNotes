package Day26_Constructor.ConstructorPractice;

public class Blocks {
	
	String name;
	static  String planet; // final
//	static final String planet; // final
	
	
	public Blocks() {
		System.out.println("I am inside of constructor.");
	}
	
	
	// instance block
	// The reason of having instance block is to initialize variables, 
	// or do some code while creating an object
	
	{
		name="David";
		System.out.println("I am inside of Instance block.");
		{
			System.out.println("In nested block");
			{
				System.out.println("In inner block");
			}
		}

	}
	
	// Static block will always execute first and once
	
	static {
		planet="Earth";
		System.out.println("I am inside of Static block.");
	}
	
	public static void main(String[] args) {
		
		Blocks blocks = new Blocks();
		System.out.println("-------------------");
		Blocks blocks2 = new Blocks();
	}

}
