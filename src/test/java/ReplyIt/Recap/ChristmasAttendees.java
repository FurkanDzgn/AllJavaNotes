package ReplyIt.Recap;

public class ChristmasAttendees {
	
	String name;
	String giftName;
	
	public ChristmasAttendees() {
		super();
	}
	
	public ChristmasAttendees(String name, String giftName) {
		this.name=name;
		this.giftName=giftName;
	}
	
	public boolean giftExchange(ChristmasAttendees c1 ,ChristmasAttendees c2 ) {
		
		if(c1.giftName!=null && c2.giftName!=null) {
			String temp = c1.giftName;
			c1.giftName = c2.giftName;
			c2.giftName = temp;
			System.out.println("name=" + name + ", giftName=" + giftName + "]");
			return true;
		}
		return false;
	}
	
	public void updateGift (ChristmasAttendees c1 , String newGift ) {
		
		c1.giftName=newGift;
		
	}
	
	@Override
	public String toString() {
		return "ChristmasAttendees [name=" + name + ", giftName=" + giftName + "]";
	}
	
	public static void main(String[] args) {
		
		ChristmasAttendees x = new ChristmasAttendees("Jhon","Apple");
		ChristmasAttendees y = new ChristmasAttendees("Patel","Computer");
	
		System.out.println(x.toString());
		x.giftExchange(x, y);
		System.out.println(y.toString());
		
		y.updateGift(y, "www");
		System.out.println(y.toString());
	}
	

}
