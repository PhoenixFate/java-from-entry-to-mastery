package chapter21;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class ExampleFrame_03 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExampleFrame_03(){
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
		for(int row=0;row<21;row++){
			Vector<String> rowValue=new Vector<String>();
			for(int column=0;column<columnNames.size();column++){
				rowValue.add(Names[column]+row);
			}
			rowData.add(rowValue	);
		}
		JTable table=new MTable(rowData,columnNames);
		
		//关闭表格列的自动调整功能
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//选择模式为单选
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//被选择行的背景色为黄色
		table.setSelectionBackground(Color.yellow);
		
		//被选择行的前景色(文件颜色)为红色
		table.setSelectionForeground(Color.RED);
		
		table.setRowHeight(30);
		scrollPane.setViewportView(table);
	}
	
	private class MTable extends JTable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public MTable(Vector<Vector<String>> rowData,Vector<String>columnNames){
			super(rowData,columnNames);
		}
		@Override
		public JTableHeader getTableHeader() {
			JTableHeader tableHeader=super.getTableHeader();
			tableHeader.setReorderingAllowed(false);
			DefaultTableCellRenderer dtcr=(DefaultTableCellRenderer)tableHeader.getDefaultRenderer();
			dtcr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
			return tableHeader;
		}
		@Override
		public TableCellRenderer getDefaultRenderer(Class<?> columnClass) {
			DefaultTableCellRenderer dtcr=(DefaultTableCellRenderer)super.getDefaultRenderer(columnClass);
			dtcr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
			return super.getDefaultRenderer(columnClass);
		}
		@Override
		public boolean isCellEditable(int row, int column) {
			
			return false;
		}
	}
	public static void main(String[] args) {
		ExampleFrame_03 frame=new ExampleFrame_03();
		frame.setVisible(true);
	}
}
