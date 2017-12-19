package Dec_7;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
/**
 * @version 
 * @author 30
 *
 */
public class Window_1 {
	public static void main(String[] args) {
		SimpleFrame frame = new SimpleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.setVisible(true);
	}
}

class SimpleFrame extends JFrame{
	public SimpleFrame() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGH);
		setIconImage(img);
	}
	Toolkit kiToolkit = Toolkit.getDefaultToolkit();
	Dimension screen = kiToolkit.getScreenSize();
	ImageIcon icon = new ImageIcon("b.png");
	Image img = kiToolkit.getImage("a.png");
	
	public  final int DEFAULT_WIDTH = screen.width/2;
	public  final int DEFAULT_HEIGH = screen.height/2;
}
