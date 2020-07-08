package Day16_Arrays.PracticeArrays;

public class ForEachPractice {
	
	public static void main(String[] args) {
		
		String [] studentNames = {"Murat", "Azamat", "Nuray", "Kadir", "Patel", "Arslan", "Alex"};
		
		/*
		 * Print the names that contains letter 'a' and length of 5
		 */
		
		for(int i=0; i<studentNames.length; i++) {
			if(studentNames[i].toLowerCase().contains("a") && studentNames[i].length()==5)
				System.out.println(studentNames[i]);
			
		}
		
		//Murat -> has 1 a letters
		//Azamat -> has 3 a letters
		//Nuray -> has 1 a letters
		
		
		
		for(String name : studentNames) {
			int count = 0;
			for(int i = 0; i<name.length(); i++) {
				if(name.toLowerCase().charAt(i)=='a')
					count++;
			}
			System.out.println(name + "-> has " +count+" a letters.");
		}
	}

}
