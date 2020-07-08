package CondingBat.codePractice;

public class xyzMiddle {
	
	public boolean xyzMiddles(String str) {
	
		boolean result=false;
		
	LOOP:	for(int i=1; i<str.length(); i++) {
			if(str.subSequence(i, i+3).equals("xyz")) {
				if(str.substring(0,i).length()==str.substring(i+3).length() || str.substring(0,i).length()==str.substring(i+3).length()) {
					result=true;
					break LOOP;
				}
			}
		}
		
		return result;	
      }
	public static void main(String[] args) {

		
		xyzMiddle mMm = new xyzMiddle();
		System.out.println(mMm.xyzMiddles("AAxyzBB"));
	}
  }