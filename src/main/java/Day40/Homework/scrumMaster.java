package Day40.Homework;

public class scrumMaster extends ScrumTeam{
	
	String projectName;
	String teamName;
	Integer salary;
	
	public scrumMaster(String projectName, String teamName) {
		super(teamName, projectName);
	}
	
	public scrumMaster(String projectName, String teamName, Integer salary) {
		this(projectName, teamName);
		this.salary=salary;
	}
	
	@Override
	public void progress() {
		System.out.println("scrumMaster...");
	}
	
	@Override
	public void work() {
		System.out.println("work from 9 am to 3 pm...");
	}
	
	public Short sprintNumber() {
		return 45;
	}

}
