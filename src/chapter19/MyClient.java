package chapter19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MyClient extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PrintWriter writer;
	private Socket socket;
	private JTextArea ta=new JTextArea();
	private JTextField tf=new JTextField();
	private Container container;
	public MyClient(String title){
		setTitle(title);
		container=getContentPane();
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		getContentPane().add(scrollPane,BorderLayout.CENTER);
		scrollPane.setViewportView(ta);
		container.add(tf	,"South");
		tf.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				writer.println(tf.getText());
				ta.append(tf.getText()+"\n");
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");
			}
		});
	}
	private void connect(){
		ta.append("尝试连接\n");
		try {
			socket=new Socket("172.20.10.7",8998);
			writer=new PrintWriter(socket.getOutputStream(),true);
			ta.append("完成连接\n");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		MyClient client=new MyClient("向服务器发送数据");
		client.setSize(500, 500);
		client.setVisible(true);
		client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client.connect();
	}
}
