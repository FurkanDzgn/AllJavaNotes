package Day41_Interface.Phone;
    // we can final
public class Iphone extends Phone {

	@Override
	public void scanFace() {
		// TODO Auto-generated method stub
		System.out.println("Iphone Scanning the face");
	}

	@Override
	public String speed() {
		return "20 MB per second";
	}

	@Override
	public void call() {
		System.out.println("Iphone is calling.");
		
	}

	@Override
	public void text() {
		System.out.println("Iphone is texting.");
		
	}
	
	@Override
	public void takePhoto() {
		System.out.println("Iphone taking a photo.");
		
	}

}
