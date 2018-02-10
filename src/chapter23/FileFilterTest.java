package chapter23;

import java.awt.event.MouseAdapter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileFilterTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
	}
	public FileFilterTest(){
		setBounds(100,100,300,300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label=new JLabel("双击选择照片",SwingConstants.CENTER);
		label.addMouseListener(new MouseAdapter(){
			JFileChooser fileChooser=new JFileChooser();{
			FileFilter filter=new FileNameExtensionFilter("图像文件(JPG/GIF)","JPG","JPEG","GIF");
			fileChooser.setFileFilter(filter);
			}
		});	
	}
}
