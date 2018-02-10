package chapter25;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ItemListenerTest {
	public static void main(String[] args) {
		JFrame jf=new JFrame();
		Container container=jf.getContentPane();
		JComboBox<String> comboBox=new JComboBox<String>();
		for(int i=0;i<6;i++){
			comboBox.addItem("选项"+i);
		}
		container.add(comboBox);
		comboBox.addItemListener(new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent e) {
				int stateChange=e.getStateChange();
				System.out.println("stateChange:"+stateChange);
				String item=e.getItem().toString();
				System.out.println("item:"+item);
				if(stateChange==ItemEvent.SELECTED){
					System.out.println("此次事件由      选中    选项"+item+"触发");
				}else if(stateChange==ItemEvent.DESELECTED){
					System.out.println("此次事件由   取消选中    选项"+item+"触发");
				}else {
					System.out.println("此次事件由   其他原因触发！");
				}
			}
		});
		
		jf.setBounds(100, 100, 200, 200);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
