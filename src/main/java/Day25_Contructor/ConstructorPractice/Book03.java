package Day25_Contructor.ConstructorPractice;

public class Book03 {
	
	String title;
	String author;
	int pages;
	int price;
	static int count=0;
	
	public Book03() {
		count++;
	}
	
	public Book03(String title) {
		this.title = title;
		count++;
	}
	
	public Book03(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	    count++;	
	}
	
	public Book03(String title, String author, int pages, int price) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
		count++;
	}
	
	public void getDetails() {
		System.out.println("Title: "+title+"\nAuthor: "+author+"\nPages: "+pages+"\nPrice: "+price); // each details are different objects
	}
	
	/*
	 * Title: 10x Rules
	 * Author: Grand Cardone
	 * Pages:250
	 * Price:50
	 */
	
}
