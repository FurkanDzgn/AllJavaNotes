package Day19_Arrays.ArraysPractice;

import java.util.Arrays;

public class mentoring {
	public static void main(String[] args) {
		
		int[] arr= {5,6,7,7,8};
		int[] arr1= {9,968,6,65,5,6,6};
		int[] newArr=new int[arr.length+arr1.length];
		System.out.println(newArr.length);
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
			++count;
		}
		
		for(int i=0;count<newArr.length;count++,i++) {
			newArr[count]=arr1[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		
		Object[][] multi=new Object[5][20]; // 100 elements
		System.out.println(multi.length);
		
		Object [][] multi1 =new Object[5][];
		
		Object [][] mul= {{"Kana",false},{"Eliza",1987,55.80}};
		
//		for(Object a:mul) {
//			for(Object b:a ) {
//				System.out.println(b);
//			}
//		}
		for(int i=0; i<mul.length;i++) {
			for(int q=0;q<mul[i].length;q++) {
				System.out.println(mul[i][q]);
			}
		}
		
		
	}

}
