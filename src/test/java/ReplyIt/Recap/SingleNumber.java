package ReplyIt.Recap;

import java.util.Arrays;
import java.util.List;

public class SingleNumber {
	
	public static int SingleNumber (int [] c1) {
		
		Integer[] c2 = new Integer[c1.length];
		
		for(int i=0;i<c1.length;i++) {
			c2[i]=c1[i];
		}
		List<Integer> list = Arrays.asList(c2);
		
		for(int i=0;i<list.size();i++) {
			for(int k=0;k<list.size();k++) {
				if(list.get(i)==list.get(k) && i!=k) {
					list.remove(i);
					list.remove(k);
				}
			}
		}
		
		Object [] result=list.toArray();
		
		Integer [] res = new Integer[result.length];
		for(int i=0; i<result.length;i++) {
			res[i]=(Integer)result[i];
			}
	    int x =(int)res[0];
	   
		return x;
	}
	
	public static void main(String[] args) {
		int [] c1= {4,4,2};
//		System.out.println(SingleNumber(c1));
		System.out.println(sing(c1));
	}
	
	public static int sing(int[] car) {
		
		int res=0;
		OUTHER:
			for(int i=0;i<car.length;i++) {
			for(int k=0;k<car.length;k++) {
				if(car[i]==car[k] && i!=k) {
					continue OUTHER;
				}
			
			}
			res=car[i];
		}
		return res;
	}

}
