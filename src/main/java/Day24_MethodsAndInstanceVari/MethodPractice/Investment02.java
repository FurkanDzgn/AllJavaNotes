package Day24_MethodsAndInstanceVari.MethodPractice;

public class Investment02 {
	
	// instance variables
	int years;  //2
	double amount; // 1000
	double rate; // 5.0
	
	//2*1000*5.0/100=100.0
	//100.0+1000.0=1100.0
	
	/**
	 * This method return the rate amount.
	 * @return
	 */
	public double rateAmount() {
		
		return years*amount*rate/100;
	}
	
	public double totalAmount() {
	
		double total = amount + rateAmount();
		
		return total;
	}
	
}
