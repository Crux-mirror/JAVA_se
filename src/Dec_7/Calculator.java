package Dec_7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.*;

/**
 * @author 30
 * @version 创建时间：2017年12月11日 下午3:11:13
 * 类说明
 */
public class Calculator {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				CalculatorFrame frame = new CalculatorFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

