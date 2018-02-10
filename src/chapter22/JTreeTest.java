package chapter22;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class JTreeTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("第一个根节点");
		DefaultMutableTreeNode nodeFirst=new DefaultMutableTreeNode("一级子节点A");
		root.add(nodeFirst);
		DefaultMutableTreeNode nodeSecond=new DefaultMutableTreeNode("二级子节点",false);
		nodeFirst.add(nodeSecond);
		root.add(new DefaultMutableTreeNode("一级子节点B"));
		JFrame jf=new JFrame();
		JTree tree1=new JTree(root);
		jf.getContentPane().add(tree1,BorderLayout.WEST);
		
		DefaultTreeModel defaultTreeModel=new DefaultTreeModel(root);
		JTree tree2=new JTree(defaultTreeModel);
		jf.getContentPane().add(tree2,BorderLayout.CENTER);
		
		
		DefaultTreeModel defaultTreeModel2=new DefaultTreeModel(root,true);
		JTree tree3=new JTree(defaultTreeModel2);
		jf.getContentPane().add(tree3,BorderLayout.EAST);
		
		
		jf.setBounds(100, 100, 500, 300);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
