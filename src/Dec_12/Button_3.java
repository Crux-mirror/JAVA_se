package Dec_12;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author 30
 * @version 创建时间：2017年12月17日 下午11:07:44
 * 类说明
 */
public class Button_3 {
	public static void main(String[] args) {
		SimpleFrames frame = new SimpleFrames();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class SimpleFrames extends JFrame{
	public SimpleFrames() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGH);
		setTitle("Button学习");
		setLocationRelativeTo(null);
		Panels panel = new Panels();
		
		add(panel,BorderLayout.CENTER);
	}
	private final int DEFAULT_WIDTH = 400;
	private final int DEFAULT_HEIGH = 400;
	
	
}

class Panels extends JPanel implements ActionListener{
	
	public Panels() {
		// TODO Auto-generated constructor stub
		JButton button1 = new JButton("yes");
		button1.setBorderPainted(true);
		JButton  button2 = new JButton("no");
		button2.setBorderPainted(true);
		JButton button3 = new JButton("undefind");
		button3.setBorderPainted(true);
		add(button1);
		add(button2);
		add(button3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = "";
		// TODO Auto-generated method stub
		String string = e.getActionCommand();
		if(string.equals("yes")){
			
			msg = "您选择了yes";
		}else if(string.equals("no")){
		
			msg = "您选择了no";
		}else{
			
			msg = "您选择了undefined";
		}
		System.out.println(msg);
		JOptionPane.showMessageDialog(null,msg);
	}
}