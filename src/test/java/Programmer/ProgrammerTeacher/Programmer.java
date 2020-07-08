package Programmer.ProgrammerTeacher;

import java.util.ArrayList;
import java.util.List;

public class Programmer {
	
	List<String> languages = new ArrayList();
	
	List<String> getLanguages(){
		return languages;
	}
	
	void addLanguage(String language) {
		languages.add(language);
	}
}

 