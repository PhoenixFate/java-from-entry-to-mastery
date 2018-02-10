package chapter25;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class WindowStateListener_Example extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		new WindowStateListener_Example().setVisible(true);
	}
	public WindowStateListener_Example() {
		addWindowStateListener(new MyWindowStateListener());
		setTitle("捕获窗体状态事件");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	private class MyWindowStateListener implements WindowStateListener {

		@Override
		public void windowStateChanged(WindowEvent e) {
			int oldState = e.getOldState();
			int newState = e.getNewState();
			String from = "";
			String to = "";
			switch (oldState) {
			case Frame.NORMAL:
				from = "正常化";
				break;
			case Frame.MAXIMIZED_BOTH:
				from = "最大化";
				break;
			default:
				from = "最小化";
			}
			switch (newState) {
			case Frame.NORMAL:
				to = "正常化";
				break;
			case Frame.MAXIMIZED_BOTH:
				to = "最大化";
				break;
			default:
				to = "最小化";
			}
			System.out.println(from+"---------->"+to);
		}
	}
}
