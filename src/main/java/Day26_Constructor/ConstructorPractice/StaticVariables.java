package Day26_Constructor.ConstructorPractice;

public class StaticVariables {
	
	static int staticV;
	int variable1;
	int variable2;
	
	static{
		staticV=3;
	}

		public StaticVariables(int variable1, int variable2) {
			this.variable1=variable1;
			this.variable2=variable2;
		}
	
	
		public static void main(String[] args) {
			
			StaticVariables var1 = new StaticVariables(5,6); // var1.variable1 =5, var1.ariable2 =6, staticV=11;
			StaticVariables var2 = new StaticVariables(10,12); // var2.varibale1 =10, var2.variable12, staticV =3;
		        var2.staticV = 11;
		        // var1.variable1 =5, var1.ariable2 =6, staticV=11;
		        // var2.varibale1 =10, var2.variable2=12, staticV =11;
		        
		        var1.variable1 = var1.variable2 + var1.staticV; // var1.variable1 = 6+11 = 17
		        var1.staticV   = var2.variable2 + var2.staticV;   // var1.staticV = 12 +11 = 23
		        var2.variable1 = var1.variable1 +var2.staticV;  // var2.variable1 = 17 + 23 = 40
		        
		        System.out.println(var1.variable1); // 17
		        System.out.println(var1.staticV);   // 23
		        System.out.println(var2.variable1); // 40
		        System.out.println(var2.staticV);   // 23
		}

}