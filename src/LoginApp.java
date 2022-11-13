
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginApp {
	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel pnlBg = new JPanel();
		JLabel lblImg;
		ImageIcon img;

		img = new ImageIcon("src\\img\\icon.png");
		lblImg = new JLabel(img);

		pnlBg.setBackground(YELLOW);
		pnlBg.setLayout(null);
		frame.add(pnlBg);
		pnlBg.add(lblImg);
		lblImg.setBounds(175, 150, 100, 100);

		frame.setVisible(true);
		frame.setSize(450, 650);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}

}
