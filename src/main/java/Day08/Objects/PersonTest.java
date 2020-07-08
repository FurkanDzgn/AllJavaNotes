package Day08.Objects;

public class PersonTest {
	public static void main(String[] args) {
		
		Person person1 = new Person();		
		Person person2 = new Person();
		Person person3 = new Person();
		
		person1.name = "James";
		person1.age = 20;
		person1.gender='M';
		person1.position = "SDET";
		person1.salary = 100000.0;
		
		person2.name = "Sarah";
		person2.age = 22;
		person2.gender='F';
		person2.position = "DEVELOPER";
		person2.salary = 100000.0;
		
		person3.name = "Kevin";
		person3.age = 25;
		person3.gender='M';
		person3.position = "Scrum master";
		person3.salary = 80000.0;
		
		/*
		 * SDET , Developer , Scrum master
		 */
	
		System.out.println(person1.position+", " + person2.position+", " +person3.position);
		
		/*
		 * Kevin works as Scrum master and makes 80000.0
		 * james works as SDET and makes 100000.0
		 * Sarah works as Developer and makes 100000.0
		 */
		
		 System.out.println(person3.name +" works a "+ person3.position + " and makes "+person3.salary);
		 System.out.println(person1.name +" works a "+ person1.position + " and makes "+person1.salary);
		 System.out.println(person2.name +" works a "+ person2.position + " and makes "+person2.salary);
		 
		 person1.study();
		 person2.study();
		 person3.study();
		 
		 person1.bike(5);
		 person3.bike(10);
		 
		 person1.swim();
		 person3.talk("Hello guys.");
		 person2.talk("Learn java");
		 person1.work(5);
	}

}
