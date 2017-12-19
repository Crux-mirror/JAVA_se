package Dec_8;

import Nov_23.exercise_1.FirstSample;

/**
 * @author 30
 * @version 创建时间：2017年12月8日 下午3:22:30
 * 类说明
 */
public class Pair<T> {
	
	private T a;
	
	
	
	private T b;
	
	public Pair(){a = null; b = null;}
	public Pair(T a,T b){this.a = a;this.b = b;}

	public T getB() {
		return b;
	}
	public T getA() {
		return a;
	}

	
	public void setB(T b) {
		this.b = b;
	}
	public void setA(T a) {
		this.a = a;
	}

}

