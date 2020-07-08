package Day27_Wrappers.Wrappers;

public class Wrapperpractice {
	public static void main(String[] args) {
	
		//	Integer number1 = new Integer(10);  // Integer(); -> constructor is deprecated
		Integer number1 =10;
		
		Double number2 = new Double(2.45);
		
		// Convert from primitives to Wrappers / Autoboxing
		int a=22;
		Integer aWrapper = a; // int(primitive) -> Integer(wrapper) =======> Autoboxing
		
		Integer num1 = new Integer("10");
  //    Integer num00 = Integer.parseInt("10");
		
		int sum =num1+15; // 10+15=25 Integer(Wrapper) -> int(primitive) ======> Unboxing
		System.out.println(sum);
		
		Integer num2 = 20; // 20 -> int -> Integer ===> Autoboxing
		
		Boolean condition = new Boolean("TruE"); // ignorecase  just > true, false
		
		System.out.println(condition);
		
		Byte byteValue = new Byte("20");
		byte bytePrim = byteValue;
		System.out.println(bytePrim);
		
		Short shortValue = new Short((short)100); // int casted to short, primitive -> Wrapper ==> Autoboxing
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		Integer n1 = 10;
		Integer n2 = 10;
		System.out.println(n1 == n2); // true
		System.out.println(n1.equals(n2)); // true
		
		Integer n3 =new Integer(10);
		Integer n4 =new Integer(10);
		System.out.println(n3 == n4); // false
		System.out.println(n3.equals(n4)); // true
		
		int random = 20;
		double dRandom = random; // int -> double this is casting
	    
		System.out.println(dRandom);
		
		
	    Integer wrappedInt = 20;
	 // Integer s = wrappedInt;
	//	Double wrapperDouble = wrapperInt; // Integer -> Double this will not work.
		
		// Integer -> int ===> unboxing
		//int -> double ====> casting
		//double -> Double ===> Autoboxing
		
		int primInt = wrappedInt; // Integer -> int  --> unboxing
		double primDouble=primInt; // int -> double --> casting
		Double wrapperDouble = primDouble; //double -> Double  --> Autoboxing
		
	}

}
