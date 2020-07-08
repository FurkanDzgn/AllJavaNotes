package ReplyIt.Homeworks;

import java.util.Arrays;

public class Phone {
	
	String phoneBrand;
	int cost;
	boolean camera;
	String carrier;
	
	public Phone(String phoneBrand) {
		this.phoneBrand=phoneBrand;
	}
	
	public Phone(String phoneBrand,int cost) {
		this.phoneBrand=phoneBrand;
		this.cost=cost;
	}
	
	public Phone(String phoneBrand,int cost,String carrier) {
		this.phoneBrand=phoneBrand;
		this.cost=cost;
		this.carrier=carrier;
	}
	
	public Phone( String phoneBrand, int cost, boolean camera, String carrier) {
		this.phoneBrand=phoneBrand;
		this.cost=cost;
		this.camera=camera;
		this.carrier=carrier;
	}
	
	public String findCheaperPhone(Phone phone1,Phone phone2) {
		
		if(phone1.cost<phone2.cost) {
			return phone1.phoneBrand;
		}  
		return phone2.phoneBrand;
	}
	
	public String[] getPhoneDetails(Phone phone) {
		
		String cost=""+phone.cost;
		String camera=""+phone.camera;
	 
		
		String[] arr=new String[] {phone.phoneBrand, cost, camera, phone.carrier} ;
	
		return arr;
		
//		 String[] details = new String[4];
//	        details[0] = phone.phoneBrand;
//	        details[1] = Integer.toString(phone.cost);
//	        details[2] = Boolean.toString(phone.camera);
//	        details[3] = phone.carrier;
	}
	
	public static void main(String[] args) {
		
		Phone phone1 = new Phone("Iphone");
		Phone phone2 = new Phone("Samsung",1500);
		Phone phone3 = new Phone("LG",1800,"Verizon");
		Phone phone4 = new Phone("Nokia",1000,true,"Cricket");
	
		
		phone1.cost=1200;
		phone1.camera=false;
		phone1.carrier=" AT&T";
		
		phone2.camera=true;
		phone2.carrier="MOBA";
		
		phone3.camera=true;
		
		System.out.println(phone1.findCheaperPhone(phone4, phone3));
		
		System.out.println(Arrays.toString(phone2.getPhoneDetails(phone1)));
		
	}


}
