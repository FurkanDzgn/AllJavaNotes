package EmployeeTrackingApplication.PackageDefault;

import java.util.Random;

public class Employee {


    /*
    1- Create private instance variables for employee firstName, lastName, phoneNumber, email, employeeId, startDate,
    title, department)
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the employeeId length of 20. This employee id must have letters as well.

       */
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String employeeId;
	private String startDate;
	private String title;
	private String department;
		
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	private Employee(String firstName, String lastName, String phoneNumber, String email,
			String startDate, String title, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.employeeId = generateEmployeeId();
		this.startDate = startDate;
		this.title = title;
		this.department = department;
	}

	public static Employee createEmployee(String firstName, String lastName,String phoneNumber,
    		String email, String startDate, String title, String department){
 	
    /*
    this method need to return Employee according to the parameter
    call the constructor inside this method.
     */
//		Employee emply = new Employee(firstName, lastName, phoneNumber, email, startDate, title, department);
//        return emply;
        return new Employee(firstName, lastName, phoneNumber, email, startDate, title, department);
    }
	
	
    @Override
	public String toString() {
		return "Employee {firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", employeeId=" + employeeId + ", startDate=" + startDate + ", title=" + title
				+ ", department=" + department + "}";
	}

	public String generateEmployeeId(){

        /*
        this method needs to return the employeeId Length of 20 which includes numbers as well.
        EmployeeId structure must be length of 20 UUID
        Example: 61c49c2e-7dcd-11ea-bc55
                 as0bn3un-zn2b-opvc-yvgj

         */
		Random get = new Random();
		
		
		StringBuilder str = new StringBuilder();
		String alphabetAndNumber = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		for(int i=0; i<20; i++) {
			
		str.append(alphabetAndNumber.charAt(get.nextInt(36)));	
			
		}
		
		str.insert(8,"-");
		str.insert(13,"-");
		str.insert(18,"-");
		String employeeId = str.toString();
		
        return employeeId;
    }
}
