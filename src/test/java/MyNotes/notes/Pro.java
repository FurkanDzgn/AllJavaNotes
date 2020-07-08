package MyNotes.notes;

import java.util.Random;

public class Pro {
	public static void main(String[] args) {
		
        Random get = new Random();
		
		String employeeId = "";
		StringBuilder str = new StringBuilder();
		
		String alphabetAndNumber = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		for(int i=0; i<20; i++) {
		str.append(alphabetAndNumber.charAt(get.nextInt(36)));	
		}
		
		str.insert(8,"-");
		str.insert(13,"-");
		str.insert(18,"-");
		
		employeeId = str.toString();
		System.out.println(employeeId);
	}

}
