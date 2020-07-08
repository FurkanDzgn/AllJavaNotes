package Day22_StringBuilder.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
	public static void main(String[] args) {
		
		StringBuilder cor=new StringBuilder("Corolla");
		StringBuilder ac=new StringBuilder("Acura");
		StringBuilder merc=new StringBuilder("C300");
		StringBuilder cam=new StringBuilder("Camry");
		StringBuilder acc=new StringBuilder("Accord");
		
		StringBuilder[] arr= {cor,ac,merc,cam,acc};
//		StringBuilder[] arr2= new StringBuilder[] {cor,ac,merc,cam,acc};
	//	StringBuilder[] arr3= new StringBuilder[] {"Corolla"}; this is imposible
		
		
		StringBuilder[] result=new StringBuilder[arr.length];
	//	System.out.println(Arrays.toString(result));   //  [null, null, null, null, null,]
		
	//	List<StringBuilder> list = new ArrayList<>();
		
		int count=0;
		for(StringBuilder model:arr) {
			result[count++]=model.reverse();
			//count++;
		}
		System.out.println(Arrays.toString(result));	
		
		
//		for(int i=0; i<arr.length; i++) {
//			result[i]=arr[i].reverse();
//		}
//		System.out.println(Arrays.toString(result));
		
		
	
	}

}
