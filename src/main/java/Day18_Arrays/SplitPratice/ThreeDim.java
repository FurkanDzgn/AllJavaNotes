package Day18_Arrays.SplitPratice;

public class ThreeDim {
	public static void main(String[] args) {
		     //1 2 3 
		String [][][] letters = {
				{{"A","B"}},
				{{"ab","ba"},{"le","se"}}		
		};
		
	//	System.out.println(letters[1][0][1]);
//		System.out.println(letters[0][0][1]);
//		System.out.println(letters[1][1][1]);
		
		for(String[][]  a: letters) { // letters -> three dimensional array
			for(String[] b: a) { // a-> two dimensional array
				for(String c: b) {// b -> one dimensional array
					System.out.println(c);
				}
			}
		}
		System.out.println();
	}

}
