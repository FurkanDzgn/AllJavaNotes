package ReplyIt.Homeworks;

public class reverseStirng {
	public static void main(String[] args) {
		
	
	String str="Techtorial";
	String word="";
	int length=str.length()-1;
	for(int i=0; i<=length; length-- ) {
		word+=str.charAt(length);
	}
	System.out.println(word);
		
		
		
		
	}
}
