package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayoutPosition {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setTitle("本窗体使用流布局管理器");
		Container container=jf.getContentPane();
		jf.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
		for(int i=0;i<10;i++){
			container.add(new JButton("button"+i));
		}
		jf.setSize(300,200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
}	
