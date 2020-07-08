package Programmer.ProgrammerTeacher;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
	
	@Test
	public void testProgrammer1() {
		ProgrammerTeacher teacher = new ProgrammerTeacher();
		teacher.addLanguage("Java");

		Programmer programmer = new Programmer();
		Assert.assertTrue(teacher.teach(programmer, "Java")); 

		List<String> list=new ArrayList<>();
		list.add("Java");
		assertEquals(list, programmer.getLanguages());
	}
	
	
	@Test
	public void testProgrammer2() {
		ProgrammerTeacher teacher = new ProgrammerTeacher();
		teacher.addLanguage("Java");
		teacher.addLanguage("Python");

		Programmer programmer = new Programmer();
		programmer.addLanguage("Java");
		assertFalse(teacher.teach(programmer, "Java"));
		assertTrue(teacher.teach(programmer, "Python"));

		List<String> list=new ArrayList<>();
		list.add("Java");
		list.add("Python");
		assertEquals(list, programmer.getLanguages());
	}
	
	@Test
	public void testProgrammer3() {
		
		ProgrammerTeacher teacher = new ProgrammerTeacher();
		teacher.addLanguage("Java");
		teacher.addLanguage("Python");
		teacher.addLanguage("C#");


		Programmer programmer = new Programmer();
		programmer.addLanguage("Java");
		programmer.addLanguage("C#");
		assertFalse(teacher.teach(programmer, "Java")); 
		assertTrue(teacher.teach(programmer, "Python"));
		assertFalse(teacher.teach(programmer, "C#")); 
		assertFalse(teacher.teach(programmer, "C++")); 


		List<String> list=new ArrayList<>();
		list.add("Java");
		list.add("C#");
		list.add("Python");
		assertEquals(list, programmer.getLanguages());
		assertTrue(list.containsAll(teacher.getLanguages()));
		
	}

}
