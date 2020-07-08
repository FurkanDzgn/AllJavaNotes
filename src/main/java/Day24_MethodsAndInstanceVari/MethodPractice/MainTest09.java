package Day24_MethodsAndInstanceVari.MethodPractice;

public class MainTest09 {
	public static void main(String[] args) {
		
		Numberutils08 numUtils=new Numberutils08();
		
		numUtils.printRandomInt();
		
		numUtils.printRandomInt(25);
		numUtils.printRandomInt(-5);
		numUtils.printRandomInt(5);
		
		System.out.println(numUtils.getIntRange(26, 25));
		
		System.out.println(numUtils.getMax(10, -22, 7));
		
		int ran = numUtils.getIntRange(1, 4);
		
		// if it is 1 -> 0ne
		// if it is 2 -> two
		
		switch(ran) {
			case 1: 
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
		}
	
	}

}
