package chapter23;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JFileChooserTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		new JFileChooserTest().setVisible(true);
	}
	public JFileChooserTest(){
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JButton button=new JButton("添加文件；");
		button.setSize(30,80);
		JPanel panel=new JPanel();
		panel.add(button);
		getContentPane().add(panel,BorderLayout.SOUTH);
		JTextField textField=new JTextField();
		getContentPane().add(textField, BorderLayout.NORTH);
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser=new JFileChooser();
				int i=fileChooser.showOpenDialog(getContentPane());
				if(i==JFileChooser.APPROVE_OPTION){
					File selectedFile=fileChooser.getSelectedFile();
					textField.setText(selectedFile.getName());
				}
			}
			
		});
	}
}
