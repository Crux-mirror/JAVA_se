package Nov_24;

import java.util.Random;
import java.util.Scanner;

public class Gesses {
	public static void main(String[] args) {
		final int temp = (int)(Math.random() * 100);
		   Scanner inputScanner = new Scanner(System.in);
		   while(true){
			   int i = inputScanner.nextInt();
			   if(i>temp){
				   System.out.println("大了");
			   }else if(i<temp){
				   System.out.println("小了");
			   }else{
				   System.out.println("恭喜答对了"+temp);
				   break;
			   }
		   }
	}
}
