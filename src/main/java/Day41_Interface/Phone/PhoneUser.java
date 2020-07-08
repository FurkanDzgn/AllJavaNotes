package Day41_Interface.Phone;

public class PhoneUser {
	public static void main(String[] args) {
	//	Phone phone = new Phone(); // Abstract class can not be instatntiated
	//	Memory memory = new Memory(); // interface can not be instantiated
		
		Iphone iphone = new Iphone();
		
		iphone.call();
		iphone.regularMethod();
	//	iphone.staticMethod(); // interface's static methods doesn't inherit
	//  iphone.CAPACITY = 5; --> constant variables (final variables) can not be reassigned.
		System.out.println(iphone.CAPACITY);
		
		GalaxySamsung gs = new GalaxySamsung();
		
	//	gs.CAPACITY = 256; --> i can not reassinged cuz of final key word
		System.out.println(gs.CAPACITY);
		
		gs.phoneName="Galaxy";
		gs.screenSize=5;
		System.out.println(gs); //  gs.toString()
		System.out.println(gs.speed());
		
		Samsung samsung = new Samsung();
		
		samsung.phoneName="Samsung";
		samsung.screenSize = 6;
		System.out.println(samsung);
	}

}
