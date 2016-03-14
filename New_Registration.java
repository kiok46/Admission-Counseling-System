package gui_1;



import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.UIManager;

import java.awt.Panel;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.SortOrder;

import java.awt.Choice;
import java.awt.List;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;

public class New_Registration extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Registration frame = new New_Registration();
					frame.setTitle("Student's Registration Form");
					
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
	public New_Registration() {
		getContentPane().setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(0, 0, 650, 650);
		getContentPane().setLayout(new CardLayout());
				getContentPane().add(tabbedPane, "name_2016672866296");
				ButtonGroup bg = new ButtonGroup();
				ButtonGroup bg1 = new ButtonGroup();
				
						JPanel panel_1 = new JPanel();
						tabbedPane.addTab("Details-1", null, panel_1, null);
						panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
						panel_1.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
						panel_1.setLayout(null);
						JLabel lblNewLabel = new JLabel("First Name :");
						lblNewLabel.setBounds(86, 73, 85, 24);
						panel_1.add(lblNewLabel);
						
						textField = new JTextField();
						textField.setBounds(323, 76, 252, 19);
						panel_1.add(textField);
						textField.setColumns(10);
						
						JLabel lblLastName = new JLabel("Last Name :");
						lblLastName.setBounds(86, 109, 84, 20);
						panel_1.add(lblLastName);
						
						textField_1 = new JTextField();
						textField_1.setBounds(323, 110, 252, 19);
						panel_1.add(textField_1);
						textField_1.setColumns(10);
						
						JLabel lblFathersName = new JLabel("Father's Name :");
						lblFathersName.setBounds(86, 145, 112, 15);
						panel_1.add(lblFathersName);
						
						JLabel lblMothersName = new JLabel("Mother's Name :");
						lblMothersName.setBounds(86, 182, 116, 24);
						panel_1.add(lblMothersName);
						
						JLabel lblDateOfBirth = new JLabel("Date of Birth (dd/mm/yyyy):");
						lblDateOfBirth.setBounds(86, 218, 191, 24);
						panel_1.add(lblDateOfBirth);
						
						JLabel lblGender = new JLabel("Gender :");
						lblGender.setBounds(86, 271, 61, 15);
						panel_1.add(lblGender);
						
						JLabel lblMobileNo = new JLabel("Mobile No. :");
						lblMobileNo.setBounds(86, 310, 84, 24);
						panel_1.add(lblMobileNo);
						
						JLabel lblEmailId = new JLabel("Email Id :");
						lblEmailId.setBounds(86, 365, 63, 24);
						panel_1.add(lblEmailId);
						
						JRadioButton rdbtnOthers = new JRadioButton("Others");
						rdbtnOthers.setBounds(439, 419, 74, 23);
						rdbtnOthers.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
						panel_1.add(rdbtnOthers);
						
						JLabel lblNewLabel_1 = new JLabel("How did you come to know about LNMIIT ?");
						lblNewLabel_1.setBounds(86, 484, 296, 15);
						panel_1.add(lblNewLabel_1);
						
						textField_2 = new JTextField();
						textField_2.setBounds(323, 143, 252, 19);
						panel_1.add(textField_2);
						textField_2.setColumns(10);
						
						textField_3 = new JTextField();
						textField_3.setBounds(323, 185, 252, 19);
						panel_1.add(textField_3);
						textField_3.setColumns(10);
						
						textField_4 = new JTextField();
						textField_4.setBounds(323, 223, 252, 19);
						panel_1.add(textField_4);
						textField_4.setColumns(10);
						
						JRadioButton rdbtnMale = new JRadioButton("Male");
						rdbtnMale.setBounds(323, 267, 59, 23);
						panel_1.add(rdbtnMale);
						rdbtnMale.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
						
						JRadioButton rdbtnFemale = new JRadioButton("Female");
						rdbtnFemale.setBounds(439, 267, 76, 23);
						panel_1.add(rdbtnFemale);
						rdbtnFemale.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
						
						textField_6 = new JTextField();
						textField_6.setBounds(323, 313, 252, 19);
						panel_1.add(textField_6);
						textField_6.setColumns(10);
						
						textField_5 = new JTextField();
						textField_5.setBounds(323, 368, 252, 19);
						panel_1.add(textField_5);
						textField_5.setColumns(10);
						
						JComboBox comboBox = new JComboBox();
						comboBox.setBounds(336, 521, 216, 24);
						panel_1.add(comboBox);
						comboBox.addItem("Please Select");
						comboBox.addItem("Social Media");
						comboBox.addItem("Newspaper Advertisement");
						comboBox.addItem("Magazines");
						comboBox.addItem("Friends or Relatives");
						comboBox.addItem("LNMIIT Homepage");
						comboBox.addItem("Internet");
						comboBox.addItem("Others");
						
						
						JLabel lblPersonalDetails = new JLabel("Personal Details");
						lblPersonalDetails.setBounds(83, 25, 188, 24);
						panel_1.add(lblPersonalDetails);
						lblPersonalDetails.setFont(new Font("Dialog", Font.BOLD, 20));
						bg.add(rdbtnMale);
						bg.add(rdbtnFemale);
						
						JLabel lblNationality = new JLabel("Nationality :");
						lblNationality.setBounds(86, 418, 87, 24);
						panel_1.add(lblNationality);
						
						JRadioButton rdbtnIndian = new JRadioButton("Indian");
						rdbtnIndian.setBounds(323, 419, 112, 23);
						rdbtnIndian.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
						panel_1.add(rdbtnIndian);
						
						bg1.add(rdbtnIndian);
						bg1.add(rdbtnOthers);
								
										JPanel panel_2 = new JPanel();
										tabbedPane.addTab("Details-2", null, panel_2, null);
										panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
										panel_2.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
										panel_2.setLayout(null);
										
										JLabel lblAddressDetails = new JLabel("Address Details");
										lblAddressDetails.setBounds(64, 37, 235, 24);
										panel_2.add(lblAddressDetails);
										lblAddressDetails.setFont(new Font("Dialog", Font.BOLD, 20));
										
										JLabel lblLocalAddress = new JLabel("Local Address :");
										lblLocalAddress.setBounds(25, 89, 139, 15);
										panel_2.add(lblLocalAddress);
										
										textField_7 = new JTextField();
										textField_7.setBounds(196, 87, 375, 19);
										textField_7.setColumns(10);
										panel_2.add(textField_7);
										
										textField_8 = new JTextField();
										textField_8.setBounds(167, 121, 120, 19);
										textField_8.setColumns(10);
										panel_2.add(textField_8);
										
										JLabel lblPinCode = new JLabel("Pin Code :");
										lblPinCode.setBounds(305, 123, 89, 15);
										panel_2.add(lblPinCode);
										
										textField_9 = new JTextField();
										textField_9.setBounds(403, 121, 172, 19);
										textField_9.setColumns(10);
										panel_2.add(textField_9);
										
										JLabel lblCity = new JLabel("City :");
										lblCity.setBounds(24, 123, 36, 15);
										panel_2.add(lblCity);
										
										textField_11 = new JTextField();
										textField_11.setBounds(167, 152, 120, 19);
										textField_11.setColumns(10);
										panel_2.add(textField_11);
										
										JLabel lblState = new JLabel("State :");
										lblState.setBounds(305, 171, 89, 15);
										panel_2.add(lblState);
										
										textField_10 = new JTextField();
										textField_10.setBounds(403, 169, 172, 19);
										textField_10.setColumns(10);
										panel_2.add(textField_10);
										
										JLabel lblDistrict = new JLabel("District :");
										lblDistrict.setBounds(25, 157, 60, 15);
										panel_2.add(lblDistrict);
										
										JLabel lblLandlineNo = new JLabel("Landline No. :");
										lblLandlineNo.setBounds(25, 198, 98, 15);
										panel_2.add(lblLandlineNo);
										
										textField_12 = new JTextField();
										textField_12.setBounds(167, 200, 120, 19);
										textField_12.setColumns(10);
										panel_2.add(textField_12);
										
										JLabel lblMobileNo_1 = new JLabel("Mobile No :");
										lblMobileNo_1.setBounds(305, 202, 89, 15);
										panel_2.add(lblMobileNo_1);
										
										textField_13 = new JTextField();
										textField_13.setBounds(403, 200, 172, 19);
										textField_13.setColumns(10);
										panel_2.add(textField_13);
										
										JLabel lblPermanentAddress = new JLabel("Permanent Address :");
										lblPermanentAddress.setBounds(25, 267, 172, 15);
										panel_2.add(lblPermanentAddress);
										
										textField_14 = new JTextField();
										textField_14.setColumns(10);
										textField_14.setBounds(215, 265, 365, 19);
										panel_2.add(textField_14);
										
										JLabel label = new JLabel("City :");
										label.setBounds(25, 303, 36, 15);
										panel_2.add(label);
										
										textField_15 = new JTextField();
										textField_15.setColumns(10);
										textField_15.setBounds(167, 301, 120, 19);
										panel_2.add(textField_15);
										
										JLabel label_1 = new JLabel("District :");
										label_1.setBounds(25, 343, 60, 15);
										panel_2.add(label_1);
										
										textField_16 = new JTextField();
										textField_16.setColumns(10);
										textField_16.setBounds(167, 341, 120, 19);
										panel_2.add(textField_16);
										
										JLabel label_2 = new JLabel("Landline No. :");
										label_2.setBounds(25, 386, 98, 15);
										panel_2.add(label_2);
										
										textField_17 = new JTextField();
										textField_17.setColumns(10);
										textField_17.setBounds(167, 384, 120, 19);
										panel_2.add(textField_17);
										
										JLabel label_3 = new JLabel("Pin Code :");
										label_3.setBounds(319, 303, 89, 15);
										panel_2.add(label_3);
										
										textField_18 = new JTextField();
										textField_18.setColumns(10);
										textField_18.setBounds(413, 296, 172, 19);
										panel_2.add(textField_18);
										
										JLabel label_4 = new JLabel("State :");
										label_4.setBounds(319, 343, 89, 15);
										panel_2.add(label_4);
										
										textField_19 = new JTextField();
										textField_19.setColumns(10);
										textField_19.setBounds(413, 341, 172, 19);
										panel_2.add(textField_19);
										
										JLabel label_5 = new JLabel("Mobile No :");
										label_5.setBounds(319, 386, 89, 15);
										panel_2.add(label_5);
										
										textField_20 = new JTextField();
										textField_20.setColumns(10);
										textField_20.setBounds(413, 384, 172, 19);
										panel_2.add(textField_20);
								
								JPanel panel = new JPanel();
								panel.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
								tabbedPane.addTab("Details-3", null, panel, null);
								panel.setLayout(null);
								
								JPanel panel_3 = new JPanel();
								panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
								panel_3.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
								panel_3.setBounds(25, 64, 595, 236);
								panel.add(panel_3);
								panel_3.setLayout(null);
								
								JLabel lblJeeMainmarks = new JLabel("JEE (main ) Roll No :");
								lblJeeMainmarks.setBounds(12, 34, 143, 15);
								panel_3.add(lblJeeMainmarks);
								
								JLabel lblMarksInPhysics = new JLabel("Marks in Physics :");
								lblMarksInPhysics.setBounds(12, 96, 143, 15);
								panel_3.add(lblMarksInPhysics);
								
								textField_21 = new JTextField();
								textField_21.setBounds(226, 32, 143, 19);
								panel_3.add(textField_21);
								textField_21.setColumns(10);
								
								JLabel lblMarksInChemistry = new JLabel("Marks in Chemistry :");
								lblMarksInChemistry.setBounds(226, 96, 169, 15);
								panel_3.add(lblMarksInChemistry);
								
								JLabel lblMarksInMathematics = new JLabel("Marks in Mathematics :");
								lblMarksInMathematics.setBounds(425, 96, 170, 15);
								panel_3.add(lblMarksInMathematics);
								
								textField_24 = new JTextField();
								textField_24.setBounds(425, 135, 143, 19);
								panel_3.add(textField_24);
								textField_24.setColumns(10);
								
								textField_23 = new JTextField();
								textField_23.setBounds(226, 135, 143, 19);
								panel_3.add(textField_23);
								textField_23.setColumns(10);
								
								textField_22 = new JTextField();
								textField_22.setBounds(12, 135, 143, 19);
								panel_3.add(textField_22);
								textField_22.setColumns(10);
								
								textField_25 = new JTextField();
								textField_25.setBounds(226, 185, 143, 19);
								panel_3.add(textField_25);
								textField_25.setColumns(10);
								
								JLabel lblJeemain = new JLabel("JEE (main ) Total Score :");
								lblJeemain.setBounds(12, 187, 196, 15);
								panel_3.add(lblJeemain);
								
								JPanel panel_4 = new JPanel();
								panel_4.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
								panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
								panel_4.setBounds(25, 348, 595, 214);
								panel.add(panel_4);
								panel_4.setLayout(null);
								
								JLabel lblToDecideThe = new JLabel("to decide the scholarship. ");
								lblToDecideThe.setBounds(12, 39, 189, 15);
								panel_4.add(lblToDecideThe);
								
								JLabel lblJeeadvancedInformation = new JLabel("JEE (Advanced) Information (Optional): JEE Advanced  Rank will be used ");
								lblJeeadvancedInformation.setBounds(12, 12, 625, 15);
								panel_4.add(lblJeeadvancedInformation);
								
								JLabel lblJeeadvancedRoll = new JLabel(" JEE (Advanced) Roll No.");
								lblJeeadvancedRoll.setBounds(34, 97, 189, 15);
								panel_4.add(lblJeeadvancedRoll);
								
								JLabel lblJeeadvancedRank = new JLabel(" JEE (Advanced) Rank");
								lblJeeadvancedRank.setBounds(334, 97, 159, 15);
								panel_4.add(lblJeeadvancedRank);
								
								textField_26 = new JTextField();
								textField_26.setColumns(10);
								textField_26.setBounds(57, 153, 120, 19);
								panel_4.add(textField_26);
								
								textField_27 = new JTextField();
								textField_27.setColumns(10);
								textField_27.setBounds(359, 153, 120, 19);
								panel_4.add(textField_27);
								
								JLabel lblJeeMain = new JLabel("JEE Main");
								lblJeeMain.setFont(new Font("Dialog", Font.BOLD, 20));
								lblJeeMain.setBounds(34, 22, 149, 30);
								panel.add(lblJeeMain);
								
								JLabel lblJeeAdvanced = new JLabel("JEE Advanced");
								lblJeeAdvanced.setFont(new Font("Dialog", Font.BOLD, 20));
								lblJeeAdvanced.setBounds(35, 312, 238, 35);
								panel.add(lblJeeAdvanced);
								
								JPanel panel_5 = new JPanel();
								panel_5.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
								tabbedPane.addTab("Details-4", null, panel_5, null);
								panel_5.setLayout(null);
								
								JLabel lblthStandard = new JLabel("10th Standard");
								lblthStandard.setFont(new Font("Dialog", Font.BOLD, 20));
								lblthStandard.setBounds(34, 32, 207, 34);
								panel_5.add(lblthStandard);
								
								JLabel lblSchoolName = new JLabel("School Board :");
								lblSchoolName.setBounds(75, 97, 140, 15);
								panel_5.add(lblSchoolName);
								
								JLabel lblSchoolName_1 = new JLabel("School Name :");
								lblSchoolName_1.setBounds(75, 137, 140, 15);
								panel_5.add(lblSchoolName_1);
								
								JLabel lblSchoolAddress = new JLabel("School Address :");
								lblSchoolAddress.setBounds(75, 175, 140, 15);
								panel_5.add(lblSchoolAddress);
								
								JLabel lblCountry = new JLabel("Country :");
								lblCountry.setBounds(75, 213, 140, 15);
								panel_5.add(lblCountry);
								
								JLabel lblDistrict_1 = new JLabel("District :");
								lblDistrict_1.setBounds(75, 256, 140, 15);
								panel_5.add(lblDistrict_1);
								
								JLabel lblState_1 = new JLabel("State :");
								lblState_1.setBounds(75, 297, 140, 15);
								panel_5.add(lblState_1);
								
								JLabel lblCity_1 = new JLabel("City :");
								lblCity_1.setBounds(75, 334, 140, 15);
								panel_5.add(lblCity_1);
								
								JLabel lblPinCode_1 = new JLabel("Pin Code :");
								lblPinCode_1.setBounds(75, 372, 140, 15);
								panel_5.add(lblPinCode_1);
								
								JLabel lblTotalMarksObtained = new JLabel("Total marks obtained :");
								lblTotalMarksObtained.setBounds(75, 444, 177, 15);
								panel_5.add(lblTotalMarksObtained);
								
								JLabel lblMaximumMarks = new JLabel("Maximum Marks :");
								lblMaximumMarks.setBounds(293, 444, 140, 15);
								panel_5.add(lblMaximumMarks);
								
								JLabel lblPercentage = new JLabel("Percentage :");
								lblPercentage.setBounds(493, 444, 140, 15);
								panel_5.add(lblPercentage);
								
								textField_28 = new JTextField();
								textField_28.setColumns(10);
								textField_28.setBounds(75, 492, 143, 19);
								panel_5.add(textField_28);
								
								textField_29 = new JTextField();
								textField_29.setColumns(10);
								textField_29.setBounds(281, 492, 143, 19);
								panel_5.add(textField_29);
								
								textField_30 = new JTextField();
								textField_30.setColumns(10);
								textField_30.setBounds(473, 492, 143, 19);
								panel_5.add(textField_30);
								
								textField_31 = new JTextField();
								textField_31.setColumns(10);
								textField_31.setBounds(330, 135, 216, 19);
								panel_5.add(textField_31);
								
								textField_32 = new JTextField();
								textField_32.setColumns(10);
								textField_32.setBounds(330, 173, 216, 19);
								panel_5.add(textField_32);
								
								textField_33 = new JTextField();
								textField_33.setColumns(10);
								textField_33.setBounds(330, 211, 216, 19);
								panel_5.add(textField_33);
								
								textField_34 = new JTextField();
								textField_34.setColumns(10);
								textField_34.setBounds(329, 254, 217, 19);
								panel_5.add(textField_34);
								
								textField_35 = new JTextField();
								textField_35.setColumns(10);
								textField_35.setBounds(330, 295, 216, 19);
								panel_5.add(textField_35);
								
								textField_36 = new JTextField();
								textField_36.setColumns(10);
								textField_36.setBounds(329, 332, 217, 19);
								panel_5.add(textField_36);
								
								textField_37 = new JTextField();
								textField_37.setColumns(10);
								textField_37.setBounds(330, 370, 216, 19);
								panel_5.add(textField_37);
								
								JComboBox comboBox_1 = new JComboBox();
								comboBox_1.setBounds(330, 92, 216, 24);
								panel_5.add(comboBox_1);
								comboBox_1.addItem("Please Select");
								comboBox_1.addItem("ICSE");
								comboBox_1.addItem("CBSE");
								comboBox_1.addItem("RBSC");
								comboBox_1.addItem("Others");
								
								JPanel panel_6 = new JPanel();
								panel_6.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
								tabbedPane.addTab("Details-5", null, panel_6, null);
								panel_6.setLayout(null);
								
								JPanel panel_7 = new JPanel();
								panel_7.setLayout(null);
								panel_7.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
								panel_7.setBounds(0, 0, 633, 623);
								panel_6.add(panel_7);
								
								JLabel lblthStandard_1 = new JLabel("12th Standard");
								lblthStandard_1.setFont(new Font("Dialog", Font.BOLD, 20));
								lblthStandard_1.setBounds(34, 32, 207, 34);
								panel_7.add(lblthStandard_1);
								
								JLabel label_11 = new JLabel("School Board :");
								label_11.setBounds(75, 97, 140, 15);
								panel_7.add(label_11);
								
								JLabel label_12 = new JLabel("School Name :");
								label_12.setBounds(75, 137, 140, 15);
								panel_7.add(label_12);
								
								JLabel label_13 = new JLabel("School Address :");
								label_13.setBounds(75, 175, 140, 15);
								panel_7.add(label_13);
								
								JLabel label_14 = new JLabel("Country :");
								label_14.setBounds(75, 213, 140, 15);
								panel_7.add(label_14);
								
								JLabel label_15 = new JLabel("District :");
								label_15.setBounds(75, 256, 140, 15);
								panel_7.add(label_15);
								
								JLabel label_16 = new JLabel("State :");
								label_16.setBounds(75, 297, 140, 15);
								panel_7.add(label_16);
								
								JLabel label_17 = new JLabel("City :");
								label_17.setBounds(75, 334, 140, 15);
								panel_7.add(label_17);
								
								JLabel label_18 = new JLabel("Pin Code :");
								label_18.setBounds(75, 372, 140, 15);
								panel_7.add(label_18);
								
								textField_41 = new JTextField();
								textField_41.setColumns(10);
								textField_41.setBounds(330, 135, 216, 19);
								panel_7.add(textField_41);
								
								textField_42 = new JTextField();
								textField_42.setColumns(10);
								textField_42.setBounds(330, 173, 216, 19);
								panel_7.add(textField_42);
								
								textField_43 = new JTextField();
								textField_43.setColumns(10);
								textField_43.setBounds(330, 211, 216, 19);
								panel_7.add(textField_43);
								
								textField_44 = new JTextField();
								textField_44.setColumns(10);
								textField_44.setBounds(329, 254, 217, 19);
								panel_7.add(textField_44);
								
								textField_45 = new JTextField();
								textField_45.setColumns(10);
								textField_45.setBounds(330, 295, 216, 19);
								panel_7.add(textField_45);
								
								textField_46 = new JTextField();
								textField_46.setColumns(10);
								textField_46.setBounds(329, 332, 217, 19);
								panel_7.add(textField_46);
								
								textField_47 = new JTextField();
								textField_47.setColumns(10);
								textField_47.setBounds(330, 370, 216, 19);
								panel_7.add(textField_47);
								
								JComboBox comboBox_2 = new JComboBox();
								comboBox_2.setBounds(330, 92, 216, 24);
								panel_7.add(comboBox_2);
								comboBox_2.addItem("Please Select");
								comboBox_2.addItem("ICSE");
								comboBox_2.addItem("CBSE");
								comboBox_2.addItem("RBSC");
								comboBox_2.addItem("Others");
								
								JLabel lblPhysics = new JLabel("Physics");
								lblPhysics.setBounds(75, 410, 70, 15);
								panel_7.add(lblPhysics);
								
								JLabel lblChemistry_1 = new JLabel("Chemistry");
								lblChemistry_1.setBounds(75, 437, 121, 15);
								panel_7.add(lblChemistry_1);
								
								JLabel lblChemistry = new JLabel("Mathematics");
								lblChemistry.setBounds(75, 464, 140, 15);
								panel_7.add(lblChemistry);
								
								JLabel label_10 = new JLabel("Total marks obtained :");
								label_10.setBounds(64, 504, 177, 15);
								panel_7.add(label_10);
								
								JLabel label_19 = new JLabel("Maximum Marks :");
								label_19.setBounds(280, 504, 140, 15);
								panel_7.add(label_19);
								
								JLabel label_20 = new JLabel("Percentage :");
								label_20.setBounds(463, 504, 140, 15);
								panel_7.add(label_20);
								
								textField_38 = new JTextField();
								textField_38.setColumns(10);
								textField_38.setBounds(75, 531, 143, 19);
								panel_7.add(textField_38);
								
								textField_39 = new JTextField();
								textField_39.setColumns(10);
								textField_39.setBounds(280, 531, 143, 19);
								panel_7.add(textField_39);
								
								textField_40 = new JTextField();
								textField_40.setColumns(10);
								textField_40.setBounds(460, 531, 143, 19);
								panel_7.add(textField_40);
								
								textField_48 = new JTextField();
								textField_48.setColumns(10);
								textField_48.setBounds(211, 408, 70, 19);
								panel_7.add(textField_48);
								
								textField_49 = new JTextField();
								textField_49.setColumns(10);
								textField_49.setBounds(211, 435, 70, 19);
								panel_7.add(textField_49);
								
								textField_50 = new JTextField();
								textField_50.setColumns(10);
								textField_50.setBounds(211, 462, 70, 19);
								panel_7.add(textField_50);
								
								JPanel panel_8 = new JPanel();
								panel_8.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
								tabbedPane.addTab("Submit", null, panel_8, null);
								panel_8.setLayout(null);
								
								JPanel panel_9 = new JPanel();
								panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
								panel_9.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
								panel_9.setBounds(26, 77, 596, 297);
								panel_8.add(panel_9);
								panel_9.setLayout(null);
								
								
								String[] preference = { "Please Select","Computer Science & Technology(CSE)", "Communication & Computer Engineering(CCE)", "Electronics and Communication Engineering(ECE)", "Mechanical & Mechatronics Engineering(MME)", "Mechanical Engineering(ME)" };
								
								
								final JComboBox comboBox_4 = new JComboBox();
								comboBox_4.setBounds(344, 45, 216, 24);
								panel_9.add(comboBox_4);
								comboBox_4.addItem(preference[0]);
								comboBox_4.addItem(preference[1]);
								comboBox_4.addItem(preference[2]);
								comboBox_4.addItem(preference[3]);
								comboBox_4.addItem(preference[4]);
								comboBox_4.addItem(preference[5]);
								
								//JComboBox petList = new JComboBox(preference);
								//petList.setSelectedIndex(4);
								//petList.addActionListener(this);
								comboBox_4.addActionListener(new ActionListener() {
								      public void actionPerformed(ActionEvent e) {
								        /*System.out.println("Selected index=" + comboBox_4.getSelectedIndex()
								            + " Selected item=" + comboBox_4.getSelectedItem());*/
								        
								        
								      }
								    });
								
								
								JComboBox comboBox_5 = new JComboBox();
								comboBox_5.setBounds(344, 90, 216, 24);
								panel_9.add(comboBox_5);
								
								comboBox_5.addItem(preference[0]);
								comboBox_5.addItem(preference[1]);
								comboBox_5.addItem(preference[2]);
								comboBox_5.addItem(preference[3]);
								comboBox_5.addItem(preference[4]);
								comboBox_5.addItem(preference[5]);
								
								//JComboBox petList = new JComboBox(preference);
								//petList.setSelectedIndex(4);
								//petList.addActionListener(this);
								comboBox_5.addActionListener(new ActionListener() {
								      public void actionPerformed(ActionEvent e) {
								        /*System.out.println("Selected index=" + comboBox_4.getSelectedIndex()
								            + " Selected item=" + comboBox_4.getSelectedItem());*/
								        
								        
								      }
								    });
								
								JComboBox comboBox_6 = new JComboBox();
								comboBox_6.setBounds(344, 142, 216, 24);
								panel_9.add(comboBox_6);
								
								comboBox_6.addItem(preference[0]);
								comboBox_6.addItem(preference[1]);
								comboBox_6.addItem(preference[2]);
								comboBox_6.addItem(preference[3]);
								comboBox_6.addItem(preference[4]);
								comboBox_6.addItem(preference[5]);
								
								//JComboBox petList = new JComboBox(preference);
								//petList.setSelectedIndex(4);
								//petList.addActionListener(this);
								comboBox_6.addActionListener(new ActionListener() {
								      public void actionPerformed(ActionEvent e) {
								        /*System.out.println("Selected index=" + comboBox_4.getSelectedIndex()
								            + " Selected item=" + comboBox_4.getSelectedItem());*/
								        
								        
								      }
								    });
								
								JComboBox comboBox_7 = new JComboBox();
								comboBox_7.setBounds(344, 245, 216, 24);
								panel_9.add(comboBox_7);
								
								comboBox_7.addItem(preference[0]);
								comboBox_7.addItem(preference[1]);
								comboBox_7.addItem(preference[2]);
								comboBox_7.addItem(preference[3]);
								comboBox_7.addItem(preference[4]);
								comboBox_7.addItem(preference[5]);
								
								//JComboBox petList = new JComboBox(preference);
								//petList.setSelectedIndex(4);
								//petList.addActionListener(this);
								comboBox_7.addActionListener(new ActionListener() {
								      public void actionPerformed(ActionEvent e) {
								        /*System.out.println("Selected index=" + comboBox_4.getSelectedIndex()
								            + " Selected item=" + comboBox_4.getSelectedItem());*/
								        
								        
								      }
								    });
								
								JComboBox comboBox_8 = new JComboBox();
								comboBox_8.setBounds(344, 199, 216, 24);
								panel_9.add(comboBox_8);
								
								comboBox_8.addItem(preference[0]);
								comboBox_8.addItem(preference[1]);
								comboBox_8.addItem(preference[2]);
								comboBox_8.addItem(preference[3]);
								comboBox_8.addItem(preference[4]);
								comboBox_8.addItem(preference[5]);
								
								//JComboBox petList = new JComboBox(preference);
								//petList.setSelectedIndex(4);
								//petList.addActionListener(this);
								comboBox_8.addActionListener(new ActionListener() {
								      public void actionPerformed(ActionEvent e) {
								        /*System.out.println("Selected index=" + comboBox_4.getSelectedIndex()
								            + " Selected item=" + comboBox_4.getSelectedItem());*/
								        
								        
								      }
								    });
								
								
								JLabel lblPreference = new JLabel("Preference 1 :");
								lblPreference.setBounds(32, 50, 139, 15);
								panel_9.add(lblPreference);
								
								JLabel lblPreference_1 = new JLabel("Preference 2 :");
								lblPreference_1.setBounds(32, 95, 139, 15);
								panel_9.add(lblPreference_1);
								
								JLabel lblPreference_2 = new JLabel("Preference 3 :");
								lblPreference_2.setBounds(32, 147, 139, 15);
								panel_9.add(lblPreference_2);
								
								JLabel lblPreference_3 = new JLabel("Preference 4 :");
								lblPreference_3.setBounds(32, 204, 139, 15);
								panel_9.add(lblPreference_3);
								
								JLabel lblPreference_4 = new JLabel("Preference 5 :");
								lblPreference_4.setBounds(32, 250, 139, 15);
								panel_9.add(lblPreference_4);
								
								JLabel lblFillInYour = new JLabel("Fill in your branch preferences");
								lblFillInYour.setFont(new Font("Dialog", Font.BOLD, 20));
								lblFillInYour.setBounds(26, 24, 429, 41);
								panel_8.add(lblFillInYour);
								
								JButton btnSubmit = new JButton("Submit");
								btnSubmit.setBounds(249, 515, 117, 25);
								panel_8.add(btnSubmit);
		
				
				
	}
}
