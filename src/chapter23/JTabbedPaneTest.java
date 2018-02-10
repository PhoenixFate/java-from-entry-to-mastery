package chapter23;

import java.awt.BorderLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JTabbedPaneTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new JTabbedPaneTest().setVisible(true);
	}

	public JTabbedPaneTest() {
		super();
		setBounds(100,100,300,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JTabbedPane tabbedPane=new JTabbedPane();
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				int selectedIndex=tabbedPane.getSelectedIndex();
				System.out.println("selectedIndex:"+selectedIndex);
				String title=tabbedPane.getTitleAt(selectedIndex);
				System.out.println("title:"+title);
			}
			
		});
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		URL resource=JTabbedPaneTest.class.getResource("tab.jpg");
		ImageIcon imageIcon=new ImageIcon(resource);
		JLabel labelA=new JLabel();
		labelA.setText("选项卡A");
		tabbedPane.addTab("选项卡A",imageIcon,labelA,"点击查看选项卡A");
		JLabel labelB=new JLabel();
		labelB.setText("选项卡B");
		tabbedPane.addTab("选项卡B", imageIcon,labelB,"点击查看选项卡B");
		JLabel labelC=new JLabel();
		labelC.setText("选项卡C");
		tabbedPane.addTab("选项卡C", imageIcon,labelC,"点击查看选项卡C");
		tabbedPane.setSelectedIndex(2);
		tabbedPane.setEnabledAt(0,false);
	}
	
}	
