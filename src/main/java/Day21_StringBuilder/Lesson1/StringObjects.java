package Day21_StringBuilder.Lesson1;

public class StringObjects {
	public static void main(String[] args) {
		
		String str="";
		
		for(char ch='a'; ch<='z'; ch++) {
			str+=ch;
		//	System.out.println(str);
		}
		System.out.println(str);
		
		String name="Techtorial";
		
		name.concat(" Academy"); // using concat method will not change original value
		
		System.out.println(name); // string is immutable
		System.out.println(name.concat(" Academy"));
	}

}
