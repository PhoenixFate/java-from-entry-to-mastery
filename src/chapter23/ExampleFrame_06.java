package chapter23;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ExampleFrame_06 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		ExampleFrame_06 frame = new ExampleFrame_06();
		frame.setVisible(true);
	}
	
	public ExampleFrame_06() {
		super();
		setTitle("��������ʽ�˵�");
		setBounds(100, 100, 500, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JLabel label = new JLabel();
		label.setText("                ���ڴ����е�������Ҽ���");
		getContentPane().add(label, BorderLayout.CENTER);
		
		final JPopupMenu popupMenu = new JPopupMenu();// ��������ʽ�˵�����
		// Ϊ����Ķ��������������¼�������
		getContentPane().addMouseListener(new MouseAdapter() {
			// ��갴�����ͷ�ʱ�����÷���
			public void mouseReleased(MouseEvent e) {
				// �жϴ˴�����¼��Ƿ�Ϊ������ĵ����˵������¼�
				// ����������ͷ�����λ�õ����˵�
				if (e.isPopupTrigger())
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		final JMenuItem cutItem = new JMenuItem("����");
		cutItem.addActionListener(new ItemListener());
		popupMenu.add(cutItem);
		
		final JMenuItem copyItem = new JMenuItem("����");
		copyItem.addActionListener(new ItemListener());
		popupMenu.add(copyItem);
		
		final JMenuItem pastItem = new JMenuItem("ճ��");
		pastItem.addActionListener(new ItemListener());
		popupMenu.add(pastItem);
		
		final JMenu editMenu = new JMenu("�༭");
		popupMenu.add(editMenu);
		
		final JMenuItem readItem = new JMenuItem("ֻ��");
		readItem.addActionListener(new ItemListener());
		editMenu.add(readItem);
		
		final JMenuItem writeItem = new JMenuItem("��д");
		writeItem.addActionListener(new ItemListener());
		editMenu.add(writeItem);
		
		final JMenu fontMenu = new JMenu("����");
		editMenu.add(fontMenu);
		
		final JMenuItem boldfacedItem = new JMenuItem("�Ӵ�");
		boldfacedItem.addActionListener(new ItemListener());
		fontMenu.add(boldfacedItem);
		
		final JMenuItem italicItem = new JMenuItem("б��");
		italicItem.addActionListener(new ItemListener());
		fontMenu.add(italicItem);
		//
	}
	
	private class ItemListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JMenuItem menuItem = (JMenuItem) e.getSource();
			System.out.println("���������ǲ˵��" + menuItem.getText());
		}
	}
	
}
