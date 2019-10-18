import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ballgame2 extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100; //小球的横坐标
	double y = 100; //小球的纵坐标
	
	double degree = 3.14/3; //弧度60
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x,(int)y , null);
		
		x = x + 10*Math.cos(degree);
		y = y + 10*Math.sin(degree);
		
		if(y>500-40-30||y<40+40) {
			degree = - degree;
		}
		
		//碰到左右边界
		if(x<40||x>856-40-30) {
			degree = 3.14 - degree;
		}
		
	}
	
	//窗口加载
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//重画窗口每秒25次
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

	//程序执行的入口
	public static void main(String[] args) {
		Ballgame2 game = new Ballgame2();
		game.launchFrame();
	}
}