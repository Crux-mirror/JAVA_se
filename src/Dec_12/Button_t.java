package Dec_12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author 30
 * @version 创建时间：2017年12月12日 上午11:31:34
 * 类说明
 */
public class Button_t {
	public static void main(String[] args) {
		SimpleFrame frame = new SimpleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}


class SimpleFrame extends JFrame{
	public SimpleFrame() {
		// TODO Auto-generated constructor stub
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGH);
		setTitle("Button学习");
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("点击");
		button.setBorderPainted(true);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"对话框");
			}
		});
		panel.add(button);
		add(panel);
	}
	
	private final int DEFAULT_WIDTH = 400;
	private final int DEFAULT_HEIGH = 400;
}