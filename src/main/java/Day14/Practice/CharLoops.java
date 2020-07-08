package Day14.Practice;

public class CharLoops {
	
	public static void main(String[] args) {
		
		char ch = 'A';
		
		System.out.println(ch+0);
		
		//A -> 65
		//B -> 66
		//C -> 67
		
		//If we use any operators with char it will convert that char to Decimal number.
		
	    //     'A'<='Z' -> 65 <= 90      	
		for( ; ch<='Z'; ch++) {
			System.out.print(ch);
		    System.out.println(" -> "+(ch+0));
	   //   System.out.println(ch+" -> "+(ch+0));
		}
	}

}
