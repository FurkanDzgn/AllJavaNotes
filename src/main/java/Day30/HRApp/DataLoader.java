package Day30.HRApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataLoader {
	
	public static List<List<String>> readFile(String path) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		String line ="";
		List<List<String>> data = new ArrayList<>();
		
		while((line=br.readLine()) != null) {  // each line is value and split coma
			// line = "Southlake,Texas,US,1400";
			// String[] values={Southlake, Texas, US, 1400};
			String[] values = line.split(",");
			// List<String> list = [Southlake, Texas, US, 1400];
			List<String> list = Arrays.asList(values);
			// data -> list of list -> we adding one value (list) to outher list
			data.add(list);
		}
	
		
		return data;
	}
	
	public static void main(String[] args) throws Exception{
		
   // 	System.out.println(readFile("src/HRApp/location.csv"));
		
	//	System.out.println(loadLocations());
//	//	System.out.println(loadDeparments());
//	//	System.out.println(loadJobs());
//		System.out.println(loadEmployees());
		
	}
	
	public static List<Location> loadLocations() throws Exception{
		List<List<String>> locations = readFile("src/HRApp/location.csv");
		List<Location> locationList = new ArrayList<>();
		
		for(int i=0; i<locations.size(); i++) {
			// Whitehorse,Yukon,CA,1900
			String city = locations.get(i).get(0);
			String state = locations.get(i).get(1);
			String country = locations.get(i).get(2);
			int locationId = Integer.parseInt(locations.get(i).get(3));
			
			Location location = new Location(country, state, city, locationId);
			locationList.add(location);

		}
		return locationList;
	}
	
	public static List<Department> loadDeparments() throws Exception{
		
		List<List<String>> departments = readFile("src/HRApp/departments.csv");
		List<Department> departmentList = new ArrayList<>();
		List<Location> locations = loadLocations();
		
		for(int i=0; i<departments.size(); i++) {
			int departmentId = Integer.parseInt(departments.get(i).get(0));
			String depatmentName = departments.get(i).get(1);
			Location location = null;
			for(int k=0; k<locations.size(); k++) {
				if(locations.get(k).getLocationId() == Integer.parseInt(departments.get(i).get(2))) {
					location = locations.get(k);
					
				}
			}
			
			Department department = new Department(departmentId, depatmentName, location);
			
			departmentList.add(department);
		}
		return departmentList;
	}
	
	public static List<Job> loadJobs() throws Exception{
		List<List<String>> jobs =  readFile("src/HRApp/Jobs.csv");
		List<Job> jobList = new ArrayList<>();
		
		for(int i=0; i<jobs.size(); i++) {
			String title = jobs.get(i).get(0);
			String jobId = jobs.get(i).get(1);
			double salary = Double.parseDouble(jobs.get(i).get(2));
			
			Job job = new Job(title, jobId, salary);
			jobList.add(job);
		}
		return jobList;
	}
	public static List<Employee> loadEmployees() throws Exception{
		List<List<String>> employees =  readFile("src/HRApp/Employees.csv");
		List<Employee> employeeList = new ArrayList<>(); // return
		List<Job> jobs = loadJobs();
		List<Department> departments = loadDeparments();
		
		for(int a=0; a<employees.size(); a++) {
			// Steven,King,100,90,AD_PRES
			String name = employees.get(a).get(0);
			String lastName = employees.get(a).get(1);
			int employeeId = Integer.parseInt(employees.get(a).get(2));
			int departmentId = Integer.parseInt(employees.get(a).get(3));
			Department department = null;
			for(int i=0; i<departments.size(); i++) {
				if(departments.get(i).getDepartmentId() == departmentId) {
					department = departments.get(i);
				}
			}
			String jobId = employees.get(a).get(4);
			Job job = null;
			for(int k=0; k<jobs.size(); k++) {
				if(jobs.get(k).getJobId().equals(jobId)){
					job = jobs.get(k);
				}
			}
			Employee employee = new Employee(name, lastName, employeeId, department, job);
			
			employeeList.add(employee);
		}
		return employeeList;
	}

}
