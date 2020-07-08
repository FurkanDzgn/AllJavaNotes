package Day40.Homework;

public class sdet extends ScrumTeam{
	
	String projectName;
	String teamName;
	Integer salary;
	
	public sdet(String projectName, String teamName) {
		super(teamName, projectName);	
	}
	
	public sdet(String projectName, String teamName, Integer salary) {
		this(projectName,teamName);
		this.salary=salary;
	}
	
	public void progress() {
		System.out.println("Sdet tests codes...");
	}
	
	public void work() {
		System.out.println("work from 9 am to 3 pm...");
	}
	
	public Long sprintNumber() {
		return 99L;
	}

}
