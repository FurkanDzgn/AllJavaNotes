package Day06.StringMethods;

public class Reverseword {
	 
	// java -> avaj
	
	public static void main(String[] args) {
		                //0123
	   String progLan = "Java"; // java -> avaJ
	   
	   String reverseWord = "";
	                //      "" +       'a' +       'v' +     'a'+    'J'=avacJ
	   reverseWord =  "" + progLan.charAt(3) + progLan.charAt(2)+ progLan.charAt(1)+progLan.charAt(0);
	   
	   System.out.println(reverseWord);
	   
	   
	   
	}

}
