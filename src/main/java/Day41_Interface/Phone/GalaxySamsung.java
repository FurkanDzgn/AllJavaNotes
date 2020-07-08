package Day41_Interface.Phone;

public class GalaxySamsung extends Samsung {

	@Override
	public void regularMethod() {
		System.out.println("Galaxy Samsung's regular method");
//		super.regularMethod();
	}

	@Override
	public String speed() {
	
		return "30 MB per second";
	//	return super.speed();
	}

	@Override
	public void call() {
		System.out.println("Galaxy Samsung is calling.");
	//	super.call();
	}

	@Override
	public String toString() {
		
		return super.phoneName+" "+super.screenSize;
	//	return super.toString();
	}

	
	
	
	
	
	
	
}
