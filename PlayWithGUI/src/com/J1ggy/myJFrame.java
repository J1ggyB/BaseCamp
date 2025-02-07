package com.J1ggy;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.ImageIcon;

public class myJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField eMail;
	private JTextField SName;
	private JTextField FName;
	String fName;
	String sName;
    String age;
    String email;
    Member myMember;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myJFrame frame = new myJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 307);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 221, 218));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter email");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(30, 191, 142, 15);
		contentPane.add(lblNewLabel);
		
		JButton Submit = new JButton("Submit");
		Submit.setBounds(30, 218, 104, 25);
		contentPane.add(Submit);
		
		JLabel RegLabel = new JLabel("Register Membership");
		RegLabel.setFont(new Font("Uroob", Font.BOLD, 16));
		RegLabel.setBounds(30, 38, 205, 23);
		RegLabel.setForeground(new Color(2, 21, 28));
		RegLabel.setVisible(false);
		contentPane.add(RegLabel);
		
		eMail = new JTextField();
		eMail.setBounds(new Rectangle(124, 189, 142, 19));
		eMail.setColumns(10);
		contentPane.add(eMail);
		
		JCheckBox CheckBox25 = new JCheckBox("1-25");
		CheckBox25.setSelected(true);
		CheckBox25.setBackground(new Color(222, 221, 218));
		CheckBox25.setForeground(new Color(0, 0, 0));
		CheckBox25.setBounds(30, 160, 71, 23);
		contentPane.add(CheckBox25);
		
		JCheckBox checkBoxOver = new JCheckBox("Over 25");
		checkBoxOver.setForeground(new Color(0, 0, 0));
		checkBoxOver.setBackground(new Color(222, 221, 218));
		checkBoxOver.setBounds(124, 160, 129, 23);
		contentPane.add(checkBoxOver);
		
		SName = new JTextField();
		SName.setBounds(124, 133, 129, 19);
		contentPane.add(SName);
		SName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Surname");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(30, 137, 142, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Forename");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(30, 106, 142, 15);
		contentPane.add(lblNewLabel_2);
		
		FName = new JTextField();
		FName.setBounds(124, 102, 129, 19);
		contentPane.add(FName);
		FName.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("/home/watso/Downloads/MadChick.jpg"));
		btnNewButton.setBounds(303, 38, 142, 145);
		contentPane.add(btnNewButton);
		
		Submit.addActionListener(new ActionListener() {   // Add Action Listeners for each JButton - Accelerate
			  public void actionPerformed(ActionEvent e) { 
				  fName = FName.getText();
				  sName = SName.getText();
				  email = eMail.getText();

				  if(CheckBox25.isSelected()) {
					  age = "1-25";  
				  }else { age = "Over 25";}
				  
				  if(email.contains("@")&& email.contains(".")) {
				  myMember = new Member(fName,sName,age,email);
				  myMember.printDetails();
				  }else {System.out.println("Apologies - Membership rejected at this time.");}
			  } 
		});
	}
}


