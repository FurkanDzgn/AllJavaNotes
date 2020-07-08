package Day13_Loops.PracticeLoops;

public class BreakStatement {
	public static void main(String[] args) {
		
		//computer ->  comp
		
		String str="computer";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='u') {
				break;
			}
			System.out.print(str.charAt(i));
		}
		System.out.println("\nAfter the loop");
		
		
	}

}
