package Day23_StringBuilder.SB;

public class SB06 {
	public static void main(String[] args) {
		
		// .append() , .insert() , .reverse() , .delete(); -->StringBuilder Methods
		// .equals() , .toString() , toUppercase();  --> String Methods
		
		//whatever string methods we have will be available for StringBuilder.
		
		StringBuilder word = new StringBuilder("hello");
		
//		System.out.println(word.reverse());
		
//		System.out.println(word==word.reverse());
//		System.out.println(word.equals(word.reverse()));
		
		// hello   .  equals("olleh")
		if(word.toString().equals(word.reverse().toString())) { // check only values
			System.out.println("It is polindrome");
		}else {
			System.out.println("It is not palindrome");
		}
		
	}

}
