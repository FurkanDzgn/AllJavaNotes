package Day28_ArrayList.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputerStore {
	public static void main(String[] args) {
		
		// We have 6 computer
		Computer computer1 = new Computer("Macbook", 2018, 1200);
		Computer computer2 = new Computer("Dell", 800);
		Computer computer3 = new Computer("Lenova", 2017, 1500, 500);
		Computer computer4 = new Computer("Asus", 2020, 1300);
		Computer computer5 = new Computer("Macbook", 2015, 900);
		Computer computer6 = new Computer("HP", 2016, 950);
		
		ArrayList<Computer> computers = new ArrayList();
		
		computers.add(computer1); // I can store because computer1 is a object.
		computers.add(computer2);
		computers.add(computer3);
		computers.add(computer4);
		computers.add(computer5);
		computers.add(computer6);
		computers.add(new Computer("Lenova", 2020, 1900));
		
		
		/*
		 * Print name of computers whose year more than 2017 (2017 is not included)
		 */
		for(int i=0; i< computers.size(); i++) {
			if(computers.get(i).year > 2017) {
				System.out.println(computers.get(i).brand);
			}
		}
		
		System.out.println("==============");
		
		
		
    //	List<Computer> computers2 = Arrays.asList(computer1, computer2, computer3, computer4, computer5);
		
		System.out.println(computers.get(0).brand);
		System.out.println(computers.get(computers.size()-1).year);
		
		//System    -> class
		//out       -> static variable
		//println() -> method 
		for(int i=0; i< computers.size(); i++) {
			System.out.println(computers.get(i).brand);
		}
		
		double sum= 0; 
		
		for(int i=0; i< computers.size(); i++) {
			sum+=computers.get(i).price;
			System.out.println(computers.get(i).price);
			
		}
	System.out.println("Total:"+sum);
	
	//====================
	System.out.println("============");
	ArrayList<Computer> disComputers = applyDiscount(computers);
	
//	System.out.println(disComputers);
	for(int i=0; i<disComputers.size(); i++) {
		System.out.println(disComputers.get(i).price);
	}
	
	}
	
	/**
	 * Method will uptade the price for each computer in list
	 * with applied discount.
	 * if total amount is more than 8000 then it will apply 20% for all objects in list.
	 * if total amount is less than 8000 then it will aplly 10% for all objects in list.
	 * 
	 * 
	 * @param ArrayList<Computer> computers
	 * @return ArrayList<Computer>
	 */
	
	public static ArrayList<Computer> applyDiscount(ArrayList<Computer> computers){
		
        double total= 0; 
		for(int i=0; i< computers.size(); i++) {
			total+=computers.get(i).price;
		}
		
		int disPercentange=0;
		
		
		if(total>=8000) {
			disPercentange=20;
		}
		else {
			disPercentange=10;
		}
		
		ArrayList<Computer> newPrices = computers;
		
		for(int i=0; i< computers.size(); i++) {
			double newPrice =computers.get(i).price - computers.get(i).price*disPercentange/100;
			
			newPrices.get(i).price = newPrice;	
		}
		
		return newPrices;
			
	}

}
