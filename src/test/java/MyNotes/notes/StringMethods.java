package MyNotes.notes;


public class StringMethods {
	public static String mySubstirngMethod(String str, int index1,int index2) {
		
		String result= str.substring(index1,index2);
		return result ;
		
	}
	public static void main(String[] args) {
		
    System.out.println(mySubstirngMethod("Techtorial", 0,4));
		
	}
	
	
	

}
