package chapter23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class JMenuTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		new JMenuTest().setVisible(true);
	}
	public JMenuTest(){
		setBounds(100,100,500,500);
		setTitle("创建菜单栏");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JMenuBar menuBar=new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menu=new JMenu("菜单名称1");
		menuBar.add(menu);
		JMenuItem menuItem=new JMenuItem("菜单项名称");
		menuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem menuItem=(JMenuItem)e.getSource();
				System.out.println("您单击的是菜单项："+menuItem.getText());
			}
		});
		menu.add(menuItem);
		
		JMenu sonMenu=new JMenu("子菜单名称");
		menu.add(sonMenu);
		
		JMenuItem sonMenuItem=new JMenuItem("子菜单项名称");
		sonMenu.add(sonMenuItem);
		
		
		//-----------
		JMenu menu2=new JMenu("菜单名称2");
		menuBar.add(menu2);
		JMenuItem menuItem2=new JMenuItem("菜单项名称2");
		menu2.add(menuItem2);
		menuItem2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem menuItem=(JMenuItem)e.getSource();
				System.out.println("您单击的是菜单项："+menuItem.getText());
			}
		});
		JMenu sonMenu2=new JMenu("子菜单名称2");
		menu2.add(sonMenu2);
		JMenuItem sonMenuItem2=new JMenuItem("子菜单项名称2");
		sonMenu2.add(sonMenuItem2);
	}
}	
