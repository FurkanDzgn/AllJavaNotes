package Day32_DateAndTimes.OCA_Test;

public class Pupy {
	
	int wag = 5;
	 public void Pupy(int wag) { this.wag=wag;}
	 
	 public static void main(String[] args) {
		Pupy pup = new Pupy();
		System.out.println(pup.wag);
		 
		 System.out.println(new Pupy().wag);
		 
		 String course = "Techtorial";
		 System.out.println(uptadeStr(course)); // Java will get copy of "Techtorial" , and will work on copy
		 System.out.println(course); // since previous method worked with copy, original course is still same
		  
	}
	 
	 public static String uptadeStr(String name) {
		 name=name.concat(" Academy");
		 return name;
		 
	 }

}
