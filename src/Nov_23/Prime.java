package Nov_23;
/**
 * �����е����ز��Ҵ�ӡ����
 * @author PC
 *
 */
public class Prime {
	static int num = 0;

	public static void main(String[] args) {

		Prime prime = new Prime();
		prime.is_prime(101, 200);
		System.out.println("101��200֮���ȫ��������"+num);

	}

	public void is_prime(int begin, int end) {

		for (; begin <= end; begin++) {
			for (int j = 2,i =(int) (Math.sqrt(begin)+1); j<=i; j++) {
				if (begin % j == 0)
					break;
				if (j == i ) {
			System.out.print(begin + " \t");
					num++;
					if (num % 6 == 0) {
						System.out.println("java\u2122");
					}
				}

			}
			if (begin==end) {
				System.out.println(" ");
			}
		}
	}
}
