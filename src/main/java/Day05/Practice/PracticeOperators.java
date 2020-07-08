package Day05.Practice;

public class PracticeOperators {
	
	public static void main(String[] args) {
		int apple = 5;
		
		//Eclipse IDE , IntellIj, Atom, Visual Studio
		//IDE -> Integrated Development Environment
		
		//              6      +   6     +  6      +    5   ;
		int addapple = ++apple + apple-- + ++apple + --apple;
		
		System.out.println(apple); //5
		System.out.println(addapple); //23

	}
}
