import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProfileList {
	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);
	
	public ProfileList() {
		JFrame frame = new JFrame("Ä«Ä«¿ÀÅå");
		JPanel pnlBg = new JPanel();

		pnlBg.setBackground(YELLOW);
		pnlBg.setLayout(null);
		frame.add(pnlBg);
		
		frame.setVisible(true);
		frame.setSize(450, 650);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}
