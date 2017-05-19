package medrex.client.main.MonthlySummary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.utils.SwingUtils;
import medrex.commons.intf.Form;
import medrex.commons.vo.admission.ResidentAssessmentFormPage21;
import medrex.commons.vo.notes.Notes;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.physician.PhysicianForm;
import medrex.commons.vo.resident.ResidentDiagnosis;
import medrex.commons.vo.resident.ResidentMain;
import medrex.commons.vo.resident.TempRoomHistory;

import com.sX.swing.notes.JxNotes;
import com.toedter.calendar.JDateChooser;

public class PanelResidentAssessmentFormPage21 extends JPanel implements Form {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5456390623110439610L;
	private JTextField txtAdjustments;
	private JTextField txtDesideredWeight;
	private JTextField txtHeight;
	private JTextField txtWeight;
	private JTextField txtEdema;
	private JTextField txtConstipation;
	private JTextField txtOpenArea;
	private JRadioButton rbSkinImpaired;
	private JRadioButton rbSkinNormal;
	private JTextField txtFoodAlergy;
	private JRadioButton rbApptitePoor;
	private JRadioButton rbApptiteFair;
	private JRadioButton rbApptiteGood;
	private JTextField txtFluidIntake;
	private JxNotes txtAreaPreferences;
	private JxNotes txtAreaLabData;
	private JTextField txtMedications;
	private JTextField txtDiagnosis;
	private JTextField txtDiet;
	private JTextField txtResidentName;
	private JTextField txtPhysician;
	private JTextField txtRoom;
	private JDateChooser dcDate;
	private JTextField txtEatingAdaptive;
	private JTextField txtEatingReason;
	private JRadioButton rbEatingDysphagic;
	private JRadioButton rbEatingNPO;
	private JRadioButton rbEatingTPN;
	private JRadioButton rbEatingGT;
	private JRadioButton rbEatingNeedAssist;
	private JRadioButton rbEatingIndependent;
	private JRadioButton rbEatingDependent;
	private ButtonGroup bgEatingAndNutrition = new ButtonGroup();
	private ButtonGroup bgAppetite = new ButtonGroup();
	private ButtonGroup bgSkinIntegrity = new ButtonGroup();
	private Notes notestxtAreaLabData;
	private Notes notestxtAreaPreferences;
	// If true then categories list and label will display otherwise not.
	private boolean isCategories = true;

	public PanelResidentAssessmentFormPage21() {
		super();

		Global.currentResidentAssessmentFormPage21 = this;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(930, 800));
		setLayout(null);

		final JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.black, 1, false));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(10, 10, 910, 755);
		add(panel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(1, 0, 908, 142);
		panel.add(panel_1);

		final JPanel panel_29 = new JPanel();
		panel_29.setBackground(Color.BLACK);
		panel_29.setLayout(null);
		panel_29.setBounds(0, 0, 910, 26);
		panel_1.add(panel_29);

		final JLabel eatingNutritionLabel = new JLabel();
		eatingNutritionLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		eatingNutritionLabel.setForeground(new Color(255, 255, 255));
		eatingNutritionLabel.setText("DIETARY");
		eatingNutritionLabel.setBounds(381, 0, 160, 30);
		panel_29.add(eatingNutritionLabel);

		rbEatingDependent = new JRadioButton();
		rbEatingDependent.setBackground(Color.WHITE);
		rbEatingDependent.setActionCommand("1");
		rbEatingDependent.setText("Dependent");
		rbEatingDependent.setBounds(10, 62, 86, 24);
		bgEatingAndNutrition.add(rbEatingDependent);
		panel_1.add(rbEatingDependent);

		rbEatingIndependent = new JRadioButton();
		rbEatingIndependent.setBackground(Color.WHITE);
		rbEatingIndependent.setActionCommand("2");
		rbEatingIndependent.setText("Independent");
		rbEatingIndependent.setBounds(116, 62, 102, 24);
		bgEatingAndNutrition.add(rbEatingIndependent);
		panel_1.add(rbEatingIndependent);

		rbEatingNeedAssist = new JRadioButton();
		rbEatingNeedAssist.setBackground(Color.WHITE);
		rbEatingNeedAssist.setActionCommand("3");
		rbEatingNeedAssist.setText("Need Assistance");
		rbEatingNeedAssist.setBounds(228, 62, 109, 24);
		bgEatingAndNutrition.add(rbEatingNeedAssist);
		panel_1.add(rbEatingNeedAssist);

		rbEatingGT = new JRadioButton();
		rbEatingGT.setBackground(Color.WHITE);
		rbEatingGT.setActionCommand("4");
		rbEatingGT.setText("GT");
		rbEatingGT.setBounds(349, 62, 46, 24);
		bgEatingAndNutrition.add(rbEatingGT);
		panel_1.add(rbEatingGT);

		rbEatingTPN = new JRadioButton();
		rbEatingTPN.setBackground(Color.WHITE);
		rbEatingTPN.setActionCommand("5");
		rbEatingTPN.setText("TPN");
		rbEatingTPN.setBounds(408, 62, 67, 24);
		bgEatingAndNutrition.add(rbEatingTPN);
		panel_1.add(rbEatingTPN);

		rbEatingNPO = new JRadioButton();
		rbEatingNPO.setBackground(Color.WHITE);
		rbEatingNPO.setActionCommand("6");
		rbEatingNPO.setText("NPO");
		rbEatingNPO.setBounds(495, 62, 67, 24);
		bgEatingAndNutrition.add(rbEatingNPO);
		panel_1.add(rbEatingNPO);

		rbEatingDysphagic = new JRadioButton();
		rbEatingDysphagic.setBackground(Color.WHITE);
		rbEatingDysphagic.setActionCommand("7");
		rbEatingDysphagic.setText("Dysphagic");
		rbEatingDysphagic.setBounds(568, 62, 102, 24);
		bgEatingAndNutrition.add(rbEatingDysphagic);
		panel_1.add(rbEatingDysphagic);

		final JLabel reasonLabel = new JLabel();
		reasonLabel.setText("Reason");
		reasonLabel.setBounds(8, 92, 66, 16);
		panel_1.add(reasonLabel);

		txtEatingReason = new JTextField();
		txtEatingReason.setBounds(80, 90, 735, 20);
		panel_1.add(txtEatingReason);

		final JLabel adaptiveEquipmentLabel = new JLabel();
		adaptiveEquipmentLabel.setText("Adaptive Equipment");
		adaptiveEquipmentLabel.setBounds(10, 116, 124, 16);
		panel_1.add(adaptiveEquipmentLabel);

		txtEatingAdaptive = new JTextField();
		txtEatingAdaptive.setBounds(140, 114, 681, 20);
		panel_1.add(txtEatingAdaptive);

		final JLabel eatingNutritionLabel_1 = new JLabel();
		eatingNutritionLabel_1.setText("Eating & Nutrition");
		eatingNutritionLabel_1.setBounds(10, 40, 102, 14);
		panel_1.add(eatingNutritionLabel_1);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(1, 144, 908, 37);
		panel.add(panel_2);

		final JLabel dateLabel = new JLabel();
		dateLabel.setBounds(10, 10, 54, 14);
		dateLabel.setText("Date");
		panel_2.add(dateLabel);

		dcDate = new JDateChooser();
		dcDate.setDateFormatString("MM/dd/yyyy");
		dcDate.setBounds(52, 4, 168, 26);
		panel_2.add(dcDate);

		final JLabel roomLabel = new JLabel();
		roomLabel.setText("Room");
		roomLabel.setBounds(285, 10, 54, 14);
		panel_2.add(roomLabel);

		txtRoom = new JTextField();
		txtRoom.setBounds(345, 8, 115, 18);
		panel_2.add(txtRoom);

		final JLabel physicianLabel = new JLabel();
		physicianLabel.setText("Physician");
		physicianLabel.setBounds(518, 10, 54, 14);
		panel_2.add(physicianLabel);

		txtPhysician = new JTextField();
		txtPhysician.setBounds(582, 8, 168, 18);
		panel_2.add(txtPhysician);

		final JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(1, 180, 908, 31);
		panel.add(panel_3);

		final JLabel residentNameLabel = new JLabel();
		residentNameLabel.setBounds(10, 10, 95, 14);
		residentNameLabel.setText("Resident Name");
		panel_3.add(residentNameLabel);

		txtResidentName = new JTextField();
		txtResidentName.setBounds(111, 8, 362, 18);
		panel_3.add(txtResidentName);

		final JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(1, 210, 908, 31);
		panel.add(panel_3_1);

		final JLabel residentNameLabel_1 = new JLabel();
		residentNameLabel_1.setText("Diet");
		residentNameLabel_1.setBounds(10, 10, 95, 14);
		panel_3_1.add(residentNameLabel_1);

		txtDiet = new JTextField();
		txtDiet.setBounds(111, 8, 362, 18);
		panel_3_1.add(txtDiet);

		final JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(Color.WHITE);
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBounds(1, 240, 908, 31);
		panel.add(panel_3_1_1);

		final JLabel residentNameLabel_1_1 = new JLabel();
		residentNameLabel_1_1.setText("Diagnosis");
		residentNameLabel_1_1.setBounds(10, 10, 95, 14);
		panel_3_1_1.add(residentNameLabel_1_1);

		txtDiagnosis = new JTextField();
		txtDiagnosis.setBounds(111, 8, 362, 18);
		panel_3_1_1.add(txtDiagnosis);

		final JPanel panel_3_1_2 = new JPanel();
		panel_3_1_2.setBackground(Color.WHITE);
		panel_3_1_2.setLayout(null);
		panel_3_1_2.setBounds(1, 270, 908, 31);
		panel.add(panel_3_1_2);

		final JLabel residentNameLabel_1_2 = new JLabel();
		residentNameLabel_1_2.setText("Medications");
		residentNameLabel_1_2.setBounds(10, 10, 95, 14);
		panel_3_1_2.add(residentNameLabel_1_2);

		txtMedications = new JTextField();
		txtMedications.setBounds(111, 8, 362, 18);
		panel_3_1_2.add(txtMedications);

		final JPanel panel_3_1_3 = new JPanel();
		panel_3_1_3.setBackground(Color.WHITE);
		panel_3_1_3.setLayout(null);
		panel_3_1_3.setBounds(1, 300, 908, 79);
		panel.add(panel_3_1_3);

		final JLabel residentNameLabel_1_3 = new JLabel();
		residentNameLabel_1_3.setText("Lab Data");
		residentNameLabel_1_3.setBounds(10, 10, 95, 14);
		panel_3_1_3.add(residentNameLabel_1_3);

		notestxtAreaLabData = new Notes();
		notestxtAreaLabData.setFormName("Resident Assessment Form");
		notestxtAreaLabData.setUserId(Global.currentLoggedInUserKey);

		txtAreaLabData = new JxNotes(isCategories);
		txtAreaLabData.setNotes(notestxtAreaLabData);
		txtAreaLabData.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaLabData.setBounds(111, 10, 252, 65);
		panel_3_1_3.add(txtAreaLabData);

		final JPanel panel_3_1_3_1 = new JPanel();
		panel_3_1_3_1.setBackground(Color.WHITE);
		panel_3_1_3_1.setLayout(null);
		panel_3_1_3_1.setBounds(1, 380, 908, 79);
		panel.add(panel_3_1_3_1);

		final JLabel residentNameLabel_1_3_1 = new JLabel();
		residentNameLabel_1_3_1
				.setText("<html>Cultural Religions<br> & Preferences</html>");
		residentNameLabel_1_3_1.setBounds(10, 10, 95, 28);
		panel_3_1_3_1.add(residentNameLabel_1_3_1);

		notestxtAreaPreferences = new Notes();
		notestxtAreaPreferences.setFormName("Resident Assessment Form");
		notestxtAreaPreferences.setUserId(Global.currentLoggedInUserKey);

		txtAreaPreferences = new JxNotes(isCategories);
		txtAreaPreferences.setNotes(notestxtAreaPreferences);
		txtAreaPreferences.setBorder(new LineBorder(Color.black, 1, false));
		txtAreaPreferences.setBounds(111, 10, 252, 65);
		panel_3_1_3_1.add(txtAreaPreferences);

		final JPanel panel_3_1_2_1 = new JPanel();
		panel_3_1_2_1.setBackground(Color.WHITE);
		panel_3_1_2_1.setLayout(null);
		panel_3_1_2_1.setBounds(1, 460, 908, 31);
		panel.add(panel_3_1_2_1);

		final JLabel residentNameLabel_1_2_1 = new JLabel();
		residentNameLabel_1_2_1.setText("Flood Intake");
		residentNameLabel_1_2_1.setBounds(10, 10, 95, 14);
		panel_3_1_2_1.add(residentNameLabel_1_2_1);

		txtFluidIntake = new JTextField();
		txtFluidIntake.setBounds(111, 8, 362, 18);
		panel_3_1_2_1.add(txtFluidIntake);

		final JPanel panel_3_1_2_1_1 = new JPanel();
		panel_3_1_2_1_1.setBackground(Color.WHITE);
		panel_3_1_2_1_1.setLayout(null);
		panel_3_1_2_1_1.setBounds(1, 495, 908, 31);
		panel.add(panel_3_1_2_1_1);

		final JLabel residentNameLabel_1_2_1_1 = new JLabel();
		residentNameLabel_1_2_1_1.setText("Appetite");
		residentNameLabel_1_2_1_1.setBounds(10, 10, 95, 14);
		panel_3_1_2_1_1.add(residentNameLabel_1_2_1_1);

		rbApptiteGood = new JRadioButton();
		rbApptiteGood.setActionCommand("1");
		rbApptiteGood.setBackground(Color.WHITE);
		rbApptiteGood.setText("Good");
		rbApptiteGood.setBounds(111, 6, 113, 22);
		bgAppetite.add(rbApptiteGood);
		panel_3_1_2_1_1.add(rbApptiteGood);

		rbApptiteFair = new JRadioButton();
		rbApptiteFair.setActionCommand("2");
		rbApptiteFair.setBackground(Color.WHITE);
		rbApptiteFair.setText("Fair");
		rbApptiteFair.setBounds(251, 6, 113, 22);
		bgAppetite.add(rbApptiteFair);
		panel_3_1_2_1_1.add(rbApptiteFair);

		rbApptitePoor = new JRadioButton();
		rbApptitePoor.setActionCommand("3");
		rbApptitePoor.setBackground(Color.WHITE);
		rbApptitePoor.setText("Poor");
		rbApptitePoor.setBounds(370, 6, 113, 22);
		bgAppetite.add(rbApptitePoor);
		panel_3_1_2_1_1.add(rbApptitePoor);

		final JPanel panel_3_1_2_1_2 = new JPanel();
		panel_3_1_2_1_2.setBackground(Color.WHITE);
		panel_3_1_2_1_2.setLayout(null);
		panel_3_1_2_1_2.setBounds(1, 527, 908, 31);
		panel.add(panel_3_1_2_1_2);

		final JLabel residentNameLabel_1_2_1_2 = new JLabel();
		residentNameLabel_1_2_1_2.setText("Food Alergy");
		residentNameLabel_1_2_1_2.setBounds(10, 10, 95, 14);
		panel_3_1_2_1_2.add(residentNameLabel_1_2_1_2);

		txtFoodAlergy = new JTextField();
		txtFoodAlergy.setBounds(111, 8, 362, 18);
		panel_3_1_2_1_2.add(txtFoodAlergy);

		final JPanel panel_3_1_2_1_1_1 = new JPanel();
		panel_3_1_2_1_1_1.setBackground(Color.WHITE);
		panel_3_1_2_1_1_1.setLayout(null);
		panel_3_1_2_1_1_1.setBounds(1, 559, 908, 31);
		panel.add(panel_3_1_2_1_1_1);

		final JLabel residentNameLabel_1_2_1_1_1 = new JLabel();
		residentNameLabel_1_2_1_1_1.setText("Skin Integrity");
		residentNameLabel_1_2_1_1_1.setBounds(10, 10, 95, 14);
		panel_3_1_2_1_1_1.add(residentNameLabel_1_2_1_1_1);

		rbSkinNormal = new JRadioButton();
		rbSkinNormal.setActionCommand("1");
		rbSkinNormal.setBackground(Color.WHITE);
		rbSkinNormal.setText("Normal");
		rbSkinNormal.setBounds(111, 6, 113, 22);
		bgSkinIntegrity.add(rbSkinNormal);
		panel_3_1_2_1_1_1.add(rbSkinNormal);

		rbSkinImpaired = new JRadioButton();
		rbSkinImpaired.setActionCommand("2");
		rbSkinImpaired.setBackground(Color.WHITE);
		rbSkinImpaired.setText("Impaired");
		rbSkinImpaired.setBounds(254, 6, 113, 22);
		bgSkinIntegrity.add(rbSkinImpaired);
		panel_3_1_2_1_1_1.add(rbSkinImpaired);

		final JPanel panel_3_1_2_1_2_1 = new JPanel();
		panel_3_1_2_1_2_1.setBackground(Color.WHITE);
		panel_3_1_2_1_2_1.setLayout(null);
		panel_3_1_2_1_2_1.setBounds(1, 590, 908, 31);
		panel.add(panel_3_1_2_1_2_1);

		final JLabel residentNameLabel_1_2_1_2_1 = new JLabel();
		residentNameLabel_1_2_1_2_1.setText("Open Areas");
		residentNameLabel_1_2_1_2_1.setBounds(10, 10, 95, 14);
		panel_3_1_2_1_2_1.add(residentNameLabel_1_2_1_2_1);

		txtOpenArea = new JTextField();
		txtOpenArea.setBounds(111, 8, 147, 18);
		panel_3_1_2_1_2_1.add(txtOpenArea);

		final JLabel constipationLabel = new JLabel();
		constipationLabel.setText("Constipation");
		constipationLabel.setBounds(289, 10, 95, 14);
		panel_3_1_2_1_2_1.add(constipationLabel);

		txtConstipation = new JTextField();
		txtConstipation.setBounds(390, 8, 147, 18);
		panel_3_1_2_1_2_1.add(txtConstipation);

		final JLabel constipationLabel_1 = new JLabel();
		constipationLabel_1.setText("Edema");
		constipationLabel_1.setBounds(568, 10, 95, 14);
		panel_3_1_2_1_2_1.add(constipationLabel_1);

		txtEdema = new JTextField();
		txtEdema.setBounds(641, 8, 147, 18);
		panel_3_1_2_1_2_1.add(txtEdema);

		final JPanel panel_3_1_2_1_2_1_1 = new JPanel();
		panel_3_1_2_1_2_1_1.setBackground(Color.WHITE);
		panel_3_1_2_1_2_1_1.setLayout(null);
		panel_3_1_2_1_2_1_1.setBounds(1, 623, 908, 122);
		panel.add(panel_3_1_2_1_2_1_1);

		final JLabel residentNameLabel_1_2_1_2_1_1 = new JLabel();
		residentNameLabel_1_2_1_2_1_1.setText("Weight");
		residentNameLabel_1_2_1_2_1_1.setBounds(13, 43, 95, 14);
		panel_3_1_2_1_2_1_1.add(residentNameLabel_1_2_1_2_1_1);

		txtWeight = new JTextField();
		txtWeight.setBounds(130, 41, 147, 18);
		panel_3_1_2_1_2_1_1.add(txtWeight);

		final JLabel constipationLabel_2 = new JLabel();
		constipationLabel_2.setText("Height");
		constipationLabel_2.setBounds(13, 63, 95, 14);
		panel_3_1_2_1_2_1_1.add(constipationLabel_2);

		txtHeight = new JTextField();
		txtHeight.setBounds(130, 61, 147, 18);
		panel_3_1_2_1_2_1_1.add(txtHeight);

		final JLabel constipationLabel_1_1 = new JLabel();
		constipationLabel_1_1.setText("Desired Body Weight");
		constipationLabel_1_1.setBounds(13, 83, 111, 14);
		panel_3_1_2_1_2_1_1.add(constipationLabel_1_1);

		txtDesideredWeight = new JTextField();
		txtDesideredWeight.setBounds(130, 81, 147, 18);
		panel_3_1_2_1_2_1_1.add(txtDesideredWeight);

		final JLabel constipationLabel_1_1_1 = new JLabel();
		constipationLabel_1_1_1.setText("Adjustments");
		constipationLabel_1_1_1.setBounds(13, 103, 95, 14);
		panel_3_1_2_1_2_1_1.add(constipationLabel_1_1_1);

		txtAdjustments = new JTextField();
		txtAdjustments.setBounds(130, 101, 147, 18);
		panel_3_1_2_1_2_1_1.add(txtAdjustments);

		final JLabel residentNameLabel_1_2_1_2_1_1_1 = new JLabel();
		residentNameLabel_1_2_1_2_1_1_1.setText("AN THROPOMETRICS");
		residentNameLabel_1_2_1_2_1_1_1.setBounds(10, 15, 124, 14);
		panel_3_1_2_1_2_1_1.add(residentNameLabel_1_2_1_2_1_1_1);

		doLoad();

	}

	public void doLoad() {
		doUpdate();
	}

	public int doSave() {
		ResidentAssessmentFormPage21 refResidentAssessmentFormPage21 = new ResidentAssessmentFormPage21();
		refResidentAssessmentFormPage21
				.setSerial(Global.currentResidentAssessmentFormPage21Key);
		refResidentAssessmentFormPage21.setFormId(Global.currentMsjnKey);
		refResidentAssessmentFormPage21
				.setAdjustments(txtAdjustments.getText());
		if (txtDesideredWeight.getText() == null
				|| txtDesideredWeight.getText().equalsIgnoreCase("")) {
			refResidentAssessmentFormPage21.setDesiredBodyWeight(0.0);
		} else {
			refResidentAssessmentFormPage21.setDesiredBodyWeight(Double
					.parseDouble(txtDesideredWeight.getText()));
		}
		if (txtHeight.getText() == null
				|| txtHeight.getText().equalsIgnoreCase("")) {
			refResidentAssessmentFormPage21.setHeight(0.0);
		} else {
			refResidentAssessmentFormPage21.setHeight(Double
					.parseDouble(txtHeight.getText()));
		}
		if (txtWeight.getText() == null
				|| txtWeight.getText().equalsIgnoreCase("")) {
			refResidentAssessmentFormPage21.setWeight(0.0);
		} else {
			refResidentAssessmentFormPage21.setWeight(Double
					.parseDouble(txtWeight.getText()));
		}
		refResidentAssessmentFormPage21.setEdema(txtEdema.getText());
		refResidentAssessmentFormPage21.setConstipation(txtConstipation
				.getText());
		refResidentAssessmentFormPage21.setOpenAreas(txtOpenArea.getText());
		refResidentAssessmentFormPage21.setFoodAlergy(txtFoodAlergy.getText());
		refResidentAssessmentFormPage21
				.setFluidIntake(txtFluidIntake.getText());
		refResidentAssessmentFormPage21.setPreference(txtAreaPreferences
				.getNotes());
		refResidentAssessmentFormPage21.setLabData(txtAreaLabData.getNotes());
		refResidentAssessmentFormPage21
				.setMedications(txtMedications.getText());
		refResidentAssessmentFormPage21.setDiagnosis(txtDiagnosis.getText());
		refResidentAssessmentFormPage21.setDiet(txtDiet.getText());
		refResidentAssessmentFormPage21.setResidentName(txtResidentName
				.getText());
		refResidentAssessmentFormPage21.setPhysician(txtPhysician.getText());
		refResidentAssessmentFormPage21.setRoom(txtRoom.getText());
		refResidentAssessmentFormPage21.setDate(dcDate.getDate());
		refResidentAssessmentFormPage21.setEatingAdaptive(txtEatingAdaptive
				.getText());
		refResidentAssessmentFormPage21.setEatingReason(txtEatingReason
				.getText());
		if (rbEatingDependent.isSelected()) {
			refResidentAssessmentFormPage21.setEatingType(1);
		}
		if (rbEatingIndependent.isSelected()) {
			refResidentAssessmentFormPage21.setEatingType(2);
		}
		if (rbEatingNeedAssist.isSelected()) {
			refResidentAssessmentFormPage21.setEatingType(3);
		}
		if (rbEatingGT.isSelected()) {
			refResidentAssessmentFormPage21.setEatingType(4);
		}
		if (rbEatingTPN.isSelected()) {
			refResidentAssessmentFormPage21.setEatingType(5);
		}
		if (rbEatingNPO.isSelected()) {
			refResidentAssessmentFormPage21.setEatingType(6);
		}
		if (rbEatingDysphagic.isSelected()) {
			refResidentAssessmentFormPage21.setEatingType(7);
		}

		if (rbApptiteGood.isSelected()) {
			refResidentAssessmentFormPage21.setAppetite(1);
		}
		if (rbApptiteFair.isSelected()) {
			refResidentAssessmentFormPage21.setAppetite(2);
		}
		if (rbApptitePoor.isSelected()) {
			refResidentAssessmentFormPage21.setAppetite(3);
		}

		if (rbSkinNormal.isSelected()) {
			refResidentAssessmentFormPage21.setSkinIntegrity(1);
		}
		if (rbSkinImpaired.isSelected()) {
			refResidentAssessmentFormPage21.setSkinIntegrity(2);
		}

		try {
			Global.currentResidentAssessmentFormPage21Key = MedrexClientManager
					.getInstance().insertOrUpdateResidentAssessmentFormPage21(
							refResidentAssessmentFormPage21);

			// for sending trigger word message
			String str = txtAreaPreferences.getTriggerWord();
			if (str == null) {
				str = txtAreaLabData.getTriggerWord();
			} else {
				str += txtAreaLabData.getTriggerWord();
			}
			if (str != null) {
				txtAreaLabData.sendMail(str);
			}

			return (0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (0);
	}

	public void doUpdate() {
		int resId = Global.currentResidenceKey;
		ResidentMain rm = null;
		TempRoomHistory roomHist = null;
		if (Global.currentMsjnKey == 0) {
			try {
				rm = MedrexClientManager.getInstance().getResident(resId);
				roomHist = MedrexClientManager.getInstance()
						.getCurrentRoomForResident(resId);
			} catch (Exception e) {
				e.printStackTrace();
			}
			txtResidentName
					.setText(rm.getUserPass() + " , " + rm.getUserName());
			/* TODO: Migrating to room history ----- Done */
			// txtRoom.setText(rm.getRoom());
			if (roomHist != null) {
				txtRoom.setText(roomHist.getRoom());
			}
			// ----------for physician name
			PhysicianForm pf = null;
			HashMap hm = getDoctorsMap();
			try {
				List<PhysicianForm> list = MedrexClientManager.getInstance()
						.getPhysicianForms(Global.currentResidenceKey);
				Iterator it = list.iterator();
				while (it.hasNext()) {
					pf = (PhysicianForm) it.next();
					String DocType = ((Doctors) hm.get(pf.getPhysician()
							.getSerial())).getDoctorType().toString();
					if (DocType.equalsIgnoreCase("Physicians")) {
						txtPhysician.setText(((Doctors) hm.get(pf
								.getPhysician().getSerial()))
								.getPhysicianName()
								+ ","
								+ ((Doctors) hm.get(pf.getPhysician()
										.getSerial())).getPhysicianSurName());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// ----------
			updateDiagnosis();
		}
		ResidentAssessmentFormPage21 refResidentAssessmentFormPage21 = null;
		if (Global.currentMsjnKey != 0) {
			try {
				refResidentAssessmentFormPage21 = MedrexClientManager
						.getInstance().getResidentAssessmentFormPage21(
								Global.currentMsjnKey);

				Global.currentResidentAssessmentFormPage21Key = refResidentAssessmentFormPage21
						.getSerial();
				txtAdjustments.setText(refResidentAssessmentFormPage21
						.getAdjustments());
				txtDesideredWeight.setText(refResidentAssessmentFormPage21
						.getDesiredBodyWeight()
						+ "");
				txtHeight.setText(refResidentAssessmentFormPage21.getHeight()
						+ "");
				txtWeight.setText(refResidentAssessmentFormPage21.getWeight()
						+ "");
				txtEdema.setText(refResidentAssessmentFormPage21.getEdema());
				txtConstipation.setText(refResidentAssessmentFormPage21
						.getConstipation());
				txtOpenArea.setText(refResidentAssessmentFormPage21
						.getOpenAreas());
				txtFoodAlergy.setText(refResidentAssessmentFormPage21
						.getFoodAlergy());
				txtFluidIntake.setText(refResidentAssessmentFormPage21
						.getFluidIntake());
				txtAreaPreferences.setNotes(refResidentAssessmentFormPage21
						.getPreference());
				txtAreaLabData.setNotes(refResidentAssessmentFormPage21
						.getLabData());
				txtMedications.setText(refResidentAssessmentFormPage21
						.getMedications());
				txtDiagnosis.setText(refResidentAssessmentFormPage21
						.getDiagnosis());
				txtDiet.setText(refResidentAssessmentFormPage21.getDiet());
				txtResidentName.setText(refResidentAssessmentFormPage21
						.getResidentName());
				txtPhysician.setText(refResidentAssessmentFormPage21
						.getPhysician());
				txtRoom.setText(refResidentAssessmentFormPage21.getRoom());
				dcDate.setDate(refResidentAssessmentFormPage21.getDate());
				txtEatingAdaptive.setText(refResidentAssessmentFormPage21
						.getEatingAdaptive());
				txtEatingReason.setText(refResidentAssessmentFormPage21
						.getEatingReason());
				SwingUtils.setSelectedButton(bgEatingAndNutrition,
						refResidentAssessmentFormPage21.getEatingType());
				SwingUtils.setSelectedButton(bgAppetite,
						refResidentAssessmentFormPage21.getAppetite());
				SwingUtils.setSelectedButton(bgSkinIntegrity,
						refResidentAssessmentFormPage21.getSkinIntegrity());
			} catch (Exception e) {

			}
		}
	}

	private void updateDiagnosis() {
		List diagList = null; // new ArrayList();
		String tmp = "";
		try {
			diagList = MedrexClientManager.getInstance().getResidentDiagnosiss(
					Global.currentResidenceKey);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < diagList.size(); i++) {
			ResidentDiagnosis diag = (ResidentDiagnosis) diagList.get(i);
			if (diag.isConfirmed()) {
				tmp += diag.getName();
				if (i != diagList.size() - 1) {
					tmp += ", ";
				}
			}
		}
		txtDiagnosis.setText(tmp);
	}

	public HashMap getDoctorsMap() {
		HashMap hm = new HashMap();
		List doctors = null;
		try {
			doctors = MedrexClientManager.getInstance().getDoctorsRecords();

			Iterator i = doctors.iterator();
			while (i.hasNext()) {
				Doctors d = (Doctors) i.next();
				hm.put(d.getSerial(), d);
			}
		} catch (Exception e) {
		}
		return hm;
	}

	public boolean doValidate() {
		/*
		 * ValidationResult vRes = new ValidationResult(); ValidationResult
		 * temp;
		 * 
		 * if (!FieldValidation.isEmpty(temp = FieldValidation.isAnySelected(
		 * bgEatingAndNutrition, "Eating & Nutrition"))) {
		 * vRes.addAllFrom(temp); }
		 * 
		 * //
		 * System.out.println(FieldValidation.getMessages(vRes.getMessages()));
		 * if (!FieldValidation.isEmpty(vRes)) { FieldValidation.Msgbox(vRes,
		 * "Resident Assessment Form: Page 21"); return false; } else { return
		 * true; }
		 */
		return true;
	}

}
