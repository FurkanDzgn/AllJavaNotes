package Day12_Loops.Loops;

import java.util.Scanner;

public class ReadUnRead {
	
	/*
	 * 10 Unread messages
	 * 10 read messages
	 * 
	 * Readind message....
	 * 9 Unread messages
	 * 11 Read messages
	 * 
	 * 
	 * .
	 * .
	 * .
	 * .
	 * Reading message...
	 * 0 Unread messages
	 * 20 Read messages
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner input=new Scanner(System.in);
		
		System.out.println("How many Unread messages on your phone?");
		int unRead=input.nextInt(); //5
		
		System.out.println("How many Read messages on your phone?");
		int read=input.nextInt(); //2
		
		/*
		 * reading message...
		 * 4 unread messages
		 * 3 read messages
		 * 
		 * 5 times
		 */
		
		while(unRead>0) { // 0>0m-> false
			
			--unRead;
			++read;
			System.out.println("Readind the message...");
			System.out.println(unRead+" unread messages.");// 4 unread messages
			System.out.println(read+" read messages.");//4 read messages
			Thread.sleep(1000);
		}
	   //     System.out.println("Readind the message...\n"+unRead+" unread messages.\n"+read+" read messages.");
		
		
		
	}

}
