package Day18_Arrays.Methods;

public class VarargsArray {
	
	public void setNames(String... name) { // String[] name  <==>  String... name 
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
	}
	public static void main(String... args ) { // Sting args []   <==>    String... args  <==> String[] args
		// main method is entry point for to start running the code
		VarargsArray  va = new VarargsArray();
		
		String[] names = {"Erica", "Sarah", "Patel"};
		va.setNames(names);
		
		va.setNames(new String[] {"John","Tim"});
		
	}

}
