package Day12_Loops.Loops;

public class CountLetters {
	
	/*
	 * We will have Techtorial
	 * We will need to count numbers of 't' letter
	 * 
	 * 1.Find a lenght
	 * 2.Loop lenght times
	 * 3.Change Techtorial to techtorial
	 * 4.We will create int variable with name count
	 * 5.If letters are equal we have to increment our count to 1
	 * 6.We will print count after the loop
	 */
	public static void main(String[] args) {
		
		String schoolName = "Techtorial";
		
		int length=schoolName.length();
		schoolName=schoolName.toLowerCase(); // Techtorial -> techtorial
		int count=0;
		int index=0;
		
		while(index<length) {
			if(schoolName.charAt(index)=='t') {
				count++;
			}
			index++;	
		}
		System.out.println(count);
		
	}

}
