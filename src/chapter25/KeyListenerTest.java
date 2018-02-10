package chapter25;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class KeyListenerTest {
	public static void main(String[] args) {
		final JLabel label = new JLabel();
		label.setText("备注：");
		JFrame jf = new JFrame();
		jf.getContentPane().add(label, BorderLayout.WEST);
		final JScrollPane scrollPane = new JScrollPane();
		jf.getContentPane().add(scrollPane, BorderLayout.CENTER);
		JTextArea textArea = new JTextArea();
		textArea.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("此次输入的是：" + e.getKeyChar() + "");

			}

			@Override
			public void keyPressed(KeyEvent e) {
				String keyText = KeyEvent.getKeyText(e.getKeyCode());
				if (e.isActionKey()) {
					System.out.println("您按下的是动作键：" + keyText);
				} else {
					System.out.println("您按下的是非动作键：" + keyText);
					int keyCode = e.getKeyCode();
					switch (keyCode) {
					case KeyEvent.VK_CONTROL:
						System.out.println(",ctrl键被按下");
						break;
					case KeyEvent.VK_ALT:
						System.out.println(",ALT键被按下");
						break;
					case KeyEvent.VK_SHIFT:
						System.out.println(",SHIFT键被按下");
					}
				}
				System.out.println();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				String keyText = KeyEvent.getKeyText(e.getKeyCode());
				System.out.println("您释放的是：" + keyText + "键");
				System.out.println();
			}
		});
		textArea.setLineWrap(true);
		textArea.setRows(3);
		textArea.setColumns(15);
		scrollPane.setViewportView(textArea);
		
		jf.setBounds(100, 100, 300, 300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
