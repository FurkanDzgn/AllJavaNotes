package Day44_ThrowAndThrows.ThrowAndThrows;

public class Citizen {

	
	// vote
	private static String name;
	private static int age;
	
	public Citizen(String name, int age) {
		this.name=name;
		this.age=age;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Citizen.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Citizen.age = age;
	}
	
	public static void vote(Citizen c) {
		if(c.getAge()<18) {
			throw new RuntimeException(c.name+" is not eligible to vote.");
		}
		System.out.println(c.getName()+" is eligible to vote."); // c.name
	}
	
	public static void main(String[] args) {
		vote(new Citizen("Jhon", 45));
		
		try {
		     vote(new Citizen("Patel", 17));
		}catch(RuntimeException e){
		     System.out.println(e.getMessage());
		}
		
		vote(new Citizen("Srikkanth", 21));
	}
		
}
