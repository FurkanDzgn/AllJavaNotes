package Day41_Interface.Phone;

public class TestPolymorphism {
	public static void main(String[] args) {
		
		Memory m1 = new Samsung();
		System.out.println(m1.speed()); // new SamSung().speed();
		m1.regularMethod();
		
//		MemoryCard w = new Iphone();
//		((Samsung)w).call();
		
		// Casting
		((Samsung)m1).call(); // call() method comes from Samsung class
		((Samsung)m1).text();
		
		((Phone)m1).takePhoto();
		System.out.println(m1.CAPACITY);
		Memory.staticMethod();
		
		Phone m2 = new Samsung();
		// Static methods are not inherited from interfaces
		System.out.println(m2.CAPACITY);
		
		FaceRecognition m3 = new Samsung();
		m3.scanFace();
		m3.toString(); // implicitly casting from Object class
		((Phone)m3).call(); // explicitly casting
//		((Iphone)m3.call(); // Class cast Exception
// 		((Number)m3.toString());
		// we can cast just subClasses
	}

}
