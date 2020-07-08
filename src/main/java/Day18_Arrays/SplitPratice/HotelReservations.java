package Day18_Arrays.SplitPratice;

import java.util.Arrays;

public class HotelReservations {
	public static void main(String[] args) {
		
		String[] reservations = {"David-Date:2-25-2019-1:15", "Erick-Date:1-16-2020-3:10",
				"Kevin-Date:10-20-2019-2:11", "Erica-Date:5-01-2019-7:10", "Patel-Date:3-11-2020-12:00"};
		
		String [][] resDetail = new String[reservations.length][];
		
		for(int i=0; i<reservations.length; i++) {
			resDetail[i] = reservations[i].split("-");
		}
		
		System.out.println(resDetail[1][0]);
		System.out.println(resDetail[4][0]);
		System.out.println(resDetail[3][0]);
		System.out.println(resDetail[2][0]);
		System.out.println(resDetail[0][0]);
		System.out.println(resDetail[0][3]);
		
		for(int a=0; a<resDetail.length; a++) {
			if(resDetail[a][3].equals("2020")) {
				System.out.println(resDetail[a][0]);
			}
				
		}
				
	}

}
