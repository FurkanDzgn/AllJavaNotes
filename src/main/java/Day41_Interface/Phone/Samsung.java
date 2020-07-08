package Day41_Interface.Phone;

public class Samsung extends Phone{

	@Override
	public void scanFace() {
		System.out.println("Samsung is scanning the face");
		
	}

	@Override
	public String speed() {
	
		return "25 MB per second";
	}

	@Override
	public void call() {
		System.out.println("Samsung is calling");
		
	}

	@Override
	public void text() {
		System.out.println("Samsung is texting");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Samsung is taking a photo");
		
	}

	@Override
	public String toString() {
		return "Samsung [phoneName=" + phoneName + ", screenSize=" + screenSize + "]";
	}

	

	
	

}
