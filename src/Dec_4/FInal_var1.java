package Dec_4;

public class FInal_var1 {

    public static void main(String[] args)  { 
        String a = "hello2";   
        final String b = getHello(); 
        String c = b + 2;   
        System.out.println((a == c)); 
  
    } 
      
    public static String getHello() { 
        return "hello"; 
    } 
}
