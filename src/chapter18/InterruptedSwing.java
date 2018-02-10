package chapter18;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;

public class InterruptedSwing extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Thread thread;
	public InterruptedSwing(){
		final JProgressBar progressBar=new JProgressBar();
		getContentPane().add(progressBar);
		progressBar.setStringPainted(true);
		thread=new Thread(new Runnable(){
			int count=0;
			@Override
			public void run() {
				while(true){
					progressBar.setValue(++count);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("当前线程被中断");
//						e.printStackTrace();
						break;
					}
				}
			}
		});
		thread.start();
		thread.interrupt();
	}
	public static void init(JFrame frame,int width,int height){
		frame.setBounds(100, 100, width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		init(new InterruptedSwing(),300,300);
	}
}
