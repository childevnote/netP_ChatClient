import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;

public class ProfileList {
	ImageIcon homeImg=new ImageIcon("src\\img\\home_FILL0.png");
	ImageIcon chatImg=new ImageIcon("src\\img\\chat_bubble.png");
	ImageIcon settingImg=new ImageIcon("src\\img\\settings_FILL0.png");
	ImageIcon userImg=new ImageIcon("src\\img\\account_circle.png");
	
	public ProfileList() {
		JFrame frame = new JFrame("Ä«Ä«¿ÀÅå");
		JPanel pnlBg = new JPanel();

		pnlBg.setBackground(new Color(255, 255, 255)); 
		pnlBg.setLayout(null);
		frame.getContentPane().add(pnlBg);
		
		JPanel sidePanel = new JPanel(); //¿ÞÂÊ »çÀÌµå¹Ù
		sidePanel.setBackground(new Color(227, 228, 230)); 
		sidePanel.setForeground(new Color(255, 255, 255));
		sidePanel.setBounds(0, 0, 66, 611);
		pnlBg.add(sidePanel);
		
		JButton homeButton = new JButton(homeImg); //È¨¹öÆ°
		homeButton.setForeground(new Color(255, 255, 255));
		homeButton.setBackground(new Color(227, 228, 230));
		homeButton.setBounds(0, 0, 66, 68);
		homeButton.setBorderPainted(false);
		homeButton.setFocusPainted(false);
		sidePanel.add(homeButton);
		
		JButton chatButton=new JButton(chatImg); //Ã¤ÆÃ¹æ ¹öÆ°
		chatButton.setForeground(new Color(255, 255, 255));
		chatButton.setBackground(new Color(227, 228, 230));
		chatButton.setBounds(0, 69, 66, 68);
		chatButton.setBorderPainted(false);
		chatButton.setFocusPainted(false);
		sidePanel.add(chatButton);
		
		JButton settingButton=new JButton(settingImg); //¼³Á¤ ¹öÆ°
		settingButton.setForeground(new Color(255, 255, 255));
		settingButton.setBackground(new Color(227, 228, 230));
		settingButton.setBounds(0, 129, 66, 68);
		settingButton.setBorderPainted(false);
		settingButton.setFocusPainted(false);
		sidePanel.add(settingButton);
		
		JPanel loginUser = new JPanel();
		loginUser.setBackground(new Color(255, 255, 255));
		loginUser.setBounds(66, 0, 368, 80);
		pnlBg.add(loginUser);
		loginUser.setLayout(null);
		
		JButton loginUserButton = new JButton(userImg);
		loginUserButton.setBounds(0, 0, 77, 80);
		loginUserButton.setBackground(new Color(255, 255, 255));
		loginUserButton.setBorderPainted(false);
		loginUserButton.setFocusPainted(false);
		loginUser.add(loginUserButton);
		
		JLabel lblNewLabel = new JLabel("Master");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		lblNewLabel.setBounds(89, 35, 160, 15);
		loginUser.add(lblNewLabel);

		JPanel loginUser01 = new JPanel(); //User1
		loginUser01.setBackground(new Color(255, 255, 255));
		loginUser01.setBounds(66, 80, 368, 80);
		pnlBg.add(loginUser01);
		loginUser01.setLayout(null);
		
		JButton loginUserButton01 = new JButton(userImg);
		loginUserButton01.setBounds(0, 0, 77, 80);
		loginUserButton01.setBackground(new Color(255, 255, 255));
		loginUserButton01.setBorderPainted(false);
		loginUserButton01.setFocusPainted(false);
		loginUser01.add(loginUserButton01);
		
		JLabel lblNewLabel01 = new JLabel("User1");
		lblNewLabel01.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		lblNewLabel01.setBounds(89, 35, 160, 15);
		loginUser01.add(lblNewLabel01);
		
		JPanel loginUser02 = new JPanel(); //User2
		loginUser02.setBackground(new Color(255, 255, 255));
		loginUser02.setBounds(66, 160, 368, 80);
		pnlBg.add(loginUser02);
		loginUser02.setLayout(null);
		
		JButton loginUserButton02 = new JButton(userImg);
		loginUserButton02.setBounds(0, 0, 77, 80);
		loginUserButton02.setBackground(new Color(255, 255, 255));
		loginUserButton02.setBorderPainted(false);
		loginUserButton02.setFocusPainted(false);
		loginUser02.add(loginUserButton02);
		
		JLabel lblNewLabel02 = new JLabel("User2");
		lblNewLabel02.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		lblNewLabel02.setBounds(89, 35, 160, 15);
		loginUser02.add(lblNewLabel02);
		
		frame.setVisible(true);
		frame.setSize(450, 650);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}
