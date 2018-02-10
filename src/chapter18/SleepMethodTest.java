package chapter18;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SleepMethodTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread t;
	private static Color[]color={Color.black ,Color.blue,Color.CYAN,Color.GREEN,Color.orange,Color.yellow,Color.red,Color.GRAY};
	private static final Random rand=new Random();
	private static Color getC(){
		return color[rand.nextInt(color.length)];
	}
	
	public SleepMethodTest(){
		t=new Thread(new Runnable(){
			int x=30;
			int y=50;
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Graphics graphics=getGraphics();
					graphics.setColor(getC());
					graphics.drawLine(x, y, 100,y++);
					if(y>80){
						y=50;
					}
				}
			}	
		});
		t.start();
	}
	public static void main(String[] args) {
		init(new SleepMethodTest(),200,200);
	}
	public static void init(JFrame jframe,int width,int height){
		jframe.setBounds(100, 100, width, height);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
}
