package chapter21;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.JTableHeader;

public class ExampleFrame_02 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExampleFrame_02(){
		setTitle("创建不可滚动的表格");
		setBounds(100,100,240,150);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Vector<String> columnNames=new Vector<String>();
		columnNames.add("A");
		columnNames.add("B");
		Vector<Vector<String>> rowData=new Vector<Vector<String>>();
		for(int row=1;row<6;row++){
			Vector<String> rowValue=new Vector<String>();
			rowValue.add("A"+row);
			rowValue.add("B"+row);
			rowData.add(rowValue);
		}
		JTable table=new JTable(rowData,columnNames);
		getContentPane().add(table, BorderLayout.CENTER);
		JTableHeader tableHeader=table.getTableHeader();
		getContentPane().add(tableHeader,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		new ExampleFrame_02().setVisible(true);
	}
}
