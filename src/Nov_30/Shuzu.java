package Nov_30;

import java.util.Arrays;

public class Shuzu {
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int [] b = a;
		 System.out.println(Arrays.toString(b));
		 System.out.println(a);
		 System.out.println(b);
		 a[0] = 3;
		 System.out.println(Arrays.toString(b));
	}
}
