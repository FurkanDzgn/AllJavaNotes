package Programmer.ProgrammerTeacher;

import java.util.ArrayList;
import java.util.List;

public class programmerRecap {
	
	List<String> languages;
	
	
	public List<String> getLanguages(){
	    return 	languages;
	}
	
	public void addLanguage(String language) {
		languages.add(language);
	}
	
//	List<String> allLanguages;
//	
//	List<String> getLanguages(){
//		return this.allLanguages;
//	}
//	
//	void addLanguage(String language) {
//		this.allLanguages.add(language);
//	}

}
