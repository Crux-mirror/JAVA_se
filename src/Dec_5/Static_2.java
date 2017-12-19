package Dec_5;

public class Static_2 {
	//静态方法
	private static String str1 ="staticProperty";
	private String str2 = "property";
	 public Static_2() {
		// TODO Auto-generated constructor stub
	}
	
	 private void print1(){
		 System.out.println(str1);
		 System.out.println(str1);
		 print2();
	 }
	 public static void print2(){
		 System.out.println(str1);
		 System.out.println(str2);
		 print1();
	 }
}
