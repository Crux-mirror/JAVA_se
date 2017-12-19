package Dec_5;

import java.awt.print.Printable;

public interface Jiekou {
	//接口里定义的成员变量只能是常量
    int MAX_CACHE_LINE = 50;
    //接口里定义的普通方法只能是public的抽象方法
    void out();
    void getData(String msg);
    //在接口里定义默认方法，需要使用default修饰

    
}
