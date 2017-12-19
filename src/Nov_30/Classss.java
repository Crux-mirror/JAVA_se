package Nov_30;

public class Classss {
    public static void main(String[] args)  {
        Outter.Inner inner = new Outter.Inner();
    }
}
 
class Outter {
	 static int a = 2;
    public Outter() {
         
    }

    private static void aa(){
    	System.out.println(a);
    }
     
    static class Inner{
    	public Inner(){
    		aa();
    	}
    	
    }
    
}