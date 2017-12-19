package Dec_4;


public class Static_1 {
	public static void main(String[] args) {
	Static_2 p1 = new Static_2("张三",25,"中国") ;
	Static_2 p2 = new Static_2("李四",30,"中国") ;
	Static_2 p3 = new Static_2("王五",35,"中国") ;
	 System.out.println(p1.talk()) ;
	 System.out.println(p2.talk()) ;
	 System.out.println(p3.talk()) ;
	 }

}
class Static_2 {
	String name;
	 String city ;
	 int age ;
	 public Static_2(String name,int age, String city)
	 {
	 this.name = name ;
	 this.city = city ;
	 this.age = age ;
	}
	 public String talk()
	{
	 return "我是： "+this.name+"，今年： "+this.age+"岁，来自： "+this.city;
	}
 }
