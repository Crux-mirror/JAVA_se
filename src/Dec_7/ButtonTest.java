package Dec_7;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
/**
 * @author 30
 * @version 创建时间：2017年12月11日 下午2:15:32
 * 类说明
 */
public class ButtonTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				ButtonFrame frame = new ButtonFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class ButtonFrame extends JFrame{
	public ButtonFrame() {
		setTitle("ButtonTest");
		setSize(DEFAULT_WIDTH,DEFAULT_WEIGHT);
		
		JButton yellowButton = new JButton("yellow");
		JButton bluButton = new JButton("Blue");
		JButton redButton = new JButton("red");
		
		buttonPanel = new JPanel();
		
		buttonPanel.add(yellowButton);
		buttonPanel.add(bluButton);
		buttonPanel.add(redButton);
		
		add(buttonPanel);
		
		ColorAction yellowAction = new ColorAction(Color.YELLOW);
		ColorAction bluAction = new ColorAction(Color.BLUE);
		ColorAction redAction = new ColorAction(Color.RED);
		
		yellowButton.addActionListener(yellowAction);
		bluButton.addActionListener(bluAction);
		redButton.addActionListener(redAction);
	}


private class ColorAction implements ActionListener{
	
	private Color backgroundColor;
	public ColorAction(Color c){
		backgroundColor = c;
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	buttonPanel.setBackground(backgroundColor);
		
	}
}
	private JPanel buttonPanel;
	public static  int DEFAULT_WIDTH = 300;
	public static  int DEFAULT_WEIGHT = 200;

}