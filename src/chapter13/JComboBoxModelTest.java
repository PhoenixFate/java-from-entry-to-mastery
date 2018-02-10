package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JComboBoxModelTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<String> jc=new JComboBox<String>(new MyComboBox());
	JLabel jl=new JLabel("请选择证件：");
	public JComboBoxModelTest(){
		Container container=getContentPane();
		container.setLayout(new FlowLayout());
		container.add(jl);
		container.add(jc);
		setBounds(50,50,300,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {
		new JComboBoxModelTest().setVisible(true);
	}
}
class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String selectedItem=null;
	String[]test={"身份证	","军人证","学生证","工作证"};
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return test.length;
	}
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return test[index];
	}
	@Override
	public void setSelectedItem(Object anItem) {
		selectedItem=(String)anItem;
	}
	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return selectedItem;
	}
	
	
}
