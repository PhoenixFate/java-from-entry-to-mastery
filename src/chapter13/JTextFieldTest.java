package chapter13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JTextFieldTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JTextFieldTest(){
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Container container=getContentPane();
		JTextField textField=new JTextField("aaa",20);
		JButton button=new JButton();
		container.add(textField,BorderLayout.NORTH);
		container.add(button,BorderLayout.SOUTH);
		textField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("触发事件");
			}
		});
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.requestFocus();
			}
		});
	}
	public static void main(String[] args) {
		new JTextFieldTest();
	}
}
