package Day07.homework;

public class again {
	
	public String initials(String fullName) {
		
		char firslLetter = fullName.charAt(0);
		int indexOfSpace = fullName.indexOf(" ");
		char lastNameFirstLetter = fullName.charAt(indexOfSpace +1);
		String initials = ""+firslLetter+lastNameFirstLetter;
		return initials;
		
	}
	public static void main(String[] args) {
		again um = new again();
		
		System.out.println(um.initials("Sarah Connor"));
	}
     
}
