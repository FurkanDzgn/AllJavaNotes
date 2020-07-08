package Day30.HRApp;

import java.util.List;

public class HRFunctions {
	/**
	 * This method will generate email like below:
	 * For example:
	 *  President Steven King 90 -> presidentsking90@mycompany.com
	 *   
	 *   
	 * @param employees
	 * @return
	 */
	public static String[] generateEmails(List<Employee> employees) {
		String[] emails = new String[employees.size()];
		
		for(int i=0; i<employees.size(); i++) {
			String title = employees.get(i).getJob().getTitle();
			String fistNameLetter = ""+employees.get(i).getFirstName().charAt(0); // char fistNameLetter = employees.get(i).getFirstName().charAt(0);
			String lastName = employees.get(i).getLastName();
			int departmentId = employees.get(i).getDepartment().getDepartmentId();
			emails[i] = (title+fistNameLetter+lastName+departmentId+"@mycompay.com").toLowerCase().replaceAll(" ", "");
			
		}
		return emails;
	}
	
	/**
	 * Write a function that will print fistName and lastName
	 * of employee to Array of String who makes more than average salary.
	 * Name of the method: salaryAverage(List<Employee> employees) 
	 */
	
	public static String salaryAverage(List<Employee> employees) {
		double sum = 0;
		int count = 0;
		String result = "";
		
		for(int i=1; i<employees.size(); i++) {
			sum +=employees.get(i).getJob().getSalary();
			count++;
		}
		sum = sum/count;
		
		for(int i=0; i<employees.size(); i++) {
			if(employees.get(i).getJob().getSalary()>sum) {
				result+= employees.get(i).getFirstName()+" "+employees.get(i).getLastName();
			}
		}
		
		return result;
	}
	
	
	
        //	Create blow mentioned methods in HRFunctions class of HRApp project

	    /**
	     * Write a method that will store firstName, lastName, and 
	     * employeeId of those employees who make more salary than
	     * employee under employeeId = 150;
	     * method return type is Array of String
	     */
	      
	      public static String[] task3(List<Employee> employees){
	    
	    	  int count=0;
	    	  int index=0;
	    	  
	    	  for(int i=0; i<employees.size(); i++) {
	    		  if(employees.get(i).getEmployeeId()<150) {
	    			  count++;
	    		  }
	    	  }
	    	  String[] arr = new String[count];
	    	  for(int i=0; i<employees.size(); i++) {
	    		  if(employees.get(i).getEmployeeId()<150) {
	    			 arr[i]=employees.get(i).getFirstName()+" "+employees.get(i).getLastName()+" "+employees.get(i).getEmployeeId();
	    		  }
	    	  }
	    	  
	    	 return arr; 
	    	  
	    	  
	      }
	
	   
	
	
	    /**
	     * Write a method that will store max salary for each department
	     * if the count of employees in that department is more than 5
	     * Returns Array of String
	     * 
	     */
	      
	      public static String[] maxSalary(List<Employee> employees) {
	    	  
	    	  for(int i=0; i<employees.size();i++) {
	    		  
	    	  }
	    	    
	    	  return null;
	      }
	 
	
	
	    /**
	     * Write a method that will return employee id who makes lowest salary
	     */
	      
	      public static int empId(List<Employee> employees) {
	    	  
	    	  double temp=employees.get(0).getJob().getSalary();
	    	  int index = 0;
	  
	    	  for(int i=1; i<employees.size(); i++) {
	    		  if(employees.get(i).getJob().getSalary()<temp) {
	    			  temp = employees.get(i).getJob().getSalary();
	    			  index=i;
	    		  }
	    		  
	    	  }
	    	  return employees.get(index).getEmployeeId();
	    	  
	      }
	   
	
	
	    /**
	     * Write a method that will return employee id who makes highest salary
	     */
	      
              public static int emploId(List<Employee> employees) {
	    	  
	    	  double temp=employees.get(0).getJob().getSalary();
	    	  int index = 0;
	  
	    	  for(int i=1; i<employees.size(); i++) {
	    		  if(employees.get(i).getJob().getSalary()>temp) {
	    			  temp = employees.get(i).getJob().getSalary();
	    			  index=i;
	    		  }
	    		  
	    	  }
	    	  return employees.get(index).getEmployeeId();
	    	  
	      }

}
