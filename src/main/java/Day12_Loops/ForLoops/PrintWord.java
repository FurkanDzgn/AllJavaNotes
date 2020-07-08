package Day12_Loops.ForLoops;

public class PrintWord {
	public static void main(String[] args) {
		
		//Techtorial
		/*
		 * T
		 * e
		 * c
		 * h
		 * ...
		 */
		
		//0123456789
		//Techtorial
		
		String word="Techtorial";
		
	    for(int index=0, lenght=word.length() ; index<lenght ; index++ ) {
	    	System.out.println(word.charAt(index));
	    }
       
//		
//	    for(int index=0, lenght=word.length()-1 ; lenght>=index ; lenght-- ) {
//	    	System.out.println(word.charAt(lenght));
//     	}
	    for(int index=word.length()-1 ; index>=0 ; index--) {
	    	System.out.println(word.charAt(index));
	    }
    }

}
