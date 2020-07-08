package Day32_DateAndTimes.mentoring;

public class dog {
	int age;
	
	public static void main(String[] args) {
	dog dog = new dog();
	dog.age=2;
	System.out.println(dog.age);
	dog dog2=dog;
	System.out.println(dog2.age);
	dog2.age=3;
	System.out.println(dog.age);
	System.out.println(dog2.age);
	}

}
