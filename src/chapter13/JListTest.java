package chapter13;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JList;

import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class JListTest {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setTitle("JFrame");
		jf.setBounds(10,10,200,200);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container container=jf.getContentPane();
		container.setLayout(null);
		String contents[]={"大娃","二娃","三娃","四娃","五娃","六娃"};
		JList<String> list=new JList<String>(contents);
		JScrollPane js=new JScrollPane(list);
		js.setBounds(10, 10, 80, 80);
		container.add(js);
		jf.setVisible(true);
	}
}
