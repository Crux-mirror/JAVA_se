package Dec_4;

public class Final_1 extends A{
	public static void main(String[] args) {
		
	}
	public void getName(){
		
	}
		
}

class A{
	 /**
     * 因为private修饰，子类中不能继承到此方法，因此，子类中的getName方法是重新定义的、
     * 属于子类本身的方法，编译正常
     */
	//private final void getName(){
		
//	}
	/*pblic修饰，子类可以继承到此方法，导致重写了父类的final方法，编译出错
	public final void getName(){
		
	}
	*/
}