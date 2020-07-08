package Day30.HRApp;

public class Department {
	
	//departmentId
    //departmentName
    //location
	
	private int departmentId;
	private String depatmentName;
	private Location location;
	
	public int getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepatmentName() {
		return depatmentName;
	}
	public void setDepatmentName(String depatmentName) {
		this.depatmentName = depatmentName;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return " { departmentId : " + departmentId + ",\n depatmentName : " + depatmentName + ",\n location : "
				+ location + " } ";
	}

	public Department(int departmentId, String depatmentName, Location location) {
		super();
		this.departmentId = departmentId;
		this.depatmentName = depatmentName;
		this.location = location;
	}
	
	

}
