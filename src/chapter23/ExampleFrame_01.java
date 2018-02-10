package chapter23;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

public class ExampleFrame_01 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		new ExampleFrame_01().setVisible(true);
	}
	public ExampleFrame_01(){
		setTitle("分割面板");
		setBounds(100,100,500,375);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JSplitPane splitPane=new JSplitPane();
		splitPane.setDividerLocation(40);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		splitPane.setLeftComponent(new JLabel("1"));
		JSplitPane vSplitPane=new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		vSplitPane.setDividerLocation(30);
		vSplitPane.setDividerSize(8);
		vSplitPane.setOneTouchExpandable(true);
		vSplitPane.setContinuousLayout(true);
		splitPane.setRightComponent(vSplitPane);
		vSplitPane.setLeftComponent(new JLabel("2"));
		vSplitPane.setRightComponent(new JLabel("3"));
		
	}
}
