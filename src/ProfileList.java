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

	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);
	ImageIcon homeImg = new ImageIcon("src\\img\\home_FILL0.png");
	ImageIcon chatImg = new ImageIcon("src\\img\\chat_bubble.png");
	ImageIcon settingImg = new ImageIcon("src\\img\\settings_FILL0.png");
	ImageIcon logoutImg = new ImageIcon("src\\img\\logout.png");
	ImageIcon userImg=new ImageIcon("src\\img\\account_circle.png");
	

	public ProfileList() {
		JFrame frame = new JFrame("카카오톡");
		JPanel pnlBg = new JPanel();
		JPanel pnlList = new JPanel();

		pnlBg.setBackground(new Color(255, 255, 255)); 
		pnlBg.setLayout(null);
		frame.getContentPane().add(pnlBg);
		
		JPanel sidePanel = new JPanel(); 
		sidePanel.setBackground(new Color(227, 228, 230)); 
		sidePanel.setForeground(new Color(255, 255, 255));
		sidePanel.setLayout(null);
		sidePanel.setBounds(0, 0, 70, 650);
		pnlBg.add(sidePanel);
		
		JButton homeButton = new JButton(homeImg); //프로필버튼
		homeButton.setForeground(new Color(255, 255, 255));
		homeButton.setBackground(new Color(227, 228, 230));
		homeButton.setBounds(0, 0, 70, 70);
		homeButton.setBorderPainted(false);
		homeButton.setFocusPainted(false);
		sidePanel.add(homeButton);
	
		JButton chatButton=new JButton(chatImg);//채팅방버튼
		chatButton.setForeground(new Color(255, 255, 255));
		chatButton.setBackground(new Color(227, 228, 230));
		chatButton.setBounds(0, 60, 70, 70);
		chatButton.setBorderPainted(false);
		chatButton.setFocusPainted(false);
		sidePanel.add(chatButton);
    
		JButton settingButton=new JButton(settingImg); //설정 버튼
		settingButton.setForeground(new Color(255, 255, 255));
		settingButton.setBackground(new Color(227, 228, 230));
		settingButton.setBounds(0, 125, 70, 70);
		settingButton.setBorderPainted(false);
		settingButton.setFocusPainted(false);
		sidePanel.add(settingButton);

		JButton logoutButton = new JButton(logoutImg);//로그아웃버튼
		logoutButton.setForeground(new Color(255, 255, 255));
		logoutButton.setBackground(new Color(227, 228, 230));
		logoutButton.setBounds(0, 530, 70, 70);
		logoutButton.setBorderPainted(false);
		logoutButton.setFocusPainted(false);
		sidePanel.add(logoutButton);
		
		JPanel loginUser = new JPanel();//유저
		loginUser.setBackground(new Color(255, 255, 255));
		loginUser.setBounds(70, 0, 368, 80);
		pnlBg.add(loginUser);
		loginUser.setLayout(null);
		
		JButton loginUserButton = new JButton(userImg);
		loginUserButton.setBounds(0, 0, 77, 80);
		loginUserButton.setBackground(new Color(255, 255, 255));
		loginUserButton.setBorderPainted(false);
		loginUserButton.setFocusPainted(false);
		loginUser.add(loginUserButton);
		
		JLabel lblNewLabel = new JLabel("Master");
		lblNewLabel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 15));
		lblNewLabel.setBounds(89, 35, 160, 15);
		loginUser.add(lblNewLabel);

		JPanel loginUser01 = new JPanel(); //User1
		loginUser01.setBackground(new Color(255, 255, 255));
		loginUser01.setBounds(70, 80, 368, 80);
		pnlBg.add(loginUser01);
		loginUser01.setLayout(null);
		
		JButton loginUserButton01 = new JButton(userImg);
		loginUserButton01.setBounds(0, 0, 77, 80);
		loginUserButton01.setBackground(new Color(255, 255, 255));
		loginUserButton01.setBorderPainted(false);
		loginUserButton01.setFocusPainted(false);
		loginUser01.add(loginUserButton01);
		
		JLabel lblNewLabel01 = new JLabel("User1");
		lblNewLabel01.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 15));
		lblNewLabel01.setBounds(89, 35, 160, 15);
		loginUser01.add(lblNewLabel01);
		
		JPanel loginUser02 = new JPanel(); //User2
		loginUser02.setBackground(new Color(255, 255, 255));
		loginUser02.setBounds(70, 160, 368, 80);
		pnlBg.add(loginUser02);
		loginUser02.setLayout(null);
		
		JButton loginUserButton02 = new JButton(userImg);
		loginUserButton02.setBounds(0, 0, 77, 80);
		loginUserButton02.setBackground(new Color(255, 255, 255));
		loginUserButton02.setBorderPainted(false);
		loginUserButton02.setFocusPainted(false);
		loginUser02.add(loginUserButton02);
		
		JLabel lblNewLabel02 = new JLabel("User2");
		lblNewLabel02.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 15));
		lblNewLabel02.setBounds(89, 35, 160, 15);
		loginUser02.add(lblNewLabel02);
		
		frame.setVisible(true);
		frame.setSize(450, 650);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}
