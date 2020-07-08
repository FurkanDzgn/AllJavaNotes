package Day40.Shapes;

public abstract class Shape {
	
	String name;
	
	public Shape(String name) {
		super();
		this.name = name;
	}
	
	public abstract Number getArea(); // abstract methods can not be body
	
	public abstract void draw();
		

	
}
