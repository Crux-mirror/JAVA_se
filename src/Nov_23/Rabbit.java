package  Nov_23;

import java.util.Scanner;


/**
 * 
 * @author PC
 *
 */
public class Rabbit {
	static int total_rabbits = 1; 

	public static void main(String[] args) throws InterruptedException {
		int now_month;
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		while (scanner.hasNext()) {			
			now_month = scanner.nextInt();
			if (now_month == 0) {
				scanner.close();
				System.exit(0);
			}
			New_rabbit rabbits = new New_rabbit(1, now_month);
			rabbits.start();
			System.out.println("");
			Thread.sleep(200);
			System.out.println(""+ total_rabbits);
			total_rabbits = 1;
			System.out.println("");
		}

	}

}
