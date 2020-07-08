package Day08.Conditions;

public class ConditionalStatements {
	public static void main(String[] args) {
		
		int apples = 10;
		int bananas = 8;
		
		/*
		 * If apples are more than bananas then print "Apples are more than bananas";
		 * 
		 * Otherwise i want to print "Bananas are more than apples";
		 * 
		 */
		if (apples>bananas) {
			System.out.println("Apples are more than bananas.");
		} 
		else {
			System.out.println("Bananas are more than apples.");
		}
	
	int classCapacity = 40;
	int studentNumber = 35;
	
	if (classCapacity >= studentNumber) {
		System.out.println("You can join the class");
	} else {
		System.out.println("You can not join the class.");
	}

}
}