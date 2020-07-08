package Day36_SetCollection.HomeworkSetPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class testClass {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList();
		arr.add("java");
		arr.add("phython");
		arr.add("javascript");
		arr.add("c++");
		arr.add("java");
		arr.add("c++");
		
		System.out.println(Arrays.toString(HomPrac.method1(arr)));
		
		String [] arr1 = new String[] {"java", "phython", "javascript", "c++", "java", "c++"};
		System.out.println(HomPrac.method2(arr1));
		
		System.out.println(HomPrac.method3(arr1));
		
		int [] arr3 = new int[] {2,3,4,4,7,2,1};
		
		System.out.println(Arrays.toString(HomPrac.method4(arr3)));
		
		System.out.println(Arrays.toString(HomPrac.method5(arr3)));
		
	}

}
