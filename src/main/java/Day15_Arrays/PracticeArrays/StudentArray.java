package Day15_Arrays.PracticeArrays;

public class StudentArray {
	public static void main(String[] args) {
		
		// ananymous array -> because we have not given the size and type of array
		String[] students = {"Murat", "Rakhim", "Ruslan","Vlad","Teymur","Azamat"};
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		
		/*
		 * --ways of creatings array--
		 * String [] students new String[5];
		 * String [] students =new String[] {"Murat", "Rakhim", "Ruslan","Vlad","Teymur","Azamat"};
		 * String[] students = {"Murat", "Rakhim", "Ruslan","Vlad","Teymur","Azamat"};
		 * 
		 * You can do the same for int,long,char,boolean,...
		 * 
 		 */
		
		int[] numbers= {5,2,10,6,7}; // number of elements 5 and last index is 4
		
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum += numbers[i];
			
		}
		System.out.println(sum);
		
		
		
	}

}
