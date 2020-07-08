package Day43_Exceptions.Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CheckedExceptions {
	
	public static void main(String[] args) {
		
		String filePath = "/src/test.csv";
		BufferedReader reader = null;
		try {
	        reader = new BufferedReader(new FileReader(filePath)); // FileNotFoundException	
	    	String value1 = reader.readLine(); // IOException
			System.out.println(value1);
		} catch (FileNotFoundException e) {	
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				reader.close(); // IOException -> checked    NullPointerException -> unChecked
			} catch (IOException | NullPointerException e) {
			   System.out.println(e.getMessage());
			}
		}
	}
	
	// IOException -> Input OutPut Excetion it is applied for the files while we are trying to read them.
	
	// IOException, FileNotFoundException are checked exceptions has to be handled during compilation.
	

}
