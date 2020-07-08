package Day25_Contructor.ConstructorPractice;

public class BookShelf04 {
	public static void main(String[] args) {
		
		Book03 book1 = new Book03(); // 1
		Book03 book2 = new Book03("OCA Book"); //  1
		Book03 book3 = new Book03("Selenium","James",200); // 1
		Book03 book4 = new Book03("10x Rules","Grand Cardone",250, 50);// 1 

		System.out.println(book2.count);
		System.out.println(book4.count);
		
		System.out.println(book4.title +" "+book4.author +" "+book4.pages+" "+book4.price);
        System.out.println("============");	
		
		
		book4.getDetails();
		System.out.println("============");
		book3.getDetails(); 
		System.out.println("============");
		book2.getDetails();
		System.out.println("============");
		book1.getDetails();
		
		
		/*
		 * All classes in java is object
		 * 
		 */
		
	}
	
	

}
