package chapter13;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Example1 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void CreateJFrame(String title){
		JFrame jf=new JFrame(title);
		Container container=jf.getContentPane();
		JLabel jl=new JLabel("这是一个JFrame窗体")	;
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.WHITE);
		jf.setVisible(true);
		jf.setSize(200,150);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		//new Example1().CreateJFrame("创建一个JFrame窗体");
		JFrame jf=new JFrame("JFrame");
		System.out.println(jf);
		Container container=jf.getContentPane();
		System.out.println(container);
		Container container2=new Container();
		System.out.println(container2);
		
		JLabel jl=new JLabel("JLabel");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
//		JLabel jl2=new JLabel("JLabel2");
//		container.add(jl2);
		System.out.println(jl);
		
		jf.setVisible(true);
		jf.setSize(150,200);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//jf.setBackground(Color.green);
		container.setBackground(Color.GREEN);
	}
}
