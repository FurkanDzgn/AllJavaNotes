package Day13_Loops.PracticeLoops;

public class NestedLoop {
	public static void main(String[] args) {
		
		for(int i=0; i<3; i++) { // Outer Loop -> 3 times
			for(int x=0; x<5; x++) { // Inner Loop -> 5 times
				System.out.print(x);
			}
			System.out.println(i);
		}
		//i=0 -> a will iterate 5 times
		//i=1 -> a will iterate 5 times
		//i=2 -> a will iterate 5 times
	}

}
