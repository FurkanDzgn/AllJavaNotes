package CondingBat.codePractice;

public class middle {
	public boolean xyzMiddles(String str) {
	
	
	boolean result=false;
	
	for(int i=0; i<str.length()-3;i++) {
		if(str.substring(i,i+3).equals("xyz")) {
		if((Math.abs(str.substring(0,i).length() - str.substring(i+3).length())>=0 )) {
				result=true;
			}
			
		}
		
	}
	
	return result;
  }
	public static void main(String[] args) {
		middle mIs= new middle();
		System.out.println(mIs.xyzMiddles("AAxyzBB"));
		
		
	}
	

}
