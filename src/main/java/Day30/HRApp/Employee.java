package Day30.HRApp;

public class Employee {
	
//	   firstName
//	   lastName
//	   employeeId
//	   department
//     job
	
	private String firstName;
	private String lastName;
	private int employeeId;
	private Department department;
	private Job job;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "{\n firstName=" + firstName + ",\n lastName : " + lastName + ",\n employeeId : " + employeeId
				+ ",\n department : " + department + ",\n job : " + job + "}";
	}

	public Employee(String firstName, String lastName, int employeeId, Department department, Job job) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.department = department;
		this.job = job;
	}
	
}
