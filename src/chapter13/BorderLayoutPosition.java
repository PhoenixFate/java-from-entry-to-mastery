package chapter13;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BorderLayoutPosition {
	public static void main(String[] args) {
		String[]border={BorderLayout.CENTER,BorderLayout.NORTH,
				BorderLayout.SOUTH,BorderLayout.EAST,BorderLayout.WEST};
		String[] buttonName={"center button","north button","south button",
				"east button","west button"};
		JFrame jf=new JFrame();
		jf.setTitle("这个窗体使用边界布局管理器");
		Container container=jf.getContentPane();
		jf.setLayout(new BorderLayout());
		for(int i=0;i<border.length;i++){
			//container.add(border[i],new JButton(buttonName[i]));
			container.add(new JButton(buttonName[i]),border[i]);
		}
		jf.setSize(350,200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
