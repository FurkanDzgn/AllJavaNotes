package Day10_IfStatements.IfStatements;

public class SwitchTest {
	public static void main(String[] args) {
		
		int num=5;
		
		switch(num) {
		case 1:
			System.out.println("Your number is equals to 1");
		case 5:
			System.out.println("Your number is equals to 5");
		}
		//Switch statements accepts only  byte, char, short, int, String -> BCSI String
		//Switch statements does not work for long, double, float
	}

}
