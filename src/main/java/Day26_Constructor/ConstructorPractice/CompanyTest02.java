package Day26_Constructor.ConstructorPractice;

import java.util.Arrays;

public class CompanyTest02 {
	
	public static void main(String[] args) {
		
		Company01 company1 = new Company01("Google","Silicon Valley", 2000000, 5000);
		Company01 company2 = new Company01("JP Mogran Chase","Chicago",15000000,2800);
		Company01 company3 = new Company01("Apple","Silicon Valley",3000000,48000);
		Company01 company4 = new Company01("CVS","New York",1000000,2000);
		
		company1.displayInfo();
	    //System.out.println(company1.name);	
		
		//Type of company array
		//String[] strs = new String[];
		
		Company01[] companies = {company1,company2,company3,company4, new Company01("US Bank","Chicago",2500000,2500)};
				
		
		for(Company01 company:companies) {
		    System.out.println(company.name);
		//	company.displayInfo();
		
		}
		
		System.out.println("================");
		// Print the company names that has more than 3000 employees.
		
		for(Company01 company:companies) {
			if(company.numberOfEmployees>3000) {
				System.out.println(company.name);
			}
		}
		
		System.out.println("==================");
		// Print me the sum of budgets of all companies.
		
		int sum=0;
		for(Company01 company:companies) {
			sum+=company.yearlyBudget;
		}
		System.out.println(sum);
		
		
	}

}
