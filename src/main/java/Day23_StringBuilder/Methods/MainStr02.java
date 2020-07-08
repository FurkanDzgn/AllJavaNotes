package Day23_StringBuilder.Methods;

public class MainStr02 {
	public static void main(String[] args) {
		StringUtilities01 utils = new StringUtilities01();
		
		
		String word = "GoOgLe";
		
		System.out.println(utils.isCapatializedWord(word));
		System.out.println(utils.isCapatializedWord("Google"));
		
		System.out.println(utils.isUppercase("GOOGLE"));
		
	}

}
