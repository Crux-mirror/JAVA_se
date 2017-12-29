package Dec_22;




import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


/**
 * @author 30
 * @version 创建时间：2017年12月22日 下午2:40:42
 * 类说明
 */
public class RadioButton_2 {
	
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
			setTitle("单选框学习");
			setLocationRelativeTo(null);
			
			JPanel panel = new JPanel();
			JRadioButton r1 = new JRadioButton("重庆");
			JRadioButton r2 = new JRadioButton("北京");
			JRadioButton r3 = new JRadioButton("上海");
			panel.setBorder(BorderFactory.createTitledBorder("choose a city"));
			
			panel.add(r1);
			panel.add(r2);
			panel.add(r3);
			ButtonGroup group=new ButtonGroup();  
			group.add(r1);
			group.add(r2);
			group.add(r3);
			add(panel);
			pack();
		}
		
		private final int DEFAULT_WIDTH = 400;
		private final int DEFAULT_HEIGH = 400;
	}