package Day28_ArrayList.ArrayListPractice;

public class Computer {
			
		String brand;
		int year;
		double price;
		int hardDiscMemory;
		
		public Computer(String brand, double price) {
			this.brand=brand;
			this.price=price;
		}
		
		public Computer(String brand, int year, double price) {
			this(brand, price);
			this.year=year;
			
		}
		
		public Computer(String brand, int year, double price, int hardDiscMemory ) {
			this(brand, year, price);
			this.hardDiscMemory= hardDiscMemory;
			
		}
		
		public void printDetail() {
			System.out.println("Brand: " +brand +"\nYear: "+year +"\nPrice: "+price+ "\nhardDiscMemory: "+hardDiscMemory);
		}


}
