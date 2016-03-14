package gui_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.border.LineBorder;

public class Login_Info extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Info frame = new Login_Info();
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
	public Login_Info() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblFirstName = new JLabel("First Name");
		contentPane.add(lblFirstName, "4, 4");
		
		JLabel lblNewLabel = new JLabel("None");
		String sql_1= "select first_name from detail1 where mainrollnumber = TextField_2.getText";
		lblNewLabel.setText(sql_1.toString());
		contentPane.add(lblNewLabel, "10, 4");
		
		JLabel lblthSchoolBoard = new JLabel("10th School Board");
		contentPane.add(lblthSchoolBoard, "34, 4");
		
		JLabel lblNewLabel_10 = new JLabel("None");
		contentPane.add(lblNewLabel_10, "46, 4");
		
		JLabel lblthSchoolBoard_1 = new JLabel("12th School Board");
		contentPane.add(lblthSchoolBoard_1, "60, 4");
		
		JLabel lblNewLabel_11 = new JLabel("None");
		contentPane.add(lblNewLabel_11, "62, 4");
		
		JLabel lblLastName = new JLabel("Last Name");
		contentPane.add(lblLastName, "4, 6");
		
		JLabel lblNewLabel_1 = new JLabel("None");
		contentPane.add(lblNewLabel_1, "10, 6");
		
		JLabel lblthSchoolName = new JLabel("10th School Name");
		contentPane.add(lblthSchoolName, "34, 6");
		
		JLabel lblNewLabel_12 = new JLabel("None");
		contentPane.add(lblNewLabel_12, "46, 6");
		
		JLabel lblthSchoolName_1 = new JLabel("10th School Name");
		contentPane.add(lblthSchoolName_1, "60, 6");
		
		JLabel lblNewLabel_20 = new JLabel("None");
		contentPane.add(lblNewLabel_20, "62, 6");
		
		JLabel lblFathersName = new JLabel("Father's Name");
		contentPane.add(lblFathersName, "4, 8");
		
		JLabel lblNewLabel_2 = new JLabel("None");
		contentPane.add(lblNewLabel_2, "10, 8");
		
		JLabel lblthSchoolAddress = new JLabel("10th School Address");
		contentPane.add(lblthSchoolAddress, "34, 8");
		
		JLabel lblNewLabel_13 = new JLabel("None");
		contentPane.add(lblNewLabel_13, "46, 8");
		
		JLabel lblthSchoolAddress_1 = new JLabel("12th School Address");
		contentPane.add(lblthSchoolAddress_1, "60, 8");
		
		JLabel lblNewLabel_21 = new JLabel("None");
		contentPane.add(lblNewLabel_21, "62, 8");
		
		JLabel lblMothersName = new JLabel("Mother's Name");
		contentPane.add(lblMothersName, "4, 10");
		
		JLabel lblNewLabel_3 = new JLabel("None");
		contentPane.add(lblNewLabel_3, "10, 10");
		
		JLabel lblCountry = new JLabel("Country");
		contentPane.add(lblCountry, "34, 10");
		
		JLabel lblNewLabel_14 = new JLabel("None");
		contentPane.add(lblNewLabel_14, "46, 10");
		
		JLabel lblCountry_1 = new JLabel("Country");
		contentPane.add(lblCountry_1, "60, 10");
		
		JLabel lblNewLabel_22 = new JLabel("None");
		contentPane.add(lblNewLabel_22, "62, 10");
		
		JLabel lblDob = new JLabel("DOB");
		contentPane.add(lblDob, "4, 12");
		
		JLabel lblNewLabel_4 = new JLabel("None");
		contentPane.add(lblNewLabel_4, "10, 12");
		
		JLabel lblDistrict = new JLabel("District");
		contentPane.add(lblDistrict, "34, 12");
		
		JLabel lblNewLabel_15 = new JLabel("None");
		contentPane.add(lblNewLabel_15, "46, 12");
		
		JLabel lblDistrict_1 = new JLabel("District");
		contentPane.add(lblDistrict_1, "60, 12");
		
		JLabel lblNewLabel_23 = new JLabel("None");
		contentPane.add(lblNewLabel_23, "62, 12");
		
		JLabel lblGender = new JLabel("Gender");
		contentPane.add(lblGender, "4, 14");
		
		JLabel lblNewLabel_5 = new JLabel("None");
		contentPane.add(lblNewLabel_5, "10, 14");
		
		JLabel lblState = new JLabel("State");
		contentPane.add(lblState, "34, 14");
		
		JLabel lblNewLabel_16 = new JLabel("None");
		contentPane.add(lblNewLabel_16, "46, 14");
		
		JLabel lblState_1 = new JLabel("State");
		contentPane.add(lblState_1, "60, 14");
		
		JLabel lblNewLabel_24 = new JLabel("None");
		contentPane.add(lblNewLabel_24, "62, 14");
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		contentPane.add(lblMobileNo, "4, 16");
		
		JLabel lblNewLabel_6 = new JLabel("None");
		contentPane.add(lblNewLabel_6, "10, 16");
		
		JLabel lblCity = new JLabel("City");
		contentPane.add(lblCity, "34, 16");
		
		JLabel lblNewLabel_17 = new JLabel("None");
		contentPane.add(lblNewLabel_17, "46, 16");
		
		JLabel lblCity_1 = new JLabel("City");
		contentPane.add(lblCity_1, "60, 16");
		
		JLabel lblNewLabel_25 = new JLabel("None");
		contentPane.add(lblNewLabel_25, "62, 16");
		
		JLabel lblEmailId = new JLabel("EMail Id");
		contentPane.add(lblEmailId, "4, 18");
		
		JLabel lblNewLabel_7 = new JLabel("None");
		contentPane.add(lblNewLabel_7, "10, 18");
		
		JLabel lblPinCode = new JLabel("Pin Code");
		contentPane.add(lblPinCode, "34, 18");
		
		JLabel lblNewLabel_18 = new JLabel("None");
		contentPane.add(lblNewLabel_18, "46, 18");
		
		JLabel lblPinCode_1 = new JLabel("Pin Code");
		contentPane.add(lblPinCode_1, "60, 18");
		
		JLabel lblNewLabel_26 = new JLabel("None");
		contentPane.add(lblNewLabel_26, "62, 18");
		
		JLabel lblNationality = new JLabel("Nationality");
		contentPane.add(lblNationality, "4, 20");
		
		JLabel lblNewLabel_9 = new JLabel("None");
		contentPane.add(lblNewLabel_9, "10, 20");
		
		JLabel lblPercentage = new JLabel("Percentage");
		contentPane.add(lblPercentage, "34, 20");
		
		JLabel lblNewLabel_19 = new JLabel("None");
		contentPane.add(lblNewLabel_19, "46, 20");
		
		JLabel lblMarksInPhysics = new JLabel("Marks In Physics");
		contentPane.add(lblMarksInPhysics, "60, 20");
		
		JLabel lblNewLabel_27 = new JLabel("None");
		contentPane.add(lblNewLabel_27, "62, 20");
		
		JLabel lblMarksInChemistry = new JLabel("Marks in Chemistry");
		contentPane.add(lblMarksInChemistry, "60, 22");
		
		JLabel lblNewLabel_28 = new JLabel("None");
		contentPane.add(lblNewLabel_28, "62, 22");
		
		JLabel lblMarksInMaths = new JLabel("Marks in Maths");
		contentPane.add(lblMarksInMaths, "60, 24");
		
		JLabel lblNewLabel_29 = new JLabel("None");
		contentPane.add(lblNewLabel_29, "62, 24");
		
		JLabel lblPercentage_1 = new JLabel("Percentage");
		contentPane.add(lblPercentage_1, "60, 26");
		
		JLabel lblNewLabel_30 = new JLabel("None");
		contentPane.add(lblNewLabel_30, "62, 26");
		
		JLabel lblLocalAddress = new JLabel("Local Address");
		contentPane.add(lblLocalAddress, "4, 36");
		
		JLabel lblNewLabel_31 = new JLabel("None");
		contentPane.add(lblNewLabel_31, "10, 36");
		
		JLabel lblPermanentAddress = new JLabel("Permanent Address");
		contentPane.add(lblPermanentAddress, "34, 36");
		
		JLabel lblNewLabel_39 = new JLabel("None");
		contentPane.add(lblNewLabel_39, "46, 36");
		
		JLabel lblNewLabel_32 = new JLabel((String) null);
		contentPane.add(lblNewLabel_32, "4, 38");
		
		JLabel lblCity_2 = new JLabel("City");
		contentPane.add(lblCity_2, "4, 40");
		
		JLabel lblNewLabel_33 = new JLabel("None");
		contentPane.add(lblNewLabel_33, "10, 40");
		
		JLabel lblCity_3 = new JLabel("City");
		contentPane.add(lblCity_3, "34, 40");
		
		JLabel lblNewLabel_40 = new JLabel("None");
		contentPane.add(lblNewLabel_40, "46, 40");
		
		JLabel lblDistrict_2 = new JLabel("District");
		contentPane.add(lblDistrict_2, "4, 42");
		
		JLabel lblNewLabel_34 = new JLabel("None");
		contentPane.add(lblNewLabel_34, "10, 42");
		
		JLabel lblDistrict_3 = new JLabel("District");
		contentPane.add(lblDistrict_3, "34, 42");
		
		JLabel lblNewLabel_41 = new JLabel("None");
		contentPane.add(lblNewLabel_41, "46, 42");
		
		JLabel lblState_2 = new JLabel("State");
		contentPane.add(lblState_2, "4, 44");
		
		JLabel lblNewLabel_35 = new JLabel("None");
		contentPane.add(lblNewLabel_35, "10, 44");
		
		JLabel lblState_3 = new JLabel("State");
		contentPane.add(lblState_3, "34, 44");
		
		JLabel lblNewLabel_42 = new JLabel("None");
		contentPane.add(lblNewLabel_42, "46, 44");
		
		JLabel lblPinCode_2 = new JLabel("Pin Code");
		contentPane.add(lblPinCode_2, "4, 46");
		
		JLabel lblNewLabel_36 = new JLabel("None");
		contentPane.add(lblNewLabel_36, "10, 46");
		
		JLabel lblPinCode_3 = new JLabel("Pin Code");
		contentPane.add(lblPinCode_3, "34, 46");
		
		JLabel lblNewLabel_43 = new JLabel("None");
		contentPane.add(lblNewLabel_43, "46, 46");
		
		JLabel lblLandlineNumber = new JLabel("Landline Number");
		contentPane.add(lblLandlineNumber, "4, 48");
		
		JLabel lblNewLabel_37 = new JLabel("None");
		contentPane.add(lblNewLabel_37, "10, 48");
		
		JLabel lblLandlineNumber_1 = new JLabel("landline Number");
		contentPane.add(lblLandlineNumber_1, "34, 48");
		
		JLabel lblNewLabel_44 = new JLabel("None");
		contentPane.add(lblNewLabel_44, "46, 48");
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		contentPane.add(lblMobileNumber, "4, 50");
		
		JLabel lblNewLabel_38 = new JLabel("None");
		contentPane.add(lblNewLabel_38, "10, 50");
		
		JLabel lblMobileNumber_1 = new JLabel("Mobile Number");
		contentPane.add(lblMobileNumber_1, "34, 50");
		
		JLabel lblNewLabel_45 = new JLabel("None");
		contentPane.add(lblNewLabel_45, "46, 50");
		
		JLabel lblJeeMainRoll = new JLabel("Jee Main Roll No.");
		contentPane.add(lblJeeMainRoll, "4, 54");
		
		JLabel lblNewLabel_46 = new JLabel("None");
		contentPane.add(lblNewLabel_46, "10, 54");
		
		JLabel lblJeeAdvancedRoll = new JLabel("Jee Advanced Roll No.");
		contentPane.add(lblJeeAdvancedRoll, "34, 54");
		
		JLabel lblNewLabel_52 = new JLabel("None");
		contentPane.add(lblNewLabel_52, "46, 54");
		
		JLabel lblJeeRank = new JLabel("Jee Rank");
		contentPane.add(lblJeeRank, "4, 56");
		
		JLabel lblNewLabel_47 = new JLabel("None");
		contentPane.add(lblNewLabel_47, "10, 56");
		
		JLabel lblMarksInPhysics_1 = new JLabel("Marks in Physics");
		contentPane.add(lblMarksInPhysics_1, "4, 58");
		
		JLabel lblNewLabel_48 = new JLabel("None");
		contentPane.add(lblNewLabel_48, "10, 58");
		
		JLabel lblJeeAdvancedRank = new JLabel("Jee Advanced Rank");
		contentPane.add(lblJeeAdvancedRank, "34, 58");
		
		JLabel lblNewLabel_53 = new JLabel("None");
		contentPane.add(lblNewLabel_53, "46, 58");
		
		JLabel lblMarksInChemistry_1 = new JLabel("Marks in Chemistry");
		contentPane.add(lblMarksInChemistry_1, "4, 60");
		
		JLabel lblNewLabel_49 = new JLabel("None");
		contentPane.add(lblNewLabel_49, "10, 60");
		
		JLabel lblMarksInMaths_1 = new JLabel("Marks in Maths");
		contentPane.add(lblMarksInMaths_1, "4, 62");
		
		JLabel lblNewLabel_50 = new JLabel("None");
		contentPane.add(lblNewLabel_50, "10, 62");
		
		JLabel lblJeeTotalScore = new JLabel("Jee Total Score");
		contentPane.add(lblJeeTotalScore, "4, 64");
		
		JLabel lblNewLabel_51 = new JLabel("None");
		contentPane.add(lblNewLabel_51, "10, 64");
		
		
	}

}