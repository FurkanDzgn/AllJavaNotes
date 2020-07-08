package Day22_StringBuilder.lesson;

public class DeleteAndDeleteCharAt {
	public static void main(String[] args) {
		
	StringBuilder country=new StringBuilder("America");
	
	country.delete(0, 3);// 0,1,2 --> return type is StringBuilder
	System.out.println(country);// rica
	country.deleteCharAt(2);
	System.out.println(country);// ria
	
	country.insert(2,'c');
	System.out.println(country);
	country.insert(0,"Costa ");
	System.out.println(country);
	
	//country.deleteCharAt(20);
	
	country.reverse();
	System.out.println(country);
	
	int x= 123;
	String x1 = ""+x;
	StringBuilder x3 = new StringBuilder(x1).reverse();
//	StringBuilder a = new StringBuilder(String.valueOf(x));
	int x4 = Integer.parseInt(x3.toString());
	System.out.println(x4);
	
	String num="12345";
	StringBuilder number=new StringBuilder(num);
	number.reverse();
	System.out.println(number);
	
	System.out.println(recap(x));
	}
	
	public static int recap(int num) {
		
	//	String str = ""+num;
		String str = String.valueOf(num);
		
		StringBuilder stb = new StringBuilder(str);
		stb.reverse();
		
		int result = Integer.parseInt(stb.toString());
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
