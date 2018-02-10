package chapter23;



import java.awt.BorderLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JDesktopPaneTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new JDesktopPaneTest().setVisible(true);
	}

	public JDesktopPaneTest()  {
		super();
		setBounds(100, 100, 700, 700);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JDesktopPane desktopPane=new JDesktopPane();
		getContentPane().add(desktopPane,BorderLayout.CENTER);
		JLabel backLabel=new JLabel();
		URL resource=this.getClass().getResource("back.jpg");
		ImageIcon icon=new ImageIcon(resource);
		backLabel.setIcon(icon);
		backLabel.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
		desktopPane.add(backLabel,new Integer(Integer.MIN_VALUE));
	}

	
	
}
