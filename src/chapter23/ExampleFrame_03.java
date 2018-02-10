package chapter23;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class ExampleFrame_03 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JDesktopPane desktopPane;
	private InternalFrame pInFrame;
	private InternalFrame rInFrame;
	private InternalFrame tInFrame;
	
	public ExampleFrame_03(){
		setTitle("企业人事管理系统");
		setBounds(100,100,570,479);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		desktopPane=new JDesktopPane();
		desktopPane.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		JLabel backLabel=new JLabel();
		URL resource=this.getClass().getResource("back.jpg");
		ImageIcon imageIcon=new ImageIcon(resource);
		backLabel.setIcon(imageIcon);
		
	}
	private class BAListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
	private class InternalFrame extends JInternalFrame{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InternalFrame(String title){
			setTitle(title);
			setResizable(true);
			setClosable(true);
			setIconifiable(true);
			setMaximizable(true);
			URL resource=this.getClass().getResource("");
			ImageIcon imageIcon=new ImageIcon(resource);
			setFrameIcon(imageIcon);
		}
	}
}

