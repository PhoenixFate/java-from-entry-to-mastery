package chapter13;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class DialogTest {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setTitle("JFrame");
		jf.setBounds(20,20,300,300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container container=jf.getContentPane();
		container.setLayout(new GridLayout(2,1));
		JLabel jl=new JLabel("这是一个JFrame窗体");
		container.add(jl);
		JButton jb=new JButton("弹出对话框");
		jb.setBounds(200, 50, 100, 21);
		jb.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog jd=new JDialog(jf,"JDialog",true);
				jd.setBounds(120, 120, 100, 100);
				jd.getContentPane().add(new JLabel("这是一个对话框"));
				jd.setVisible(true);
			}
		});
		container.add(jb);
		jf.setVisible(true);
	}
}
