package Day40.Shapes;

public class Triangle extends Shape {
	
	
	int height;
	int base;
	
	public Triangle(int height, int base) {
		super("Triangle");
		this.height = height;
		this.base = base;
		
	}
	
	@Override
	public Double getArea() {
		return (double)(height*base/2);  // casting
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing triangle...");
	}
	

}
