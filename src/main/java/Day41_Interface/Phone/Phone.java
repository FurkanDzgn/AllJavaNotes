package Day41_Interface.Phone;
     // we can't final                   // extends Object
public  abstract class Phone implements FaceRecognition,MemoryCard {

	String phoneName;
	int screenSize;
	  // we can't final 
	public abstract void call();
	public abstract void text();
	public abstract void takePhoto();
	
	
}
