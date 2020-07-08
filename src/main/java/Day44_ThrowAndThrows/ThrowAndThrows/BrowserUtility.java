package Day44_ThrowAndThrows.ThrowAndThrows;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BrowserUtility {
	
	public static void readFile(String fileName)  throws IOException {
		FileReader fileReader = new FileReader("src/Data/"+fileName+".txt");
		fileReader.read();
		
	}
	
	public static void wait(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		readFile("Confing");
		
		wait(5);
		
	}

}
