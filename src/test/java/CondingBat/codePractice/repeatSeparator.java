package CondingBat.codePractice;

public class repeatSeparator {
	public String repeatSeparator(String word, String sep, int count) {
		
		String result=word;
		
		for(int i=1; i<count; i++) {
				result +=sep+word;
		}
		return result;
	}
	public static void main(String[] args) {
		repeatSeparator rSp= new repeatSeparator();
		
		System.out.println(rSp.repeatSeparator("word", "X", 3));
		
	}

}
