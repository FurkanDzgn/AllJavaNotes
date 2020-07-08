package Day41_Interface.InterfaceEx;

public interface Flyable {
	
	// Flyable -> adjective
	// Object is noun
	
	// color -> 
	
	// Phyton,C##
	// iFly
	// iColor
	
	// By default all variables in interface are public static final
	
	//public static final int WINGCOUNT;
	
	public static final int WINGCOUNT = 2;
//	int WINGCOUNT=2;
//	WINGCOUNT = 4; WE CAN'T

	int TAILCOUNT=1;
	
	// by default methods in interface are public abstract
	// public abstract void fly();
	   void fly();
}
