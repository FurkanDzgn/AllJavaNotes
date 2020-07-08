package Day40.Shapes;

public class ShapeApp {
	
	public static void main(String[] args) {
		
	//	Shape shape = new Shape("Shape"); // Abstract classes can not be instantiated(create an object).
		
		
		Triangle triangle = new Triangle(10, 5);
		triangle.draw();
		System.out.println(triangle.getArea()); 
		
		Circle circle = new Circle(5);
		circle.draw();
		System.out.println(circle.getArea());
		
		Square square = new Square(6, 6);
		square.draw();
		System.out.println(square.getArea());
		
	}

}
