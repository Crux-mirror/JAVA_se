package Dec_12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.plaf.ButtonUI;

/**
 * @author 30
 * @version 创建时间：2017年12月17日 下午10:40:31
 * 类说明
 */
public class Button_2 extends Applet implements ActionListener{

	String msg = "";
	Button yes,no,undefind;
	
	public void init() {
		yes = new Button("yes");
		no = new Button("no");
		undefind = new Button("undefind");
		
		add(yes);
		add(no);
		add(undefind);
		
		yes.addActionListener(this);
		no.addActionListener(this);
		undefind.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String string = e.getActionCommand();
		if(string.equals("yes")){
			msg = "您选择了yes";
		}else if(string.equals("no")){
			msg = "您选择了no";
		}else{
			msg = "您选择了undefined";
		}
		repaint();
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, 6, 100);
	}
	
}	
