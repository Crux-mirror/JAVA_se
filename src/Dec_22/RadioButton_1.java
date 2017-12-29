package Dec_22;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

/**
 * @author 30
 * @version 创建时间：2017年12月22日 下午2:21:32
 * 类说明
 */
public class RadioButton_1 extends JFrame{
	public RadioButton_1(){  
        this.setTitle("单选按钮的使用");  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setBounds(100, 100, 250, 100);  
        JPanel contentPane=new JPanel();  
        contentPane.setBorder(new EmptyBorder(5,5,5,5));  
        this.setContentPane(contentPane);  
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));  
        JRadioButton randioButton1=new JRadioButton("Java");  
        JRadioButton randioButton2=new JRadioButton("PHP",true);  
        JRadioButton randioButton3=new JRadioButton("C++");  
        contentPane.add(randioButton1);  
        contentPane.add(randioButton2);  
        contentPane.add(randioButton3);  
        ButtonGroup group=new ButtonGroup();  
        group.add(randioButton1);  
        group.add(randioButton2);  
        group.add(randioButton3);  
        this.setVisible(true);  
          
    }  
    public static void main(String[]args){  
    	RadioButton_1 example=new RadioButton_1();  
    }  
}