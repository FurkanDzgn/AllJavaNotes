package Day06.StringMethods;

public class StartEndWith {
	public static void main(String[] args) {
		
		String java = "I love Java";
		
		
		
		System.out.println(java.startsWith("I "));
		
		// .startsWith("I"); -> returnning boolean (true/false)
		// .length() -> 11 -> returns int
		// .toUpperCase() -> returns String
		// .toLowerCase() -> returns String 
		//.endsWith() -> returns boolean
		//.equals() -> retuns boolean
		//.equalsIgnoreCase() -> boolean
		
		System.out.println(java.endsWith("Java"));
		
		System.out.println( java.equals("I love Java"));
		
		System.out.println(java.equalsIgnoreCase("i love java"));
		
		System.out.println(java.substring(7,11));
		
		System.out.println(java.substring(2,6));
		
		System.out.println(java.substring(0,1));
		
		System.out.println(java.substring(5));
		
		//.substring(2,6) -> beginIndex(Included), 6 is lastIndex(Excluded) -> 2,3,4,5
		 
		
	}

}
