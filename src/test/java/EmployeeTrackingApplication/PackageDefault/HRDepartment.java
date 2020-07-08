package EmployeeTrackingApplication.PackageDefault;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HRDepartment {


    private String location;
    private String companyName;
    private ArrayList<Employee> allCards;

    public HRDepartment(String location, String companyName){
        this.location=location;
        this.companyName=companyName;
        this.allCards=new ArrayList<Employee>();
    }

    public boolean addEmployee(Employee card){
        /*
        This method will take the parameter as a Employee object and
        if the Employee is not added to the list before it will add to the arraylist.
        To be able to understand employee is registered or not you need to check employeeId.
        Because employee id is unique value.
        Also, This company can hold up to 20 employee.
        NOTE: The company has 6 department and in each department can have max 5 employee.

         */
    
    	int count=0;
        
        if(allCards.size()==20) {
            System.out.println("The company has maximum capacity");
            
            return false;
        }else {
        for(int i=0;i<allCards.size();i++) {
            if(allCards.get(i).getDepartment().equals(card.getDepartment())) {
                count++;
            }
        }
        if(count==5) {
            System.out.println(card.getDepartment()+" Has maximum capacity");
            return false;
        }else {
        if(card.getEmployeeId().length()!=20 && (allCards.contains(card)) ) {
        
            return false;
        }else {
        	allCards.add(card);
        	return true;
        }
        }
        }
        }
        
       
//        int count = 0;
//    	for(Employee cardd:allCards) {
//    		if(cardd.getEmployeeId().equals(card.getEmployeeId())) {
//    			count++; 			
//    		}
//    	}
//    	
//    	if(count<5) {
//    	for(int i=0; i<allCards.size() ;i++) {
//    		if(!(allCards.get(i).getEmployeeId().equals(card.getEmployeeId())) && allCards.size()<20 ) {
//    			allCards.add(card); 
//    			return true;
//    	    }else {
//    	    	return false;
//    	    }
//       }
//    }
//    	  		
//        return false;
//    }
    
    public void printEmailAddress(String departmentName){

        /*
        this method is taking one parameter department name and it will print all the email address.
         which is available in this list related with department id
         */
    	
    	for(int i=0; i<allCards.size(); i++) {
    		if(allCards.get(i).getDepartment().equals(departmentName)) {
    			System.out.println(allCards.get(i).getEmail());
    		}
    	}
    }

    public boolean updateEmailAddress(String employeeId, String newEmailAddress){

        /*
        This method is taking parameter as employeeId and email address.
        According to the employeeId, you will update the old email address with new email.
        if it is updated this method will return true else return false
         */
    	
    	boolean isUpdated=false;
    	
    	int i=0;
    	for(; i<allCards.size(); i++) {
    		if(allCards.get(i).getEmployeeId().equals(employeeId)) {
    			isUpdated=true;
    			break;
    		}
    	}
    	if(isUpdated) {
    		allCards.get(i).setEmail(newEmailAddress);
    		return true;
    	}
    	
        return false;
    }
    
 //   1- Create the method will take parameter as employeeId and new phone number, 
 //   it will update old phone number with new phone number.
    
    public boolean uptadePhoneNum(String employeeId, String phoneNumber) {
    	
    	for(int i=0; i<allCards.size(); i++) {
    		if(allCards.get(i).getEmployeeId().equals(employeeId)) {
    			allCards.get(i).setPhoneNumber(phoneNumber);
    			return true;
    		}
    	}
    	
    	return false;
    	  	
    }

    // 2- Create the method will take parameter as emailAddress and newTitle, it will update old title with new title.
    
     public boolean uptadeTitle(String emailAddress, String newTitle) {
    	
    	for(int i=0; i<allCards.size(); i++) {
    		if(allCards.get(i).getEmail().equals(emailAddress)) {
    			allCards.get(i).setTitle(newTitle);
    			return true;
    		}
    	}
    	
    	return false;
    	  	
    }
     // 3- Create the method will take one parameter as a employeeId and it will print all other information of employee like
    //   name, email, phone, title, department etc.
     
     public void printInfo(String employeeId) {
    	 
    	 for(int i=0; i<allCards.size(); i++) {
    		 if(allCards.get(i).getEmployeeId().equals(employeeId)) {
    			 System.out.println(allCards.get(i).toString());
    		 }
    	 }
     }
    
     //  4- Create the method will take one parameter as a employeeId and it will remove the employee from the list.
     
     public boolean removeList(String employeeId) {
    	 
    	 for(int i=0; i<allCards.size(); i++) {
    		 if(allCards.get(i).getEmployeeId().equals(employeeId)) {
    			 allCards.remove(allCards.get(i));
    			 return true;
    		 }
    	 }
    	 return false;
     }
     
     // 5- Create the method will take no parameter and it will print all the department names with employee numbers
     
     public void printDepartmentAndEmpNum() {
    	   	 
    	 int c1=0;
    	 int c2=0;
    	 int c3=0;
    	 int c4=0;
    	 int c5=0;
    	 int c6=0;
    	 
    	 for (int i = 0; i<allCards.size(); i++) {
    		 if(allCards.get(i).getDepartment().equals("Finance"))
			    c1++;
		    else if(allCards.get(i).getDepartment().equals("Marketing"))
		    	c2++;
		    else if(allCards.get(i).getDepartment().equals("IT"))
		    	c3++;
		    else if(allCards.get(i).getDepartment().equals("HR"))
		    	c4++;
		    else if(allCards.get(i).getDepartment().equals("Purchasing"))
		    	c5++;
		    else if(allCards.get(i).getDepartment().equals("Sales"))
		    	c6++;
		    
    	 }		 
    		 System.out.println("Finance: "+c1 +"\n"+ "Marketing: "+c2 +"\n"+"IT: "+c3 +"\n"+
    				            "HR: "+c4 +"\n"+"Purchasing: "+c5 +"\n"+"Sales: "+c6 +"\n");
     
     }
     
     public ArrayList<Employee> getAllCards(){
    	 
    	 ArrayList<Employee> cards = new ArrayList<Employee>();
   	
    		 cards.addAll(allCards);
  
    		 return cards;
    	
     }

    /*
    REST OF THE METHODS
        1- Create the method will take parameter as employeeId and new phone number, it will update old phone number with new phone number.
        2- Create the method will take parameter as emailAddress and newTitle, it will update old title with new title.
        3- Create the method will take one parameter as a employeeId and it will print all other information of employee like
        name, email, phone, title, department etc.
        4- Create the method will take one parameter as a employeeId and it will remove the employee from the list.
        5- Create the method will take no parameter and it will print all the department names with employee numbers
        The Company has 6 different department Finance, Marketing, IT, HR, Purchasing and Sales department.
        For example:
        Finance department - 10 employee
        Marketing department - 10 employee
        IT department - 10 employee
        ...
        .
        */
}
