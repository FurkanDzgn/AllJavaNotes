package EmployeeTrackingApplication.PackageDefault;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeAppRunner {
	
	static HRDepartment dep = new HRDepartment("Chicago", "Techtorial");

    public static void main(String[] args){
        welcome();
        printOptions();
        Scanner scanner = new Scanner(System.in);
        String option;
        /*
        implement the choice logic
         */
        do {
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));
    }

    private static void makeAChoice(String choice){
    	Scanner scan = new Scanner(System.in);
        switch (choice){
            case "0":
                System.out.println("Thank you for using our application");
                break;
            case "1":     	
               // NOTE: Employee firstName and LastName can not include any digit or symbol only upper 
               // or lower cases letter and each of them length can not be less 3
                // NOTE: Employee email address can be only gmail or yahoo account.
                // NOTE: Employee phone number must be 10 digit and also you should be able to give any letter
                // NOTE: Employee Department can not be other than given 6 department.
            	
            
            	String firstName="";
             OUTHERLOOP:
            	 for (int i = 0; i < 3; i++) {
                    System.out.println("Please enter  firstName:");
                    String NameTrial=scan.next();
                    if(NameTrial.length()>3) {
              INNERLOOP:
            	  for (int j = 0; j < NameTrial.length(); j++) {
                            if(!Character.isLetter(NameTrial.charAt(j))) {
                                System.out.println("Please enter valid name");
                                continue OUTHERLOOP;
                            }else if (j==NameTrial.length()-1) {
                            	firstName=NameTrial;     
                                break OUTHERLOOP;
                            }
                        }                               
                    }                   
                }
            	
            	
            	String lastName="";
             OUTHERLOOP:
            	 for (int i = 0; i < 3; i++) {
                    System.out.println("Please enter  lastName: ");
                    String NameTrial=scan.next();
                    if(NameTrial.length()>3) {
              INNERLOOP:
            	  for (int j = 0; j < NameTrial.length(); j++) {
                            if(!Character.isLetter(NameTrial.charAt(j))) {
                                System.out.println("Please enter valid name");
                                continue OUTHERLOOP;
                            }else if (j==NameTrial.length()-1) {
                            	lastName=NameTrial;     
                                break OUTHERLOOP;
                            }
                        }                               
                    }                   
                }
            	System.out.println("Please enter PhoneNumber: ");
            	String phoneNumber = "";
         outher:
        	 for(int i=0; i<3; i++) {
            		String num=scan.next();
            		if(num.length()==10) {
            			phoneNumber=num;
            			break outher;
            		}else {
            			System.out.println("Please enter valid phoneNum.");
            		}           		
            	}
            	            	
            	String email="";
            	outherLoop:
            		for(int i=0; i<3 ; i++) {
            		System.out.println("Please enter email: ");
            		String em = scan.next();
            		if(em.endsWith("@gmail.com") || em.endsWith("@yahoo.com")) {
            			email = em;
            			break outherLoop;
            		}else{
            			System.out.println("Please finish @gmail.com or @yahoo.com");
            		}
            		}
            	System.out.println("Please enter startDate: ");
            	String startDate = scan.next();
            	
            	System.out.println("Please enter title: ");
            	String title = scan.next();
            	
            	System.out.println("Please enter Department");
            	String department="";
            	outherLoop:
            	for(int i=0; i<3 ;i++) {
            		String dept  = scan.next();
            		if(dept.equals("Finance") || dept.equals("Marketing") || dept.equals("IT") || 
            				dept.equals("HR") || dept.equals("Purchasing") || dept.equals("Sales") ) {
            			department = dept;
            			break outherLoop;
            		}else {
            			System.out.println("Please enter valid department.");
            		}
            	}
              
            	Employee employee = Employee.createEmployee(firstName, lastName, phoneNumber, email, startDate, title, department);
            
            	dep.addEmployee(employee);

                break;
            case "2":
                // NOTE: ask user order type of for this list. There should be three types of order according to their name--> Default order, ascending or descending order
                // If the user enter:
                // "default" then the user should see the list in insertion order,
                // "ascending" print this list ascending order
                // "descending" print this list descending order
            
            	
            	
            	System.out.println("Please choose your option: 1:default\n 2:ascending\n 3:descending");
            	String choise = scan.next();
            	
            	switch(choise) {
            	case "1":
            		printInsertion();
            		break; 
            	
                case "2":
                	printAscending();
                	break;
                case"3":
                	printDescending();
                	break;
            	}
                break;
            case "3":
                // NOTE: ask user to enter Department Name then print all employee email addresses according to this email address
            	System.out.println("Please enter department name: ");
            	
            	dep.printEmailAddress(scan.next());
            	break;
            case "4":
            	System.out.println("Please enter employeeId");
            	String employeeId = scan.next();          	
            	
            	String email1="";
            	outherLoop:
            		for(int i=0; i<3 ; i++) {
            		System.out.println("Please enter email: ");
            		String em = scan.next();
            		if(em.endsWith("@gmail.com") || em.endsWith("@yahoo.com")) {
            			email1 = em;
            			break outherLoop;
            		}else{
            			System.out.println("Please finish @gmail.com or @yahoo.com");
            		}
            		}
            	dep.updateEmailAddress(employeeId, email1);
            	break;
            case "5":
            	System.out.println("Please enter employeeId");
            	String employeeId1 = scan.next();   
            	
            	System.out.println("Please enter PhoneNumber: ");
            	String phoneNumber1 = "";
         outher:
        	 for(int i=0; i<3; i++) {
            		String num=scan.next();
            		if(num.length()==10) {
            			phoneNumber1=num;
            			break outher;
            		}else {
            			System.out.println("Please enter valid phoneNum.");
            		}           		
            	}
            	
            	dep.uptadePhoneNum(employeeId1, phoneNumber1);
            	break;
            case "6":
            	String email2="";
            	outherLoop:
            		for(int i=0; i<3 ; i++) {
            		System.out.println("Please enter email: ");
            		String em = scan.next();
            		if(em.endsWith("@gmail.com") || em.endsWith("@yahoo.com")) {
            			email2 = em;
            			break outherLoop;
            		}else{
            			System.out.println("Please finish @gmail.com or @yahoo.com");
            		}
            		}
            	System.out.println("Please enter newTitle: ");
            	String newTitle = scan.next();
            	dep.uptadeTitle(email2, newTitle);
            	break;
            case "7":
            	System.out.println("Please enter employeeId: ");
            	dep.printInfo(scan.next());           	
            	break;
            case "8":
            	System.out.println("Please enter employeeId: ");
            	dep.removeList(scan.next());
            	break;
            case "9":
            	dep.printDepartmentAndEmpNum();            	
            	break;
            case "10":
            	printOptions();
            	break;
         
        }
    }

    public static void welcome(){

        System.out.println("Welcome to the Employee Management System");
    }

    public static void printOptions(){

        System.out.println("Hello! Please choose on of the following options");
        System.out.println("1 - For new employee");
        System.out.println("2 - To print all employee names, titles and employee ids");
        System.out.println("3 - To print all employee email address");
        System.out.println("4 - To update the employee email address");
        System.out.println("5 - To update the employee phone number");
        System.out.println("6 - To update the employee title");
        System.out.println("7 - To search the employee with employee id and print all other employee information");
        System.out.println("8 - To remove the employee");
        System.out.println("9 - To print all the department names with department employee number");
        System.out.println("10 - To print available options");
        System.out.println("0 - To exit");
    }
    
    public static void printInsertion() {
    	  ArrayList<Employee> allCards = dep.getAllCards();
    	  LinkedHashSet<String> insertionOrder = new LinkedHashSet();
    	
    	for(int i=0; i<allCards.size(); i++) {
    		String res=allCards.get(i).getFirstName()+" "+allCards.get(i).getLastName()+
    				" "+allCards.get(i).getTitle()+" "+allCards.get(i).getEmployeeId();
    		insertionOrder.add(res);
    		
    	}
    	System.out.println(insertionOrder);
    }
    
    public static void printAscending() {
  	  ArrayList<Employee> allCards = dep.getAllCards();
  	  TreeSet<String> ascendingOrder = new TreeSet();
  	
  	for(int i=0; i<allCards.size(); i++) {
  		String res=allCards.get(i).getFirstName()+" "+allCards.get(i).getLastName()+
  				" "+allCards.get(i).getTitle()+" "+allCards.get(i).getTitle();
  		ascendingOrder.add(res);
  		
  	}
  	System.out.println(ascendingOrder);
  }
    
    public static void printDescending() {
    	  ArrayList<Employee> allCards = dep.getAllCards();
    	  TreeSet<String> ascendingOrder = new TreeSet();
    	
    	for(int i=0; i<allCards.size(); i++) {
    		String res=allCards.get(i).getFirstName()+" "+allCards.get(i).getLastName()+
    				" "+allCards.get(i).getTitle()+" "+allCards.get(i).getTitle();
    		ascendingOrder.add(res);	
    	}
    	
    	TreeSet<String> des2 = (TreeSet<String>) ascendingOrder.descendingSet(); // casting
    	System.out.println(des2);
    	
//    	for (String card: des2) {
//            System.out.println(card);
//    	}
    }
      
}
