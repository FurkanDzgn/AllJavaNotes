package Day17_Arrays.MultiDimensionalArrays;

import java.util.Arrays;

public class MDimensional {
	public static void main(String[] args) {
		
		int [][] containers = new int[2][3];
		
		containers[0][0] = 1;
		containers[0][1] = 2;
		containers[0][2] = 3;
	
		containers[1][0] = 11;
		containers[1][1] = 12;
		containers[1][2] = 13;
		
	//	System.out.println(containers.length);
	//	System.out.println(containers[0].length);
//		System.out.println(containers[1].length);
		
		for(int a=0; a<containers.length;a++) { // 0,1
			// a will go till the number 1 as i have only two arrays in my containers
			for(int b=0; b<containers[a].length; b++) { //0,1,2
				// b will go till the number 2 as i have 3 values in my containers[a]
				System.out.println(containers[a][b]);
			}
		}
		
		
		
		
		
		
		
		
	}

}
