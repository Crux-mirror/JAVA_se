package Dec_8;


/**
 * @author 30
 * @version 创建时间：2017年12月8日 下午3:19:32
 * 泛型类
 */
public class Generic_class {
	public static void main(String[] args) throws ClassNotFoundException {  
		Pair<Integer> pair = new Pair<Integer>(12,34); 
		System.out.println(pair.getA());
		pair.setA(23);
		System.out.println(pair.getA());
		
	}  

}

