/*
 * MainFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package com.itjob.view;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author  __USER__
 */
public class MainFrm extends javax.swing.JFrame {

	/** Creates new form MainFrm */
	public MainFrm() {
		initComponents();
		//设置最大化
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//		this.setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		table = new javax.swing.JDesktopPane();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu3 = new javax.swing.JMenu();
		jmiBookTypeAdd = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem5 = new javax.swing.JMenuItem();
		jmiExit = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem6 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u56fe\u4e66\u7ba1\u7406\u7cfb\u7edf\u4e3b\u754c\u9762");

		jMenu1.setText("\u57fa\u672c\u6570\u636e\u7ef4\u62a4");

		jMenu3.setText("\u56fe\u4e66\u7c7b\u522b\u7ba1\u7406");

		jmiBookTypeAdd.setText("\u6dfb\u52a0\u56fe\u4e66\u7c7b\u522b");
		jmiBookTypeAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmiBookTypeAddActionPerformed(evt);
			}
		});
		jMenu3.add(jmiBookTypeAdd);

		jMenuItem3.setText("\u56fe\u4e66\u7c7b\u522b\u7ef4\u62a4");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem3);

		jMenu1.add(jMenu3);

		jMenu4.setText("\u56fe\u4e66\u7ba1\u7406");

		jMenuItem4.setText("\u6dfb\u52a0\u56fe\u4e66");
		jMenu4.add(jMenuItem4);

		jMenuItem5.setText("\u56fe\u4e66\u7ef4\u62a4");
		jMenu4.add(jMenuItem5);

		jMenu1.add(jMenu4);

		jmiExit.setText("\u9000\u51fa\u7cfb\u7edf");
		jmiExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jmiExitActionPerformed(evt);
			}
		});
		jMenu1.add(jmiExit);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("\u5173\u4e8e");

		jMenuItem6.setText("\u5173\u4e8ejava1234");
		jMenu2.add(jMenuItem6);

		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
				javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
				javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		BookTypeManageInterFrm bookTypeManageInterFrm = new BookTypeManageInterFrm();
		bookTypeManageInterFrm.setVisible(true);
		this.table.add(bookTypeManageInterFrm);
	}

	private void jmiBookTypeAddActionPerformed(java.awt.event.ActionEvent evt) {
		BookTypeInterFrm bookTypeInterFrm = new BookTypeInterFrm();
		bookTypeInterFrm.setVisible(true);
		this.table.add(bookTypeInterFrm);
	}

	private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {
		int result = JOptionPane.showConfirmDialog(null, "是否退出系统");
		if (result == 0) {
			this.dispose();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jmiBookTypeAdd;
	private javax.swing.JMenuItem jmiExit;
	private javax.swing.JDesktopPane table;
	// End of variables declaration//GEN-END:variables

}