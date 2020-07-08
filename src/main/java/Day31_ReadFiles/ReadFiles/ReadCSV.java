package Day31_ReadFiles.ReadFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class ReadCSV {
	
	// CSV -> Coma Seperated Values.
	
	public static void main(String[] args)  throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader("src/ReadFiles/data.CSV")); // 

   //	System.out.println(br.nullReader().toString());
	
//		String Line = br.readLine();
//    	System.out.println(Line);
//		
//		String Line2 = br.readLine();
//		System.out.println(Line2);
//		
//		String Line3 = br.readLine(); // null 
//		System.out.println(Line3);
		
		String Line= "";
	//	List<String> list = new ArrayList();
		while((Line = br.readLine()) != null) {
//			System.out.println(Line);
			String[] values = Line.split(",");
	//		System.out.println(values[0]+" "+values[1]+" "+values[2]+" "+values[3]);
			List<String> list = Arrays.asList(values); 
		//	ArrayList<String> arr = new ArrayList<String>(list); How to convert from list to arrayList
 		
			System.out.println(Arrays.toString(values));
			
			// CSV file purpose is store your test data.
			// Properties 
		}
	//	System.out.println(list);
		br.close();
	}

}
