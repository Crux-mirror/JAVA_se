package Dec_7;

import javax.swing.JFrame;

/**
 * @author 30
 * @version 创建时间：2017年12月11日 下午3:12:34
 * 类说明
 */
public class CalculatorFrame extends JFrame{
	public CalculatorFrame() {
		
		setTitle("Calculator");
		CalculatorPanel panel = new CalculatorPanel();
		add(panel);
		pack();
	}
}
