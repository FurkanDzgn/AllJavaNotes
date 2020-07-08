package Day12_Loops.Mentoring;

import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String sentence=scan.nextLine();
 
		for(int i=0; i<=sentence.length()-1 ; i++) {
			if(Character.isUpperCase(sentence.charAt(i))) {
				
				char space=sentence.charAt(i);
				sentence =sentence+space + " ";
	}
			System.out.println(sentence);
		}
		
	}
}
