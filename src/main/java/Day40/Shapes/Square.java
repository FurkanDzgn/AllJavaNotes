package Day40.Shapes;

public class Square extends Shape {

	int length;
	int width;
	
	public Square(int length, int width) {
		super("Square");
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width; 
	}
	

	@Override
	public Number getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing square....");
	}

}
