package chapter25;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class WindowFocusListener_Example {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.addWindowFocusListener(new WindowFocusListener(){
			@Override
			public void windowGainedFocus(WindowEvent e) {
				System.out.println("窗口获得了焦点！");
			}
			@Override
			public void windowLostFocus(WindowEvent e) {
				System.out.println("窗口失去了焦点！");
			}
		});
		frame.setTitle("捕获窗体焦点事件");
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
