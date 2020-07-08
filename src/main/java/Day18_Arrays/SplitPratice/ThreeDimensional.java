package Day18_Arrays.SplitPratice;

import java.util.Arrays;

public class ThreeDimensional {
	public static void main(String[] args) {
		
		String[][][] rooms =  new String[1][2][3];
		
		rooms[0][0][0] = "Dining room";
		rooms[0][0][1] = "Master bedroom";
		rooms[0][0][2] = "Bathroom";
		
		rooms[0][1][0] = "playing room";
		rooms[0][1][1] = "Living room";
		rooms[0][1][2] = "Kitchen";
		
	//	System.out.println(rooms.length);
		System.out.println(rooms[0][1][1]);
		System.out.println(Arrays.toString(rooms[0][1]));
		
		System.out.println("===========");
		
		for(int a=0; a<rooms.length; a++) { // 1
			for(int b=0; b<rooms[a].length; b++) { // 2
				for(int c=0; c<rooms[a][b].length; c++) { // 3
					System.out.println(rooms[a][b][c]);
				}
			}
		}
		
		
		
		
		
		
	}

}
