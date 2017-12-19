package Dec_4;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class Final_var {
	private final int i=0;
	public static void main(String[] args) {
		//i = 1;
		//不能对final修饰的变量赋值，报错
		final Object object = new Object();
	//	object = new Object();
	}
}
