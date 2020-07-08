package ReplyIt.Homeworks;
import java.util.Arrays;
public class ArraysMethodDifWay {
	public static void main(String[] args) {
		
		String names[] = {"John Doe", "Sarah Clark", "Harsh Patel", "Philip Brown", "Mike Clark"};
		String name = "";
		
		
		for(int i=0;i<names.length; i++) {
			int space = names[i].indexOf(" ");
			names[i]= names[i].substring(space+1)+" "+names[i].substring(0,space);
			//name+= names[i].split(" ");
		}
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		for(int i=0;i<names.length; i++) {
			int space = names[i].indexOf(" ");
			names[i]= names[i].substring(space+1)+" "+names[i].substring(0,space);
		}
		System.out.println(Arrays.toString(names));
		
				
	}

}
