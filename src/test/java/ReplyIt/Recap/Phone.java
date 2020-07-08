package ReplyIt.Recap;

public class Phone {
	
	String phoneBrand;
	int cost;
	boolean camera;
	String carrier;
	
	public Phone (String phoneBrand) {
		this.phoneBrand=phoneBrand;
	}
	
	public Phone(String phoneBrand,int cost) {
		this(phoneBrand);
		this.cost=cost;
	}
	
	public Phone(String phoneBrand,int cost,boolean camera) {
		this(phoneBrand, cost);
		this.camera=camera;
	}
	
	public Phone(String phoneBrand,int cost,boolean camera,String carrier) {
		this(phoneBrand, cost, camera);
		this.carrier=carrier;
	}
	
	public void findCheaperPhone(Phone phone1, Phone phone2) {
		
		if(phone1.cost>phone2.cost) {
			System.out.println(phone2.phoneBrand);
		}else {
			System.out.println(phone1.phoneBrand);
		}
	}

	public String getPhoneDetails(Phone phone) {
		return "Phone [phoneBrand=" + phone.phoneBrand + ", cost=" + phone.cost + ","
				+ " camera=" + phone.camera + ", phone.carrier=" + carrier
				+ "]";
	}
	
	

}
