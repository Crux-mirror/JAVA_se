package Nov_24;

public class Prime {
	public static int sum = 0;
	public static void main(String[] args) {
		
		isprime(101,200);
		System.out.println("素数总共为："+sum+"个");
	}
	
	private static void isprime(int begin,int end){
		for(;begin<=end;begin++)
			for(int i=2;i<=(int)(Math.sqrt(begin)+1);i++){
				if(begin%i == 0)
					break;
				if(i==(int)(Math.sqrt(begin)+1)){
					System.out.print(begin+"	");
					sum++;
					if(sum%6 == 0)
					{	
						System.out.println("");
					}
				}
			}
		
	}
	
	
}
