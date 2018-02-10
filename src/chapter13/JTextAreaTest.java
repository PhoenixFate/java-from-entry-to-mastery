package chapter13;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JTextAreaTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTextAreaTest(){
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container container=getContentPane();
		JTextArea textArea=new JTextArea("文本域",6,6);
		container.add(textArea);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
}
