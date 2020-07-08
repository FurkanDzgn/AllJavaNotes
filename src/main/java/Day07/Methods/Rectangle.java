package Day07.Methods;

public class Rectangle {
	
	//perimeter(int height, int width) -> will return a perimeter of this rectangle
	
	//area(int height, width) -> will return int area of rectangle
	
	//(height+weight)*2 -> perimeter of rectangle
	//(height*width) -> area of rectangle
	
	public int perimeter(int height,int width) {
		int result=(height+width)*2;
		return result;
	}
	public int area(int height,int width) {
		int result=height*width;
		return result;
	}
	public static void main(String[] args) {
		Rectangle x=new Rectangle();
		
		int perimeter=x.perimeter(3, 5);
		System.out.println(perimeter);
		
		int area=x.area(3, 5);
		System.out.println(area);
	}

}
