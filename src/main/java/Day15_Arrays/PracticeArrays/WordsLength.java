package Day15_Arrays.PracticeArrays;

public class WordsLength {
	public static void main(String[] args) {
		
		String[] names = {"Erick","John","Nina","Sarah","Alex","David"};
		
		/*
		 * Print only the names that has 4 letters.
		 * John
		 * Nina
		 * Alex
		 */
		
		// For traditional loop
		for(int i=0; i<names.length; i++) {
			if(names[i].length()==4) {
				System.out.println(names[i]);
			}	
		}
		//For Each loop -> Enhanced For loop
		System.out.println("--------");
		for(String name : names) {
		//	System.out.println(name);
			if(name.length()==4) {
				System.out.println(name);
			}
		}
	}

}
