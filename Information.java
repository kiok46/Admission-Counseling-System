package gui_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.Color;

public class Information extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information frame = new Information();
					frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
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
	public Information() {
		setBounds(0, 0, 650, 650);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JTextPane txtpnBTech = new JTextPane();
		txtpnBTech.setBackground(Color.DARK_GRAY);
		txtpnBTech.setForeground(Color.WHITE);
		txtpnBTech.setFont(new Font("Droid Sans", Font.BOLD, 16));
		txtpnBTech.setEditable(false);
		txtpnBTech.setText("\t\t* B. Tech Admission Portal for 2015 is now open. *\n\n\tAdmission Portal opens on: \t9th March 2015\n\nLast date of submission of application form Will be declared soon.\n\nSchedule of Admission Counseling and Fee Payment\n\n1. First Round of Admission Counseling on LNMIIT Campus and seat allotment of(Release First Admission List) 26th – 28th June 2015.\n\n2. Last Date of Acceptance and Payment of Fee for applicants allocated seats in the First Admission List 4th July 2015.\n\n-------------------------------------------------------------------------------------------------------------------------------------------------\n* Click on New_Registration if you want to apply.\n* Fill in all the details very carefully.\n-------------------------------------------------------------------------------------------------------------------------------------------------\nNOTE: \n1. Your Personal Mobile Number will be your User Name. \n2. Your Roll Number will be your Password.");
		getContentPane().add(txtpnBTech, "name_4008644292648");
		
		
		
	}
}
