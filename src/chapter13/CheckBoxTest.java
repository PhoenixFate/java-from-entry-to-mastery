package chapter13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class CheckBoxTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CheckBoxTest(){
		setSize(200,200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container container=getContentPane();
		container.setLayout(new BorderLayout());
		JPanel panel=new JPanel();
		JTextArea textArea=new JTextArea(5,10);
		JScrollPane scrollPane=new JScrollPane(textArea);
		panel.add(scrollPane);
		container.add(panel,BorderLayout.NORTH);
		JPanel panel2=new JPanel();
		container.add(panel2,BorderLayout.SOUTH);
		JCheckBox checkBox1=new JCheckBox("复选框1");
		panel2.add(checkBox1);
		checkBox1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("复选框1被选中\n");
			}
		});
		JCheckBox checkBox2=new JCheckBox("复选框2");
		panel2.add(checkBox2	);
		checkBox2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("复选框2被选中\n");
			}
		});
		JCheckBox checkBox3=new JCheckBox("复选框3");
		panel2.add(checkBox3);
		checkBox3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("复选框3被选中\n");
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxTest();
	}
}
