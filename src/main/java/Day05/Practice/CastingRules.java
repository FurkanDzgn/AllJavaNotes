package Day05.Practice;

public class CastingRules {
	
	public static void main (String[] args) {
		
		int num1 = 22;
		
		double num2 = num1;	
		System.out.println(num2);
		
		long num3 = num1;
		System.out.println(num3);
		
		char num4 = 'a';
		
		int num5 = num4;
		
		System.out.println(num5);
		
		short num6 = (short)num5;
		System.out.println(num6);
		
		
		// byte -128 to 127 ->int ->long
		//long 876543 -> byte (byte)876543
		
		double a = 5.65;
		
		int b=(int)a;
		System.out.println(b);
		
		byte byte1=6;
		byte byte2=7;
		
		byte byte3= (byte)(byte1 + byte2); // 6+7=13 int (autmatically convert to int)
		//int byte3= (byte)(byte1 + byte2);
		
		System.out.println(byte3);
		
		short short1= 10;
		short short2=(short)(byte1 + short1);
		//int short2=(short)(byte1 + short1);
		
		System.out.println(short2);
			
	}

}
