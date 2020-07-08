package Day06.StringMethods;

public class MethodChaining {
	public static void main(String[] args) {
		
		String sentence = " I want to be SDET ";
		
		// substring , toLowerCase,
		System.out.println(sentence.substring(14).toLowerCase().trim());
		
		//.trim(); -> trim will remove space in the beginning and the end, and returns String
		
		String word = " Hello World";
		System.out.println(word);
		System.out.println(word.trim());
		
		System.out.println(word+", I am here");
		System.out.println(word.concat(", I am here"));
		
		// Hello World -> Hello Wolrd ->Hello World, I am here
		System.out.println(word.trim().concat(", I am here").toLowerCase());
		
		System.out.println(word+", I am here".toLowerCase());
	}
	

}
