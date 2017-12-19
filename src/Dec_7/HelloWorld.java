package Dec_7;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.*;
/**
 * @author 30
 * @version 创建时间：2017年12月11日 上午11:25:07
 * 类说明
 */
public class HelloWorld {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Hello frame = new Hello();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class Hello extends JFrame{
	public Hello(){
		setTitle("Hello world");
		setSize(200,300);
		Hellopanel panel = new Hellopanel();
		add(panel);
	}
}

class Hellopanel extends JPanel{
	public void  paintComponent(Graphics g) {
		g.drawString("Hello world", 75, 100);
	}
}