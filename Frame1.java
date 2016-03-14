package gui_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTable;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.TextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
public class Frame1 {

	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField pwdPassword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setDefaultCloseOperation(window.frame.EXIT_ON_CLOSE);
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.BOLD, 52));
		frame.getContentPane().setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		frame.setSize(650, 650);
		frame.getContentPane().setLayout(null);
		
		JButton btnSignIn = new JButton("New Registration");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignIn.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnSignIn.setBounds(93, 517, 215, 51);
		frame.getContentPane().add(btnSignIn);
		
		btnSignIn.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt1) {
                NextActionPerformed(evt1);
            }
            private void NextActionPerformed(ActionEvent evt1) {
                New_Registration nr = new New_Registration();
                nr.setTitle("Registration Form");
                nr.setSize(650, 650);
                nr.setLocationRelativeTo(null);
                //nr.setDefaultCloseOperation(nr.EXIT_ON_CLOSE);
                nr.setVisible(true);
            }
        });
		
		JButton btnInformation = new JButton("Information");
		btnInformation.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnInformation.setBounds(492, 527, 117, 30);
		frame.getContentPane().add(btnInformation);
		
		btnInformation.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
            private void NextActionPerformed(ActionEvent evt) {
                Information myProg = new Information();
                myProg.setTitle("Information");
                //myProg.setBounds(200, 200, 500, 300);
                myProg.setLocationRelativeTo(null);
                //myProg.setDefaultCloseOperation(myProg.EXIT_ON_CLOSE);
                myProg.setVisible(true);
            }
        });
		
		JLabel lblWelcomeToLnmiit = DefaultComponentFactory.getInstance().createLabel("            \t    Admission Portal");
		lblWelcomeToLnmiit.setFont(new Font("Dialog", Font.BOLD, 30));
		lblWelcomeToLnmiit.setBounds(12, 159, 626, 67);
		frame.getContentPane().add(lblWelcomeToLnmiit);
		
		JLabel lblWelcome = DefaultComponentFactory.getInstance().createLabel("Welcome");
		lblWelcome.setFont(new Font("Dialog", Font.BOLD, 30));
		lblWelcome.setBounds(247, 55, 186, 40);
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblTo = DefaultComponentFactory.getInstance().createLabel("to");
		lblTo.setFont(new Font("Dialog", Font.BOLD, 30));
		lblTo.setBounds(297, 107, 136, 40);
		frame.getContentPane().add(lblTo);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		panel.setBounds(132, 238, 395, 219);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUserName = DefaultComponentFactory.getInstance().createLabel("User Name");
		lblUserName.setBounds(52, 45, 136, 15);
		panel.add(lblUserName);
		lblUserName.setFont(new Font("Serif", Font.BOLD, 17));
		lblUserName.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblUserName.setForeground(Color.WHITE);
		
		JLabel lblPassword = DefaultComponentFactory.getInstance().createLabel("Password");
		lblPassword.setBounds(52, 108, 136, 15);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Serif", Font.BOLD, 17));
		lblPassword.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		lblPassword.setForeground(Color.WHITE);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(229, 39, 117, 30);
		panel.add(txtUserName);
		txtUserName.setText("");
		txtUserName.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(229, 102, 117, 30);
		panel.add(pwdPassword);
		pwdPassword.setText("");
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(229, 177, 117, 30);
		panel.add(btnLogIn);
		
		
		
	}
}

