package Dec_22;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author 30
 * @version 创建时间：2017年12月22日 下午2:56:44
 * 类说明
 */
public class ComboxButton_1 extends JFrame{
	 public ComboxButton_1(){  
        this.setTitle("复选按钮的使用");  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setBounds(100, 100, 250, 100);  
        JPanel contentPane=new JPanel();  
        contentPane.setBorder(new EmptyBorder(5,5,5,5));  
        this.setContentPane(contentPane);  
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));  
        JCheckBox checkBox1=new JCheckBox("Java");  
        JCheckBox checkBox2=new JCheckBox("PHP",true);  
        JCheckBox checkBox3=new JCheckBox("C++");  
        contentPane.add(checkBox1);  
        contentPane.add(checkBox2);  
        contentPane.add(checkBox3);  
        this.setVisible(true);  
     }  
     public static void main(String[]args){  
    	 ComboxButton_1 example=new ComboxButton_1();  
     }  
}
