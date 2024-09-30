package guiProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIApp {

	private JFrame frmGraemesApp;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	//private static int studentCount = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIApp window = new GUIApp();
					window.frmGraemesApp.setVisible(true);
				} catch (Exception e) {e.printStackTrace();}
			}
		});
}	


	/**
	 * Create the application.
	 */
	public GUIApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGraemesApp = new JFrame();
		frmGraemesApp.setBackground(new Color(255, 255, 255));
		frmGraemesApp.getContentPane().setBackground(new Color(255, 255, 255));
		frmGraemesApp.setVisible(true);
//		frmGraemesApp.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/watso/eclipse_Workspace_JEEE/guiProject/src/Logo.png"));

		frmGraemesApp.setTitle("Graeme's App");
		frmGraemesApp.setBounds(100, 100, 450, 300);
		frmGraemesApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGraemesApp.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(77, 80, 60, 17);
		frmGraemesApp.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(155, 78, 114, 21);
		frmGraemesApp.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		frmGraemesApp.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("email");
		lblNewLabel.setBounds(77, 120, 60, 17);
		frmGraemesApp.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 118, 114, 21);
		frmGraemesApp.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(77, 159, 60, 17);
		frmGraemesApp.getContentPane().add(lblMobile);
		
		textField_2 = new JTextField();
		textField_2.setBounds(155, 157, 114, 21);
		frmGraemesApp.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(! (lblName.getText()== "")&& ! (lblNewLabel.getText()== "" )&& ! (lblMobile.getText() =="")) {
							if(! (lblName.getText()== null)&& ! (lblNewLabel.getText()== null)&& ! (lblMobile.getText() ==null)) {		
									Student x = new Student(lblName.getText(),lblNewLabel.getText(), lblMobile.getText());
									Student.addStudent(x);
//									studentCount += 1;
									Student.printStudents();
									}
						}else {System.out.println("please ensure you have populated each field before submitting" );}
				}catch(Exception e) {System.out.println("please ensure you have populated each field before submitting" );}
			}
		});
		btnSubmit.setBounds(271, 205, 105, 27);
		frmGraemesApp.getContentPane().add(btnSubmit);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(296, 80, 80, 80);
		btnNewButton.setIcon(new ImageIcon("/home/watso/eclipse_Workspace_JEEE/guiProject/src/AOC.png"));
		frmGraemesApp.getContentPane().add(btnNewButton);
	}
}
