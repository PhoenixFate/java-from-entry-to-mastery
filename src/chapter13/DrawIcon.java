package chapter13;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
public class DrawIcon implements Icon{
	private int width;
	private int height;
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		g.fillOval(x, y, width, height);
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}
	
	public DrawIcon(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public static void main(String[] args) {
		DrawIcon icon=new DrawIcon(15,15);
		JLabel jl=new JLabel("测试",icon,SwingConstants.CENTER);
		JFrame jf=new JFrame("");
		Container c=jf.getContentPane();
		c.add(jl	);
		jf.setVisible(true);
		jf.setSize(200, 300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
}
