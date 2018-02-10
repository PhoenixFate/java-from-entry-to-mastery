package chapter25;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class MouseListenerTest {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		JLabel label=new JLabel();
		jf.getContentPane().add(label);
		label.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("单击了鼠标按键，");
				int i=e.getButton();
				if(i==MouseEvent.BUTTON1){
					System.out.println("单击的是鼠标左键");
				}else if(i==MouseEvent.BUTTON2){
					System.out.println("单击的是鼠标滚轮");
				}else if(i==MouseEvent.BUTTON3){
					System.out.println("单击的是鼠标右键");
				}
				int clickCount=e.getClickCount();
				System.out.println("单击次数为："+clickCount+"下");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("鼠标按键被按下");
				int i=e.getButton();
				if(i==MouseEvent.BUTTON1){
					System.out.println("按下的是鼠标左键");
				}else if(i==MouseEvent.BUTTON2){
					System.out.println("按下的是鼠标滚轮");
				}else if(i==MouseEvent.BUTTON3){
					System.out.println("按下的是鼠标右键");
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("鼠标按键被释放：");
				int i=e.getButton();
				if(i==MouseEvent.BUTTON1){
					System.out.println("释放的是鼠标左键");
				}else if(i==MouseEvent.BUTTON2){
					System.out.println("释放的是鼠标滚轮");
				}else if(i==MouseEvent.BUTTON3){
					System.out.println("释放的是鼠标右键");
				}
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("光标移入组件");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("光标移出组件");
			}
			
		});
		jf.setBounds(100, 100, 300, 300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
