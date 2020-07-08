package ReplyIt.Homeworks;

public class ChristmasAttendees {
	
	String name;
	String giftName;
	
	public ChristmasAttendees() {
			
	}
	
	public ChristmasAttendees(String name, String giftName) {
		this.name=name;
		this.giftName=giftName;
		
	}
	
	public void giftExchange(ChristmasAttendees person1,ChristmasAttendees person2) {
		if(person1.giftName !=null && person2.giftName!=null) {
			String temp=person1.giftName;
			person1.giftName=person2.giftName;
			person2.giftName=temp;
			System.out.println(person1.name + "->"+ person1.giftName + "\n" + person2.name + "->"+ temp);
		}
		else {
			System.out.println(person1.name + "->"+ person1.giftName + "\n" + person2.name + "->"+ person2.giftName);
		}
	
	}
	public void updateGift(ChristmasAttendees xx,String newGift) {
		
		xx.giftName=newGift;
		System.out.println(name+"->"+giftName);
	}
	
	public static void main(String[] args) {
		ChristmasAttendees f1 = new ChristmasAttendees();
		ChristmasAttendees f2 = new ChristmasAttendees("Kate",null);
		
		f1.name="John";
		f1.giftName="Photo Frame";
		
		f1.giftExchange(f1, f2);
		f2.giftExchange(f1, f2);
		
	    f1.updateGift(f1, "Iphone 11");
		
	}
	

}
