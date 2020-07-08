package CondingBat.codePractice;

public class WarmUp2 {
	public String stringTimes(String str, int n) {
	
        String sum="";
		for(int i=0; i<n; i++) {
			sum+=str;
		}
		return sum;
	}
	
	public String frontTimes(String str, int n) {
		
		String sum="";
		if(str.length()>=3) {
		for(int i=0; i<n;i++) {
			sum+=str.substring(0,3);
		}
		}
		if(str.length()==2) {
		for(int i=0; i<n;i++) {
			sum+=str.substring(0,2);
		}
		}
		if(str.length()==1) {
		for(int i=0; i<n;i++) {
			sum+=str.substring(0,1);
		}
		}
		return sum;
	}
	
	int countXX(String str) {
		
		int counter=0;
		if(str.contains("xx")) {
		for(int i=0; i<str.length()-1; i++) {
			if(str.substring(i,i+2).equals("xx")) {
				counter++;
			}
		}
		}
		return counter;
	}
	
	boolean doubleX(String str) {
		
		int i = str.indexOf("x");
		  if (i == -1) return false; // no "x" at all

		  // Is char at i+1 also an "x"?
		  if (i+1 >= str.length()) return false; // check i+1 in bounds?
		  return str.substring(i+1, i+2).equals("x");
	}
	
	public String stringBits(String str) {
		
		String sum="";
		for(int i=0; i<str.length(); i+=2) {
			sum+=str.charAt(i);
		}
		
		return sum;
	}
	public String stringSplosion(String str) {
		
		String x="";
		for(int i=0; i<str.length(); i++) {
			x+=str.substring(0,i+1);
		}
		return x;
	}
	public int last2(String str) {
		
		
		
		
		
		
		
		
		
		return -1;
	}
	public int arrayCount9(int[] nums) {
		
		int count=0;
		for(int num:nums) {
			if(num==9) {
				count++;
			}
		}
		return count;
	}
	public boolean arrayFront9(int[] nums) {
		boolean result=false;
		OUTHER:	if(nums.length>=4) {
				for(int i=0; i<4; i++) {
					if(nums[i]==9) {
						result=true;
					}
				}
			}
				if(nums.length<4) {
					for(int i=0; i<nums.length; i++) {
						if(nums[i]==9) {
							result=true;
						}
					}
				}
			
				return result;
	}
	public boolean array123(int[] nums) {
		
		//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
		int c1=0;
		int c2=0;
		int c3=0;
		for(int i=0; i<nums.length ; i++) {
			if(nums[i]==1) {
				c1++;;
			}if(nums[i]==2) {
				c2++;
			}if(nums[i]==3) {
				c3++;
			}
		}
		if(c1>=1 && c2>=1 && c3>=1) {
			return true;
		}
		return false;
	}
	public int stringMatch(String a, String b) {
		
		int minLength = Math.min(a.length(), b.length());
		int counter =0;
		
		for(int i=0; i<minLength-1; i++) {
			if(a.substring(i,i+2).equals(b.substring(i,i+2))) {
				counter++;
			}
		}
		return counter;
	}
	public String stringX(String str) {
		
		String str2="";
		
		for(int i=1; i<str.length()-1; i++) {
			if(!(i>0 && i<str.length()-1) && str.charAt(i)=='x') {
				str2+=str.charAt(i);
			}
		}
		
		return str2;
	}
	public String altPairs(String str) {
		
		 String str2="";
			for(int i=0; i<str.length(); i+=4) {
			  int end=i+2;
			  if(end>str.length()){
			     end = str.length();
			  }
				str2+=str.substring(i,end);
			}
			return str2;
	}
	
	public String stringYak(String str) {
		 String str2="";
			for(int i=0; i<str.length(); i++) {
				if(i+2<str.length () && str.charAt(i)=='y' && str.charAt(i+2)=='k' ) {
				i=i+2;
				}else{
				str2+=str.charAt(i);
				}
			}
		
			return str2;
	}
	public int array667(int[] nums) {
		
		int counter=0;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7) ){
				counter++;
			}
		}
		return counter;
	}
	public boolean noTriples(int[] nums) {
		
		for(int i=0; i<nums.length-2; i++) {	
			if(nums[i]==nums[i+1] && nums[i]==nums[i+2]) {
				return false;
			}
		}
		return true;
	}
	public boolean has271(int[] nums) {
		
		
		
		
		
		
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
