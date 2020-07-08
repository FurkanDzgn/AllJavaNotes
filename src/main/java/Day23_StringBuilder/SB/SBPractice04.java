package Day23_StringBuilder.SB;

public class SBPractice04 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Dear Student,");
		sb.append("Please finish your homework."); 
		// StringBuilder methods will change the value and store it automatically to that reference
		System.out.println(sb);
		
		String greetings = "Welcome";
		greetings.concat(" back"); // it will not store the values
		System.out.println(greetings); // it will not change the values 
		System.out.println(greetings.concat(" back")); // we created new value in String Pool
		System.out.println(greetings);
		
		greetings=greetings.concat(" back"); // we reassinged new value in String Pool
		System.out.println(greetings);
		
		StringBuilder sb2 = new StringBuilder("Stay");
		System.out.println(sb2.hashCode());
		sb2.append(" at home!");
		System.out.println(sb2.hashCode());
		
		
		
		
	}

}
