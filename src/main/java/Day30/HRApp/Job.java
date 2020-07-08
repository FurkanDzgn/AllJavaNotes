package Day30.HRApp;

public class Job {
	
//    title
//    jobId
//    salary
	
	private String title;
	private String jobId;
	private double salary;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return " { title : " + title + ",\n jobId : " + jobId + ",\n salary : " + salary + " } \n";
	}

	public Job(String title, String jobId, double salary) {
		super();
		this.title = title;
		this.jobId = jobId;
		this.salary = salary;
	}
	
	
	

}
