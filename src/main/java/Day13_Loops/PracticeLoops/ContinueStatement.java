package Day13_Loops.PracticeLoops;

public class ContinueStatement {
	public static void main(String[] args) {
		
		//techtorial
		String name="techtorial";
		
		//"t" -> String
		//'t' -> char
		char letter ='a';
		String letter2 = letter +"";
		
		int num=10;
		String num2 = num+ "";
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)=='t') {
				continue;
			}
			System.out.print(name.charAt(i));
		}
		System.out.println("\n------");
		String position = "Developer";
		
		// D and e
		position = position.toLowerCase(); // Developer -> developer
		for(int i=0; i<position.length(); i++) {
			if(position.charAt(i)=='d' || position.charAt(i)=='e') {
				continue;
			}
			System.out.print(position.charAt(i));
		}
				
		// Continue -> stop current iteration of for loop and go to next iteration
	}

}
