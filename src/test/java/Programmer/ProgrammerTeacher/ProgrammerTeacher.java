package Programmer.ProgrammerTeacher;

import java.util.ArrayList;
import java.util.List;

public class ProgrammerTeacher extends Programmer{
	
	List<String> teachLang = new ArrayList<String>();
	
	@Override
	public List<String> getLanguages(){
		return teachLang;
	}
	
	@Override
	public void addLanguage(String language) {
		teachLang.add(language);
	}
	
//	Programmer programmer = new Programmer();
	
	boolean teach(Programmer programmer, String language) {
		if((!programmer.getLanguages().contains(language)) && teachLang.contains(language)) {
		//	programmer.languages.add(language);
			programmer.addLanguage(language);
			return true;
		}
		return false;
	}
	

	

}

/*boolean teach(Programmer programmer, String language) { // public
if(!(programmer.languages.contains(language)) && teachLang.contains(language)) {
programmer.languages.add(language);
return true;
}else {
return false;
}
}*/