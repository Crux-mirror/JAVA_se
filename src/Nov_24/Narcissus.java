package Nov_24;

import java.awt.geom.GeneralPath;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Narcissus {
	
	public static void main(String[] args) {
		
	narcissus();
		
	}
	
	private static void narcissus() {
		int ge;
		int shi;
		int bai;
		for(int i=100;i<1000;i++){
			ge = i%10;
			shi = i/10%10;
			bai = i/100;
			if((Math.pow(ge, 3)+Math.pow(shi, 3)+Math.pow(bai, 3)) == i)
			{
				System.out.println(i);
			}
		}
	}

}
