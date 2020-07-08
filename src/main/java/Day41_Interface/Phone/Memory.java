package Day41_Interface.Phone;
     // we can't final  
public interface Memory {
	
	// public static final int CAPACITY = 128;
	int CAPACITY = 128;
	
	// this is abstract method    public abstract String speed();
	String speed();
	
//	 public default void regularMethod() {
//		 System.out.println("ADA");
//	 }
	default void regularMethod() {
		System.out.println("Interfaces regular method.");
	}
	
	// public static void staticMethod() {}
	static void staticMethod() {
		System.out.println("Interface's static method.");
	}
	

}
