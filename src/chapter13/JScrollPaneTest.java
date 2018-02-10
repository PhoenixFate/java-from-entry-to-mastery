package chapter13;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JScrollPaneTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JScrollPaneTest(){
		Container container=getContentPane();
		JTextArea ta=new JTextArea(20,5);
		JScrollPane sp=new JScrollPane(ta);
		container.add(sp);
		setTitle("带滚动条的文字编辑器");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JScrollPaneTest();
	}
}
