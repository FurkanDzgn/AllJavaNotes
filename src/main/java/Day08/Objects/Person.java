package Day08.Objects;

public class Person {
	
	String name;
	int age;
	char gender;
	String position;
	double salary;
	
	public void study() {
		System.out.println(name + " is studying.");
	}
	
	public void work(int hours) {
		System.out.println(name+" is working "+ hours+" hours.");
	}
	
	public void bike(int miles) {
		System.out.println(name +" can bike at most "+miles+" miles." );
	}
	
	public void swim() {
		System.out.println(name+" is swimming.");
	}
	
	public void talk(String speech) {
		System.out.println(name+" is saying "+speech);
	}
}


