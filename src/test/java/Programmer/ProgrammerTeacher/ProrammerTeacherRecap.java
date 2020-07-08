package Programmer.ProgrammerTeacher;

import java.util.List;

public class ProrammerTeacherRecap extends programmerRecap{

	List<String> teacherLanguages;
	
	@Override
	public List<String> getLanguages(){
		return teacherLanguages;
	}
	
	@Override
	public void addLanguage(String language) {
		this.teacherLanguages.add(language);
	}
	
	public boolean teach(programmerRecap programmer, String language) {
		
		if(!programmer.getLanguages().contains(language) && teacherLanguages.contains(language)) {
			return true;
		}else {
			return false;
		}
	}
	
//	List<String> teacherLanguages;
//	
//	@Override
//	public List<String> getLanguages(){
//		return this.allLanguages;
//	}
//	
//	@Override
//	public void addLanguage(String language) {
//		this.allLanguages.add(language);
//	}
//	
//	boolean teach(programmerRecap programmer, String language) {
//		if(!(programmer.getLanguages().contains(language)) && teacherLanguages.contains(language)) {
//			programmer.addLanguage(language);
//     		return true;
//		}else {
//			return false;
//		}
//	}
}
