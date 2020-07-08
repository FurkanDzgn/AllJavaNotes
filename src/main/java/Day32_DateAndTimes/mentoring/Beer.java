package Day32_DateAndTimes.mentoring;

public class Beer {
	public static void main(String[] args) {
		
		String str1 = "Lager";
		String str2 = str1;
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str2 + "");
		String str3 = "Lager";
		System.out.println(str1 == str3);
		
		String str4 = new String("Lager");
		System.out.println(str4 == str1);
		System.out.println(str4.equals(str1));
		System.out.println(str1 == "La"+"ger");
		
		String str5 = "La";
		String str6 = "ger";
		System.out.println(str1 == str5+str6);
	}

}
