package ReplyIt.Recap;

public class FirstUniqueChar {
	public static int unique(String str) {
		

		for(int i=0;i<str.length();i++) {
			char letter = str.charAt(i);
			if(str.toLowerCase().indexOf(letter) == str.toLowerCase().lastIndexOf(letter)) {
				return i;
			}
		}
		return -1;
		
		
	}
	public static void main(String[] args) {
		System.out.println(unique("fufunn"));
	}

}
