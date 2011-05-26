package org.uiframe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JLabel;


public class MainFrame {

	private JFrame frame = new JFrame();
	private JMenuBar menu = new JMenuBar();
	JMenu jm1, jm2, jm3;
	JMenuItem jmt1, jmt2, jmt3, jmt4;
	private JPanel pageInitial;
	private JLabel lable1;
	private static final String instruction = "<html> <p> <font color=red size= 5> Instructions </p> <p> <font color=black size=3> Step1: Login </p> <p> Step2: do what you wanna do</p></html>";
	
	public MainFrame(String title) {
		frame.setTitle(title);
		frame.setSize(new Dimension(600, 480));
	}
	
	void setMenuBar() {
		//*********************//
		// how menu UI are arranged 
		//*********************//
		jm1 = new JMenu("Session");
		jm2 = new JMenu("Function");
		jm3 = new JMenu("Help");
		
		menu.add(jm1);
		menu.add(jm2);
		menu.add(jm3);
		
		jm1.add(jmt1 = new JMenuItem("Login"));
		jm1.add(jmt2 = new JMenuItem("Exit"));
		
		jm2.add(jmt3 = new JMenuItem("Query"));
		
		jm3.add(jmt4 = new JMenuItem("Help"));
		
		frame.setJMenuBar(menu);
		//frame.pack();
	}
	
	void setMenuAction() {
		//*********************//
		// add action for menu items
		//*******************//
	}
	
	void setupLayout() {
		frame.setLayout(new CardLayout());
	
		//setup first page
		pageInitial = new JPanel(new FlowLayout(FlowLayout.CENTER));
		lable1 = new JLabel();
		lable1.setText(instruction);
		pageInitial.add(lable1);
		
		//add pages to Frame
		frame.add(pageInitial);
		frame.setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame window = new MainFrame("i360 Storage Manage");
		window.setMenuBar();
		window.setMenuAction();
		window.setupLayout();
	}

}
