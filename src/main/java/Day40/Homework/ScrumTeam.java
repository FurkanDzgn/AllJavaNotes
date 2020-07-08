package Day40.Homework;

public abstract class ScrumTeam {
	
	String teamName;
	String projectName;
	
	public ScrumTeam(String teamName, String projectName) {
		super();
		this.teamName=teamName;
		this.projectName=projectName;
	}
	
	public abstract void progress();
	public abstract void work();
	public abstract Number sprintNumber();

}
