package Day15_Arrays.PracticeArrays;

import java.util.Arrays;

public class GenerateNames {
	public static void main(String[] args) {
		
		String[] names = {"Murat", "Ruslan", "Gulmira", "Vlad", "Patel", "Vova"};
		
		/*
		 * Murat -> Muratbek
		 * Ruslan -> Ruslanbek
		 * Vlad -> Vladbek
		 * Patel -> Patelbek
		 */
	//	String [] newNames=new String[names.length];
		
		
		for (int i=0; i<names.length; i++) {
			names[i]=names[i]+"bek";	
		}
		System.out.println(Arrays.toString(names));
	}

}
