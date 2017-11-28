package Nov_24;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Morra {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		while(true){
			System.out.println("请出拳：剪刀1-石头2-布3：" );
			int temp = (int)(Math.random()*3+1);
			int me = inputScanner.nextInt();
			if(temp -me == 0){
				System.out.println("平手！"+temp);
			}
			if(temp - me == 2 || me - temp == 1){
				System.out.println("你赢了！"+temp);
			}
			if(temp - me == 1 || temp -me == -2){
				System.out.println("你输了！"+temp);
			}
			
		
		}
		}
}
