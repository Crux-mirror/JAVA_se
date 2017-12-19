package Nov_29;

import java.awt.*;
public class BallGanme extends Frame{
	//桌球和桌面图片
	Image ball = Toolkit.getDefaultToolkit().getImage("Image/b.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("Image/a.png");
	//桌球起始位置
	double x =100;
	double y = 100;
	double degree = 3.14/3;
	/**
	 * 绘制一次桌面和桌球
	  */
	public void paint(Graphics g){
		//绘制一次桌面和桌球
		
		System.out.println("窗口被画了一次");
		g.drawImage(desk, 0, 0,null);
	//	g.drawImage(ball, (int)x,(int)y,null);
		
		//桌球下一次位置
		x = x+10*Math.cos(degree);
		y = y+10*Math.sin(degree);
		
		if(y>480-30-40){
				degree = -degree;	
		}
		
		if(x>856-30-40){
			degree = 3.14-degree;
		}
		
		if(x<20+20){
			degree = 3.14-degree;
		}
		
		if(y<20+20){
			degree = -degree;
		}
	}

		/**
		 * 绘制多次桌面和桌球
		 */
	void lanuchFrame(){
		setSize(856,480);
		setLocation(50,50);
		setTitle("测试");
		setVisible(true);
		while(true){
			repaint();
			try{
					Thread.sleep(400);	
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("kaishi ");
		BallGanme bGanme = new BallGanme();
		bGanme.lanuchFrame();
	}
}
