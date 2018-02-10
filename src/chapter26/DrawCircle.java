package chapter26;



import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DrawCircle extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setSize(200, 200);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setContentPane(new DrawPanel());
		jf.setVisible(true);
	}
}
class DrawPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void paint(Graphics g){
		g.setColor(Color.RED	);
		g.drawOval(10, 10, 80, 80);
	}
}
