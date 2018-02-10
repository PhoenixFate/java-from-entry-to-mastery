package chapter25;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class TableModelEventTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel tableModel;
	private JTextField aTextField;
	private JTextField bTextField;
	public TableModelEventTest(){
		setTitle("表格模型事件事例");
		setBounds(100,100,500,375);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JScrollPane scrollPane=new JScrollPane();
		Container container=getContentPane();
		container.add(scrollPane, BorderLayout.CENTER);
		String[]columnNames={"A","B"};
		String[][]rowData={{"A1","B1"},{"A2","B2"},{"A3","B3"},{"A4","B4"}};
		tableModel=new DefaultTableModel(rowData,columnNames);
		tableModel.addTableModelListener(new TableModelListener(){

			@Override
			public void tableChanged(TableModelEvent e) {
				int type=e.getType();
				int row=e.getFirstRow()+1;
				int column=e.getColumn()+1;
				if(type==TableModelEvent.INSERT){
					System.out.println("此次事件由    插入   行触发");
					System.out.println("此次插入的是第"+row+"行！");
				}else if(type==TableModelEvent.UPDATE){
					System.out.println("此次事件由    修改   行触发");
					System.out.println("此次修改的是第"+row+"行！"+column+"列！");
				}else if(type==TableModelEvent.DELETE){
					System.out.println("此次事件由    删除   行触发");
					System.out.println("此次删除的是第"+row+"行！");
				}else{
					System.out.println("此次事件由   其他原因  触发！");
				}
			}
		});
		table=new JTable(tableModel);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		JPanel panel=new JPanel();
		container.add(panel, BorderLayout.SOUTH);
		JLabel aLabel=new JLabel("A:");
		panel.add(aLabel);
		aTextField=new JTextField(15);
		panel.add(aTextField);
		JLabel bLabel=new JLabel("B:");
		panel.add(bLabel);
		bTextField=new JTextField(15);
		panel.add(bTextField	);
		JButton addButton=new JButton("添加");
		addButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] rowData={aTextField.getText(),bTextField.getText()};
				tableModel.addRow(rowData);
				aTextField.setText(null);
				bTextField.setText(null);
			}
		});
		panel.add(addButton);
		JButton delButton=new JButton("删除");
		delButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				int[]selectedRows=table.getSelectedRows();
				for(int row=0;row<selectedRows.length;row++){
					tableModel.removeRow(selectedRows[row]-row);
				}
			}
			
		});
		panel.add(delButton);
	}
	public static void main(String[] args) {
		new TableModelEventTest().setVisible(true);
	}
}
