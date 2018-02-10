package chapter18;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;

public class PriorityTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final JProgressBar progressBar1=new JProgressBar();
	final JProgressBar progressBar2=new JProgressBar();
	final JProgressBar progressBar3=new JProgressBar();
	final JProgressBar progressBar4=new JProgressBar();
	private Thread threadA;
	private Thread threadB;
	private Thread threadC;
	private Thread threadD;
	public PriorityTest(){
		getContentPane().add(progressBar1);
		getContentPane().add(progressBar2);
		getContentPane().add(progressBar3);
		getContentPane().add(progressBar4);
		setLayout(new GridLayout(4,1,10,10));
		progressBar1.setStringPainted(true);
		progressBar2.setStringPainted(true);
		progressBar3.setStringPainted(true);
		progressBar4.setStringPainted(true);
		threadA=new Thread(new MyThread(progressBar1));
		threadB=new Thread(new MyThread(progressBar2));
		threadC=new Thread(new MyThread(progressBar3));
		threadD=new Thread(new MyThread(progressBar4));
		setPriority("threadA",10,threadA);
		setPriority("threadB",5,threadB);
		setPriority("threadC",5,threadC);
		setPriority("threadD",1,threadD);
	}
	public static void setPriority(String threadName,int priority,Thread thread){
		thread.setPriority(priority);
//		thread.setName(threadName);
		thread.start();
	}
	private final class MyThread implements Runnable{
		private final JProgressBar bar;
		int count=0;
		private MyThread(JProgressBar bar){
			this.bar=bar;
		}
		@Override
		public void run() {
			while(true)	{
				bar.setValue(count+=1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("当前线程被中断");
				}
			}
		}	
	}
	public static void main(String[] args) {
		init(new PriorityTest(),200,300);
	}
	public static void init(JFrame frame,int width,int height){
		frame.setBounds(100, 100, width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
