package chapter25;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class WindowListenerTest extends JFrame {
	public static void main(String[] args) {
		new WindowListenerTest().setVisible(true);
	}
	public WindowListenerTest(){
		addWindowListener(new MyWindowListener());
		setTitle("捕获其他窗体事件");
		setBounds(100,100,200,200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private class MyWindowListener implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("窗口被打开");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("窗口将要被关闭");
		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("窗口已经被关闭！");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("窗口被最小化");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("窗口被非最小化");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("窗口被激活！");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("窗口不再处于激活状态！");
		}
		
	}
}
