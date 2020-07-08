package Day07.Methods;

public class MethodPractice {
	
	/*
	 * Creata a method that will accept String item
	 * And will return String as first two character os item
	 * 
	 * Example:
	 *      Computer -> Co
	 */
	
	public String twoChars(String item) {
		String twoChars = item.substring(0,2);
		return twoChars;
	}
	public static void main(String[] args) {
		MethodPractice mp = new MethodPractice(); // object
		// In order to call methods you should create an object 
		
		String result = mp.twoChars("Computer"); //Computer is parameter
		System.out.println(result);
		
	}
	
	
	
      
}
