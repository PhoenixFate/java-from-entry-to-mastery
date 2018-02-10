package chapter13;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridLayoutPosition {
	public static void main(String[] args) {
		JFrame jf=new JFrame("这个窗体使用网格布局管理器");
		Container container=jf.getContentPane();
		jf.setLayout(new GridLayout(7,3,5,5));
		for(int i=0;i<20;i++){
			container.add(new JButton("button"+i));
		}
		jf.setSize(300, 300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
