package Day30.HRApp;

import java.util.Arrays;
import java.util.List;

public class HRApp {
	
	public static void main(String[] args) throws Exception {
		
//		Location location1 = new Location("USA", "IL", "Chicago",45);
//		Department department1 = new Department(101, "IT", location1);
//		Job job1 = new Job("SDET", "1",1000000.0);
//		Employee employee1 = new Employee("Patel", "Harsh", 10, department1, job1);
////		
//		System.out.println(employee1);
////		
////		System.out.println(department1);
////		System.out.println(employee1.getDepartment());
//	
//		System.out.println(location1);
	
		
		// Beans 
		
		
		System.out.println("==========================");
		
	//	System.out.println(DataLoader.loadEmployees());
		
		/**
		 * Print all employees first name who works in IT_PROG job
		 */
		List<Employee> employees = DataLoader.loadEmployees();
		
//		for(int i=0; i<employees.size(); i++) { 
//			if(employees.get(i).getJob().getJobId().equals("IT_PROG")) {
//				System.out.println(employees.get(i).getFirstName());
//			}
//		}
		
		/**
		 * Print employees id who works in departmentId 50
		 */
		
//		for(int i=0; i<employees.size(); i++) {
//			if(employees.get(i).getDepartment().getDepartmentId() == 50) {
//				System.out.println(employees.get(i).getEmployeeId());
//			}
//		}
		
		
		
//        String[] emails = HRFunctions.generateEmails(employees);
//		System.out.println(Arrays.toString(emails));
		
		String result = HRFunctions.salaryAverage(employees);
		System.out.println(result);
//		
//		String [] arr = HRFunctions.task3(employees);
//		System.out.println(Arrays.toString(arr));
//		
//		int result1 = HRFunctions.empId(employees);
//		System.out.println(result1);
//		
//		int result2  = HRFunctions.emploId(employees);
//		System.out.println(result2);
	
		
	}

}
