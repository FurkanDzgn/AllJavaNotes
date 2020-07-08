package Day22_StringBuilder.lesson;

public class prac {
	public static void main(String[] args) {
		
		StringBuilder weird=new StringBuilder("ASDFKJAGFPW32KEJFQ40NASDEHJGE22KVNDMNAPWRNJFV4307ASDF");
		
		StringBuilder result=new StringBuilder();
		
		for(int i=0; i<weird.length(); i++) {
			// this char must be D to G
			if(weird.charAt(i)>='D' && weird.charAt(i)<='G') {
				result.append(weird.charAt(i));
			}
		}
		System.out.println(result);
	}

}
