package Dec_5;

import org.omg.CORBA.portable.ValueBase;

public class Static_3 {
	public static int value = 33;
	public static void main(String[] args) {
		new Static_3().print1();
	}
	
	private void print1(){
		int value = 3;
		System.out.println(this.value);
	}
}
