package Nov_24;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);//所有控制台输入？
		System.out.println("请输入字符串：");
		while(true){
			String line = s.nextLine();
			if(line.equals("exit")) break;
			System.out.println(">>>"+line);
		}
	}

}
