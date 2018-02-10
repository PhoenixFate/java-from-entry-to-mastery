package chapter21;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class ExampleFrame_04 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ExampleFrame_04(){
		setTitle("自定义表格");
		setBounds(100,100,200,200);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JScrollPane scrollPane=new JScrollPane();
		getContentPane().add(scrollPane);
		String[] Names={"A","B","C","D","E","F"};
		Vector<String> columnNames=new Vector<String>();
		for(int column=0;column<Names.length;column++){
			columnNames.add(Names[column]);
		}
		Vector<Vector<String>>rowData=new Vector<Vector<String>>();
		for(int row=1;row<21;row++){
			Vector<String> rowValue=new Vector<String>();
			for(int column=0;column<columnNames.size();column++){
				rowValue.add(Names[column]+row);
			}
			rowData.add(rowValue	);
		}
		JTable table=new JTable(rowData,columnNames);
		table.setRowSelectionInterval(1, 3);
		table.addRowSelectionInterval(5, 5);
		scrollPane.setViewportView(table);
		JPanel buttonPanel=new JPanel();
		getContentPane().add(buttonPanel,BorderLayout.SOUTH);
		JButton selectAllButton=new JButton("全部选择");
		selectAllButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				table.selectAll();
			}
		});
		buttonPanel.add(selectAllButton);
		JButton clearSelectionButton=new JButton("取消选择");
		clearSelectionButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				table.clearSelection();
			}
		});
		buttonPanel.add(clearSelectionButton);
		System.out.println("表格共有"+table.getRowCount()+"行"+table.getColumnCount()+"列");
		System.out.println("共有"+table.getSelectedRowCount()+"行被选中");
		System.out.println("第3行的选择状态为："+table.isRowSelected(2));
		System.out.println("第5行的选择状态为："+table.isRowSelected(4));
		System.out.println("被选中的第一行索引是："+table.getSelectedRow());
		int[]selectedRows=table.getSelectedRows();
		System.out.println("所有被选中的行的索引是:");
		for(int row=0;row<selectedRows.length;row++){
			System.out.println(selectedRows[row]+" ");
		}
		System.out.println();
		System.out.println("列移动前第2列的名称是："+table.getColumnName(1));
		System.out.println("列移动前第2行第2列的值是:"+table.getValueAt(1, 1));
		table.moveColumn(1, 5);
		System.out.println("列移动后第2列的名称是："+table.getColumnName(1));
		System.out.println("列移动后第2列第2行的值是："+table.getValueAt(1, 1));
	}
	public static void main(String[] args) {
		ExampleFrame_04 frame=new ExampleFrame_04();
		frame.setVisible(true);
	}
}
