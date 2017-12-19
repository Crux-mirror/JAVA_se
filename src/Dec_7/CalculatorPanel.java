package Dec_7;

import java.awt.BorderLayout;
import java.awt.DisplayMode;
import java.awt.Event;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.xml.stream.events.StartDocument;

/**
 * @author 30
 * @version 创建时间：2017年12月11日 下午3:13:14
 * 类说明
 */
public class CalculatorPanel extends JPanel{
	public CalculatorPanel() {
		setLayout(new BorderLayout());
		result = 0;
		lastCommand = "=";
		start = true;
		
		display = new JButton("0");
		display.setEnabled(false);
		add(display,BorderLayout.NORTH);
		
		ActionListener insert = new InserAction();
		ActionListener command = new CommandAction();
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,4));
		
		addButton("7",insert);
		addButton("8",insert);
		addButton("9",insert);
		addButton("/",insert);
		addButton("4",insert);
		addButton("5",insert);
		addButton("6",insert);
		addButton("*",insert);
		addButton("1",insert);
		addButton("2",insert);
		addButton("3",insert);
		addButton("-",insert);
		addButton("0",insert);
		addButton(".",insert);
		addButton("=",insert);
		addButton("+",insert);
		
		add(panel,BorderLayout.CENTER);
		
	}
	
	/**
	 * 
	 * @time : 2017年12月11日下午3:21:12 
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param lable
	 * @param: @param listener      
	 * @return: void
	 */
	private void addButton(String lable,ActionListener listener){
		JButton button = new JButton(lable);
		button.addActionListener(listener);
		panel.add(button);
	}
	
	private class InserAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			String inputString = event.getActionCommand();
			if(start){
				display.setText("");
				start = false;
			}
			display.setText(display.getText()+inputString);
		}
		
	}
	
	private class CommandAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			String commandString = event.getActionCommand();
			if(start){
				if(commandString.equals("-")){
					display.setText(commandString);
					start = false;
				}else lastCommand = commandString;
			}
			else{
				calculate(Double.parseDouble(display.getText()));
				lastCommand = commandString;
				start = true;
			}
		}
		
	}
		
	public void calculate(double x){
		if(lastCommand.equals("+")) result +=x;
		else if(lastCommand.equals("-")) result -=x;
		else if(lastCommand.equals("*")) result *=x;
		else if(lastCommand.equals("/")) result /=x;
		else if(lastCommand.equals("=")) result =x;
		display.setText(""+result);
	}
	
	private JButton display;
	private JPanel panel;
	private double result;
	private String lastCommand;
	private boolean start;
}
