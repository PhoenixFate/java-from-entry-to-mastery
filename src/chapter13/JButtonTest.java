package chapter13;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class JButtonTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButtonTest() {
		URL url = JButtonTest.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);
		setLayout(new GridLayout(3, 2, 5, 5));
		Container container = getContentPane();
		for (int i = 0; i < 5; i++) {
			JButton j = new JButton("button" + i,icon);
			container.add(j);
		}
		JButton jb = new JButton();
		jb.setMaximumSize(new Dimension(90, 30));
		jb.setIcon(icon);
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮");
		jb.setBorderPainted(false);
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "弹出对话框");
			}
		});
		container.add(jb);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new JButtonTest();
	}
}
