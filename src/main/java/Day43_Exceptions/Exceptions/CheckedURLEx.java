package Day43_Exceptions.Exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedURLEx {
	
	public static void navigate(String URL) {
		
		try {
			URL url = new URL(URL); // http://ww.google.com,http
  //         	System.out.println("*");
		} catch (MalformedURLException e) {
		     System.out.println(e);	//   e.getMessage() 
		//      e.printStackTrace();
		
		}
	}
	public static void main(String[] args) {
		
		navigate("http");
	}

}
