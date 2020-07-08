package Day05.StringManipulation;

public class PracticeString {
	public static void main(String[] args) {
		
		String firstName = "John"; // 0123
		String lastName = "Doe";
		
		System.out.println(firstName+" "+lastName);
		
		String fullName = firstName+" "+lastName;
		
		System.out.println(fullName.toUpperCase());
		System.out.println(fullName.toLowerCase());
		
		System.out.println(firstName.length());
		System.out.println(lastName.length());
		System.out.println(fullName.length());
		
		System.out.println(firstName.charAt(3));	//0 1 2 3 	
		
		System.out.println(fullName.charAt(4));
		
		System.out.println(fullName.indexOf('o'));
		/*
		 * .to
		 */
		
	
		
		
	}
}
