package Day23_StringBuilder.SB;

public class EqualsMethod02 {
	public static void main(String[] args) {
		
		System.out.println("============ '==' vs equals() ==============");
		
		String str1 ="a"; //directly creating a value in String Pool
		String str2 ="a"; // as "a" value is a already created in String pool it will just point to same value
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1==str2); // true
		
		String str3 = new String("a");
		
		System.out.println(str3.equals(str2)); //true
		System.out.println(str3==str2); // false
		
		String value1 = new String("tech"); // It will create an object in heap memory and will be in string pool
		String value2 = new String("tech"); // It will create an object in heap memory and will be in string pool
		
		System.out.println(value1 == value2); // false
		// == --> It will compare the objects and values
		               //  "tech".equals("tech")
		System.out.println(value1.equals(value2)); // true
		// .equals() --> will compare only the values
		
		String val1 = "SDET"; // pointing to string pool
		String val2 = new String("SDET"); // pointing to object in heap
		
		System.out.println(val1 == val2); // false
		System.out.println(val1.equals(val2)); // true
		
		
	}

}
