package Day38_Map.HomeWork;

public class test {
	public static void main(String[] args) {
		
		
		int a=5;
		int b=3;
		
		a = a+b;
		b= a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
		
		outher:
			for(int i=0; i<5; i++) {
			
			for(int k=0; k<5; k++) {
				if(k>2) {
					System.out.print(k);
					continue outher;
				}
			
			}
			System.out.println(i);
		}
	}

}
