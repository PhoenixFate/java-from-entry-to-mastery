package chapter21;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class ExampleFrame_01 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ExampleFrame_01(){
		setTitle("创建可以滚动的表格");
		setBounds(100,100,240,150);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		String[] columnNames={"A","B"};
		String[][]tableValues={{"A1","B1"},{"A2","B2"},{"A3","B3"},{"A4","B4"},{"A5","B5"}};
		JTable table=new JTable(tableValues,columnNames);
		JScrollPane scrollPane=new JScrollPane(table);
		getContentPane().add(scrollPane,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		new ExampleFrame_01().setVisible(true);;
	}
}
