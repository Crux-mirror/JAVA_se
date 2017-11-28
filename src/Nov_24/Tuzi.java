package Nov_24;

import javax.jws.Oneway;

/**
 * 
 *@author Mirror
 *
 */
public class Tuzi{
	public static void main(String[] args) {
		//兔子对数分为3种，大于等于3个月的，2个月的，1个月的
		//>3月时，1月的+1
		int sum = 0;
		Rabbit rabbit = new Rabbit();
		int month = 10;
		for(int i=1;i<=month;i++){
			sum = rabbit.getOne()+rabbit.getTwo()+rabbit.getThree();
			rabbit.setThree(rabbit.getThree()+rabbit.getTwo());
			rabbit.setTwo(rabbit.getOne());
			rabbit.setOne(rabbit.getThree());
			//sum = rabbit.getOne()+rabbit.getTwo()+rabbit.getThree();
			System.out.println("第"+i+"个月的兔子对数为："+sum);
		
	}
	
	
}
}

class Rabbit {
	private int  three = 0;
	private int two = 0;
	private int one = 1;
	
	/**
	 * @return the three
	 */
	public int getThree() {
		return three;
	}
	/**
	 * @param three the three to set
	 */
	public void setThree(int three) {
		this.three = three;
	}
	/**
	 * @return the two
	 */
	public int getTwo() {
		return two;
	}
	/**
	 * @param two the two to set
	 */
	public void setTwo(int two) {
		this.two = two;
	}
	/**
	 * @return the one
	 */
	public int getOne() {
		return one;
	}
	/**
	 * @param one the one to set
	 */
	public void setOne(int one) {
		this.one = one;
	}

}

