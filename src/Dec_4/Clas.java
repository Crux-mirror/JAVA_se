package Dec_4;

public class Clas {
	public static void main(String[] args) {
		//初始化Bean1
		Clas.Bean1 bean1 = new Clas().new Bean1();
		bean1.I++;
		
		//初始化Bean2
		Clas.Bean2 bean2 = new Clas.Bean2();
		bean2.J++;
		
		//初始化Bean3
		Bean3 bean3 = new Bean3();
		bean3.K++;
	}
	class Bean1{
		public int I = 0;
	}
	static class Bean2{
		public int J = 0;
	}
}
class Bean3{
	public int K = 0;
}

