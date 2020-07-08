package Day23_StringBuilder.SB;

public class StringBuilderEqualsMethods03 {
	public static void main(String[] args) {
		
		// StringBuilder has nothing to do with string pool
		
		StringBuilder sb1 = new StringBuilder("Techtorial");
		StringBuilder sb2 = new StringBuilder("Techtorial");
		StringBuilder sb3 = sb2;
		
		System.out.println(sb1==sb2); //False, different objects and values
		System.out.println(sb1.equals(sb2)); //False, different values
		
		System.out.println(sb3==sb2); // true, same objects and values
		System.out.println(sb3.equals(sb2));// true, same values
		
		System.out.println(sb1.toString().equals(sb2.toString())); // convert from StringBuilder to String with toString method.
		
		System.out.println(sb1.hashCode());//different
		System.out.println(sb2.hashCode());//same
		System.out.println(sb3.hashCode());//same
	}

}
