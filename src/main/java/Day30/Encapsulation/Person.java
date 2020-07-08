package Day30.Encapsulation;

public class Person {
	
	private String name;
	private int age;
	private char gender;
	private boolean isEmployed;
	
	//setName
	public void setName(String name) {
		this.name=name;
	}
	
	//getName
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setIsEmployed(boolean isEmployed) {
		this.isEmployed=isEmployed;
	}
	
	public boolean getIsEmployed() {
		return isEmployed;
	}
	
	public String toString() {
		return "Name: "+name+"\nAge: " +age+"\nGender: "+ gender+"\nIsEmployed: "+isEmployed;
	}

}
