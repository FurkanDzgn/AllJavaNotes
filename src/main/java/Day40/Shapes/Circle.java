package Day40.Shapes;

public class Circle extends Shape {

	int radius;
	
	
	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public Number getArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI; //  3.14	 
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle...");
	}
	
	

}
