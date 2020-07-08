package Day38_Map.Mentoring;

public class Abstraction {
	
	private double height;
	private double length;
	private double getHeight;
	
	
	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getGetHeight() {
		return getHeight;
	}


	public void setGetHeight(double getHeight) {
		this.getHeight = getHeight;
	}
	
    public double area() {
		
		double area1 = height*length;
		return area1;
	}

}
