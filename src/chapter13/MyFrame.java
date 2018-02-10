package chapter13;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		new MyFrame();
	}
	public void hh(){
		System.out.println(MyFrame.this);
	}
	public MyFrame(){
		Container container=getContentPane();
		container.setLayout(null);
		JLabel jl=new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton jb=new JButton("弹出对话框");
		jb.setBounds(10,10,100,21);
		jb.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyJDialog(MyFrame.this).setVisible(true);
			}
		});
		
		container.add(jb);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(300,300);
	}
}

class MyJDialog extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyJDialog(MyFrame frame){
		super(frame,"第一JDialog窗体",true);
		Container container=getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setBounds(120,120,200,200);
	}
}