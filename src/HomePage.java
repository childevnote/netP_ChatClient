import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HomePage {
	public static final Color YELLOW = new Color(250, 225, 0);
	public static final Color BROWN = new Color(82, 55, 56);
	public static final Color WHITE = new Color(255, 255, 255);
	public static final Color GREY = new Color(227, 228, 230);

	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Image img_icon = toolkit.getImage("src\\img\\img_icon.png");

	ImageIcon homeImg = new ImageIcon("src\\img\\home_FILL0.png");
	ImageIcon chatImg = new ImageIcon("src\\img\\chat_bubble.png");
	ImageIcon settingImg = new ImageIcon("src\\img\\settings_FILL0.png");
	ImageIcon logoutImg = new ImageIcon("src\\img\\logout.png");
	ImageIcon userImg = new ImageIcon("src\\img\\account_circle.png");

	public HomePage(String conn_id) {
		JFrame frame = new JFrame("카카오톡");
		frame.setIconImage(img_icon);
		
		JPanel pnlBg = new JPanel();
		pnlBg.setBackground(WHITE);
		pnlBg.setLayout(null);
		frame.getContentPane().add(pnlBg);
		
		JPanel profListpnl = new JPanel();
		profListpnl.setBackground(WHITE);
		profListpnl.setLayout(null);
		profListpnl.setBounds(70, 0, 380, 650);
		pnlBg.add(profListpnl);
		
		JPanel chatListpnl = new JPanel();
		chatListpnl.setBackground(WHITE);
		chatListpnl.setLayout(null);
		chatListpnl.setBounds(70, 0, 380, 650);
		pnlBg.add(chatListpnl);

		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(GREY);
		sidePanel.setForeground(WHITE);
		sidePanel.setLayout(null);
		sidePanel.setBounds(0, 0, 70, 650);
		pnlBg.add(sidePanel);

		JButton homeButton = new JButton(homeImg); // 프로필버튼
		homeButton.setForeground(WHITE);
		homeButton.setBackground(GREY);
		homeButton.setBounds(0, 0, 70, 70);
		homeButton.setBorderPainted(false);
		homeButton.setFocusPainted(false);
		sidePanel.add(homeButton);
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				profListpnl.setVisible(true);
				chatListpnl.setVisible(false);
			}
		});

		JButton chatButton = new JButton(chatImg);// 채팅방버튼
		chatButton.setForeground(WHITE);
		chatButton.setBackground(GREY);
		chatButton.setBounds(0, 60, 70, 70);
		chatButton.setBorderPainted(false);
		chatButton.setFocusPainted(false);
		sidePanel.add(chatButton);
		chatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				profListpnl.setVisible(false);
				chatListpnl.setVisible(true);
			}
		});

		JButton settingButton = new JButton(settingImg); // 설정 버튼
		settingButton.setForeground(WHITE);
		settingButton.setBackground(GREY);
		settingButton.setBounds(0, 125, 70, 70);
		settingButton.setBorderPainted(false);
		settingButton.setFocusPainted(false);
		sidePanel.add(settingButton);

		JButton logoutButton = new JButton(logoutImg);// 로그아웃버튼
		logoutButton.setForeground(WHITE);
		logoutButton.setBackground(GREY);
		logoutButton.setBounds(0, 530, 70, 70);
		logoutButton.setBorderPainted(false);
		logoutButton.setFocusPainted(false);
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = JOptionPane.showConfirmDialog(null, conn_id + "님 로그아웃 하시겠습니까?", "로그아웃",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					new LoginApp();
					frame.setVisible(false);
				}
			}
		});
		sidePanel.add(logoutButton);

		JPanel loginUser = new JPanel();// 유저
		loginUser.setBackground(WHITE);
		loginUser.setBounds(0, 0, 380, 80);
		loginUser.setLayout(null);
		loginUser.setVisible(true);
		profListpnl.add(loginUser);

		JButton loginUserButton = new JButton(userImg);
		loginUserButton.setBounds(0, 0, 70, 70);
		loginUserButton.setBackground(WHITE);
		loginUserButton.setBorderPainted(false);
		loginUserButton.setFocusPainted(false);
		loginUser.add(loginUserButton);

		JLabel lblNewLabel = new JLabel(conn_id);
		lblNewLabel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 15));
		lblNewLabel.setBounds(89, 35, 160, 15);
		loginUser.add(lblNewLabel);

		JPanel loginUser01 = new JPanel(); // User1
		loginUser01.setBackground(WHITE);
		loginUser01.setBounds(0, 80, 380, 70);
		loginUser01.setLayout(null);
		loginUser01.setVisible(true);
		profListpnl.add(loginUser01);

		JButton loginUserButton01 = new JButton(userImg);
		loginUserButton01.setBounds(0, 0, 70, 70);
		loginUserButton01.setBackground(WHITE);
		loginUserButton01.setBorderPainted(false);
		loginUserButton01.setFocusPainted(false);
		loginUser01.add(loginUserButton01);

		JLabel lblNewLabel01 = new JLabel("User1");
		lblNewLabel01.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 15));
		lblNewLabel01.setBounds(89, 35, 160, 15);
		loginUser01.add(lblNewLabel01);

		JPanel loginUser02 = new JPanel(); // User2
		loginUser02.setBackground(WHITE);
		loginUser02.setBounds(0, 160, 380, 70);
		loginUser02.setVisible(true);
		loginUser02.setLayout(null);
		profListpnl.add(loginUser02);

		JButton loginUserButton02 = new JButton(userImg);
		loginUserButton02.setBounds(0, 0, 70, 70);
		loginUserButton02.setBackground(WHITE);
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
