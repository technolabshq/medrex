package medrex.client.mds3.ui.fullPages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

import medrex.commons.enums.ColorConstants;
import medrex.commons.intf.Form;

import com.toedter.calendar.JDateChooser;

public class PanelMDS3Page21 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6993259416144743041L;

	public PanelMDS3Page21() {
		super();
		setPreferredSize(new Dimension(840, 750));
		final FlowLayout flowLayout_6 = new FlowLayout();
		flowLayout_6.setHgap(0);
		setLayout(flowLayout_6);
		setBackground(Color.WHITE);

		final JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(840, 35));
		add(panel);

		final JLabel residentLabel = new JLabel();
		residentLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel.setText("Resident");
		residentLabel.setBounds(10, 9, 56, 16);
		panel.add(residentLabel);

		final JTextField textField = new JTextField();
		textField.setBounds(84, 8, 248, 20);
		panel.add(textField);

		final JLabel residentLabel_1 = new JLabel();
		residentLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1.setText("Identifier");
		residentLabel_1.setBounds(354, 10, 56, 16);
		panel.add(residentLabel_1);

		final JTextField textField_1 = new JTextField();
		textField_1.setBounds(429, 8, 213, 20);
		panel.add(textField_1);

		final JLabel residentLabel_1_1 = new JLabel();
		residentLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		residentLabel_1_1.setText("Date");
		residentLabel_1_1.setBounds(668, 10, 56, 16);
		panel.add(residentLabel_1_1);

		final JDateChooser dcDate = new JDateChooser();
		dcDate.setBackground(Color.WHITE);
		dcDate.setBounds(730, 8, 100, 22);
		panel.add(dcDate);

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(ColorConstants.MDS_FONT_COLOR);
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(840, 25));
		add(panel_2);

		final JPanel panel_3 = new JPanel();
		panel_3.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_1 = new FlowLayout();
		flowLayout_1.setVgap(2);
		flowLayout_1.setHgap(10);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_3.setLayout(flowLayout_1);
		panel_3.setBounds(3, 3, 231, 18);
		panel_2.add(panel_3);

		final JLabel sectionALabel = new JLabel();
		sectionALabel.setForeground(Color.WHITE);
		sectionALabel.setFont(new Font("Arial", Font.BOLD, 16));
		sectionALabel.setText("Section J");
		panel_3.add(sectionALabel);

		final JPanel panel_4 = new JPanel();
		panel_4.setBackground(ColorConstants.MDS_BACK_COLOR);
		final FlowLayout flowLayout = new FlowLayout();
		flowLayout.setVgap(2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_4.setLayout(flowLayout);
		panel_4.setBounds(246, 2, 592, 21);
		panel_2.add(panel_4);

		final JLabel identificationInformationLabel = new JLabel();
		identificationInformationLabel
				.setForeground(ColorConstants.MDS_FONT_COLOR);
		identificationInformationLabel
				.setFont(new Font("Arial", Font.BOLD, 16));
		identificationInformationLabel
				.setHorizontalAlignment(SwingConstants.LEFT);
		identificationInformationLabel.setText("Health Conditions");
		panel_4.add(identificationInformationLabel);

		final JPanel panel_1_1_2_2 = new JPanel();
		panel_1_1_2_2.setBackground(Color.WHITE);
		panel_1_1_2_2.setBorder(new LineBorder(Color.black, 1, false));
		panel_1_1_2_2.setLayout(null);
		panel_1_1_2_2.setPreferredSize(new Dimension(840, 280));
		add(panel_1_1_2_2);

		final JPanel panel_6_1_1_2 = new JPanel();
		panel_6_1_1_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_1_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		panel_6_1_1_2.setLayout(null);
		panel_6_1_1_2.setBounds(0, 29, 84, 251);
		panel_1_1_2_2.add(panel_6_1_1_2);

		final JLabel enterCodeLabel_1_3 = new JLabel();
		enterCodeLabel_1_3.setText("Enter Code");
		enterCodeLabel_1_3.setBounds(15, 9, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_3);

		final JComboBox comboBox_1_3 = new JComboBox();
		comboBox_1_3.setModel(new DefaultComboBoxModel(new String[] { "", "0",
				"1" }));
		comboBox_1_3.setBackground(Color.WHITE);
		comboBox_1_3.setPreferredSize(new Dimension(50, 20));
		comboBox_1_3.setBounds(17, 31, 50, 20);
		panel_6_1_1_2.add(comboBox_1_3);

		final JLabel enterCodeLabel_1_1_3 = new JLabel();
		enterCodeLabel_1_1_3.setText("Enter Code");
		enterCodeLabel_1_1_3.setBounds(15, 68, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_1_3);

		final JComboBox comboBox_1_1_3 = new JComboBox();
		comboBox_1_1_3.setModel(new DefaultComboBoxModel(new String[] { "",
				"0", "1" }));
		comboBox_1_1_3.setBackground(Color.WHITE);
		comboBox_1_1_3.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_3.setBounds(15, 88, 50, 20);
		panel_6_1_1_2.add(comboBox_1_1_3);

		final JLabel enterCodeLabel_1_1_2_1 = new JLabel();
		enterCodeLabel_1_1_2_1.setText("Enter Code");
		enterCodeLabel_1_1_2_1.setBounds(15, 130, 54, 14);
		panel_6_1_1_2.add(enterCodeLabel_1_1_2_1);

		final JComboBox comboBox_1_1_2_1 = new JComboBox();
		comboBox_1_1_2_1.setModel(new DefaultComboBoxModel(new String[] { "",
				"0", "1" }));
		comboBox_1_1_2_1.setBackground(Color.WHITE);
		comboBox_1_1_2_1.setPreferredSize(new Dimension(50, 20));
		comboBox_1_1_2_1.setBounds(15, 150, 50, 20);
		panel_6_1_1_2.add(comboBox_1_1_2_1);

		final JPanel panel_7_1_1_3 = new JPanel();
		panel_7_1_1_3.setBackground(Color.WHITE);
		panel_7_1_1_3.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_3.setLayout(null);
		panel_7_1_1_3.setBounds(83, 29, 757, 86);
		panel_1_1_2_2.add(panel_7_1_1_3);

		final JLabel aNationalProviderLabel_3_1_1_3 = new JLabel();
		aNationalProviderLabel_3_1_1_3
				.setFont(new Font("Arial", Font.PLAIN, 12));
		aNationalProviderLabel_3_1_1_3
				.setText("<html><b>A.</b> Did the resident have fall any time in the <b>last month</b> prior to admission?");
		aNationalProviderLabel_3_1_1_3.setBounds(10, 5, 706, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_3_1_1_3);

		final JLabel aNationalProviderLabel_1_3_1_5_2 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_1_3_1_5_2.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2.setBounds(20, 25, 311, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_1_3_1_5_2);

		final JLabel aNationalProviderLabel_1_3_1_5_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_1.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1.setBounds(20, 45, 311, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_1_3_1_5_2_1);

		final JLabel aNationalProviderLabel_1_3_1_5_2_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1
				.setText("<html>9. <b>Unable to answer");
		aNationalProviderLabel_1_3_1_5_2_1_1.setBounds(20, 65, 311, 14);
		panel_7_1_1_3.add(aNationalProviderLabel_1_3_1_5_2_1_1);

		final JPanel panel_5_1_1_2_2 = new JPanel();
		panel_5_1_1_2_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1_2_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR,
				1, false));
		final FlowLayout flowLayout_12 = new FlowLayout();
		flowLayout_12.setVgap(0);
		flowLayout_12.setHgap(10);
		flowLayout_12.setAlignment(FlowLayout.LEFT);
		panel_5_1_1_2_2.setLayout(flowLayout_12);
		panel_5_1_1_2_2.setPreferredSize(new Dimension(820, 30));
		panel_5_1_1_2_2.setBounds(0, 0, 840, 30);
		panel_1_1_2_2.add(panel_5_1_1_2_2);

		final JLabel a0100Label_1_1_2_2 = new JLabel();
		a0100Label_1_1_2_2
				.setText("<html><b>J1700.Fall History on admission<br></b>Complete only if A01310E=1 or A0310E = 1");
		panel_5_1_1_2_2.add(a0100Label_1_1_2_2);

		final JPanel panel_7_1_1_3_1_1 = new JPanel();
		panel_7_1_1_3_1_1.setBackground(Color.WHITE);
		panel_7_1_1_3_1_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_3_1_1.setLayout(null);
		panel_7_1_1_3_1_1.setBounds(83, 200, 757, 79);
		panel_1_1_2_2.add(panel_7_1_1_3_1_1);

		final JLabel aNationalProviderLabel_3_1_1_3_1_1 = new JLabel();
		aNationalProviderLabel_3_1_1_3_1_1.setFont(new Font("Arial",
				Font.PLAIN, 12));
		aNationalProviderLabel_3_1_1_3_1_1
				.setText("<html><b>C.</b> Did the resident have any <b>fracture related to a fall in the last 6 months</b>prior to admission?");
		aNationalProviderLabel_3_1_1_3_1_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_3_1_1_3_1_1);

		final JLabel aNationalProviderLabel_1_3_1_5_2_2_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_2_1.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2_2_1.setBounds(20, 25, 311, 14);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_1_3_1_5_2_2_1);

		final JLabel aNationalProviderLabel_1_3_1_5_2_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1_1.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1_1_1.setBounds(20, 40, 311, 14);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_1_3_1_5_2_1_1_1);

		final JLabel aNationalProviderLabel_1_3_1_5_2_1_1_1_1 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1_1_1
				.setText("<html>9. <b>Unable to answer");
		aNationalProviderLabel_1_3_1_5_2_1_1_1_1.setBounds(20, 55, 311, 14);
		panel_7_1_1_3_1_1.add(aNationalProviderLabel_1_3_1_5_2_1_1_1_1);

		final JPanel panel_7_1_1_3_1 = new JPanel();
		panel_7_1_1_3_1.setBackground(Color.WHITE);
		panel_7_1_1_3_1.setBorder(new LineBorder(Color.black, 1, false));
		panel_7_1_1_3_1.setLayout(null);
		panel_7_1_1_3_1.setBounds(83, 114, 757, 86);
		panel_1_1_2_2.add(panel_7_1_1_3_1);

		final JLabel aNationalProviderLabel_3_1_1_3_1 = new JLabel();
		aNationalProviderLabel_3_1_1_3_1.setFont(new Font("Arial", Font.PLAIN,
				12));
		aNationalProviderLabel_3_1_1_3_1
				.setText("<html> <b> B.</b> Did the resident have a fall any time in the <b>last 2-6 months</b> prior to admission?");
		aNationalProviderLabel_3_1_1_3_1.setBounds(10, 5, 706, 14);
		panel_7_1_1_3_1.add(aNationalProviderLabel_3_1_1_3_1);

		final JLabel aNationalProviderLabel_1_3_1_5_2_2 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_2.setText("<html>0. <b>No");
		aNationalProviderLabel_1_3_1_5_2_2.setBounds(20, 25, 311, 14);
		panel_7_1_1_3_1.add(aNationalProviderLabel_1_3_1_5_2_2);

		final JLabel aNationalProviderLabel_1_3_1_5_2_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_1_2.setText("<html>1. <b>Yes</b>");
		aNationalProviderLabel_1_3_1_5_2_1_2.setBounds(20, 45, 311, 14);
		panel_7_1_1_3_1.add(aNationalProviderLabel_1_3_1_5_2_1_2);

		final JLabel aNationalProviderLabel_1_3_1_5_2_1_1_2 = new JLabel();
		aNationalProviderLabel_1_3_1_5_2_1_1_2
				.setText("<html>9. <b>Unable to answer");
		aNationalProviderLabel_1_3_1_5_2_1_1_2.setBounds(20, 65, 311, 14);
		panel_7_1_1_3_1.add(aNationalProviderLabel_1_3_1_5_2_1_1_2);

		final JPanel panel_1_2 = new JPanel();
		add(panel_1_2);
		panel_1_2.setBackground(Color.WHITE);
		panel_1_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_1_2.setLayout(null);
		panel_1_2.setPreferredSize(new Dimension(840, 100));

		final JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_7 = new FlowLayout();
		flowLayout_7.setHgap(10);
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_5_2.setLayout(flowLayout_7);
		panel_5_2.setBounds(0, 0, 840, 27);
		panel_1_2.add(panel_5_2);

		final JLabel a0100Label_2 = new JLabel();
		a0100Label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		a0100Label_2
				.setText("<html><b>J1800. Any Falls Since Admission or prior Assessment (OBRA,PPS,or Discharge),</b>whichever is more recent.");
		panel_5_2.add(a0100Label_2);

		final JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_6_2.setLayout(null);
		panel_6_2.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		panel_6_2.setBounds(0, 26, 84, 74);
		panel_1_2.add(panel_6_2);

		final JLabel enterCodeLabel_2 = new JLabel();
		enterCodeLabel_2.setText("Enter Code");
		enterCodeLabel_2.setBounds(10, 10, 54, 14);
		panel_6_2.add(enterCodeLabel_2);

		final JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setPreferredSize(new Dimension(50, 20));
		comboBox_2.setBounds(10, 30, 50, 20);
		panel_6_2.add(comboBox_2);

		final JPanel panel_7_2 = new JPanel();
		panel_7_2.setOpaque(false);
		panel_7_2.setLayout(null);
		panel_7_2.setBounds(90, 33, 740, 57);
		panel_1_2.add(panel_7_2);

		final JLabel aNationalProviderLabel_3 = new JLabel();
		aNationalProviderLabel_3
				.setText("<html><body>Has the resident <b>had any falls since admission or the prior assessment</b>(OBRA,PPS,or Discharge), whichever is more recent.");
		aNationalProviderLabel_3.setBounds(10, 5, 706, 14);
		panel_7_2.add(aNationalProviderLabel_3);

		final JLabel aNationalProviderLabel_1_3 = new JLabel();
		aNationalProviderLabel_1_3
				.setText("<html><body>01. <b>Yes</b> - > Continue to J1900 Number of falls Since admission or prior Assessment (OBRA,PPS,Or Discharge)");
		aNationalProviderLabel_1_3.setBounds(21, 43, 676, 14);
		panel_7_2.add(aNationalProviderLabel_1_3);

		final JLabel aNationalProviderLabel_1_3_2 = new JLabel();
		aNationalProviderLabel_1_3_2
				.setText("<html>0. <b>No - > </b>skip to K0100 swallowing Disorder");
		aNationalProviderLabel_1_3_2.setBounds(20, 25, 311, 14);
		panel_7_2.add(aNationalProviderLabel_1_3_2);

		final JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(840, 215));
		panel_1.setName("");
		panel_1.setBackground(ColorConstants.MDS_FONT_COLOR);
		final FlowLayout flowLayout_2 = new FlowLayout();
		flowLayout_2.setHgap(0);
		flowLayout_2.setVgap(0);
		panel_1.setLayout(flowLayout_2);
		add(panel_1);

		final JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setRequestFocusEnabled(false);
		final FlowLayout flowLayout_4 = new FlowLayout();
		flowLayout_4.setVgap(0);
		flowLayout_4.setHgap(0);
		panel_1_1_1.setLayout(flowLayout_4);
		panel_1.add(panel_1_1_1);
		panel_1_1_1.setBackground(Color.WHITE);
		panel_1_1_1.setPreferredSize(new Dimension(840, 216));

		final JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setPreferredSize(new Dimension(840, 30));
		panel_5_1_1.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_5_1_1.setBorder(new LineBorder(ColorConstants.MDS_FONT_COLOR, 1,
				false));
		final FlowLayout flowLayout_5 = new FlowLayout();
		flowLayout_5.setHgap(10);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_5_1_1.setLayout(flowLayout_5);
		panel_1_1_1.add(panel_5_1_1);

		final JLabel a0100Label_1_1 = new JLabel();
		a0100Label_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		a0100Label_1_1.setText("J0300. Pain presence");
		panel_5_1_1.add(a0100Label_1_1);

		final JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setPreferredSize(new Dimension(840, 185));
		panel_1_1_1.add(panel_6);

		final JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBorder(new LineBorder(Color.black, 1, false));
		panel_7.setLayout(null);
		panel_7.setBounds(0, 0, 168, 185);
		panel_6.add(panel_7);

		final JLabel codingLabel = new JLabel();
		codingLabel.setFont(new Font("Arial", Font.BOLD, 12));
		codingLabel.setText("Coding");
		codingLabel.setBounds(10, 24, 49, 14);
		panel_7.add(codingLabel);

		final JLabel label = new JLabel();
		label.setText("<html>0. <b> None");
		label.setBounds(20, 49, 167, 14);
		panel_7.add(label);

		final JLabel label_1 = new JLabel();
		label_1.setText("<html>1. <b> One");
		label_1.setBounds(20, 70, 167, 14);
		panel_7.add(label_1);

		final JLabel label_1_1 = new JLabel();
		label_1_1.setText("<html>2. <b>Two or More");
		label_1_1.setBounds(20, 90, 167, 14);
		panel_7.add(label_1_1);

		final JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_3 = new FlowLayout();
		flowLayout_3.setVgap(0);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_9.setLayout(flowLayout_3);
		panel_9.setBounds(168, 0, 672, 17);
		panel_6.add(panel_9);

		final JLabel enterCodeInLabel = new JLabel();
		enterCodeInLabel.setText("Enter Code in Boxes");
		panel_9.add(enterCodeInLabel);

		final JPanel panel_10 = new JPanel();
		panel_10.setBackground(ColorConstants.MDS_BACK_COLOR);
		panel_10.setBorder(new LineBorder(Color.black, 1, false));
		panel_10.setLayout(null);
		panel_10.setBounds(168, 16, 67, 169);
		panel_6.add(panel_10);

		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(10, 10, 47, 21);
		panel_10.add(comboBox_3);

		final JComboBox comboBox_3_1 = new JComboBox();
		comboBox_3_1.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_3_1.setBackground(Color.WHITE);
		comboBox_3_1.setBounds(10, 68, 47, 21);
		panel_10.add(comboBox_3_1);

		final JComboBox comboBox_3_3 = new JComboBox();
		comboBox_3_3.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox_3_3.setBackground(Color.WHITE);
		comboBox_3_3.setBounds(10, 124, 47, 21);
		panel_10.add(comboBox_3_3);

		final JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setOpaque(true);
		panel_11.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_8 = new FlowLayout();
		flowLayout_8.setHgap(30);
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		panel_11.setLayout(flowLayout_8);
		panel_11.setBounds(234, 16, 606, 58);
		panel_6.add(panel_11);

		final JLabel aInattentionLabel = new JLabel();
		aInattentionLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		aInattentionLabel
				.setText("<Html><b>A. No Injury</b>- no evidence of any injury is noted on physical assessment by the nurse or primary<br>care clinian; no complaints of pain or injury by the resident; no change in the residents behavior <br>is noted  after the fall.");
		panel_11.add(aInattentionLabel);

		final JPanel panel_11_2 = new JPanel();
		panel_11_2.setBackground(Color.WHITE);
		panel_11_2.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_10 = new FlowLayout();
		flowLayout_10.setHgap(30);
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		panel_11_2.setLayout(flowLayout_10);
		panel_11_2.setBounds(234, 73, 606, 58);
		panel_6.add(panel_11_2);

		final JLabel aInattentionLabel_1_1 = new JLabel();
		aInattentionLabel_1_1
				.setText("<html><b>B. Injury (except major) - </b> skin tears , abrassion, lacerations , superficial bruises, hematomas and <br>sprains or any fall related injury that causes the resident to complain of pain.");
		panel_11_2.add(aInattentionLabel_1_1);

		final JPanel panel_11_3 = new JPanel();
		panel_11_3.setBackground(Color.WHITE);
		panel_11_3.setBorder(new LineBorder(Color.black, 1, false));
		final FlowLayout flowLayout_11 = new FlowLayout();
		flowLayout_11.setHgap(30);
		flowLayout_11.setAlignment(FlowLayout.LEFT);
		panel_11_3.setLayout(flowLayout_11);
		panel_11_3.setBounds(234, 130, 606, 55);
		panel_6.add(panel_11_3);

		final JLabel aInattentionLabel_1_2 = new JLabel();
		aInattentionLabel_1_2
				.setText("<html><b>C. Major injury -</b> bone fractures, joint dislocations, closed head injuries with altered <br>conciousness , subdural hematoma ");
		panel_11_3.add(aInattentionLabel_1_2);

		final JLabel aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1 = new JLabel();
		add(aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1);
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setPreferredSize(new Dimension(820, 30));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1.setFont(new Font("Arial",
				Font.PLAIN, 14));
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setText("MDS 3.0 Nursing Home Comprehensive (NC) Version 1.00.2 10/01/2010");
		aNationalProviderLabel_1_1_1_1_2_1_2_1_1_1
				.setForeground(ColorConstants.MDS_FONT_COLOR);

	}

	public static void main(String ar[]) {
		try {
			UIManager
					.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JScrollPane scroller = new JScrollPane();
		PanelMDS3Page6 panel = new PanelMDS3Page6();
		scroller.setViewportView(panel);
		JFrame frm = new JFrame("Frame");
		frm.setSize(new Dimension(java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize()));
		frm.add(scroller);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setState(JFrame.MAXIMIZED_BOTH);
		frm.setVisible(true);

		// SwingUtils.openInDialogforJPanel().setVisible(true);
	}

	public void doLoad() {
		// TODO Auto-generated method stub

	}

	public int doSave() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void doUpdate() {
		// TODO Auto-generated method stub

	}

	public boolean doValidate() {
		// TODO Auto-generated method stub
		return false;
	}
}
