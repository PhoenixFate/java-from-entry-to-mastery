package chapter13;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JPanelTest {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setTitle("窗体");
		Container container=jf.getContentPane();
		container.setLayout(new GridLayout(2,1,10,10));
		JPanel jp1=new JPanel(new GridLayout(1,3,10,10));
		JPanel jp2=new JPanel(new GridLayout(1,2,10,10));
		JPanel jp3=new JPanel(new GridLayout(1,2,10,10));
		JPanel jp4=new JPanel(new GridLayout(2,1,10,10));
		jp1.add(new JButton("1"));
		jp1.add(new JButton("2"));
		jp1.add(new JButton("3"));
//		jp1.add(new JButton("jj"));
		jp2.add(new JButton("4"));
		jp2.add(new JButton("5"));
		jp3.add(new JButton("6"));
		jp3.add(new JButton("7"));
		jp4.add(new JButton("8"));
		jp4.add(new JButton("9"));
		
		container.add(jp1);
		container.add(jp2);
		container.add(jp3);
		container.add(jp4);
		jf.setSize(300,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
