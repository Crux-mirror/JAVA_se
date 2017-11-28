package Nov_24;

import java.util.ArrayList;
import java.util.List;

public class Acount {
	public static void main(String[] args) {
		acount(7);
	}
	
	public static void  acount(int n) {
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i = 1;i<=n;i++)
		{
		list.add(i);	
		}
		while(list.size()>0){
			for(int j=0;j<2;j++)
			{
				list.add(list.remove(0));
				
			}
			System.out.println(list.remove(0));
		}
}
}
