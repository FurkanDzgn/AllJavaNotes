package Day21_StringBuilder.Lesson1;

public class StringBuilderPractice {
	public static void main(String[] args) {
		
		// creating the StringBuilder without value
		StringBuilder stringBuilder=new StringBuilder();
		
		// value is apple
		StringBuilder stringBuilder1=new StringBuilder("Apple");
		
		StringBuilder stringBuilder2=new StringBuilder(5); // capacity
		
		System.out.println(stringBuilder);
		System.out.println(stringBuilder1);
		System.out.println(stringBuilder2);
		
		// Append method in stringBuilder
		
		stringBuilder.append("Computer ");
		System.out.println(stringBuilder);
		
		stringBuilder1.append(" Value");
		System.out.println(stringBuilder1);
		
		stringBuilder.append(true);
		System.out.println(stringBuilder); // stringBuilder class is mutable
		
		StringBuilder str=new StringBuilder();
		
		for(char ch='a'; ch<='z'; ch++) {
			str.append(ch);
		//	str.append(ch+0);
		}
		System.out.println(str);
		
		//Method Chaining in StringBuilder
		
		StringBuilder city = new StringBuilder("Chicago");
		System.out.println(city);
		city.append(" is beatiful").append(" city ").append(2020+" ").append(true);
		
		System.out.println(city);
		
		StringBuilder fruit=new StringBuilder("Orange ").append(" is ").append("orange");
		System.out.println(fruit);
		
		System.out.println("=======");
		StringBuilder success=new StringBuilder("A"); // because i use only ine object
		success.append("B");
		System.out.println(success);// AB--> since return type of append
		StringBuilder truth=success.append("C");
		System.out.println(success);//ABC
		System.out.println(truth);//ABC
		
		truth.append("D");
		System.out.println(success);//ABCD
		System.out.println(truth);//ABCD
		
		truth.append(success);
		System.out.println(truth); //ABCDABCD
	//	System.out.println(success);
		
		System.out.println(success.charAt(3)); 
		// since return type is char of charAt method it will not change your original value
		System.out.println(success);
		
		System.out.println(success.indexOf("B")+"-----"); // return type is int for indexOf 
		
		System.out.println(success);
		
		//abcdabcd
		//acbdabcd
		//acdadbbc
		//acdadbbbc
		
		
		System.out.println(success.indexOf("B",2)); // 5
		System.out.println(success.indexOf("B",success.indexOf("B"+1)) + "---------"); // 1
		System.out.println(success.length());// return length of StringBuilder
		
		//Substring method
		//If you want to get part of the StringBuilder we need wo use substring method
		// return type of substring in StringBuilder is String
		
		
		System.out.println(success.substring(0,4)); //ABCD
		System.out.println(success);//ABCDABCD
		
		success.insert(4,"-"); // return type of insert method is StringBuilder , '-'
		System.out.println(success);
		System.out.println(success.length());
		//ABCD-ABCD
		
	
		success.insert(9,"ABCD");
		//ABCD-ABCDABCD
		success.insert(11,"ABCD");
		//ABCD-ABCDABABCDCD
		System.out.println(success);
		
		StringBuilder pre = new StringBuilder();
		pre.append("preparation");
		
		pre.insert(0, "$");
		pre.insert(11, "$");
		System.out.println(pre);
		
		pre.insert(3, "-").append(" OCA");
	//	pre.append(" OCA").insert(17, "-");
		System.out.println(pre);
		
	}

}
