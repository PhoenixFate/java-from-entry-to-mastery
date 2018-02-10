package chapter18;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;

public class JoinTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Thread threadA;
	private Thread threadB;
	final JProgressBar progressBar1=new JProgressBar();
	final JProgressBar progressBar2=new JProgressBar();
	int count=0;
	public JoinTest(){
		getContentPane().add(progressBar1,BorderLayout.NORTH);
		getContentPane().add(progressBar2,BorderLayout.SOUTH);
		progressBar1.setStringPainted(false);
		progressBar2.setStringPainted(true);
		threadA=new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					progressBar1.setValue(++count);
					try {
						Thread.sleep(100);
						threadB.join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		threadA.start();
		threadB=new Thread(new Runnable(){
			int count=0;
			@Override
			public void run() {
				while(true){
					progressBar2.setValue(++count);
					try {
						Thread.sleep(100);
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(count==100){
						break;
					}
				}
			}
		});
		threadB.start();
	}
	public static void init(JFrame frame,int width,int height){
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setBounds(50, 50,width	,height);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		init(new JoinTest(),500,500);
	}
}
