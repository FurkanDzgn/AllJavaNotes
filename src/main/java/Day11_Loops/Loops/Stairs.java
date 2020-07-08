package Day11_Loops.Loops;

import java.util.Scanner;

public class Stairs {
	/*
	 * *                       *                              *          *
	 * **                     * *                           * *         * *
	 * ***                  * * * *                       * * *       * * * * 
	 * ****               * * * * * *                   * * * *     * * * * * *
 	 * *****            * * * * * * * *               * * * * *       * * * * 
 	 * *****          * * * * * * * * * *           * * * * * *         * *
	 * *******      * * * * * * * * * * * *       * * * * * * *          *  
	 *                 
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		String space=" ";
	    String star="*";
		
		do {
			System.out.print(space);
			space=space+" ";
			System.out.println(star);
			star=star+"*";
			--num;
		}while(num>0);
		
		 star="*";
		while(num<10) {
//			System.out.print(space);
//			space=space+" ";
			System.out.println(star);
			star=star+"*";
			++num;
		}
	

 }
}
