package Nov_29;

import java.util.Scanner;

public class Plus {
	
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("输入数字");
	int in = scanner.nextInt();
	System.out.println("输入个数");
	int num = scanner.nextInt();
	
	Plus plu = new Plus();
	int zhi = plu.plus(in, num);
	System.out.println(zhi);
	
}

private int plus(int in,int num){
	int sum = 0;
	while(num>=1){
		sum += plss(in, num);
		num--;
	}
	return sum;
}
public int  plss(int in,int num) {
	int sum = 0;
	while(num>1){
		sum += in*Math.pow(10, num-1);
		num--;
	}
	if(num == 1){
		sum += in;
	}
	return sum;
	
	
}

}
