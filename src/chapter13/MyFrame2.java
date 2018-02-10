package chapter13;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyFrame2 {
	public static void main(String[] args) {
		JFrame jf=new JFrame("这是一个JFrame窗体");
		jf.setVisible(true);
		jf.setSize(200,300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE	);
		Container container=jf.getContentPane();
		container.setLayout(null);
		JLabel jl=new JLabel("JLabel");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton jb=new JButton("弹出对话框");
		jb.setBounds(10, 10, 100, 21);
		jb.addActionListener(new Listener(jf));
		container.add(jb);
		
	}
}

class Listener implements ActionListener{
	JDialog jd;
	Listener(Frame frame){
		jd=new JDialog(frame,"第一个JDialog窗体",true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {  
		Container container=jd.getContentPane();
		jd.setBounds(120,120,100,100);
		container.add(new JLabel("这是一个对话框"));
		jd.setVisible(true);
	}
	
}
