package Day40.Homework;

public class developer extends ScrumTeam {
	
	String projectName;
	String teamName;
	Integer salary;
	
	public developer(String teamName, String projectName) {
		super(teamName, projectName);
		// TODO Auto-generated constructor stub
		
	}
	
	public developer(String teamName, String projectName, Integer salary) {
		this(teamName, projectName);
		this.salary=salary;
	}
	
	@Override
	public void progress() {
		// TODO Auto-generated method stub
		System.out.println("develop codes...");
		
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub	
		System.out.println("work from 9 am to 3 pm...");
	}
	
	@Override
	public Integer sprintNumber() {
		// TODO Auto-generated method stub	
		return 123;
	}

}
