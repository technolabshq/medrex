package medrex.client.mds3.ui.subSections.sectionZ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.border.LineBorder;

import medrex.client.mds3.controller.Mds3Controller;
import medrex.client.mds3.general.Mds3SubSection;
import medrex.client.mds3.general.constants.Mds3Constants;
import medrex.commons.vo.mds3.sectionZ.Mds3SectionZ;

import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxText;
import com.sX.theme.BlackOverWhiteTheme;
import com.sX.theme.Theme;

public class PanelZ0300 extends JxPanel implements Mds3SubSection {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4369847924172926748L;
	Theme theme = new BlackOverWhiteTheme();
	private JxText txtZ0300;
	private JxText txtZ0300A;

	public PanelZ0300() {
		super();
		setPreferredSize(new Dimension(840, 140));
		setLayout(null);
		setBackground(Color.WHITE);

		final JxPanel panel = new JxPanel();
		panel.setTheme(theme);
		panel.setLayout(null);

		panel.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 140);
		add(panel);

		final JxPanel panel_1 = new JxPanel();
		panel_1.setTheme(theme);
		panel_1.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_1.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, Mds3Constants.PAGE_WIDTH, 25);
		panel.add(panel_1);

		final JxLabel z0100MedicarePartLabel = new JxLabel();
		z0100MedicarePartLabel.setTheme(theme);

		z0100MedicarePartLabel.setFontSize(12);
		z0100MedicarePartLabel.setFontStyle(Font.BOLD);
		z0100MedicarePartLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		z0100MedicarePartLabel.setText("Z0300.   Insurance Billing");
		z0100MedicarePartLabel.setBounds(10, 6, 308, 14);
		panel_1.add(z0100MedicarePartLabel);

		final JxPanel panel_2 = new JxPanel();
		panel_2.setTheme(theme);

		panel_2.setLayout(null);
		panel_2.setBounds(0, 24, Mds3Constants.PAGE_WIDTH, 116);
		panel.add(panel_2);

		final JxPanel panel_3 = new JxPanel();
		panel_3.setTheme(theme);
		panel_3.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_3.setBackground(Mds3Constants.BACKGROUND_LIGHTGREY);
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, Mds3Constants.SUBSECTION_WIDTH_LEFT_1, 116);
		panel_2.add(panel_3);

		final JxPanel panel_4 = new JxPanel();
		panel_4.setTheme(theme);
		panel_4.setBorder(new LineBorder(Mds3Constants.BORDER_DARKGRAY,
				Mds3Constants.BORDER_SIZE_1, false));
		panel_4.setLayout(null);

		panel_4.setBounds(79, 0, Mds3Constants.SUBSECTION_WIDTH_RIGHT_1, 116);
		panel_2.add(panel_4);

		final JxLabel aLabel = new JxLabel();
		aLabel.setTheme(theme);

		aLabel.setFontSize(12);
		aLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		aLabel.setText("<html><body><b> A. </b> &nbsp <b> RUG Case Mix group:");
		aLabel.setBounds(10, 10, 240, 14);
		panel_4.add(aLabel);

		final JxLabel bLabel = new JxLabel();
		bLabel.setTheme(theme);

		bLabel.setFontSize(12);
		bLabel.setForeground(Mds3Constants.FONT_COLOR_BlACK);
		bLabel
				.setText("<html><body><b> B. </b> &nbsp <b> RUG version code : </b>");
		bLabel.setBounds(10, 63, 220, 14);
		panel_4.add(bLabel);

		txtZ0300A = new JxText();
		txtZ0300A.setTheme(theme);
		txtZ0300A.setBounds(30, 30, 225, 22);
		panel_4.add(txtZ0300A);

		txtZ0300 = new JxText();
		txtZ0300.setTheme(theme);
		txtZ0300.setBounds(30, 84, 225, 22);
		panel_4.add(txtZ0300);
		doUpdate();
	}

	@Override
	public void doSave() {
		Mds3SectionZ mds3sectionZ = (Mds3SectionZ) Mds3Controller.getInstance()
				.getSection(Mds3SectionZ.class);

		mds3sectionZ.setZ0300A(txtZ0300.getText());
		mds3sectionZ.setZ0300B(txtZ0300A.getText());

	}

	@Override
	public void doUpdate() {
		Mds3SectionZ mds3sectionZ = (Mds3SectionZ) Mds3Controller.getInstance()
				.getSection(Mds3SectionZ.class);

		txtZ0300.setText(mds3sectionZ.getZ0300A());
		txtZ0300A.setText(mds3sectionZ.getZ0300B());

	}

}
