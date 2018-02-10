package chapter13;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AbsolutePosition{
	
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setTitle("本窗体使用绝对布局");
		jf.setLayout(null);//使该窗体取消布局管理器设置
		jf.setBounds(200, 0, 200, 150);
		Container container=jf.getContentPane();
		JButton jb=new JButton("按钮1");
		JButton jb2=new JButton("按钮2");
		jb.setBounds(10, 30, 80, 30);
		jb2.setBounds(60, 70, 100, 20);
		container.add(jb);
		container.add(jb2);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
}
