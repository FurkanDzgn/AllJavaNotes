package Day19_Arrays.ArraysPractice;

import java.util.Arrays;

public class Practice {
	
	public static boolean searchValue(int [] ids,int searchValue) {
		
		Arrays.sort(ids);
		
		int indexNumber=Arrays.binarySearch(ids,searchValue);
		
		if(indexNumber>=0) {
			System.out.println(indexNumber);
			return true;
		}
		System.out.println(indexNumber);
		return false; // if IndexNumebr value is less than 0 it means the array has no value.
	}
	
	public static boolean containsValue(int [] ids,int searchValue) {
		//Convert array t String and use String method contains();
		
		String id = Arrays.toString(ids);
		
		if(id.contains(""+searchValue)) {
			return true;
		}
	
		return false;
	}
	
	public static void main(String[] args) {
		
		int [] ids= {1,2,3,4,5,6,7,123456,5678,456,76,897};
		
		/*Search value is available or not
		*If the value is available print(give) the index number
		*if the value is not available return false, if it is available return true
		*50 --> false
		*7 --> true
		*/
		
		searchValue(ids,666);
		
		System.out.println(	containsValue(ids,5));
	
		
	}

}
