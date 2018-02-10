package chapter13;

import java.awt.Container;
import java.awt.FlowLayout;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class JComboBoxTest {
	public static void main(String[] args) {
		String[] list={"身份证","军人证","学生证","工作证"};
		JComboBox<String> comboBox=new JComboBox<String>(list);
		JFrame jf=new JFrame();
		Container container=jf.getContentPane();
		jf.setSize(200,300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel jl=new JLabel("请选择证件:");
		container.setLayout(new FlowLayout(SwingConstants.CENTER,10,10));
		container.add(jl);
		container.add(comboBox);
		jf.setVisible(true);
	}
}


