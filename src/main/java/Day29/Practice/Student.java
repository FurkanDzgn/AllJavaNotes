package Day29.Practice;

public class Student {
	
	// Encapsulation -> hiding the data with private access modifier
	// and giving them an access through getters and setters
	
	private String name;
	private int id;
	private int SSN;
	private String address;
	
	public Student(String name, int id, int SSN, String address) {
		this.name=name;
		this.id=id;
		this.SSN=SSN;
		this.address=address;
	}	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getSSN() {
		return this.SSN;
	}
	
	public void setSSN(int SSN) {
		this.SSN=SSN;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", id=" + id + ", SSN=" + SSN + ", address=" + address + "]";
//	}
	
	// getters and setters 
}
