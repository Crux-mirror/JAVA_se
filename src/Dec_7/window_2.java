package Dec_7;

import java.awt.*;

import javax.swing.*;

/**
 * 
 * @author 30
 *
 */
public class window_2 {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SizeFrame frame = new SizeFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

class SizeFrame extends JFrame{
	public SizeFrame(){
		Toolkit kiToolkit  = Toolkit.getDefaultToolkit();
		Dimension screenSize = kiToolkit.getScreenSize();
		
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		setSize(screenWidth/2, screenHeight/2);
		setLocationByPlatform(true);
		ImageIcon img = new ImageIcon(getClass().getResource("a.png"));
		setIconImage(img.getImage());
		setTitle("SizeFrame");
	}
}