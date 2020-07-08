package Day11_Loops.Conditions;

public class LeapYear {
	
	/*
	 *Leap year is the year where it has 366 days 
	 * Which has February 29
	 * 2020, 2024, 2028, 2032......
	 * 2000 -> leap year, 2000/100 -> 20, 2000/400 -> 5
	 * 1996 -> leap year
	 * 1900 -> 1900/4 ->475, 1900/400 -> there will be remainder,Not LEAP
	 * 
	 * 1800 -> 1800/4 -> 450. 1800/100 -> 18, 1800/400 -> NOT LEAP
	 * 2024 -> 2024/4 -> 506
	 * 
	 * If the year is the dividable by 4 but not by 100 then it is leap year
	 * If the year is dividable by 4 and by 100 then we have to check with 400
	 */
	
	//Write a method which will accept int year and will return String "Leep", "Not Leap"
	//Name of the method leapOrNotLeap
	
	public String leapOrNotLeap(int year) {
		
		if(year %4 ==0) {
			if(year %100 ==0) {
				if(year %400 ==0) {
					return "Leap";
				}
				return "Not Leap";
				
			}
			return "Leap";
			
		}else {
			return "Not Leap";
		}
	}
	public static void main(String[] args) {
		LeapYear ly = new LeapYear();
		System.out.println(ly.leapOrNotLeap(2400));  
	}

}
