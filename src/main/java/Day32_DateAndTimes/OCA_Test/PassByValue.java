package Day32_DateAndTimes.OCA_Test;

public class PassByValue {
	
	public static void uptadeValue(int number) {
		number = 10;
	}
	
	public static void main(String[] args) {
		
		int number = 5;
		// Java is working, java 
	    uptadeValue(number);
		System.out.println(number);
	}

}
